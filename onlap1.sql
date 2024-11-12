-- Câu 1: Liệt kê doanh số bán hàng của từng nhân viên theo mỗi khách hàng
-- Sử dụng bảng employees, customers và payments
-- Câu hỏi: Mỗi nhân viên đã bán được bao nhiêu cho từng khách hàng
use classicmodels;
select e.employeeNumber, e.firstName, e.lastName, c.customerName, sum(p.amount)
from employees e
join customers c on e.employeeNumber = c.salesRepEmployeeNumber
join payments p on c.customerNumber = p.customerNumber
group by e.employeeNumber, c.customerNumber
order by e.employeeNumber, c.customerNumber;

-- Câu 2: Tính tổng doanh số bán hàng của từng phân viên
-- Sử dụng bảng employees, customer và payment
-- Câu hỏi: Nhân viên nào có  tổng doanh số bán hàng cao nhất
use classicmodels;
select e.employeeNumber, e.firstName, e.lastName, c.customerName, sum(p.amount) as 'max'
from employees e
join customers c on e.employeeNumber = c.salesRepEmployeeNumber
join payments p on c.customerNumber = p.customerNumber
group by e.employeeNumber, c.customerNumber
order by max  asc
limit 1;

-- Câu 3: Liệt kê các sản phẩm bán ra cùng số lượng bán theo từng loại sản phẩm
-- Sử dụng bảng products và orderdetails
-- Câu hỏi: Có bao nhiêu sản phẩm đã bán ra cho mỗi loại sản phẩm
use classicmodels;
select p.productLine, p.productName, sum(od.quantityOrdered) as 'total'
from products p
join orderdetails od on p.productCode = od.productCode
group by p.productLine, p.productName
order by p.productLine, total desc;

-- Câu 4: Tính tổng số lượng đơn hàng đã giao theo từng khách hàng
-- Sử dụng bảng customer, orders và orderdetails
-- Câu hỏi: Khách hàng nào có nhiều đơn hàng đã giao nhất và tổng số lượng sản phẩm của họ là bao nhiêu
use classicmodels;
select c.customerName, count(o.orderNumber) as 'ordertotal', sum(od.quantityOrdered) as 'sumtotal'
from customers c
join orders o on c.customerNumber = o.customerNumber
join orderdetails od on o.orderNumber = od.orderNumber
where o.status = 'Shipped'
group by c.customerName
order by 'ordertotal' desc
limit 1;

-- Câu 5: Tính doanh thu từ các sản phẩm theo từng loại sản phẩm, loại sản phẩm nào mang doanh thu cao nhất
-- Sử dụng bảng product, orderdetails, orders
use classicmodels;
SELECT p.ProductLine, SUM(od.QuantityOrdered * od.PriceEach) AS TotalRevenue
FROM products p
JOIN orderdetails od ON p.ProductCode = od.ProductCode
JOIN orders o ON od.OrderNumber = o.OrderNumber
GROUP BY p.ProductLine
ORDER BY TotalRevenue DESC;


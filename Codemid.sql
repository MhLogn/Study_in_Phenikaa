use classicmodels;
-- Bài 1: Tính tổng doanh thu trong mỗi tháng của từng năm cửa bảng Payments?
select year(paymentdate) as year, month(paymentdate) as month,sum(amount) as total
from payments
group by month(paymentDate), year(paymentdate)
order by month(paymentDate), year(paymentdate);

-- Bài 2: Lấy danh sách tất cả các khách hàng (bảng customers)
select customerNumber, customerName
from customers;

-- Bài 3: Liệt kê doanh thu của mỗi đơn hàng
select o.orderNumber, sum(od.quantityOrdered * od.priceEach) as 'totalod'
from orders o
join orderdetails od on o.orderNumber = od.orderNumber
group by o.orderNumber
order by o.orderNumber;

-- Bài 4: Tìm đơn hàng có tổng giá trị lớn nhất trong mỗi tháng của một năm 2004
select o.orderNumber ,  sum(od.priceEach) as 'total'
from orders o
join orderdetails od on o.orderNumber = od.orderNumber
where year(o.orderDate) = 2004
and month(o.orderDate) between 1 and 12
group by o.orderNumber
order by o.orderNumber;

-- Bài 5: Lấy danh sach các khách hàng từ quốc gia 'USA'
select customerNumber, customerName, phone, city, country
from customers
where country = 'USA';

-- Bài 6: Tính giá trị trung bình của tất cả các đơn hàng
select avg(priceEach) as 'avg'
from orderdetails;

-- Bài 7: Tính tổng số tiền thanh toán của tất cả khách hàng
select sum(amount) as 'sum_amount'
from payments;

-- Bài 8: Lấy tên và giá của tất cả các sản phẩm
select productName, buyPrice
from products;

-- Bài 9: Tính tổng doanh thu của mỗi nhân viên trong từ tháng
use classicmodels;
select e.employeeNumber, e.firstName, e.lastName, c.customerName, p.paymentDate, sum(p.amount)
from employees e
join customers c on e.employeeNumber = c.salesRepEmployeeNumber
join payments p on c.customerNumber = p.customerNumber
where month(paymentDate) between 1 and 12
group by e.employeeNumber, c.customerNumber, p.paymentDate
order by e.employeeNumber, c.customerNumber,  p.paymentDate;

-- Bài 10: Tìm sản phẩm có giá bán cao nhất
select productCode, productName, buyPrice
from products
order by buyPrice desc
limit 1;
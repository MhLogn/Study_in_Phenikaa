-- Bai 1
use classicmodels;
select e.firstName, e.lastName, e.email, e.jobTitle, o.officeCode
from employees e
join offices o on e.officeCode = o.officeCode;

SELECT o.country, COUNT(e.employeeNumber)
FROM offices o
JOIN employees e ON o.officeCode = e.officeCode
GROUP BY o.country;

-- Bai 2
select c.customerName, p.productName
from customers c
join orders o on c.customerNumber = o.customerNumber
join orderdetails od on o.orderNumber = od.orderNumber
join products p on od.productCode = p.productCode;

-- Bai 3
select p.productCode, p.productName
from products p
left join orderdetails od on p.productCode = od.productCode
where od.orderNumber is null;

-- Bai 4
select o.orderDate, o.requiredDate, o.status, sum(od.priceEach * od.quantityOrdered) as total
from orders o
join orderdetails od on o.orderNumber = od.orderNumber
where o.orderDate between '2005-03-01' and '2005-03-31'
group by o.orderNumber;

-- Bai 5
select pl.productLine, count(p.productCode) as totalProducts
from productlines pl
join products p on pl.productLine = p.productLine
group by pl.productLine
order by totalProducts desc; 
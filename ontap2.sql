use classicmodels;
select *
from employees
where reportsTo is null;

use classicmodels;
select distinct customerNumber
from payments;

use classicmodels;
select orderNumber
from orders
where requiredDate = '2003/1/18';

use classicmodels;
select orderNumber
from orders
where orderDate between '2005/04/01' and '2005/04/30' and status = 'Shipped';

use classicmodels;
select productCode, productName
from products
where productLine = 'Classic Cars';

select customerNumber, customerName, phone, country
from customers
where city in ("Nantes", "Lyon");

select orderNumber
from orders
where shippedDate between '2003/01/10' and '2003/03/10';

select productCode, productName, productLine
from products
where productLine like '%CARS';

select productCode, productName, productLine
from products
order by quantityInStock desc 
limit 10;

SELECT productCode, productName, quantityInStock, buyPrice, (quantityInStock * buyPrice) AS inventoryValue
FROM products;

select city, count(customerNumber) as 'total'
from customers
group by city;

select count(orderNumber) as 'total'
from orders
where orderDate between '2005/03/01' and '2005/03/31';

select month(orderDate) as 'totalmonth', count(orderNumber) as 'total'
from orders
where year(orderdate) = 2005
group by month(orderDate)
order by totalmonth;

select o.orderNumber, sum(od.quantityOrdered * od.priceEach) as 'total'
from orders o
join orderdetails od on o.orderNumber = od.orderNumber
group by o.orderNumber
order by total desc
limit 10;

SELECT p.productLine, SUM(p.quantityInStock) AS totalQuantityInStock
FROM products p
GROUP BY p.productLine;

select e.employeeNumber, e.firstName, e.lastName, o.officeCode, o.city
from employees e
join offices o on e.officeCode = o.officeCode;

select c.customerName, p.productName
from customers c
join orders o on c.customerNumber = o.customerNumber
join orderdetails od on o.orderNumber = od.orderNumber
join products p on od.productCode = p.productCode;

select p.productName
from products p
left join orderdetails od on p.productCode = od.productCode
where od.orderNumber is null;

select o.orderNumber, o.orderDate, o.requiredDate, o.status, sum(od.quantityOrdered * od.priceEach) as 'total'
from orders o
join orderdetails od on o.orderNumber = od.orderNumber
where o.orderDate between '2005/03/01' and '2005/03/31'
group by o.orderNumber, o.orderDate, o.requiredDate, o.status
order by o.orderDate;

select p.productLine, count(p.productCode) as 'total'
from products p
group by productLine
order by total desc;
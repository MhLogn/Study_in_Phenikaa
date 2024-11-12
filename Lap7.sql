SELECT DISTINCT productCode
FROM orderdetails
WHERE orderNumber IN (
    SELECT orderNumber
    FROM orders
    WHERE orderDate BETWEEN '2005-03-01' AND '2005-03-31'
);


SELECT DISTINCT od.productCode
FROM orderdetails od
JOIN orders o ON od.orderNumber = o.orderNumber
WHERE o.orderDate BETWEEN '2005-03-01' AND '2005-03-31';

SELECT *
FROM orders
WHERE orderDate = (
    SELECT MAX(orderDate)
    FROM orders
);

SELECT o.orderNumber, SUM(od.priceEach * od.quantityOrdered) AS totalOrderValue
FROM orders o
JOIN orderdetails od ON o.orderNumber = od.orderNumber
GROUP BY o.orderNumber;

SELECT c.customerNumber, 
       SUM(od.priceEach * od.quantityOrdered) AS totalOrderValue, 
       SUM(p.amount) AS totalPaid
FROM customers c
JOIN orders o ON c.customerNumber = o.customerNumber
JOIN orderdetails od ON o.orderNumber = od.orderNumber
JOIN payments p ON c.customerNumber = p.customerNumber
GROUP BY c.customerNumber;

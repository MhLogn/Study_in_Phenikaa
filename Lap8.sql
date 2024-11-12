-- Bài 1: 

-- orders table 
use classicmodels;
INSERT INTO orders (orderNumber, orderDate, requiredDate, shippedDate, status, comments, customerNumber)
VALUES (10427, '2023-10-07', '2023-10-20', NULL, 'In Process', 'Urgent order', 103);

use classicmodels;
UPDATE orders
SET status = 'Shipped', shippedDate = '2023-10-10'
WHERE orderNumber = 10427;

use classicmodels;
DELETE FROM orders
WHERE orderNumber = 10427;

--  orderdetails
use classicmodels;
INSERT INTO orderdetails (orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber)
VALUES (10426, 'S10_1678', 30, 86.99, 1);

use classicmodels;
UPDATE orderdetails
SET quantityOrdered = 50, priceEach = 82.75
WHERE orderNumber = 10426  AND productCode = 'S10_1678';

use classicmodels;
DELETE FROM orderdetails
WHERE orderNumber = 10426 AND productCode = 'S10_1678';

-- products
use classicmodels;
INSERT INTO products (productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, MSRP)
VALUES ('S10_9999', 'New Product', 'Classic Cars', '1:18', 'Vendor XYZ', 'This is a new product description.', 100, 55.99, 95.99);
  
use classicmodels;
UPDATE products
SET quantityInStock = 200, buyPrice = 52.50
WHERE productCode = 'S10_9999';

use classicmodels;
DELETE FROM products
WHERE productCode = 'S10_9999';

-- productlines
use classicmodels;
INSERT INTO productlines (productLine, textDescription, htmlDescription, image)
VALUES ('Motorcycless', 'All types of motorcycles', '<p>We offer a wide range of motorcycles.</p>', NULL);

use classicmodels;
UPDATE productlines
SET textDescription = 'Updated description for motorcycles', htmlDescription = '<p>New HTML description for motorcycles</p>'
WHERE productLine = 'Motorcycless';

use classicmodels;
DELETE FROM productlines
WHERE productLine = 'Motorcycless';

-- Bài 2:
use classicmodels;
CREATE TABLE IF NOT EXISTS temp_orderdetails LIKE orderdetails;
INSERT INTO temp_orderdetails
SELECT od.*
FROM orderdetails od
JOIN orders o ON od.orderNumber = o.orderNumber
WHERE o.orderDate = (SELECT MAX(orderDate) FROM orders);

-- Bài 3:
use classicmodels;
SET SQL_SAFE_UPDATES = 0;
UPDATE Employees
SET jobTitle = 'Sales Representative'
WHERE jobTitle = 'Sales Rep';

SET SQL_SAFE_UPDATES = 1;

 


 
create database if not exists practice;
use practice;

-- note 2 (table)
create table if not exists note2 
(
id int not null unique primary key,
myname varchar(30),
myold int not null,
thisday datetime,
thisyear datetime
-- foreign key(key_name) references table(key_name) 
); 

-- note 3 (truy vấn dữ liệu với select, where, distinct, limit)
use classicmodels;
select * -- tên cột cần truy vấn 
from employees; -- bảng cần truy vấn
-- where (tạo thêm điều kiện), group by (nhóm), order by (các cột sắp xếp), limit (giới hạn số lượng) 

-- VD1:
use classicmodels;
select lastname, firstname, jobtitle from employees;
select ProductCode, ProductName from products;

-- VD2: Where
use classicmodels;
select FirstName, LastName, email from employees
where jobTitle = "President"; 

select * from customers
where customerNumber = 112;

-- Kết hợp toán tử AND (cần cả 2 đúng để đúng) và OR (nếu 1 trong 2 đúg)
use classicmodels;
select * from customers 
where country = 'USA' and salesRepEmployeeNumber = 1165;

select * from orders
where status = 'On Hold' or status = 'In Process';

-- VD từ khóa DISTINCT, có thể loại bỏ dữ liệu trùng lặp từ câu lệnh SELECT
use classicmodels; 
select distinct jobTitle from employees;
select distinct productCode from orderdetails;

-- VD giới hạn số lượng (hàng) kết quả với LIMIT
use classicmodels;
select productName from products limit 5; 

select * from customers
where country = 'France'
limit 10;

-- note 4 (toán tử IN, BETWEEN, LIKE, ORDER BY, UNION)
-- Toán tử IN cho phép chọn giá trị phù hợp từ một tập các giá trị
use classicmodels;
select officeCode, city, phone
from offices
where country in ('USA','France');
-- hoặc not in 

-- BETWEEN cho phép lấy các giá trị trong một phạm vi cụ thể. Nó phải được sử dụng trong mệnh đề WHERE 
use classicmodels;
select productCode, productName, buyPrice
from products
where buyPrice between 90 and 100
order by buyPrice desc;

use classicmodels;
select productCode, productName, buyPrice
from products
where buyPrice not between 20 and 100;

--  Like- tìm kiếm thông tin
-- • Ký tự đại diện tỷ lệ phần trăm (%) đại diện cho bất kỳ chuỗi có thể không có hoặc có nhiều ký tự
-- • Gạch dưới (_) chỉ đại diện cho một ký tự duy nhất. 
use classicmodels;
select employeeNumber, lastName, firstName
from employees
where firstName like 'a%';
-- tức là tìm các thông tin thuộc cột có firstNane bắt đầu bằng chữ a

select employeeNumber, lastName, firstName
from employees
where lastName like '%on';
-- lastname có kết thúc là on 

SELECT productCode, productName
FROM products
WHERE productCode LIKE '%\_20%';

-- Sắp xếp kết quả với Order by
-- tăng dần ASC, giảm dần DESC, mặc định order by là tăng dần
use classicmodels;
select FirstName, LastName, jobtitle
from employees
order by firstName ASC, jobTitle DESC;

-- SUM, AVG, MAX/MIN, COUNT
-- Tổng - SUM
use classicmodels;
select sum(priceEach * quantityOrdered) 'total'
from orderdetails;

-- Giá trị TB - AVG
use classicmodels;
select avg(buyPrice) average_buy_price
from products;

-- Max/Min
SELECT MAX(buyPrice) highest_price,
MIN(buyPrice) lowest_price
FROM Products;

-- Đếm số lượng - COUNT
SELECT COUNT(*) AS Total
FROM products;


-- INSERT, UPDATE, DELETE
INSERT INTO classicmodels.offices
 (officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory)
 VALUES ('8', 'Boston', '+1 215 837 0825', '1550 dummy street', NULL, 'MA', 'USA', '02107', 'NA');
 
UPDATE employees
SET email = 'diane-murphy @classicmodelcars.com'
WHERE employeeNumber = 1002;

SET SQL_SAFE_UPDATES = 0;
DELETE
FROM employees
WHERE officeCode = 6;
SET SQL_SAFE_UPDATES = 1;
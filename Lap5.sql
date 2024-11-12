-- Note 5
use classicmodels;
-- Bai 1
select city, count(customerName) as tong from customers group by city;

-- Bai 2
select count(*) as order_count from orders where orderdate between '2005-03-01' and '2005-03-31';

-- Bai 3
select month(orderdate) as month, count(*) as order_count from orders where year(orderdate) = 2005 group by month(orderdate);

-- Bai 4
select ordernumber, sum(quantityordered * priceeach) as total_value from orderdetails group by ordernumber order by total_value desc limit 10;

-- Bai 5
select productline, sum(quantityinstock) as total_quantity from products group by productline;

-- ------------------------------
-- Add 5
use sakila;
-- Limit
select * from sakila.payment where amount > 2 order by staff_id limit 10; -- Lấy ra 10 bản ghi đầu tiên theo thứ tự sắp xếp
select * from sakila.payment where amount > 2 limit 10; -- Lấy ra 10 bản ghi ngẫu nhiên, không có sự sắp xếp.
select * from sakila.payment limit 10; -- Lấy 10 bản ghi bất kỳ mà không cần điều kiện lọc.
/* So sánh: Câu lệnh có ORDER BY sắp xếp dữ liệu, câu lệnh không có thì chỉ lấy dữ liệu ngẫu nhiên.*/

-- Min max
select min(amount) as GiaTriNhoNhat from payment;
select max(amount) as GiaTriLonNhat from payment; -- Lấy giá trị nhỏ nhất của amount từ toàn bộ bảng.
select min(amount) as GiaTriNhoNhat from payment where amount > 2; -- Lấy giá trị nhỏ nhất của amount chỉ khi amount > 2
/* WHERE giới hạn tập dữ liệu trước khi áp dụng hàm MIN hoặc MAX*/

-- Count
select count(*) from payment where amount > 2; -- đếm tổng số bản ghi trong bảng payment mà có amount > 2
/* WHERE lọc dữ liệu trước khi đếm, còn không có WHERE thì đếm toàn bộ dữ liệu.*/

-- avg,sum
select avg(amount) as TB from payment; -- Tính trung bình của tất cả các giá trị amount trong bảng payment
select sum(amount) as Tong from payment; -- Tính tổng của tất cả các giá trị amount trong bảng payment
select avg(amount) as TB from payment where amount > 2; -- Tính trung bình của những giá trị amount lớn hơn 2.
select sum(amount) as Tong from payment where amount > 2; -- Tính tổng của những giá trị amount lớn hơn 2.
/*WHERE lọc dữ liệu trước khi tính trung bình và tổng*/R
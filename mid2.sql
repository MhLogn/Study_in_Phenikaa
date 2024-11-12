use classicmodels;
-- Câu 1:
-- Danh sách các đơn hàng có ngày yêu cầu trong tháng 4 và tháng 1 năm 2005:

SELECT * 
FROM orders 
WHERE YEAR(requireddate) = 2005 
AND (MONTH(requireddate) = 1 OR MONTH(requireddate) = 4);

-- Câu 2:
-- Thông tin khách hàng có nhiều đơn hàng nhất:

SELECT customerNumber, COUNT(orderNumber) AS total_orders
FROM orders
GROUP BY customerNumber
ORDER BY total_orders DESC
LIMIT 1;

-- Câu 3:
-- Thông tin sản phẩm dựa trên số lượng hàng trong kho:
-- Sản phẩm có số lượng hàng trong kho từ 1000 - 2000:
SELECT * 
FROM products 
WHERE quantityInStock BETWEEN 1000 AND 2000;

-- Mã sản phẩm có số lượng hàng >2000 và productLine là 'Classic Cars':
SELECT productCode 
FROM products 
WHERE quantityInStock > 2000 
AND productLine = 'Classic Cars';

-- Câu 4:
-- Thông tin từ bảng Customers:
-- Tên khách hàng bắt đầu bằng chữ 'B':
SELECT customerName 
FROM customers 
WHERE customerName LIKE 'B%';

-- Tổng số khách hàng theo từng quốc gia:
SELECT country, COUNT(customerNumber) AS total_customers 
FROM customers 
GROUP BY country;

-- Quốc gia có tổng số creditLimit lớn nhất:
SELECT country, SUM(creditLimit) AS total_creditLimit
FROM customers
GROUP BY country
ORDER BY total_creditLimit DESC
LIMIT 1;

-- Câu 5:
-- Thông tin từ bảng Payments:
-- Tổng tiền thanh toán ứng với mỗi khách hàng:
SELECT customerNumber, SUM(amount) AS total_amount
FROM payments
GROUP BY customerNumber;

-- CustomerNumber có amount < 90000 và số lần trả > 2:
SELECT customerNumber 
FROM payments 
WHERE amount < 90000 
GROUP BY customerNumber 
HAVING COUNT(*) > 2;

-- Câu 6:
-- Tổng tiền thanh toán trong tháng 11 năm 2004:
-- Tính tổng tiền thanh toán tháng 11 năm 2004:
SELECT SUM(amount) AS total_amount 
FROM payments 
WHERE YEAR(paymentDate) = 2004 AND MONTH(paymentDate) = 11;

-- Khách hàng trả nhiều tiền nhất trong tháng 11 năm 2004:
SELECT customerNumber, SUM(amount) AS total_amount
FROM payments
WHERE YEAR(paymentDate) = 2004 AND MONTH(paymentDate) = 11
GROUP BY customerNumber
ORDER BY total_amount DESC
LIMIT 1;

-- Câu 7:
-- Số lượng đơn hàng yêu cầu trong năm 2003:
-- Số lượng đơn hàng yêu cầu theo tháng năm 2003:
SELECT MONTH(requireddate) AS month, COUNT(orderNumber) AS total_orders
FROM orders
WHERE YEAR(requireddate) = 2003
GROUP BY MONTH(requireddate);

-- Tên khách hàng có số đơn hàng yêu cầu nhiều nhất trong năm 2003:
SELECT customers.customerName, COUNT(orders.orderNumber) AS total_orders
FROM orders
JOIN customers ON orders.customerNumber = customers.customerNumber
WHERE YEAR(orders.requireddate) = 2003
GROUP BY customers.customerName
ORDER BY total_orders DESC
LIMIT 1;

-- Câu 8:
-- Tên khách hàng và tên sản phẩm họ đặt hàng vào tháng 5 năm 2003:
SELECT customers.customerName, products.productName
FROM orders
JOIN orderdetails ON orders.orderNumber = orderdetails.orderNumber
JOIN products ON orderdetails.productCode = products.productCode
JOIN customers ON orders.customerNumber = customers.customerNumber
WHERE YEAR(orders.requireddate) = 2003 
AND MONTH(orders.requireddate) = 5;

-- Câu 9:
-- Sử dụng truy vấn con để lấy các sản phẩm được đặt hàng trong tháng 3-2005 với trạng thái Shipped:
SELECT productCode 
FROM orderdetails 
WHERE orderNumber IN (
    SELECT orderNumber 
    FROM orders 
    WHERE YEAR(requireddate) = 2005 
    AND MONTH(requireddate) = 3 
    AND status = 'Shipped'
);

-- Câu 10:
-- Tạo database và các bảng:
-- Tạo database QuanLyDiem_N03TH2:

CREATE DATABASE IF NOT EXISTS QuanLyDiem_N03TH2
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE QuanLyDiem_N03TH2;

CREATE TABLE IF NOT EXISTS SinhVien (
    maSV VARCHAR(10) PRIMARY KEY,
    hoten VARCHAR(100),
    gioitinh VARCHAR(10),
    ngaysinh DATE,
    diachi VARCHAR(100),
    malop VARCHAR(10),
    maKhoa VARCHAR(10)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS Khoa (
    MaKhoa VARCHAR(10) PRIMARY KEY,
    TenKhoa VARCHAR(100),
    MaGV_TruongKhoa VARCHAR(10)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS GiaoVien (
    maGV VARCHAR(10) PRIMARY KEY,
    hoten VARCHAR(100),
    ngaysinh DATE,
    gioitinh VARCHAR(10),
    diachi VARCHAR(100),
    MaKhoa VARCHAR(10),
    FOREIGN KEY (MaKhoa) REFERENCES Khoa(MaKhoa)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Insert dữ liệu
INSERT INTO SinhVien (maSV, hoten, gioitinh, ngaysinh, diachi, malop, maKhoa) 
VALUES ('SV001', 'Nguyen Van A', 'Nam', '2001-01-02', 'Hà Nội', 'CSDL', 'CNTT');

INSERT INTO Khoa (MaKhoa, TenKhoa, MaGV_TruongKhoa) 
VALUES ('CNTT', 'Công nghệ thông tin', 'PU001');

INSERT INTO GiaoVien (maGV, hoten, ngaysinh, gioitinh, diachi, MaKhoa) 
VALUES ('PU010', 'Nguyễn Công Phượng', '1996-10-20', 'Nam', 'Nghệ An', 'CNTT');

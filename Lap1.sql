create database CSDL_Thuchanh1;
-- tạo 1 database nếu có rồi sẽ báo lỗi ko tiếp tục chạy câu lệnh
-- tên database có thể có số hoặc chữ ko thể tạo chỉ kiểu  số
select * from classicmodels.customers;

create database if not exists CSDL_Thuchanh1;
-- tạo 1 databes nếu có rồi thì không tạo nữa nhưng vẫn tiếp tục chạy các câu lệnh
-- if not exists - tùy chọn tránh lỗi 
select * from classicmodels.customers;

drop database csdl_thuchanh1;
-- xóa database
drop database if exists csdl_thuchanh1;

show databases;
-- xem các databases tồn tại trên hệ thống

show databases like 'h%';
-- like là đọc rồi tìm kiếm
-- xem các databases có chữ h nằm cuối % là chuỗi bất kỳ
show databases like '%h%';
-- xem các databases có chữ h nằm ở đâu cũng đc, Dấu % là ký tự đại diện (wildcard), có nghĩa là có thể có hoặc không có bất kỳ ký tự nào trước và sau "h".
show databases  like 'h%';

create database if not exists csdln01th2;
-- kiểm tra nếu tồn tại csdln01th2 thì sẽ bỏ qua và chạy xuống câu lệnh thứ 2
drop database if exists csdln01th2;
-- câu lệnh thứ 2 sẽ kiểm tra trong MySQL nếu có database csdln01h2 thì sẽ xóa nếu ko có sẽ bỏ qua câu lệnh


-- Tạo 1 csdl nếu nó chưa tồn tại
create database if not exists CSDL_thuchanh;
-- Chọn csdl để hoạt động 
use CSDL_thuchanh;

drop table if exists LopHoc;
drop table if exists SinhVien;
drop table if exists MonHoc;

-- Bài 1: Tạo 3 bảng SV, Môn, Lớp có dấu và không dấu
-- a, 3 bảng không dấu
create table SinhVien (
    MaSinhVien int not null unique primary key,
    TenSinhVien char(30) not null,
    HoSinhVien char(30) not null,
    NgaySinh DATETIME not null,
    GioiTinh char not null,
    Tinh char(30) not null,
    Huyen char(30) not null,
    Xaa char(30) not null,
    SoDienThoai char(30) not null,
    MaLopHoc char(30) not null
);

create table MonHoc (
    MaMonHoc char(30) not null unique primary key,
    TenMonHoc char(50) not null,
    SoTinChi smallint not null
);

create table LopHoc (
    MaLopHoc char(30) not null unique primary key,
    TenLopHoc char(30) not null,
    Khoa char(30) not null,
    MaQuanLyLop char(30) not null
);

-- b, 3 bảng có dấu
create database if not exists CSDL_thực_hành;
use CSDL_thực_hành;

drop table if exists Lớp_Học;
drop table if exists Sinh_Viên;
drop table if exists Môn_học;

create table Sinh_Viên (
Mã_Sinh_Viên int not null unique primary key,
Tên_Sinh_Viên char(30) not null,
Họ_Sinh_Viên char(30) not null,
Ngày_sinh datetime not null,
Giới_tính char(30) not null,
Tỉnh char(30) not null,
HUyện char(30) not null,
Xã char (30) not null,
Số_điện_thoại char(30) not null,
Mã_Lớp_Học char(30) not null
);

create table Môn_Học (
    Mã_Môn_Học char(30)  not null unique primary key,
    Tên_Môn_Học char(50) not null ,
    Số_Tín_Chỉ smallint not null
);

create table Lớp_Học (
    Mã_Lớp_Học char(30) not null unique primary key,
    Tên_Lớp_Học char(30) not null,
    Khoa char(30) not null,
    Mã_Quản_Lý_Lớp char(30) not null
);

-- Bài 2:
use CSDL_thuchanh;
-- a, MaSinhVien: là khóa chính của bảng SinhVien

-- alter table dùng để sửa bảng
-- add constraint pk_ là thêm khóa chính
-- add constraint fk_ là thêm khóa ngoại
-- foreign key .. references là khóa ngoại tham chiếu đến 1 cột trong bảng
alter table SinhVien
add constraint pk_SinhVien primary key (MaSinhVien),
add constraint fk_MaLopHoc foreign key (MaLopHoc) references LopHoc (MaLopHoc);

-- b, MaMonHoc: là khóa chính của bảng MonHoc
alter table MonHoc
add constraint pk_Monhoc primary key (MaMonHoc);

-- c, MaLopHoc: là khóa chính của bảng LopHoc
alter table LopHoc
add constraint pk_LopHoc primary key (MaLopHoc);

-- Bài 2.2: 
alter table LopHoc
add TenQLL char(30) not null;

-- Bài 2.3: 
alter table SinhVien
modify SoDienThoai int(11) not null;

-- Bài 2.4: 
drop table SinhVien;
drop table MonHoc;
drop table LopHoc;

-- Bài 2.5: 
create database if not exists CSDL_thuchanh2;
use CSDL_thuchanh2;

drop table if exists lophoc;
drop table if exists SinhVien;
drop table if exists MonHoc;

create table lophoc (
    MaLopHoc char(30) not null unique primary key,
    TenLopHoc char(30) not null,
    Khoa char(30) not null,
    MaQuanLyLop char(30) not null,
    TenQLL char(30) not null
);

create table SinhVien (
    MaSinhVien int not null unique primary key,
    TenSinhVien char(30) not null,
    HoSinhVien char(30) not null,
    NgaySinh datetime not null,
    GioiTinh char not null,
    Tinh char(30) not null,
    Huyen char(30) not null,
    Xaa char(30) not null,
    SoDienThoai int(11) not null,
    MaLopHoc char(30) not null,
    constraint fk_MaLopHoc foreign key(MaLopHoc) references lophoc(MaLopHoc)
);

create table MonHoc (
    MaMonHoc char(30) not null unique primary key,
    TenMonHoc char(50) not null,
    SoTinChi smallint not null
);
-- Bài 2.5 có thể có lỗi nếu mà ko tạo bảng LopHoc trước mà tạo SinhVIên trước. Vì:
-- bảng SinhVien có 1 khóa ngoại là MaLopHoc tham chiếu đến bảng LopHoc nếu LopHoc ko
-- tồn tại trước thì sẽ dẫn đến lỗi
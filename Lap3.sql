use CSDL_Thực_Hành;
select Mã_Sinh_Viên from Sinh_Viên;
-- Where Mã_Sinh_Viên >4;
select Mã_Sinh_Viên from Sinh_Viên, Lớp_Học;
select Sinh_Viên.Mã_Sinh_Viên, Lớp_Học.Mã_Lớp_Học from Sinh_Viên, Lớp_Học;
package Main.Final.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Phong_Giam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ten_phong;
    private String ten_tu_nhan;
    private String so_luong_hien_tai;
    private String so_luong_toi_da;

    public Phong_Giam() {}

    public Phong_Giam(int id, String ten_phong, String ten_tu_nhan, String so_luong_hien_tai, String so_luong_toi_da) {
        this.id = id;
        this.ten_phong = ten_phong;
        this.ten_tu_nhan = ten_tu_nhan;
        this.so_luong_hien_tai = so_luong_hien_tai;
        this.so_luong_toi_da = so_luong_toi_da;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTen_phong() {
        return ten_phong;
    }
    public void setTen_phong(String ten_phong) {
        this.ten_phong = ten_phong;
    }

    public String getTen_tu_nhan() {
        return ten_tu_nhan;
    }
    public void setTen_tu_nhan(String ten_tu_nhan) {
        this.ten_tu_nhan = ten_tu_nhan;
    }

    public String getSo_luong_hien_tai() {
        return so_luong_hien_tai;
    }
    public void setSo_luong_hien_tai(String so_luong_hien_tai) {
        this.so_luong_hien_tai = so_luong_hien_tai;
    }

    public String getSo_luong_toi_da() {
        return so_luong_toi_da;
    }
    public void setSo_luong_toi_da(String so_luong_toi_da) {
        this.so_luong_toi_da = so_luong_toi_da;
    }
}
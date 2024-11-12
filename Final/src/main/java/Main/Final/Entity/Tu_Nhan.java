package Main.Final.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Tu_Nhan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ho_va_ten;
    private String tuoi;
    private String gioi_tinh;
    private String dia_chi;
    private String pham_toi;
    private String muc_an;
    private LocalDate ngay_vao_trai;
    private LocalDate ngay_ra_trai;
    private String phong_Giam;

    public Tu_Nhan() {}

    public Tu_Nhan(int id, String ho_va_ten, String tuoi, String gioi_tinh, String dia_chi, String pham_toi, String muc_an, LocalDate ngay_vao_trai, LocalDate ngay_ra_trai,  String phong_Giam) {
        this.id = id;
        this.ho_va_ten = ho_va_ten;
        this.tuoi = tuoi;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
        this.pham_toi = pham_toi;
        this.muc_an = muc_an;
        this.ngay_vao_trai = ngay_vao_trai;
        this.ngay_ra_trai = ngay_ra_trai;
        this.phong_Giam = phong_Giam;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getHo_va_ten() {
        return ho_va_ten;
    }
    public void setHo_va_ten(String ho_va_ten) {
        this.ho_va_ten = ho_va_ten;
    }

    public String getTuoi() {
        return tuoi;
    }
    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }
    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getDia_chi() {
        return dia_chi;
    }
    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getPham_toi() {
        return pham_toi;
    }
    public void setPham_toi(String pham_toi) {
        this.pham_toi = pham_toi;
    }

    public String getMuc_an() {
        return muc_an;
    }
    public void setMuc_an(String muc_an) {
        this.muc_an = muc_an;
    }

    public LocalDate getNgay_vao_trai() {
        return ngay_vao_trai;
    }
    public void setNgay_vao_trai(LocalDate ngay_vao_trai) {
        this.ngay_vao_trai = ngay_vao_trai;
    }

    public LocalDate getNgay_ra_trai() {
        return ngay_ra_trai;
    }
    public void setNgay_ra_trai(LocalDate ngay_ra_trai) {
        this.ngay_ra_trai = ngay_ra_trai;
    }

    public String getPhong_giam() {
        return phong_Giam;
    }
    public void setPhong_giam(String phong_Giam) {
        this.phong_Giam = phong_Giam;
    }
}
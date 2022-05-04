package bai7;

public class GiaoVien {
    private double luongCung;
    private double luongThuong;
    private double tienPhat;
    private double luongThuc;
    private String ten;
    private int tuoi;
    private String que;
    private String maGV;

    public GiaoVien(String ten, int tuoi, String que, String maGV, double luongCung, double luongThuong, double tienPhat) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        this.luongThuc = luongThuc;
        this.ten = ten;
        this.tuoi = tuoi;
        this.que = que;
        this.maGV = maGV;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongThuc() {
        return luongThuc;
    }

    public void setLuongThuc(double luongThuc) {
        this.luongThuc = luongThuc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                "luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                ", tienPhat=" + tienPhat +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", que='" + que + '\'' +
                ", maGV='" + maGV + '\'' +
                '}';
    }
}

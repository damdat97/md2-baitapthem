package bai9;

public class KhachHang {
    private String tenChuHo;
    private int soNha;
    private String maCongTo;

    public KhachHang() {
        super();
    }

    public KhachHang(String tenChuHo, int soNha, String maCongTo) {
        this.tenChuHo = tenChuHo;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    @Override
    public String toString() {
        return "tenChuHo='" + tenChuHo + '\'' +
                ", soNha=" + soNha +
                ", maCongTo='" + maCongTo + '\'' +
                '}';
    }
}

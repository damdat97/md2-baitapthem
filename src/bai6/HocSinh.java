package bai6;

public class HocSinh {
    private String ten;
    private int tuoi;
    private String que;
    private int lop;

    public HocSinh() {
    }

    public HocSinh(String ten, int tuoi, String que, int lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.que = que;
        this.lop = lop;
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

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", que='" + que + '\'' +
                ", classStudent=" + lop +
                '}';
    }
}

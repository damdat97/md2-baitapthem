package bai7;

import java.util.ArrayList;
import java.util.List;

public class QuanLyGiaoVien {
    private List<GiaoVien> giaoVienList;

    public QuanLyGiaoVien() {
        giaoVienList = new ArrayList<>();
    }

    public void them(GiaoVien giaoVien) {
        giaoVienList.add(giaoVien);
    }

    public int timKiemMa(String ma) {
        for (int i = 0; i < giaoVienList.size(); i++) {
            if (giaoVienList.get(i).getMaGV().equals(ma)){
                return i;
            }
        }
        return -1;
    }

    public void xoaTheoMa(String ma) {
        giaoVienList.remove(timKiemMa(ma));
    }

    public double luongGiaoVien(String ma) {
        for (int i = 0; i < giaoVienList.size(); i++) {
            if (giaoVienList.get(i).getMaGV().equals(ma)) {
               return giaoVienList.get(i).getLuongCung() + giaoVienList.get(i).getLuongThuong() - giaoVienList.get(i).getTienPhat();
            }
        }
        return 0;
    }
}

package bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyHocSinh {
    private List<HocSinh> hocSinhList;

    public QuanLyHocSinh() {
        hocSinhList = new ArrayList<>();
    }

    public void add(HocSinh hocSinh) {
        this.hocSinhList.add(hocSinh);
    }

    public List<HocSinh> getHocSinh20Tuoi() {
        for (int i = 0; i < hocSinhList.size(); i++) {
            if (hocSinhList.get(i).getTuoi() == 20) {
                System.out.println(hocSinhList.get(i));
            } else {
                System.out.println("Khong co hoc sinh 20 tuoi trong truong!");
            }
        }
        return null;
    }

    public void demHocSinh23TuoiODN() {
        int count = 0;
        for (int i = 0; i < hocSinhList.size(); i++) {
            if (hocSinhList.get(i).getTuoi() == 23 && hocSinhList.get(i).getQue().equals("DN")) {
                count++;
            }
        }
        System.out.println("So hoc sinh 23 tuoi song o Da Nang: " + count);
    }
}

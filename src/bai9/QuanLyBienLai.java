package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class QuanLyBienLai {
    private List<BienLai> bienLaiList;
    private KhachHang khachHang;
    private BienLai bienLai;
    private Scanner so = new Scanner(System.in);
    private Scanner chu = new Scanner(System.in);

    public QuanLyBienLai() {
        bienLaiList = new ArrayList<>();
    }

    public void them() {
        System.out.println("Nhap ten chu ho:");
        String ten = chu.nextLine();
        System.out.println("Nhap so nha: ");
        int soNha = so.nextInt();
        System.out.println("Nhap vao ma cong to: ");
        String maCongTo = chu.nextLine();
        khachHang = new KhachHang(ten, soNha, maCongTo);
        int soDienMoi;
        int soDienCu;
        do {
            System.out.println("Nhap vao so dien cu: ");
            soDienCu = so.nextInt();
            System.out.println("Nhap vao so dien moi: ");
            soDienMoi = so.nextInt();
            if (soDienMoi < soDienCu) {
                System.err.println("So dien moi phai > so dien c!u");
            }
        } while (soDienMoi < soDienCu && soDienMoi > 0 && soDienCu > 0);
        bienLai = new BienLai(khachHang, soDienCu, soDienMoi);
        bienLaiList.add(bienLai);
    }

    public int timTheoSoNha(int soNha) {
        for (int i = 0; i < bienLaiList.size(); i++) {
            if (Objects.equals(bienLaiList.get(i).getKhachHang().getSoNha(), soNha)) {
                return i;
            }
        }
        return -1;
    }

    public void xoa(int soNha) {
        bienLaiList.remove(timTheoSoNha(soNha));
    }

    public void hienThi() {
        for (int i = 0; i < bienLaiList.size(); i++) {
                System.out.println(bienLaiList.get(i));
        }
        if (bienLaiList.isEmpty()) {
            System.out.println("Khong co nha nao");
        }
    }

    public int tienDien(int soNha) {
        for (int i = 0; i < bienLaiList.size(); i++) {
            if (Objects.equals(bienLaiList.get(i).getKhachHang().getSoNha(), soNha)) {
                return (bienLaiList.get(i).getSoDienMoi() - bienLaiList.get(i).getSoDienCu())*5000;
            }
        }
        return 0;
    }
}

package bai9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyBienLai quanLyBienLai = new QuanLyBienLai();

        while (true) {
            hienMenu();
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Chi duoc nhap so");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    quanLyBienLai.them();
                    break;
                case 2:
                    System.out.println("Nhap vao so nha muon xoa bien lai");
                    int soNha = scanner.nextInt();
                    int soNhaXoa = quanLyBienLai.timTheoSoNha(soNha);
                    if (soNhaXoa == -1) {
                        System.out.println("Khong co nha nay");
                    } else {
                        quanLyBienLai.xoa(soNha);
                        System.out.println("Xoa thanh cong");
                    }
                    break;
                case 3:
                    quanLyBienLai.hienThi();
                    break;
                case 4:
                    System.out.println("Nhap vao so nha muon tinh tien:");
                    int soNhaTien = scanner.nextInt();
                    int khongSoNhaTien = quanLyBienLai.timTheoSoNha(soNhaTien);
                    if (khongSoNhaTien == -1) {
                        System.out.println("Khong co nha nay");
                    } else {
                        System.out.println("So tien cua nha " + soNhaTien + " la: " +quanLyBienLai.tienDien(soNhaTien) + " dong.");
                    }
                    break;
            }
        }
    }

    public static void hienMenu() {
        System.out.println("---Menu----");
        System.out.println("1. Them bien lai ho su dung dien");
        System.out.println("2. Xoa bien lai ho su dung dien");
        System.out.println("3. Hien thi cac bien lai");
        System.out.println("4: Hien thi so tien dien tung ho");
        System.out.println("5. Thoat");
        System.out.println("Chon");
    }
}

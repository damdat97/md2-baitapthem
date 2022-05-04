package bai7;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyGiaoVien quanLyGiaoVien = new QuanLyGiaoVien();
        GiaoVien giaoVien;

        while (true) {
            showMenu();
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Chi duoc nhap so");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten giao vien: ");
                    String ten = scanner.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int tuoi = scanner.nextInt();
                    System.out.println("Nhap que: ");
                    scanner.nextLine();
                    String que = scanner.nextLine();
                    System.out.println("Nhap ma GV: ");
                    String ma = scanner.nextLine();
                    System.out.println("Nhap luong cung: ");
                    double luongCung = scanner.nextDouble();
                    System.out.println("Nhap luong thuong: ");
                    double luongThuong = scanner.nextDouble();
                    System.out.println("Nhap tien phat: ");
                    double tienPhat = scanner.nextDouble();
                    giaoVien = new GiaoVien(ten, tuoi, que, ma, luongCung, luongThuong, tienPhat);
                    quanLyGiaoVien.them(giaoVien);
                    System.out.println(giaoVien);
                    break;
                case 3:
                    System.out.println("Nhap vao ma muon tinh luong: ");
                    String maLuong = scanner.nextLine();
                    int isNotExist = quanLyGiaoVien.timKiemMa(maLuong);
                    if (isNotExist == -1) {
                        System.out.println("Khong co giao vien nay");
                    } else {
                        System.out.println("Luong thuc cua giao vien co ma: " + maLuong + " " + quanLyGiaoVien.luongGiaoVien(maLuong));
                    }
                    break;
                case 2:
                    System.out.println("Nhap vao ma giao vien muon xoa: ");
                    String maXoa = scanner.nextLine();
                    int isNotExist2 = quanLyGiaoVien.timKiemMa(maXoa);
                    if (isNotExist2 == -1) {
                        System.out.println("Khong co giao vien nay de xoa");
                    } else {
                        quanLyGiaoVien.xoaTheoMa(maXoa);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid");
                    continue;
            }
        }
    }

    public static void showMenu() {
        System.out.println("----Menu----");
        System.out.println("1. Them giao vien");
        System.out.println("2. Xoa giao vien");
        System.out.println("3. Luong giao vien");
        System.out.println("Chon!");
    }
}

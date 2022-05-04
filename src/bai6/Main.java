package bai6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        Scanner scanner = new Scanner(System.in);
        HocSinh hocSinh;

        while (true) {
            showMenu();
            int choice  = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Chi duoc nhap so!");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhap vao ten: ");
                    String ten = scanner.nextLine();
                    System.out.println("Nhap vao tuoi: ");
                    int tuoi = scanner.nextInt();
                    System.out.println("Nhap vao que: ");
                    scanner.nextLine();
                    String que = scanner.nextLine();
                    System.out.println("Nhap vao lop: ");
                    int lop = scanner.nextInt();
                    hocSinh = new HocSinh(ten, tuoi, que, lop);
                    quanLyHocSinh.add(hocSinh);
                    break;
                case 2:
                    quanLyHocSinh.getHocSinh20Tuoi();
                    break;
                case 3:
                    quanLyHocSinh.demHocSinh23TuoiODN();
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
        System.out.println("---Menu----");
        System.out.println("1. Them hoc sinh.");
        System.out.println("2. So hoc sinh 20 tuoi.");
        System.out.println("3. So hoc sinh 23 tuoi song tai DN");
        System.out.println("4. Thoat");
        System.out.println("Chon di!");
    }
}

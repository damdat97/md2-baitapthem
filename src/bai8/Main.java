package bai8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCard managerCard = new ManagerCard();

        while (true) {
            showMenu();
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
                    managerCard.add();
                    break;
                case 2:
                    System.out.println("Nhap vao ma muon sach muon xoa: ");
                    int id = scanner.nextInt();
                    int isNotExist = managerCard.findByID(id);
                    if (isNotExist == -1) {
                        System.out.println("Khong co ma nay!");
                    } else {
                        managerCard.delete(id);
                        System.out.println("Xoa thanh cong!");
                    }
                    break;
                case 3:
                    managerCard.show();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chi duoc nhap 1-4");
                    continue;
            }
        }
    }

    public static void showMenu() {
        System.out.println("---Menu----");
        System.out.println("1. Them ma phieu muon sach");
        System.out.println("2. Xoa ma phieu muon sach");
        System.out.println("3. Hien thi danh sach cac ma muon sach");
        System.out.println("4. Thoat");
        System.out.println("Chon!");
    }
}

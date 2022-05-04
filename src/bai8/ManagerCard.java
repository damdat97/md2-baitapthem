package bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ManagerCard {
    private List<Card> cardList;
    private Student student;
    private Card card;
    private Scanner number = new Scanner(System.in);
    private Scanner word = new Scanner(System.in);

    public ManagerCard() {
        cardList = new ArrayList<>();
    }

    public void add() {
        System.out.println("Nhap ten sinh vien: ");
        String name = word.nextLine();
        System.out.println("Nhap vao tuoi sinh vien: ");
        int age = number.nextInt();
        System.out.println("Nhap vao lop cua sinh vien: ");
        String classStudent = word.nextLine();
        student = new Student(name, age, classStudent);
        System.out.println("Nhap vao id card: ");
        int id = number.nextInt();
        System.out.println("Nhap vao ngay muon sach: ");
        int borrowDate = number.nextInt();
        System.out.println("Nhap vao ngay tra sach: ");
        int paymentDate = number.nextInt();
        System.out.println("Nhap vao ID sach: ");
        String idBook = word.nextLine();
        card = new Card(student, id, borrowDate, paymentDate, idBook);
        cardList.add(card);
    }

    public int delete(int id) {
        for (int i = 0; i < cardList.size(); i++) {
            if (Objects.equals(cardList.get(i).getId(), id)) {
                cardList.remove(card);
            }
        }
        return -1;
    }

    public void show() {
        for (int i = 0; i < cardList.size(); i++) {
            System.out.println(cardList.get(i));
        }
    }

    public int findByID(int id) {
        for (int i = 0; i < cardList.size(); i++) {
            if (Objects.equals(cardList.get(i).getId(), id)) {
                return i;
            }
        }
        return -1;
    }
}

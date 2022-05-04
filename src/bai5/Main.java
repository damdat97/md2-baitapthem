package bai5;

import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Person person;

        while (true) {
            showMenu();
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Please enter the number !");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter passport: ");
                    scanner.nextLine();
                    String passport = scanner.nextLine();
                    System.out.println("Choice 'a' to rent Room type A ");
                    System.out.println("Choice 'b' to rent Room type B ");
                    System.out.println("Choice 'c' to rent Room type C ");
                    String choise = scanner.nextLine().toLowerCase(Locale.ROOT);
                    Room room;
                    if (choise.equals("a")) {
                        room = new RoomA();
                    } else if (choise.equals("b")) {
                        room = new RoomB();
                    } else if (choise.equals("c")) {
                        room = new RoomC();
                    } else {
                        break;
                    }
                    System.out.println("Enter number day for rent: ");
                    int numberRent = scanner.nextInt();
                    person = new Person(name, age, passport, room, numberRent);
                    hotel.add(person);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Enter passport want to remove: ");
                    String passpostDel = scanner.nextLine();
                    int isNotExisted = hotel.findByPassport(passpostDel);
                    if (isNotExisted == -1) {
                        System.out.println("Not have this person!");
                    } else {
                        hotel.delete(passpostDel);
                        System.out.println("Remove done!");
                    }
                    break;
                case 3:
                    System.out.println("Enter passport want to pay: ");
                    String passpostPay = scanner.nextLine();
                    int isNotExistedPay = hotel.findByPassport(passpostPay);
                    if (isNotExistedPay == -1) {
                        System.out.println("Not have this person!");
                    } else {
                        System.out.println("Price: " + hotel.calculator(passpostPay) + " $");
                    }
                    break;
                case 4:
                    hotel.show();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Invalid");
                    break;
            }
        }
    }
        public static void showMenu () {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert person for rent");
            System.out.println("Enter 2: To remove person by passport");
            System.out.println("Enter 3: To calculator price by passport");
            System.out.println("Enter 4: To show infor");
            System.out.println("Enter 5: To exit:");
            System.out.println("Enter number!");
        }
    }

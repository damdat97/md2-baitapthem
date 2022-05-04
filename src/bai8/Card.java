package bai8;

public class Card {
    private Student student;
    private int id;
    private int borrowDate;
    private int paymentDate;
    private String idBook;

    public Card(Student student, int id, int borrowDate, int paymentDate, String idBook) {
        this.student = student;
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.idBook = idBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    @Override
    public String toString() {
        return "Card{" +
                student +
                ", id='" + id + '\'' +
                ", borrowDate=" + borrowDate +
                ", paymentDate=" + paymentDate +
                ", idBook='" + idBook + '\'' +
                '}';
    }
}

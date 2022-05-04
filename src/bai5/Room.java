package bai5;

public class Room {
    String category;
     int price;

    public Room() {
    }

    public Room(String category, int price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

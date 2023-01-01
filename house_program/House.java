package house_program;

public class House {
    String color;
    int price;

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

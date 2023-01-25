package practice_problems;

public class Marble {

    private String color;
    private int price;

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marble{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
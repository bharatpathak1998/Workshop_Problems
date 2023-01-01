package marble_program;

public class Marble {

    String color;
    int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "marble_Stream_Program.Marble{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

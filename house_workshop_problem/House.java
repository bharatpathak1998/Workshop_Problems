package house_workshop_problem;

public class House {
    private String Name;
    String color;
    int price;
    String size;
    String address;

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "House{" +
                "Name='" + Name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
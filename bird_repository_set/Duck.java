package bird_repository_set;

public class Duck extends Bird implements Swimmable, Flyable {
    @Override
    public void fly() {
        System.out.println("Duck Can Fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck Can Swim");
    }
}

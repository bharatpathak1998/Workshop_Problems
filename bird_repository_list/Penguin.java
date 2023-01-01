package bird_repository_list;

public class Penguin extends Bird implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Penguin Can Swim");
    }
}

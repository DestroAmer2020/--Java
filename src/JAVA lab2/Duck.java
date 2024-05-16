import java.util.*;

public class Duck extends Bird {
    public Duck() {
        super();
    }

    @Override
    void Eat() {
        System.out.println("Duck is eating");
    }

    @Override
    void Move() {
        System.out.println("Duck is swimming");
    }
}
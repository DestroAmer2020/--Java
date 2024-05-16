import java.util.*;

public class Eagle extends Bird {
    public Eagle() {
        super();
    }

    @Override
    void Eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    void Move() {
        System.out.println("Eagle is flying");
    }
}
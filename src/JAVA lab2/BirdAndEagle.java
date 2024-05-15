class Bird {
    void Eat() {
        System.out.println("Bird is eating");
    }

    void Move() {
        System.out.println("Bird is moving");
    }
}

class Eagle extends Bird {
    @Override
    void Eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    void Move() {
        System.out.println("Eagle is flying");
    }
}

class Duck extends Bird {
    @Override
    void Eat() {
        System.out.println("Duck is eating");
    }

    @Override
    void Move() {
        System.out.println("Duck is swimming");
    }
}

public class BirdAndEagle {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird duck = new Duck();

        eagle.Eat();
        eagle.Move();
        duck.Eat();
        duck.Move();
    }
}
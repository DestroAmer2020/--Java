public class BirdAndEagle {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird duck = new Duck();
        Bird sparrow = new Sparrow();

        eagle.Eat();
        eagle.Move();
        duck.Eat();
        duck.Move();
        sparrow.Eat();
        sparrow.Move();
    }
}
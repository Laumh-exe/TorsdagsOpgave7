package TaskThree;

public class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "cluck";
    }

    public String howToEat(){
        return "Eat the chicken";
    }
}

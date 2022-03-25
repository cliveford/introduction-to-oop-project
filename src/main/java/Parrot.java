public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " parrot. If you have a parrot, it says a lot about you!");
    }
}


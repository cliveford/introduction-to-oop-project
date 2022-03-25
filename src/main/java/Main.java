public class Main {
    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();


        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();


        Parrot polly = new Parrot("Polly", "Red, Yellow & Blue");
        polly.speak();
        polly.fly();
        polly.spin();
        polly.doTheCaterpillar();
        polly.jump();


    }
}

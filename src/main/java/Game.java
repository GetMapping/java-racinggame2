import java.util.Random;

public class Game {
    private final Car[] cars;
    private final int round;

    public Game(Car[] cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    public void run() {

    }

    public void end() {

    }

    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public void printResult(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getName());
            printPositionBar(cars[i].getPosition());
        }
    }

    public void printPositionBar(int position) {
        String bar = "";
        for (int i = 0; i < position; i++) {
            bar = bar + "-";
        }
        System.out.println(bar);
    }
}

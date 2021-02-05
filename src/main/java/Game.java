import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private final List<Car> cars;
    private final int round;

    public Game(List<Car> cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    public void run() {
        for (int i = 0; i < round; i++) {
            for (Car car : cars) {
                checkGoOrStop(car);
            }
            printResult(cars);
            System.out.println();
        }
    }

    public void end() {
        printWinner(cars);
    }

    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public void checkGoOrStop(Car car) {
        if (generateRandomNumber() >= 4) {
            car.goStraight();
        }
    }

    public void printResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " ");
            printPositionBar(car.getPosition());
        }
    }

    public void printPositionBar(int position) {
        String bar = "";
        for (int i = 0; i < position; i++) {
            bar = bar + "-";
        }
        System.out.println(bar);
    }

    public int getMaxPosition(List<Car> cars) {
        int maxPosition = (cars.get(0)).getPosition();
        for (Car car : cars) {
            if (car.getPosition() >= maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    public void printWinner(List<Car> cars) {
        List<String> winner = new ArrayList<>();
        for (Car car : cars) {
            if (getMaxPosition(cars) == car.getPosition()) {
                winner.add(car.getName());
            }
        }
        System.out.print("Winner : ");
        for (String s : winner) {
            System.out.print(s + " ");
        }
    }
}

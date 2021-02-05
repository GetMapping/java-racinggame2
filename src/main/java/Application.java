import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Check check = new Check();

        System.out.print("Enter car name : ");
        String carNames = scanner.next();
        System.out.print("Enter round : ");
        int round = scanner.nextInt();
        System.out.println();

        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }

        Game game = new Game(cars, round);
        game.run();
        game.end();
    }
}

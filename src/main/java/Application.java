import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car name : ");
        String carNames = scanner.next();
        System.out.print("Enter round : ");
        int round = scanner.nextInt();

        String[] names = carNames.split(",");
        Car[] cars = new Car[names.length];
        for (int i = 0; i < names.length; i++){
            cars[i] = new Car(names[i]);
        }

        Game game = new Game(cars, round);
    }
}

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = new Logger();

        Path currentPath = Paths.get("").toAbsolutePath();
        String logFileName = currentPath + "/log.txt";

        Calculator calculator = new Calculator(logger, logFileName);


        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.print("Введите номер операции: ");
        int operationChoice = scanner.nextInt();

        Oper oper;
        switch (operationChoice) {
            case 1:
                oper = new Sloj();
                break;
            case 2:
                oper = new Razn();
                break;
            case 3:
                oper = new Umno();
                break;
            case 4:
                oper = new Delen();
                break;
            default:
                System.out.println("Некорректная операция. Программа завершает работу.");
                return;
        }

        double result = calculator.calculate(oper, num1, num2);
        System.out.println("Результат операции: " + result);

        scanner.close();
    }
}
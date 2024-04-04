import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Calculator {
    private final Logger logger;
    private final String logFileName;

    public Calculator(Logger logger, String logFileName) {
        this.logger = logger;
        this.logFileName = logFileName;
    }

    public double calculate(Oper oper, double oper1, double oper2) {
        double result = oper.execute(oper1, oper2);
        logToFile("Результат операции: " + result);
        return result;
    }

    private void logToFile(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFileName, true))) {
            writer.println(message);
            System.out.println("Результат записан в лог-файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
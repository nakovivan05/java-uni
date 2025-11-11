package Sem3;
import java.io.FileWriter;
import java.io.IOException;

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console: "+ message);
    }
}
class FileLogger implements Logger {
    private String filename;
    public FileLogger(String filename) {
        this.filename = filename;
    }
    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write( message + "\n");
            System.out.println("Successful writing in file!");
        } catch (IOException e) {
            System.err.println("Error while writing: " + e.getMessage());
        }
    }
}
class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }
    public void logInfo(String message) {
        logger.log(message);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Application app1 = new Application(new ConsoleLogger());
        app1.logInfo("This is a console log message.");
        Application app2 = new Application(new FileLogger("log.txt"));
        app2.logInfo("This is a file log message.");
    }
}

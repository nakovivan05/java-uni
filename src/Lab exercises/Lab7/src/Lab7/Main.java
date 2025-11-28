package Lab7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
class User implements Validator
{
    private String nickName;
    private String password;
    public User(String nickName, String password) throws InvalidEmailException, IOException {
        if (checking(nickName)) {
            this.nickName = nickName;
            this.password = password;
            saveToFile();
        }
    }
    public String getNickName()
    {
        return this.nickName;
    }
    @Override
    public boolean checking(String nickName) throws InvalidEmailException {
        if (!nickName.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new InvalidEmailException("Invalid email: " + nickName);
        }
        return true;
    }
    private void saveToFile() throws IOException {
        Files.write(
                Paths.get("users.txt"),
                Collections.singletonList(nickName + ";" + password),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }
    public static boolean userValidation(File file, String nickName, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    String user = parts[0];
                    String pass = parts[1];
                    if (user.equals(nickName) && pass.equals(password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        File userFile = new File("users.txt");
        try {
            User u1 = new User("test@example.com", "1234");
            System.out.println("User created: " + u1.getNickName());
        } catch (InvalidEmailException e) {
            System.out.println("Failed to create user: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error while creating user: " + e.getMessage());
        }
        boolean valid1 = User.userValidation(userFile, "test@example.com", "1234");
        if (valid1) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail!");
        }
    }
}
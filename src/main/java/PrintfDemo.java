import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintfDemo {
    public static void main(String[] args) {
        //"C:/Users/Asus/IdeaProjects/first_tg_bot/src/main/java/Bot.java"

        try (PrintWriter printWriter = new PrintWriter("C:/Users/Asus/IdeaProjects/first_tg_bot/src/main/java/Bot.java")){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваше имя - ");
            String firstName = scanner.next();

           System.out.println("Введите ваше фамилия - ");
            String lastName = scanner.next();

          System.out.println("Введите ваше телефон номер - ");
            String phoneNumber = scanner.next();

            printWriter.printf("Пользователя зовут %s %s. Его телефон - %s%n", firstName, lastName, phoneNumber);
            System.out.println("Команды были выполнены для требуемого файла.");
        }catch (IOException ex){
            System.out.printf(ex.getMessage());
        }
    }
}

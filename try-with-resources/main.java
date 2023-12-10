import java.io.FileWriter;

public class main {
    public static void main(String[] args) {
        // try() - это try-with-resources
        // каждое исключение типа checked(Exception без RuntimeException)
        // нужно обрабатывать блоком try catch, а открытые элементы нужно 
        // закрывать через метод close(), если открыть элемент в скобках в try,
        // то элемент будет закрыт автоматически при завершении блока try
        try (FileWriter fileWriter = new FileWriter("text", true)){
            fileWriter.write("my text");
            fileWriter.flush();
        } catch (Exception e) {
            System.out.println("ошибка");
        }
    }
}

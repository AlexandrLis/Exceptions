// throws позволяет пробрасывать исключение на ступень выше - в функцию,
// которая вызвала данную функцию с исключением

import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        String path = "text";
        try{
            function(path);
        } catch (IOException e) {
            System.out.println("ошибка");
        }
    }
    // объекты типа FileWriter writer = new FileWriter(path)
    // обязательно должны быть обработаны блоком try catch,
    // если мы не хотим обратбатывать объект внутри функции, 
    // можно пробросить ошибку на ступень выше
    // в main с помощью throws и обработать исключение уже в main
    // если удалить throws IOException, то код не скомпилируется
    // и сообщит об ошибке
    public static void function(String path) throws IOException{
        FileWriter writer = new FileWriter(path);
        writer.write("my message");
        writer.flush();
        writer.close();
        if(path.isEmpty()){
            throw new IOException();
        }
    }
}

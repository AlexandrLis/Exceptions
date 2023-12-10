public class main {
    public static void main(String[] args) {
        try {
            function(5, 0);
        } catch (Exception e) {
            // e.getMessage() выводит сообщение из 16 строки
            System.out.println(e.getMessage());
        }
        // try catch не дает коду упасть, если throw прокинет ошибку
        System.out.println("код после блока try catch");
    }
    public static int function(int a, int b){
        // в случае, если b == 0, throw прокинет ошибку, которую обработает
        // блок try catch
        if(b == 0){
            throw new ArithmeticException("арифметическая ошибка");
        }
        return a/b;
    }
}

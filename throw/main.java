public class main {
    public static void main(String[] args) {

        function();

    }

    public static void function(){
        // throw просто пробрасывает ошибку типа RuntimeException
        throw new RuntimeException("ошибка");
    }
}

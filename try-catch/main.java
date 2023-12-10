public class main {
    public static void main(String[] args) {
        // блок try выполняет код, в котором потенциально может быть
        // ошибка
        try {
            System.out.println(5/0);
        // блок catch ловит ошибку, указанную в (), если такая ошибка появляется
        //  - в этом случае ошибку Exception
        } catch (Exception e) {
            System.out.println("ошибка");
        }
        // если ошибка есть, блок try cath обрабатывает ее и 
        // программа продолжает работать
        System.out.println("код после блока try catch");
    }
}

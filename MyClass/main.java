public class main {
    // в свой класс исключения можно прописать свое сообщение и 
    // ловить более узкие исключения по сравнению с классическими
    // классами исключений
    public static void main(String[] args) {
        try {
            System.out.println(div(5, 0));
        } catch (DivideByZero e) {
            System.out.println(e.getMessage());
        }
    }
    public static int div(int a, int b){
        if(b == 0){
            throw new DivideByZero();
        }
        return a/b;
    }
}

// создаю свой класс исключения и наследую от ArithmeticException
// наследовать можно от любого классического класса исключений
public class DivideByZero extends ArithmeticException{
    
    // у ArithmeticException есть свой конструктор(Ctrl + ЛКМ(левая кнопка мыши)), и, так как 
    // мы унаследовались от него, то нужно создать свой конструктор
    // в super() можем указать свое сообщение
    public DivideByZero() {
        super("Ошибка деления на 0");
    }
}

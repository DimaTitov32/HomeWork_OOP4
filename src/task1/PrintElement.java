package task1;

public class PrintElement<T> {
    private T obj;

    public PrintElement(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void printType(){
        System.out.println("Тип элемента: " + obj.getClass().getName());
    }

    public static void main(String[] args) {
        PrintElement<Integer> printInt = new PrintElement<>(30);
        PrintElement<String> printString = new PrintElement<>("Привет");
        PrintElement<Double> printDouble = new PrintElement<>(3.14);
        PrintElement<Character> printChar = new PrintElement<>('a');

        printInt.printType();
        printString.printType();
        printDouble.printType();
        printChar.printType();

    }

}


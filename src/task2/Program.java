package task2;

public class Program<T> {
    private T[] obj;

    public T[] getObj() {
        return obj;
    }

    public void setObj(T[] obj) {
        this.obj = obj;
    }

    public Program(T[] obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] names = new String[]{"Дима","Игорь","Петя"};
        Integer[] age = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Double[] doubles = new Double[]{3.15,4.55,6.66};


        printer.<String>print(names);
        printer.<Integer>print(age);
        printer.<Double>print(doubles);
    }
}

class Printer {

    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}


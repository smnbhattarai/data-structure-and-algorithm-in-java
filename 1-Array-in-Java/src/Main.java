import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        numbers.insert(50);
//        System.out.println(numbers.indexOf(30));
//        System.out.println(numbers.indexOf(300));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.remove(0);
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.contains(40));
        System.out.println(list.size());
        list.toArray();
        System.out.println(list);
    }
}

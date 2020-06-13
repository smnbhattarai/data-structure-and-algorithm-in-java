import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedListC();
        //System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println(list.getKthFromTheEnd(4));
        //list.reverse();
        //System.out.println(list.size());
        //list.removeFirst();
        //System.out.println(list.size());
        //System.out.println(list.indexOf(40));
        //System.out.println(list.contains(20));
        //var array = list.toArray();
        //System.out.println(Arrays.toString(array));
    }

}

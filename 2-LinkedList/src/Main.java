import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);
        System.out.println(list.size());
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(60));
        System.out.println(list.contains(60));
        System.out.println(list.contains(30));
        list.addLast(40);
        System.out.println(list.size());
        list.removeFirst();
        System.out.println(list.size());

        var arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        list.reverse();
        var arr1 = list.toArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(list.getKthFromEnd(2));
    }
}

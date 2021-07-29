public class Main {

    public static void main(String[] args) {
        CharacterFinder chr = new CharacterFinder();
        var ch = chr.firstNonRepeating("this is a test and hats off");
        var frch = chr.firstRepeatedChar("this is a test and hats off");
        System.out.println(ch);
        System.out.println(frch);

        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");

        System.out.println(table.get(8));
    }

}

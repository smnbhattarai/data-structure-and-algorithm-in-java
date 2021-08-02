public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("careful");
        trie.insert("egg");
        //trie.insert("can");
        //System.out.println(trie.contains("cat"));
        //System.out.println(trie.contains("canada"));
        //trie.traverse();
        //trie.remove("cat");
        System.out.println(trie.findWords("car"));
        ;
    }
}

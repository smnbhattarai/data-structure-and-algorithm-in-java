public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(6));
        System.out.println("traverse Pre Order");
        tree.traversePreOrder();
        System.out.println("traverse In Order");
        tree.traverseInOrder();
        System.out.println("traverse Post Order");
        tree.traversePostOrder();
        System.out.println("Height");
        System.out.println(tree.height());
        System.out.println("Min value in tree");
        System.out.println(tree.min());

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

        System.out.println("Two tree same");
        System.out.println(tree.equals(tree2));

        System.out.println("is Binary Search Tree");
        System.out.println(tree.isBinarySearchTree());

        System.out.println("print Nodes At Distance");
        var list = tree.getNodesAtDistance(2);
        for (var item : list) {
            System.out.println(item);
        }

        System.out.println("traverse Level Order");
        tree.traverseLevelOrder();
    }
}

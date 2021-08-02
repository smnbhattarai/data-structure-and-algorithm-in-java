public class Main {
    public static void main(String[] args) {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.print();
        graph.removeEdge("A", "C");
        graph.print();
        graph.removeNode("A");
        graph.print();
    }
}

public class Main {
    public static void main(String[] args) {
        var graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B");
//        graph.addEdge("B", "D");
//        graph.addEdge("D", "C");
//        graph.addEdge("A", "C");
        //graph.print();
        //graph.removeEdge("A", "C");
        //graph.print();
        //graph.print();
        //graph.traverseDepthFirst("A");
        //graph.traverseBreadthFirst("A");
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");
        graph.addEdge("X", "A");
        graph.addEdge("X", "B");
        graph.addEdge("A", "P");
        graph.addEdge("B", "P");
        var list = graph.topologicalSort();
        System.out.println(list);
    }
}

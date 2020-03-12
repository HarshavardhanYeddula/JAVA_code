package Graph;

public class GRAPH_client {
    public static void main(String[] args) throws Exception {
        GRAPH<String> graph = new GRAPH<>();
        graph.addvertex("a");
        graph.addvertex("b");
        graph.addvertex("c");
        graph.addvertex("d");
        graph.addvertex("e");

        graph.addEdge("a","b");
        graph.addEdge("a","c");
        graph.addEdge("c","d");
        graph.breadthfirsttraversal();
        System.out.println();
        graph.depthfirsttraversal();
        System.out.println( graph.breadthfirstsearch("a"));
        System.out.println();
        graph.connectedcomponent();


        graph.display();
        System.out.println();

        graph.shortestpath();

    }
}

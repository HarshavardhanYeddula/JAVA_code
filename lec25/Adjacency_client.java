package lec25;

public class Adjacency_client {
    public static void main(String[] args) {
        AdjacencyMapGraph<String> graph = new AdjacencyMapGraph<>();
        graph.addvertex("A");
        graph.addvertex("B");
        graph.addvertex("C");
        graph.addvertex("D");

        graph.addEdge("A","B");
        graph.addEdge("B","C");


        graph.display();

    }
}

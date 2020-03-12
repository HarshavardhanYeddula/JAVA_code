package lec25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdjacencyMapGraph<T> {
    Map<T, Vertex> vertexmap;
    Map<Vertex, Vertex> parent = new HashMap<>();

    public AdjacencyMapGraph() {
        this.vertexmap = new HashMap<>();


    }


    public void addvertex(T value) {
        if (!vertexmap.containsKey(value)) {
            vertexmap.put(value, new Vertex(value));
        }
    }

    public void addEdge(T first, T second) {
        vertexmap.get(first).neighbour.put(vertexmap.get(second), 1);
        vertexmap.get(second).neighbour.put(vertexmap.get(first), 1);
    }


    public void addEdgeweight(T first, T second, int weight) {
        vertexmap.get(first).neighbour.put(vertexmap.get(second), weight);
        vertexmap.get(second).neighbour.put(vertexmap.get(first), weight);
    }

    public void display() {
        for (T vertex : vertexmap.keySet()) {
            System.out.print(vertex + "->");
            for (Vertex padosi : vertexmap.get(vertex).neighbour.keySet()) {
                System.out.print(padosi.value);
            }

            System.out.println();
        }

    }


    public void parent() {
        for (Vertex vertex : vertexmap.values()) {
            parent.put(vertex, null);

        }
    }


    public Vertex find(Vertex v) {

        while (parent.get(v) != null) {
            v = parent.get(v);

        }
        return v;
    }


    public boolean union(Vertex first, Vertex second) {
        Vertex f = find(first);
        Vertex s = find(second);

        if (f != s) {
            parent.put(f, s);
            return true;
        }
        return false;
    }



//    public AdjacencyMapGraph<String> kruskal(){
//
//
//        parent();
//        ArrayList<edge> edges = new ArrayList<>();
//        AdjacencyMapGraph<T> map = new AdjacencyMapGraph<>();
//        for(T values:vertexmap.keySet()){
//            map.addvertex(values);
//        }
//        for (Vertex vertex:vertexmap.values()){
//            for (Vertex padosi: vertex.neighbour.keySet()) {
//                edges.add(new edge(vertex,padosi,vertex.neighbour.get(padosi)));
//            }
//        }
//          edges.sort((o1,o2) -> o1.weight-o2.weight);
//        for (edge e:edges) {
//            if(union(e.first,e.second)) {
//                map.addEdgeweight(e.first.value, e.second.value, e.weight);
//
//            }
//        }
//        return map;
//    }





    public class Vertex{
        T value;
        Map<Vertex, Integer> neighbour;
         public Vertex(T value){
             this.value=value;
             this.neighbour=new HashMap<>();
         }

    }

    private class edge{
       Vertex first;
       Vertex second;
        int weight;
       public edge(Vertex first,Vertex second,int weight){
           this.first=first;
           this.second=second;
           this.weight=weight;
       }

    }

}

package Graph;


import java.util.*;


public class GRAPH<T> {
    LinkedList<Vertex> vertices;


    public GRAPH() {
        this.vertices = new LinkedList<>();
    }


    private class Vertex {
        T value;
        LinkedList<Vertex> neighbour;


        public Vertex(T value) {
            this.value = value;
            this.neighbour = new LinkedList<>();
        }


    }


    public Vertex find(T value) {
        for (Vertex vertex : vertices) {
            if (vertex.value.equals(value)) {
                return vertex;
            }
        }
        return null;
    }

    public void addvertex(T value) {
        vertices.add(new Vertex(value));
    }


    public void addEdge(T first, T second) throws Exception {
        Vertex f = find(first);
        Vertex s = find(second);
        if (f == null && s == null) {
            throw new Exception("empty graph");
        } else {
            f.neighbour.add(s);
            s.neighbour.add(f);
        }

    }

    public void display() {
        for (Vertex vertex : vertices) {
            System.out.print(vertex.value + "->");

            for (Vertex padosi : vertex.neighbour) {
                System.out.print(padosi.value);
            }
            System.out.println();
        }
    }

    public void depthfirsttraversal() {
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visted = new HashSet<>();
        Vertex vertex = vertices.get(0);
        stack.add(vertex);
        visted.add(vertex);
        while (!stack.isEmpty()) {
            Vertex top = stack.pop();
            System.out.println(top.value);
            for (Vertex padosi : top.neighbour) {
                if (!visted.contains(padosi)) {
                    visted.add(padosi);
                    stack.push(padosi);
                }
            }
        }
    }


    public void breadthfirsttraversal() {
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visted = new HashSet<>();
        Vertex vertex = vertices.get(0);
        queue.add(vertex);
        visted.add(vertex);
        while (!queue.isEmpty()) {
            Vertex top = queue.remove();
            System.out.println(top.value);
            for (Vertex padosi : top.neighbour) {
                if (!visted.contains(padosi)) {
                    visted.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }


    public boolean breadthfirstsearch(T value) {
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visted = new HashSet<>();
        Vertex vertex = vertices.get(0);
        queue.add(vertex);
        visted.add(vertex);
        while (!queue.isEmpty()) {
            Vertex top = queue.remove();
            if (top.value.equals(value)) {

                return true;
            }
            for (Vertex padosi : top.neighbour) {
                if (!visted.contains(padosi)) {
                    visted.add(padosi);
                    queue.add(padosi);
                }
            }

        }
        return false;
    }


    public void connectedcomponent() {
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        for (Vertex vertex : vertices) {
            if (visited.contains(vertex)) {
                continue;
            }
            queue.add(vertex);
            visited.add(vertex);
            while (!queue.isEmpty()) {
                Vertex top = queue.remove();
                System.out.println(top.value);
                for (Vertex padosi : top.neighbour) {
                    if (!visited.contains(padosi)) {
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                }
            }
            System.out.println();
        }
    }

    public void shortestpath() {
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visted = new HashSet<>();
        Vertex vertex = vertices.get(0);


        visted.add(vertex);
        queue.add(vertex);
        queue.add(null);
        int level = 0;
        while (queue.size() > 1) {
            Vertex front = queue.remove();
            if (front == null) {
                level++;
                queue.add(null);
                continue;
            }

            System.out.println(front.value + "->" + level);
            for (Vertex padosi : front.neighbour) {
                if (!visted.contains(padosi)) {
                    visted.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

//
//    public boolean bipartitegraph() {
//        Set<Vertex> green = new HashSet<>();
//        Set<Vertex> red = new HashSet<>();
//        Set<Vertex> visited = new HashSet<>();
//        Queue<Vertex> queue = new LinkedList<>();
//        Vertex vertex = vertices.get(0);
//        red.add(vertex);
//        queue.add(vertex);
//
//
//        while (!queue.isEmpty()) {
//            Vertex front = queue.remove();
//            if (red.contains(front)) {
//
//                for (Vertex padosi : front.neighbour) {
//                    if (!visited.contains(padosi)) {
//                        green.add(padosi);
//                        visited.add(padosi);
//                        queue.add(padosi);
//                    } else if (red.contains(padosi)) {
//                        return false;
//                    }
//                }
//
//
//                if (green.contains(front)) {
//
//                    for (Vertex padosi : front.neighbour) {
//                        if (!visited.contains(padosi)) {
//                            red.add(padosi);
//                            visited.add(padosi);
//                            queue.add(padosi);
//                        } else
//                            if (green.contains(padosi)) {
//                                return false;
//                            }
//                        }
//
//
//                    }
//                }
//
//                return true;
//            }
//
//
//        }
//
//
//
//}
}

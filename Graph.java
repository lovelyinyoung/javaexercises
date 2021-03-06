import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<Integer, Node> nodeLookup = new HashMap<>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<>();
        
        private Node(int id) {
            this.id = id;
        }
    }

    private Node getNode(int id) {
        return nodeLookup.get(id);
    }

    // public void addEdge (int source, int dest) {
    //     Node s = getNode(source);
    //     Node d = getNode(dest);
    //     s.adjacent.add(d);
    // }

    public boolean hasPathDFS(int source, int dest) {
        Node s = getNode(source);
        Node d = getNode(dest);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node source, Node dest, Set<Integer> visited) {
        if (visited.contains(source.id)) {
            return false;
        }
        visited.add(source.id);

        if (source == dest) {
            return true;
        }

        for (Node child : source.adjacent) {
            if (hasPathDFS(child, dest, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(Node source, Node dest) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        nextToVisit.add(source);

        while(!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            if (node == dest) {
                return true;
            }

            if (visited.contains(node.id)) {
                continue;
            }
            visited.add(node.id);

            for (Node child : node.adjacent) {
                nextToVisit.add(child);
            }
        }
        return false;
    }
}

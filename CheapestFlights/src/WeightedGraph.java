import java.util.*;
public class WeightedGraph {
    private Map<Vertex, HashSet<Edge>> edges;

    public WeightedGraph() {
        edges = new HashMap<>();
    }

    public void addEdge(Vertex v1, Vertex v2, int d, String description) {
        addEdge(new Edge(v1, v2, d , description));
        addEdge(new Edge(v2, v1, d, description));
    }

    public void addEdge(Edge edge) {
        Vertex v1 = edge.getStart();
        if (!edges.containsKey(v1)) {
            edges.put(v1, new HashSet<>());
        }
        edges.get(v1).add(edge);
    }

    public Set<Vertex> getVertices() {
        return vertexEdgeMap.keySet();
    }

    public Vertex getVertex(String name) {
        for (Vertex v : vertexEdgeMap.keySet()) {
            if (v.getName().equals(name)) {
                return v;
            }
        }
        return new Vertex(name);
    }

    public Set<Edge> getEdges() {
        Set<Edge> edges = new HashSet<>();
        for (HashSet<Edge> edgeSet : vertexEdgeMap.values()) {
            edges.addAll(edgeSet);
        }
        return edges;
    }

    public Set<Vertex> getNeighbors(Vertex v) {
        Set<Vertex> neighbors = new HashSet<>();
        if (vertexEdgeMap.containsKey(v)) {
            for (Edge edge : vertexEdgeMap.get(v)) {
                neighbors.add(edge.getV2());
            }
        }
        return neighbors;
    }

    public int getDistance(Vertex v1, Vertex v2) {
        if (!vertexEdgeMap.containsKey(v1)) return Integer.MAX_VALUE;
        for (Edge edge : vertexEdgeMap.get(v1)) {
            if (edge.getV2().equals(v2)) {
                return edge.getDistance();
            }
        }
        return Integer.MAX_VALUE;
    }


    public String findPath(Vertex v1, Vertex v2){
//        dh = new DijkstraHelper(this);
//        dh.create
        return "";
    }




}
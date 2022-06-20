package graphs.challange1;

import graphs.DoublyLinkedList;
import graphs.Graph;
import graphs.Queue;

public class BreadFirstSearch {

    //Breadth First Traversal of Graph g
    public static String bfs(Graph g) {
        String result = "";

        if (g.vertices < 1){
            return result;
        }
        //Boolean Array to hold the history of visited nodes (by default-false)
        boolean[] visited = new boolean[g.vertices];

        for (int i = 0; i < g.vertices; i++) {

            if(!visited[i]){
                result += bfsVisit(g,i,visited);
            }
        }

        return result;
    }

    private static String bfsVisit(Graph graph, int source, boolean[] visitedArray) {

        String result = "";

        //Create Queue for Breadth First Traversal and enqueue source in it
        Queue<Integer> queue = new Queue<>(graph.vertices);

        queue.enqueue(source);

        visitedArray[source] = true;

        while (!queue.isEmpty()) {

            int current_node = queue.dequeue();
            result += String.valueOf(current_node);

            DoublyLinkedList<Integer>.Node temp = null;

            if(graph.adjacencyList[current_node] != null)
                temp = graph.adjacencyList[current_node].headNode;

            while (temp != null) {

                if (!visitedArray[temp.data]) {
                    queue.enqueue(temp.data);
                    visitedArray[temp.data] = true; //Visit the current Node
                }
                temp = temp.nextNode;
            }

        }
        return result;
    }

    public static void main(String[] args) {
//        Graph g = new Graph(5);
//        g.addEdge(0,1);
//        g.addEdge(0,2);
//        g.addEdge(1,3);
//        g.addEdge(1,4);
//        System.out.println("Graph1:");
//        g.printGraph();
//        System.out.println("BFS traversal of Graph1 : " + bfs(g));
        System.out.println();

        Graph g2 = new Graph(10);

        g2.addEdge(0,1);
        g2.addEdge(0,2);
        g2.addEdge(0,3);
        g2.addEdge(1,4);
        g2.addEdge(1,5);
        g2.addEdge(2,6);
        g2.addEdge(3,7);
        g2.addEdge(4,8);
        g2.addEdge(4,9);

        System.out.println("Graph2:");
        g2.printGraph();
        System.out.println("BFS traversal of Graph2 : " + bfs(g2));
    }

}

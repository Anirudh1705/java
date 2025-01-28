

import java.util.ArrayList;

public class Graph_Demo {
    static class Edge{
        int src;
        int dest;
        //int wt;
        public Edge(int src, int dest /*int wt*/){
            this.src= src;
            this.dest= dest;
            //this.wt= wt;
        }
    }
    public static void main(String[] args) {
        int V= 6;
        ArrayList<Edge>[]graph = new ArrayList[V];
        for(int i=1; i<V; i++){
            graph[i]= new ArrayList<>();
        }
        /*graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        graph[4].add(new Edge(4, 2, 2));
        */
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 5));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        
        for(int i=1; i<V; i++){
            System.out.print(i+"-> ");
            for(int j=0; j<graph[i].size(); j++){
                Edge e= graph[i].get(j);
                System.out.print(e.dest+" ");
            }
            System.out.println();
        }
        /*for(int i=0; i<graph[2].size(); i++){
            Edge e= graph[2].get(i);
            //System.out.println(e.src+" "+e.dest+" "+e.wt);
            System.out.println(e.dest);
        }*/
    }
}
import java.util.*;
public class BellmanFord { 
static class Edge {
int src;
int dest;
int wt;
public Edge(int s, int d, int w) {
this.src = s;
this.dest = d;
this.wt = w;
}
}
static void createGraph(ArrayList<Edge> graph[]) {
for(int i=0; i<graph.length; i++) {
graph[i] = new ArrayList<>();
}
graph[0].add(new Edge(0, 1, 2));
graph[0].add(new Edge(0, 2, 4));
graph[1].add(new Edge(1, 2, -4));
graph[2].add(new Edge(2, 3, 2));
graph[3].add(new Edge(3, 4, 4));

graph[4].add(new Edge(4, 1, -1));//if here weight is <= -3
}   //then this algo fails as it will have neg weight cycle

public static void bellmanFord(ArrayList<Edge> graph[], int src) {
    //O(V.E)
int dist[] = new int[graph.length];
for(int i=0; i<dist.length; i++) {
if(i != src)
dist[i] = Integer.MAX_VALUE;
}
//O(V)
for(int i=0; i<graph.length-1; i++) {
//edges - O(E)
for(int j=0; j<graph.length; j++) {
for(int k=0; k<graph[j].size(); k++) {
Edge e = graph[j].get(k);
int u = e.src;
int v = e.dest;
int wt = e.wt;
if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]) {
//i think only this condition (dist[u]+wt < dist[v])
// can also give correct output in most cases
dist[v] = dist[u] + wt;
}
}
}
}
//Detecting Negative Weight Cycle
for(int j=0; j<graph.length; j++) {
for(int k=0; k<graph[j].size(); k++) {
Edge e = graph[j].get(k);
int u = e.src;
int v = e.dest;
int wt = e.wt;
if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]) {
  //i think only this condition (dist[u]+wt < dist[v])
// can also give correct output in most cases
System.out.println("negative weight cycle exists");
break;
}
}
}
for(int i=0; i<dist.length; i++) {
System.out.print(dist[i]+" ");
}
System.out.println();
}
public static void main(String args[]) {
int V = 5;
ArrayList<Edge> graph[] = new ArrayList[V];
createGraph(graph);
int src = 0;
bellmanFord(graph, src);
}
}
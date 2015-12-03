package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kaling on 12/3/15.
 * 算法第四版page336
 */
public class Graph {
    //顶点数目
    private final int vertexNum;
    //边数目
    private int edgeNum;
    //邻接表
    private List<Integer>[] adj;

    public Graph(int vertexNum) {
        this.vertexNum = vertexNum;
        this.edgeNum = 0;
        adj = (List<Integer>[]) new ArrayList[vertexNum];
        for (int v = 0; v < vertexNum; v++){
            adj[v] = new ArrayList<>();
        }

        Scanner in = new Scanner(System.in);
        int E = in.nextInt();
        for (int i = 0; i < E; i++){
            //添加一条边
            int v = in.nextInt();
            int w = in.nextInt();
            addEdge(v, w);
        }
    }

    public int getVertexNum(){
        return vertexNum;
    }

    public int getEdgeNum(){
        return edgeNum;
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
        edgeNum++;
    }

    public Iterable<Integer> adj(int vertex){
        return adj[vertex];
    }

}

package Graph;

/**
 * Created by kaling on 12/3/15.
 * 图的深度优先搜索，算法第四版p339
 */
public class DepthFirstSearch {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph graph, int start){
        marked = new boolean[graph.getVertexNum()];
        dfs(graph, start);
    }

    private void dfs(Graph graph, int vertex) {
        marked[vertex] = true;
        count++;
        for (int w : graph.adj(vertex)){
            if (!marked[w]){
                dfs(graph, w);
            }
        }
    }

    /**
     * 是否被标记
     * @param w 节点
     * @return
     */
    public boolean isMarked(int w){
        return marked[w];
    }

    public int getCount(){
        return count;
    }
}

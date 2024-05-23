## BFS 

### BFS - 인접 리스트
```Java
import java.util.LinkedList;

LinkedList<Integer> adjList = new LinkedList<>();
for(int i = 0; i <= n; i++){
    adjList[i] = new LinkedList<Integer>();
}

for(int i = 0; i <= m; i++){
    int v1 = sc.nextInt();
    int v2 = sc.nextInt();
    adjList[v1].add(v2);
    adjList[v2].add(v1); // 양방향
}

for(int i = 1; i <= n; i++){
    Collections.sort(adjList[i]);
}

bfs(v, adjList, visited);
```

```Java
import java.util.Iterator;
import java.util.LinkedList;

public static void bfs(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
    Queue<Integer> q = new LinkedList<>();
    visited[v] = true;
    q.add(v);

    while (q.size() != 0) {
        v = q.poll();
        Iterator<Integer> iter = adjList[v].listIterator();
        while(iter.hasNext()){
            int w = iter.next();
            if(!visited[w]){
                visited[w] = true;
                q.add(w);
            }
        }
    }
}
```
### BFS - 인접 행렬
```Java
int[][] adjArr = new int[n+1][n+1];
for(int i = 0; i < m; i++){
    int v1 = sc.nextInt();
    int v2 = sc.nextInt();
    adjArr[v1][v2] = 1;
    adjArr[v2][v1] = 1;
}

bfs(v, adjArr, visited);
```

```Java
import java.util.LinkedList;

public static void bfs(int v, int[][] adjArr, boolean[] visited) {
    Queue<Integer> q = new LinkedList<>();
    int n = adjArr.length - 1;

    q.add(v);
    visited[v] = true;

    while (!q.isEmpty()) {
        v = q.poll();

        for (int i = 1; i <= n; i++) {
            if (adjArr[v][i] == 1 && !visited[i]) {
                q.add(i);
                visited[i] = true;
            }
        }
    }
}
```

## DFS

### DFS - 인접리스트

```Java
import java.util.LinkedList;

LinkedList<Integer>[] adjList = new LinkedList[n+1];
for(int i = 0; i <= n; i++){
    adjList[i] = new LinkedList<>();
}

for(int i = 0; i < m; i++){
    int v1 = sc.nextInt();
    int v2 = sc.nextInt();
    adjList[v1].add(v2);
    adjList[v2].add(v1);
}

for(int i = 1; i <= n; i++){
    Collections.sort(adjList[i]);
}

dfs(v, adjList, visited);
```
```Java
public static void dfs(int v, LinkedList<Integer>[] adjList, boolean[] visited){
    visited[v] = true;
    
    Iterator<Integer> iter = adjList[v].listIterator();
    while(iter.hasNext()){
        int w = iter.next();
        if(!visited[w])
            dfs(w, adjList, visited);
    }
}
```

### DFS - 인접행렬

```Java
int[][] adjArr = new int[n+1][n+1];
for(int i = 0; i < m; i++){
    int v1 = sc.nextInt();
    int v2 = sc.nextInt();
    adjArr[v1][v2] = 1;
    adjArr[v2][v1] = 1;
}

dfs(v, adjArr, visited);
```
```Java
public static void dfs(int v, int[][] arr, boolean[] visited){
    int n = arr.length - 1;
    visited[v] = true;
    
    for(int i = 1; i <= n; i++){
        if(arr[v][i] == 1 && !visited[i]){
            dfs(i, arr, visited);
        }
    }
}

```




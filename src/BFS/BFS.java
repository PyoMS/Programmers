package BFS;

import java.util.*;

public class BFS {
	public int solution(int n, int[][] edge) {
//		int[][] arr = new int[n+1][n+1]; //인접행렬
		ArrayList[] arr = new ArrayList[n+1]; 
		for (int i=1;i<arr.length;i++) {
			arr[i] = new ArrayList();
		}

		// 인접행렬 input
//		for(int i=0;i<edge.length;i++) {
//			int x = edge[i][0];
//			int y = edge[i][1];
//			arr[x][y] = 1;
//			arr[y][x] = 1;
//		}
		
		//인접리스트 input
		for(int i =0;i<edge.length;i++) {
			arr[edge[i][0]].add(edge[i][1]);
			arr[edge[i][1]].add(edge[i][0]);
		}
		
//		for (int i=1;i<arr.length;i++) {
//			System.out.println(i+" : "+arr[i].toString());
//		}
		
        return bfs(n,arr,1);
    }
	
	/**
	 * @param n Node 갯수
	 * @param arr 인접행렬
	 * @param p 시작지점*/
	public int bfs(int n, int[][] arr, int p) {
		int max = 0; int maxCount = 0;
		boolean[] visit = new boolean[n+1];  visit[0] = true; // 방문한 node.
		int[] distance = new int[n+1]; //거리
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(p); // 1 node input
		
		while(!q.isEmpty()) {
			System.out.println(q.toString());
			int num = q.poll();
			visit[num] = true;
			
			for(int i=1;i<arr.length;i++) {
				if(arr[num][i]==1 && !visit[i]) {
					visit[i]=true; //양방향
					q.offer(i);
					distance[i] += distance[num]+1;
					max = Math.max(max, distance[i]);
				}
			}
			
		}
		for (int i = 0; i < distance.length; i++) {
			if(distance[i]==max)maxCount++;
		}
		
		return maxCount;
	}
	
	/**
	 * @param n Node 갯수
	 * @param arr 인접리스트
	 * @param p 시작지점*/
	public int bfs(int n, ArrayList[] arr, int p) {
		int max = 0; int maxCount = 0;
		boolean[] visit = new boolean[n+1];  visit[0] = true; // 방문한 node.
		int[] distance = new int[n+1]; //거리
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(p); // 1 node input
		
		while(!q.isEmpty()) {
			System.out.println(q.toString());
			int num = q.poll();
			visit[num] = true;
			
			for(int i=0;i<arr[num].size();i++) {
				int data = (int) arr[num].get(i);
				if(!visit[data]) {
					visit[data]=true; //양방향
					q.offer(data);
					distance[data] += distance[num]+1;
					max = Math.max(max, distance[data]);
				}
			}
			
		}
		for (int i = 0; i < distance.length; i++) {
			if(distance[i]==max)maxCount++;
		}
		
		return maxCount;
	}
	
	
	
	public static void main(String[] args) {
		BFS b = new BFS();
		int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		System.out.println(b.solution(6, edge));
		
	}
}

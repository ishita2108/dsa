package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphPath {
	
	private static boolean bfs(Map<Integer, List<Integer>> graph, int start, int target) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Set<Integer> visited = new HashSet<>();
		
		queue.add(start);
		visited.add(start);
		
		while (!queue.isEmpty()) {
            int node = queue.poll();

            // If the target node is found
            if (node == target) {
                return true;
            }
		
		
		
		for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                queue.add(neighbor);
                visited.add(neighbor);
            }
        }
		}
		return false;
	}
	
	private static boolean dfs(Map<Integer, List<Integer>> graph, int start, int target) {
		Stack<Integer> stack = new Stack<Integer>();
		Set<Integer> visited = new HashSet<>();
		
		stack.add(start);
		visited.add(start);
		
		while (!stack.isEmpty()) {
            int node = stack.pop();

            // If the target node is found
            if (node == target) {
                return true;
            }
		
		
		
		for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
            	stack.add(neighbor);
                visited.add(neighbor);
            }
        }
		}
		return false;
	}

	public static void main(String[] args) {
		 // Create a graph using an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(4));

        // Define the start and target nodes
        int start = 0;
        int target = 5;

        // Test BFS approach
        System.out.println("Using BFS: ");
        if (bfs(graph, start, target)) {
            System.out.println("Path exists!");
        } else {
            System.out.println("No path found.");
        }
        
     // Test DFS approach
        System.out.println("Using DFS: ");
        if (dfs(graph, start, target)) {
            System.out.println("Path exists!");
        } else {
            System.out.println("No path found.");

	}

	}
}

	

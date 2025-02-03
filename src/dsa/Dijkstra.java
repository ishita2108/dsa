package dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijkstra {

	// Method to implement Dijkstra's algorithm
	public static Map<Integer, Integer> dijkstra(Map<Integer, List<int[]>> graph, int source) {
		// Priority queue to process nodes by their distance (min-heap)
		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

		// Distance map to keep track of the shortest distance to each node
		Map<Integer, Integer> dist = new HashMap<>();

		// Initialize the distances (INF for all nodes except the source)
		for (Integer node : graph.keySet()) {
			dist.put(node, Integer.MAX_VALUE);
		}
		dist.put(source, 0);

		// Add the source node to the priority queue (with distance 0)
		pq.offer(new int[] { source, 0 });

		while (!pq.isEmpty()) {
			int[] current = pq.poll();
			int node = current[0];
			int currentDistance = current[1];

			// Process all neighbors of the current node
			for (int[] neighbor : graph.get(node)) {
				int nextNode = neighbor[0];
				int weight = neighbor[1];

				// Calculate the potential new distance to the neighbor
				int newDist = currentDistance + weight;

				// If the new distance is shorter, update the distance and add to the queue
				if (newDist < dist.get(nextNode)) {
					dist.put(nextNode, newDist);
					pq.offer(new int[] { nextNode, newDist });
				}
			}
		}

		return dist;
	}

	public static void main(String[] args) {

		// Create a weighted graph as an adjacency list
		Map<Integer, List<int[]>> graph = new HashMap<>();

		// Graph initialization (each entry in the list is {neighbor, weight})
		graph.put(0, Arrays.asList(new int[] { 1, 4 }, new int[] { 2, 1 }));
		graph.put(1, Arrays.asList(new int[] { 3, 1 }));
		graph.put(2, Arrays.asList(new int[] { 1, 2 }, new int[] { 3, 5 }));
		graph.put(3, Arrays.asList());

		// Source node
		int source = 0;

		// Run Dijkstra's algorithm
		Map<Integer, Integer> distances = dijkstra(graph, source);

		// Print the shortest distance from the source to each node
		System.out.println("Shortest distances from node " + source + ":");
		for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
			System.out.println("Node " + entry.getKey() + " -> " + entry.getValue());
		}
	}

}

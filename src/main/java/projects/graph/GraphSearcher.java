package projects.graph;

import java.util.*;

/**
 * @author harhani perera
 *
 */
public class GraphSearcher {

	/**
	 * Calculate the shortest path between a specified node in a directed,
	 * un-weighted, acyclic graph.
	 * 
	 * @param startNode
	 *            source node
	 * @param finishNode
	 *            target node
	 * @return return the shortest distance (number of edges) between two nodes
	 *         if these are connected, -1 otherwise
	 */
	public static int getShortestPathDistance(GraphNode startNode, GraphNode finishNode) {
		// contains the nodes that is already visited.
		Set<GraphNode> alreadyVisited = new HashSet<>();
		// contains the node that needs to be visited next, using a FIFO Queue
		// to search breadth first.
		Queue<GraphNode> toBeVisited = new LinkedList<>();
		// stored calculated distance from the source
		Map<GraphNode, Integer> distanceFromSource = new HashMap<>();
		// Stored the parent of the node for shortest path
		Map<GraphNode, GraphNode> predecessors = new HashMap<>();
		toBeVisited.add(startNode);
		// initialize distance to -1 for source, once source is visited distance
		// will be set as 0.
		distanceFromSource.put(startNode, -1);
		predecessors.put(startNode, startNode);

		while (!toBeVisited.isEmpty()) {
			GraphNode next = toBeVisited.poll();
			int distance = distanceFromSource.get(predecessors.get(next)) + 1;
			if (next.equals(finishNode)) {
				return distance;
			}
			// if next is not already visited, then we have to add its children
			// to visit.
			if (!alreadyVisited.contains(next)) {
				if (next.getDirectlyLinkedNodes() != null) {
					for (GraphNode node : next.getDirectlyLinkedNodes()) {
						toBeVisited.add(node);
						if (predecessors.get(node) == null) {
							predecessors.put(node, next);
						}
					}
				}
				alreadyVisited.add(next);
				distanceFromSource.put(next, distance);
			}
		}
		return -1;
	}

}

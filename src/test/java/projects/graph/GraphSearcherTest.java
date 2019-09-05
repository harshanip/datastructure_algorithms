package projects.graph;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;



public class GraphSearcherTest {

	
	@Test
	public void getShortestPathDistanceForStartNodeWithNoChildShouldReturnNegativeOne() {
		GraphNode startNode = mock(GraphNode.class);
		GraphNode finishNode = mock(GraphNode.class);
		when(startNode.getDirectlyLinkedNodes()).thenReturn(null);
		assertEquals(-1, GraphSearcher.getShortestPathDistance(startNode, finishNode));
	}

	@Test
	public void getShortestPathDistanceForUnreachableNodeshouldReturnNegativeOne() {
		GraphNode startNode = mock(GraphNode.class);
		GraphNode B = mock(GraphNode.class);
		GraphNode finishNode = mock(GraphNode.class);
		Set<GraphNode> nodes = new HashSet<>();
		nodes.add(B);
		when(startNode.getDirectlyLinkedNodes()).thenReturn(nodes);
		assertEquals(-1, GraphSearcher.getShortestPathDistance(startNode, finishNode));
	}

	@Test
	public void getShortestPathDistanceForAdjecentNodesShouldReturnOne() {
		GraphNode startNode = mock(GraphNode.class);
		GraphNode finishNode = mock(GraphNode.class);
		Set<GraphNode> nodes = new HashSet<>();
		nodes.add(finishNode);
		when(startNode.getDirectlyLinkedNodes()).thenReturn(nodes);
		assertEquals(1, GraphSearcher.getShortestPathDistance(startNode, finishNode));
	}

	@Test
	public void getShortestPathDistanceForGrandChildNodeShouldReturnTwo() {
		GraphNode startNode = mock(GraphNode.class);
		GraphNode B = mock(GraphNode.class);
		GraphNode finishNode = mock(GraphNode.class);
		
		Set<GraphNode> adjStartNode = new HashSet<>();
		adjStartNode.add(B);

		Set<GraphNode> adjB = new HashSet<>();
		adjB = new HashSet<>();
		adjB.add(finishNode);

		when(startNode.getDirectlyLinkedNodes()).thenReturn(adjStartNode);
		when(B.getDirectlyLinkedNodes()).thenReturn(adjB);
		
		assertEquals(2, GraphSearcher.getShortestPathDistance(startNode, finishNode));
	}
 
	@Test
	public void getShortestPathDistanceForTargetNodewithTwoPathShouldReturnTheShortest() {
		GraphNode startNode = mock(GraphNode.class);
		GraphNode B = mock(GraphNode.class);
		GraphNode finishNode = mock(GraphNode.class);
		
		Set<GraphNode> adjStartNode = new HashSet<>();
		adjStartNode.add(B);
		adjStartNode.add(finishNode);

		Set<GraphNode> adjB = new HashSet<>();
		adjB = new HashSet<>();
		adjB.add(finishNode);

		when(startNode.getDirectlyLinkedNodes()).thenReturn(adjStartNode);
		when(B.getDirectlyLinkedNodes()).thenReturn(adjB);
		
		assertEquals(1, GraphSearcher.getShortestPathDistance(startNode, finishNode));
	}

}

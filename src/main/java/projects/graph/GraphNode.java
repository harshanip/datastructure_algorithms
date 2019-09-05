package projects.graph;

import java.util.*;

public interface GraphNode {
/**
* Returns all the GraphNodes directly linked
* to this GraphNode.
* These are considered to be distance 1 from this node.
*/
Set<GraphNode> getDirectlyLinkedNodes();
}
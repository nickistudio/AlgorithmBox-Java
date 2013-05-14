package com.nickistudio.algorithm.graph.test;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.nickistudio.algorithm.graph.BellmanFordAlgorithm;
import com.nickistudio.algorithm.graph.type.Edge;
import com.nickistudio.algorithm.graph.type.Graph;
import com.nickistudio.algorithm.graph.type.Vertex;

/**
 * Paths:
 *    0|1|2
 * --------
 * 0| 0|9|1
 * 1| 4|0|2
 * 2| 2|4|0
 *
 */
public class BellmanFordAlgorithmTest
{

	private List<Vertex> vertices;
	private List<Edge> edges;
	private Graph graph;

	@Before
	public void setUp() throws Exception
	{
		vertices = new ArrayList<Vertex>();
		edges = new ArrayList<Edge>();

		for (int i = 0; i < 3; i++) {
			vertices.add(new Vertex("V" + i));
		}

		addEdge("E0", 0, 1, 9);
		addEdge("E1", 0, 2, 1);
		addEdge("E3", 1, 0, 4);
		addEdge("E4", 1, 2, 2);
		addEdge("E5", 2, 0, 2);
		addEdge("E6", 2, 1, 4);

		graph = new Graph(vertices, edges);
	}

	@Test
	public void Test()
	{
		BellmanFordAlgorithm r = new BellmanFordAlgorithm(graph);
		r.execute(vertices.get(0));
		r.dump();
	}

	private void addEdge(String id, int src, int des, int duration)
	{
		Edge lane = new Edge(id, vertices.get(src), vertices.get(des), duration);
		edges.add(lane);
	}
}

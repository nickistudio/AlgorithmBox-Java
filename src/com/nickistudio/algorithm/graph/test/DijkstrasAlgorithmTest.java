package com.nickistudio.algorithm.graph.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.nickistudio.algorithm.graph.DijkstrasAlgorithm;
import com.nickistudio.algorithm.graph.type.Edge;
import com.nickistudio.algorithm.graph.type.Graph;
import com.nickistudio.algorithm.graph.type.Vertex;

public class DijkstrasAlgorithmTest
{

	private List<Vertex> vertices;
	private List<Edge> edges;
	private Graph graph;

	@Before
	public void setUp() throws Exception
	{
		vertices = new ArrayList<Vertex>();
		edges = new ArrayList<Edge>();

		for (int i = 0; i < 11; i++) {
			vertices.add(new Vertex("V" + i));
		}

		addEdge("E0", 0, 1, 85);
		addEdge("E1", 0, 2, 217);
		addEdge("E2", 0, 4, 173);
		addEdge("E3", 2, 6, 186);
		addEdge("E4", 2, 7, 103);
		addEdge("E5", 3, 7, 183);
		addEdge("E6", 5, 8, 250);
		addEdge("E7", 8, 9, 84);
		addEdge("E8", 7, 9, 167);
		addEdge("E9", 4, 9, 502);
		addEdge("E10", 9, 10, 40);
		addEdge("E11", 1, 10, 600);

		graph = new Graph(vertices, edges);
	}

	@Test
	public void test()
	{
		DijkstrasAlgorithm dijkstra = new DijkstrasAlgorithm(graph);
		dijkstra.execute(vertices.get(0));

		LinkedList<Vertex> path = dijkstra.getPath(vertices.get(10));
		assertNotNull(path);
		assertTrue(path.size() > 0);

		for (int i = 0; i < path.size() - 1; i++) {
			System.out.print(path.get(i) + " -> ");
		}
		System.out.print(path.get(path.size() - 1));
	}

	private void addEdge(String id, int src, int des, int duration)
	{
		Edge lane = new Edge(id, vertices.get(src), vertices.get(des), duration);
		edges.add(lane);
	}
}

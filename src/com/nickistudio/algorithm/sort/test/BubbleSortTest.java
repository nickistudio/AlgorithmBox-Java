package com.nickistudio.algorithm.sort.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nickistudio.algorithm.sort.BubbleSort;

public class BubbleSortTest
{
	@Test
	public void testSortIntArray()
	{
		int[] array = new int[] { 2, 4, 1, 6, 7, 8, 9, 3, 5, 0 };
		BubbleSort.sort(array);
		for (int i = 0; i < 10; i++) {
			assertEquals(i, array[i]);
		}
	}

	@Test
	public void testSortInvertedIntArray()
	{
		int[] array = new int[] { 2, 4, 1, 6, 7, 8, 9, 3, 5, 0 };
		BubbleSort.sortInverted(array);
		for (int i = 0; i < 10; i++) {
			assertEquals(9 - i, array[i]);
		}
	}

	@Test
	public void testSortFloatArray()
	{
		float[] array = new float[] { 0.2f, 0.4f, 0.1f, 0.6f, 0.7f, 0.8f, 0.9f, 0.3f, 0.5f, 0.0f };
		BubbleSort.sort(array);
		for (int i = 0; i < 10; i++) {
			float value = (float) i / 10;
			assertEquals(value, array[i], 0.1f);
		}
	}

	@Test
	public void testSortInvertedFloatArray()
	{
		float[] array = new float[] { 0.2f, 0.4f, 0.1f, 0.6f, 0.7f, 0.8f, 0.9f, 0.3f, 0.5f, 0.0f };
		BubbleSort.sortInverted(array);
		for (int i = 0; i < 10; i++) {
			float value = (float) (9 - i) / 10;
			assertEquals(value, array[i], 0.1f);
		}
	}

	@Test
	public void testSortDoubleArray()
	{
		double[] array = new double[] { 0.2, 0.4, 0.1, 0.6, 0.7, 0.8, 0.9, 0.3, 0.5, 0.0 };
		BubbleSort.sort(array);
		for (int i = 0; i < 10; i++) {
			double value = (double) i / 10;
			assertEquals(value, array[i], 0.1);
		}
	}

	@Test
	public void testSortInvertedDoubleArray()
	{
		double[] array = new double[] { 0.2, 0.4, 0.1, 0.6, 0.7, 0.8, 0.9, 0.3, 0.5, 0.0 };
		BubbleSort.sortInverted(array);
		for (int i = 0; i < 10; i++) {
			double value = (double)  (9 - i)  / 10;
			assertEquals(value, array[i], 0.1);
		}
	}

	@Test
	public void testSortStringArray()
	{
		String[] array = new String[] { "B", "E", "A", "J", "G", "F", "C", "D", "H", "I" };
		BubbleSort.sort(array);
		for (int i = 0; i < 10; i++) {
			String value = Character.toString((char) (i+65));
			assertEquals(value, array[i]);
		}
	}

	@Test
	public void testSortInvertedStringArray()
	{
		String[] array = new String[] { "B", "E", "A", "J", "G", "F", "C", "D", "H", "I" };
		BubbleSort.sortInverted(array);
		for (int i = 0; i < 10; i++) {
			String value = Character.toString((char) ((9-i)+65));
			assertEquals(value, array[i]);
		}
	}
}

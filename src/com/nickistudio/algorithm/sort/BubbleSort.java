package com.nickistudio.algorithm.sort;

/**
 * Bubble Sort
 */
public class BubbleSort
{
	private enum Type {
		INTEGER, DOUBLE, FLOAT, STRING
	}

	private enum Order {
		ASCENDING, DESCENDING
	}

	public static void sort(int[] aArray)
	{
		execute(aArray, aArray.length, Type.INTEGER, Order.ASCENDING);
	}

	public static void sortInverted(int[] aArray)
	{
		execute(aArray, aArray.length, Type.INTEGER, Order.DESCENDING);
	}

	public static void sort(float[] aArray)
	{
		execute(aArray, aArray.length, Type.FLOAT, Order.ASCENDING);
	}

	public static void sortInverted(float[] aArray)
	{
		execute(aArray, aArray.length, Type.FLOAT, Order.DESCENDING);
	}

	public static void sort(double[] aArray)
	{
		execute(aArray, aArray.length, Type.DOUBLE, Order.ASCENDING);
	}

	public static void sortInverted(double[] aArray)
	{
		execute(aArray, aArray.length, Type.DOUBLE, Order.DESCENDING);
	}

	public static void sort(String[] aArray)
	{
		execute(aArray, aArray.length, Type.STRING, Order.ASCENDING);
	}

	public static void sortInverted(String[] aArray)
	{
		execute(aArray, aArray.length, Type.STRING, Order.DESCENDING);
	}

	/**
	 * Optimized Pseudocode:
	 * 
	 * <pre>
	 * procedure bubbleSort( A : list of sortable items )
	 *     n = length(A)
	 *     repeat
	 *         newn = 0
	 *         for i = 1 to n-1 inclusive do
	 *             if A[i-1] > A[i] then
	 *                 swap(A[i-1], A[i])
	 *                 newn = i
	 *             end if
	 *         end for
	 *         n = newn
	 *     until n = 0
	 * end procedure
	 * </pre>
	 */
	private static void execute(Object aArray, int aArraySize, Type aType, Order aOrder)
	{
		// start algorithm
		int n = aArraySize;
		do {
			int m = 0;
			for (int i = 1; i < n; i++) {
				// compare and swap
				switch (aType) {
				case INTEGER: {
					int[] array = (int[]) aArray;
					if ((aOrder == Order.ASCENDING && array[i - 1] > array[i])
							|| (aOrder == Order.DESCENDING && array[i - 1] < array[i])) {
						int tmp = array[i - 1];
						array[i - 1] = array[i];
						array[i] = tmp;
						m = i;
					}
					break;
				}
				case DOUBLE: {
					double[] array = (double[]) aArray;
					if ((aOrder == Order.ASCENDING && array[i - 1] > array[i])
							|| (aOrder == Order.DESCENDING && array[i - 1] < array[i])) {
						double tmp = array[i - 1];
						array[i - 1] = array[i];
						array[i] = tmp;
						m = i;
					}
					break;
				}
				case FLOAT: {
					float[] array = (float[]) aArray;
					if ((aOrder == Order.ASCENDING && array[i - 1] > array[i])
							|| (aOrder == Order.DESCENDING && array[i - 1] < array[i])) {
						float tmp = array[i - 1];
						array[i - 1] = array[i];
						array[i] = tmp;
						m = i;
					}
					break;
				}
				case STRING: {
					String[] array = (String[]) aArray;
					if ((aOrder == Order.ASCENDING && array[i - 1].compareTo(array[i]) > 0)
							|| (aOrder == Order.DESCENDING && array[i - 1].compareTo(array[i]) < 0)) {
						String tmp = array[i - 1];
						array[i - 1] = array[i];
						array[i] = tmp;
						m = i;
					}
					break;
				}
				default:
					break;

				}
				// end comparing and swapping
			}
			n = m;
		} while (n > 0);
		// end algorithm
	}
}

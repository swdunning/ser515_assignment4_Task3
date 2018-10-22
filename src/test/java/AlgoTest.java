package test.java;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;


//JUnit Test Class for the Bubble Sort Algorithm Method in AlgosSort
public class AlgoTest {
	private NullPointerException npe;
	SortAlgos sortObj = new SortAlgos();
	SortDemoData data;
	StringBuffer testNull, testlargeDataSet, testSmallDataSet;
	

	//Rule for unit testing a NullPointerException
	@Rule
	public ExpectedException thrown = ExpectedException.none();


	/*===========Bubble Sort ==========
	 * Test case Conditional Coverage {22,23}
	 * Testing the conditional that looks for NullPointerException
	 * */
	@Test (expected=NullPointerException.class)
	public void testForNullBubble() {
		Item testNullArr[] = null;
		SortAlgos.bubbleSort(testNullArr);
		/*thrown.expect(NullPointerException.class);
		assertTrue(testNullArr.equals(NullPointerException.class));
		throw new NullPointerException();*/
	}
	/* ===========Selection Sort ==========
	 * Test case Conditional Coverage
	 * Testing the conditional that looks for NullPointerException
	 * */
	@Test (expected=NullPointerException.class)
	public void testForNullSelection() {
		Item testNullArr[] = null;
		SortAlgos.selectionSort(testNullArr);
	}
	/* ===========Insertion Sort ==========
	 * Test case Conditional Coverage
	 * Testing the conditional that looks for NullPointerException
	 * */
	@Test (expected=NullPointerException.class)
	public void testForNullInsertion() {
		Item testNullArr[] = null;
		SortAlgos.insertionSort(testNullArr);
	}
	/* ===========Merge Sort ==========
	 * Test case Conditional Coverage 
	 * Testing the conditional that looks for NullPointerException
	 * */
	@Test (expected=NullPointerException.class)
	public void testForNullMerge() {
		Item testNullArr[] = null;
		SortAlgos.mergeSort(testNullArr);
	}
	/* ===========Merge Sort ==========
	 * Test case Conditional Coverage 
	 * Testing the conditional that looks for NullPointerException
	 * */
	@Test (expected=NullPointerException.class)
	public void testForNullQuick() {
		Item testNullArr[] = null;
		SortAlgos.quickSort(testNullArr);
	}
	/* ===========Merge Sort ==========
	 * Test case Conditional Coverage 
	 * Testing the conditional that looks for NullPointerException
	 * */
	@Test (expected=NullPointerException.class)
	public void testForNullHeap() {
		Item testNullArr[] = null;
		SortAlgos.heapSort(testNullArr);
	}
	
	
	/*
	 * ===========Bubble Sort ==========
	 * Test case Conditional Coverage
	 * Test the swap conditional inside the nested for loop
	 * with 1 element there should be no errors and it should just not enter the 
	 * the inside of the conditional and skip on by.
	 * */
	@Test
	public void testWithOneElement() throws Exception{
		data = new SortDemoData();
		data.initializeArray("1");
		data.runAlgo(Integer.valueOf('0').intValue());
		
		for (int j = 0; j < data.myArray.length; j++) {
			assertEquals("One Element Array --> Swap conditional should not be entered",
					data.myArray[j].key, j+1);
		}
		
	}
	
	
	
	/*
	 * Test case Node, Edge and Conditional Coverage
	 * */
	@Test
	public void testFullBubbleSort() throws Exception {
		Item beforeSort[] = {new Item(14), new Item(1), new Item(13), new Item(2), new Item(10), new Item(4), new Item(5),
				 new Item(3), new Item(7), new Item(8), new Item(9),  new Item(11), new Item(6), new Item(12)};
		
		Item beforeSortSmallDataSet[] = {new Item(2), new Item(1)};
		/*Call the static Bubble Sort method and loop through to test the beforeSort array elements 
		 * with the sorted "elements" (which is just j+1)*/
		SortAlgos.bubbleSort(beforeSort);
		for (int j = 0; j < beforeSort.length; j++) {
			assertEquals("The elements for beforeSort array should be equal to the elements after BubbleSort",
					beforeSort[j].key, j +1);
		}

		/*Test the same as above except use SortDemoData to call BubbleSort and then we can
		 * just pass in a number and test all sorts of sizes for the array to be sorted.
		 * Test with a large data set*/
		data = new SortDemoData();
		data.initializeArray("100");
		data.runAlgo(Integer.valueOf('0').intValue());
		
		for (int j = 0; j < beforeSort.length; j++) {
			assertEquals("Large Element Array --> The elements for beforeSort array should be equal to the elements after BubbleSort",
					data.myArray[j].key, j+1);
		}

		/*Test with a small data set
		 * Make sure 2 elements will be sorted*/
		SortAlgos.bubbleSort(beforeSortSmallDataSet);
		for (int j = 0; j < beforeSortSmallDataSet.length; j++) {
			assertEquals("Small Data Set Array --> The elements for beforeSort array should be equal to the elements after BubbleSort",
					beforeSortSmallDataSet[j].key, j+1);
		}
	}
	
	
	
	/* One test for Edge coverage
	 * Test using an empty array will hit line 27 and will never enter the for loop
	 * */
	@Test
	public void testForEmpty() throws Exception {
		Item beforeSortEmpty[] = {};
		SortAlgos.bubbleSort(beforeSortEmpty);
		data = new SortDemoData();
		data.initializeArray("0");
		data.runAlgo(Integer.valueOf('0').intValue());
		assertEquals("Empty Array --> Outer for loop will not be entered", data.myArray.length, 0);
		
	}
	
	
	
	/*
	 * Test case Node, Edge and Conditional Coverage 
	 * ===========Selection Sort ==========
	 * */
	@Test
	public void testFullSelectionSort() throws Exception {
		Item beforeSort[] = {new Item(14), new Item(1), new Item(13), new Item(2), new Item(10), new Item(4), new Item(5),
				 new Item(3), new Item(7), new Item(8), new Item(9),  new Item(11), new Item(6), new Item(12)};
		
		Item beforeSortSmallDataSet[] = {new Item(2), new Item(1)};
		/*Call the static Selection Sort method and loop through to test the beforeSort array elements 
		 * with the sorted "elements" (which is just j+1)*/
		SortAlgos.selectionSort(beforeSort);
		for (int j = 0; j < beforeSort.length; j++) {
			assertEquals("The elements for beforeSort array should be equal to the elements after SelectionSort",
					beforeSort[j].key, j +1);
		}

		/*Test the same as above except use SortDemoData to call SelectionSort and then we can
		 * just pass in a number and test all sorts of sizes for the array to be sorted.
		 * Test with a large data set*/
		data = new SortDemoData();
		data.initializeArray("100");
		data.runAlgo(Integer.valueOf('1').intValue());
		
		for (int j = 0; j < data.myArray.length; j++) {
			assertEquals("Large Element Array --> The elements for beforeSort array should be equal to the elements after SelectionSort",
					data.myArray[j].key, j+1);
		}

		/*Test with a small data set
		 * Make sure 2 elements will be sorted*/
		SortAlgos.selectionSort(beforeSortSmallDataSet);
		for (int j = 0; j < beforeSortSmallDataSet.length; j++) {
			assertEquals("Small Data Set Array --> The elements for beforeSort array should be equal to the elements after SelectionSort",
					beforeSortSmallDataSet[j].key, j+1);
		}
	}
	
	
	/*
	 * Test case Node, Edge and Conditional Coverage
	 * ===========Insertion Sort ==========
	 * */
	@Test
	public void testFullInsertionSort() throws Exception {
		Item beforeSort[] = {new Item(14), new Item(1), new Item(13), new Item(2), new Item(10), new Item(4), new Item(5),
				 new Item(3), new Item(7), new Item(8), new Item(9),  new Item(11), new Item(6), new Item(12)};
		
		Item beforeSortSmallDataSet[] = {new Item(2), new Item(1)};
		/*Call the static Insertion Sort method and loop through to test the beforeSort array elements 
		 * with the sorted "elements" (which is just j+1)*/
		SortAlgos.insertionSort(beforeSort);
		for (int j = 0; j < beforeSort.length; j++) {
			assertEquals("The elements for beforeSort array should be equal to the elements after InsertionSort",
					beforeSort[j].key, j +1);
		}

		/*Test the same as above except use SortDemoData to call InsertionSort and then we can
		 * just pass in a number and test all sorts of sizes for the array to be sorted.
		 * Test with a large data set*/
		data = new SortDemoData();
		data.initializeArray("100");
		data.runAlgo(Integer.valueOf('2').intValue());
		for (int j = 0; j < data.myArray.length; j++) {
			assertEquals("Large Element Array --> The elements for beforeSort array should be equal to the elements after InsertionSort",
					data.myArray[j].key, j+1);
		}

		/*Test with a small data set
		 * Make sure 2 elements will be sorted*/
		SortAlgos.insertionSort(beforeSortSmallDataSet);
		for (int j = 0; j < beforeSortSmallDataSet.length; j++) {
			assertEquals("Small Data Set Array --> The elements for beforeSort array should be equal to the elements after InsertionSort",
					beforeSortSmallDataSet[j].key, j+1);
		}
	}
	
	
	
	/*
	 * Test case Node, Edge and Conditional Coverage
	 * ===========Merge Sort ==========
	 * */
	@Test
	public void testFullMergeSort() throws Exception {
		Item beforeSort[] = {new Item(14), new Item(1), new Item(13), new Item(2), new Item(10), new Item(4), new Item(5),
				 new Item(3), new Item(7), new Item(8), new Item(9),  new Item(11), new Item(6), new Item(12)};
		
		Item beforeSortSmallDataSet[] = {new Item(2), new Item(1)};
		/*Call the static Merge Sort method and loop through to test the beforeSort array elements 
		 * with the sorted "elements" (which is just j+1)*/
		SortAlgos.mergeSort(beforeSort);
		for (int j = 0; j < beforeSort.length; j++) {
			assertEquals("The elements for beforeSort array should be equal to the elements after MergeSort",
					beforeSort[j].key, j +1);
		}

		/*Test the same as above except use SortDemoData to call MergeSort and then we can
		 * just pass in a number and test all sorts of sizes for the array to be sorted.
		 * Test with a large data set*/
		data = new SortDemoData();
		data.initializeArray("100");
		data.runAlgo(Integer.valueOf('3').intValue());
		for (int j = 0; j < data.myArray.length; j++) {
			assertEquals("Large Element Array --> The elements for beforeSort array should be equal to the elements after MergeSort",
					data.myArray[j].key, j+1);
		}

		/*Test with a small data set
		 * Make sure 2 elements will be sorted*/
		SortAlgos.mergeSort(beforeSortSmallDataSet);
		for (int j = 0; j < beforeSortSmallDataSet.length; j++) {
			assertEquals("Small Data Set Array --> The elements for beforeSort array should be equal to the elements after MergeSort",
					beforeSortSmallDataSet[j].key, j+1);
		}
	}
	
	
	/*
	 * Test case Node, Edge and Conditional Coverage
	 * ===========Quick Sort ==========
	 * */
	@Test
	public void testFullQuickSort() throws Exception {
		Item beforeSort[] = {new Item(14), new Item(1), new Item(13), new Item(2), new Item(10), new Item(4), new Item(5),
				 new Item(3), new Item(7), new Item(8), new Item(9),  new Item(11), new Item(6), new Item(12)};
		
		Item beforeSortSmallDataSet[] = {new Item(2), new Item(1)};
		/*Call the static Quick Sort method and loop through to test the beforeSort array elements 
		 * with the sorted "elements" (which is just j+1)*/
		SortAlgos.quickSort(beforeSort);
		for (int j = 0; j < beforeSort.length; j++) {
			assertEquals("The elements for beforeSort array should be equal to the elements after QuickSort",
					beforeSort[j].key, j +1);
		}

		/*Test the same as above except use SortDemoData to call QuickSort and then we can
		 * just pass in a number and test all sorts of sizes for the array to be sorted.
		 * Test with a large data set*/
		data = new SortDemoData();
		data.initializeArray("100");
		data.runAlgo(Integer.valueOf('4').intValue());
		for (int j = 0; j < data.myArray.length; j++) {
			assertEquals("Large Element Array --> The elements for beforeSort array should be equal to the elements after QuickSort",
					data.myArray[j].key, j+1);
		}

		/*Test with a small data set
		 * Make sure 2 elements will be sorted*/
		SortAlgos.quickSort(beforeSortSmallDataSet);
		for (int j = 0; j < beforeSortSmallDataSet.length; j++) {
			assertEquals("Small Data Set Array --> The elements for beforeSort array should be equal to the elements after QuickSort",
					beforeSortSmallDataSet[j].key, j+1);
		}
	}
	
	
	
	/*
	 * Test case Node, Edge and Conditional Coverage
	 * ===========Heap Sort ==========
	 * */
	@Test
	public void testFullHeapSort() throws Exception {
		Item beforeSort[] = {new Item(14), new Item(1), new Item(13), new Item(2), new Item(10), new Item(4), new Item(5),
				 new Item(3), new Item(7), new Item(8), new Item(9),  new Item(11), new Item(6), new Item(12)};
		
		Item beforeSortSmallDataSet[] = {new Item(2), new Item(1)};
		/*Call the static Heap Sort method and loop through to test the beforeSort array elements 
		 * with the sorted "elements" (which is just j+1)*/
		SortAlgos.heapSort(beforeSort);
		for (int j = 0; j < beforeSort.length; j++) {
			assertEquals("The elements for beforeSort array should be equal to the elements after HeapSort",
					beforeSort[j].key, j +1);
		}

		/*Test the same as above except use SortDemoData to call HeapSort and then we can
		 * just pass in a number and test all sorts of sizes for the array to be sorted.
		 * Test with a large data set*/
		data = new SortDemoData();
		data.initializeArray("100");
		data.runAlgo(Integer.valueOf('5').intValue());
		for (int j = 0; j < data.myArray.length; j++) {
			assertEquals("Large Element Array --> The elements for beforeSort array should be equal to the elements after HeapSort",
					data.myArray[j].key, j+1);
		}

		/*Test with a small data set
		 * Make sure 2 elements will be sorted*/
		SortAlgos.heapSort(beforeSortSmallDataSet);
		for (int j = 0; j < beforeSortSmallDataSet.length; j++) {
			assertEquals("Small Data Set Array --> The elements for beforeSort array should be equal to the elements after HeapSort",
					beforeSortSmallDataSet[j].key, j+1);
		}
	}

}

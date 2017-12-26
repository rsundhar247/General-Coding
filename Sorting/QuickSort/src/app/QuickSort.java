package app;

public class QuickSort {

	public static int[] sort(int[] toSort) {
		
		
		
		return toSort;
	}
	
	public static void main(String[] args) {
		
		int[] toSort = {1,4,2,6,5,9,0,12};
		int[] sortedArray = new int[toSort.length];
		System.out.println("Unsorted Input Array Sequence.. ");
		for(int i=0; i<toSort.length; i++) {
			System.out.print(toSort[i]+" ");
		}
		sortedArray = sort(toSort);
		System.out.println();
		System.out.println("Sorted Array Sequence.. ");
		for(int i=0; i<sortedArray.length; i++) {
			System.out.print(sortedArray[i]+" ");
		}
	}
}

package app;

public class InsertionSort {

	public static int[] sort(int[] toSort) {
		
		for(int i=1; i<toSort.length; i++) {
			int j = i;
			int temp = toSort[i];
			while(j>0 && toSort[j-1] > temp) {
				toSort[j] = toSort[j-1];
				--j;
			}
			toSort[j] = temp;
			
			System.out.println("\nArray after "+(i+1)+" iteration of sorting...");
			for(int a=0; a<toSort.length; a++) {
				System.out.print(toSort[a]+" ");
			}
			System.out.println();
		}
		return toSort;
	}
	
	public static void main(String[] args) {
		
		int[] toSort = {1,4,2,6,5,9,0,12};
		int[] sortedArray = new int[toSort.length];
		System.out.println("Unsorted Input Array Sequence.. ");
		for(int i=0; i<toSort.length; i++) {
			System.out.print(toSort[i]+" ");
		}
		System.out.println();
		sortedArray = sort(toSort);
		System.out.println();
		System.out.println("Sorted Array Sequence.. ");
		for(int i=0; i<sortedArray.length; i++) {
			System.out.print(sortedArray[i]+" ");
		}
	}


}

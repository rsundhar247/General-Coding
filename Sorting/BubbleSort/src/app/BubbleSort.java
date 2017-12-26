package app;

public class BubbleSort {

	public static int[] sort(int[] toSort) {
		
		for(int i=0; i<toSort.length; i++) {
			boolean change = false;
			for(int j=0; j<toSort.length-i-1; j++) { // after each iteration remove the last number as its correctly sorted -- length-i-1
				if(toSort[j] > toSort[j+1]) {
					int temp = toSort[j];
					toSort[j] = toSort[j+1];
					toSort[j+1] = temp;
					change = true;
				}
			}
			System.out.println("\nArray after "+(i+1)+" iteration of sorting...");
			for(int j=0; j<toSort.length; j++) {
				System.out.print(toSort[j]+" ");
			}
			System.out.println();
			if(!change)
				break;
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

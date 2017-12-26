package app;

public class SelectionSort {

	public static int[] sort(int[] arrayToSort){
		int pos = 0, temp = 0 ;
		for(int i=0;i<arrayToSort.length;i++) {
			pos = i;
			for(int j=i+1;j<arrayToSort.length;j++) {
				if(arrayToSort[i] > arrayToSort[j]) {
					pos = j;
				}
			}
			temp = arrayToSort[i];
			arrayToSort[i] = arrayToSort[pos];
			arrayToSort[pos] = temp;
			
			System.out.println("\nArray after "+(i+1)+" iteration of sorting...");
			for(int a=0; a<arrayToSort.length; a++) {
				System.out.print(arrayToSort[a]+" ");
			}
			System.out.println();
		}
		return arrayToSort;
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
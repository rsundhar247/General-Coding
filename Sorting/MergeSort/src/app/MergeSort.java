package app;

public class MergeSort {

	public static void sort(int[] toSort,int startIdx, int endIdx) {
		
		if(startIdx < endIdx) {
			int midIdx = startIdx+(endIdx-startIdx)/2;
			
			sort(toSort, startIdx, midIdx);
			sort(toSort, midIdx+1, endIdx);
			
			merge(toSort, startIdx, midIdx, endIdx);
		}
	}
	
	public static void merge(int[] toSort, int startIdx, int midIdx, int endIdx) {
		
		int arr1 = midIdx - startIdx +1;
		int arr2 = endIdx - midIdx;
		
		int[] leftArr = new int[arr1];
		int[] rightArr = new int[arr2];
		
		for(int i=0; i<arr1; i++) {
			leftArr[i] = toSort[startIdx+i];
		}
		for(int i=0; i<arr2; i++) {
			rightArr[i] = toSort[midIdx+i+1];
		}
		
		int left = 0, right = 0, original = startIdx;
		
		while(left<arr1 && right<arr2) {
			if(leftArr[left] <= rightArr[right]) {
				toSort[original] = leftArr[left];
				++left;
			} else {
				toSort[original] = rightArr[right];
				++right;
			}
			++original;
		}
		
		while(left<arr1) {
			toSort[original] = leftArr[left];
			++left;
			++original;
		}
		
		while(right<arr2) {
			toSort[original] = rightArr[right];
			++right;
			++original;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] toSort = {1,4,2,6,5,9,0,12};
		int[] sortedArray = new int[toSort.length];
		System.out.println("Unsorted Input Array Sequence.. ");
		for(int i=0; i<toSort.length; i++) {
			System.out.print(toSort[i]+" ");
		}
		System.out.println();
		sort(toSort,0,toSort.length-1);
		System.out.println();
		System.out.println("Sorted Array Sequence.. ");
		for(int i=0; i<sortedArray.length; i++) {
			System.out.print(sortedArray[i]+" ");
		}
	}

}

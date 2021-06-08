package Sorting;

public class BubbleSort {
	public static void main(String args[]) {
		int[] array = {9,43,65,2,5,7,19};
		bubbleSort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void bubbleSort(int[] array) {
		/*Iterate over the array example i = 0*/
		for(int i = 0; i<array.length; i++){
			/*Compare the variables in the iteration (Only need array.length-i-1)*/
			/*As we don't need to check those at the end of the array as they are already sorted*/
			for(int j = 0; j<array.length-i-1; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}

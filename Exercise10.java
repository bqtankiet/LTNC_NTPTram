package exercise;

import java.util.Random;

public class Exercise10 {

	public static void insertionSort(int[] arr) {

		for (int pointer = 1; pointer < arr.length; pointer++) {
			int currentElement = arr[pointer];
			if (currentElement < arr[pointer - 1]) {
				int i = pointer - 1;
				while (i >= 0 && currentElement < arr[i]) {
					arr[i + 1] = arr[i];
					i--;
				}
				arr[i + 1] = currentElement;
			} else
				continue;
		}
	}

	public static void interchangeSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i])
					swap(arr, i, j);
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 8, 1, 3, 2, 4, 9, 7, 6, 5 };
//		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//		insertionSort(arr);
//		interchangeSort(arr);

		int[] randomArr = randomArr(arr, 9);

		printArray(randomArr);

	}

	public static int[] randomArr(int[] arr, int size) {

		if (size > arr.length) {
			System.out.println("ERROR: Size is greater than the length of source array");
			return null;
		}

		int[] result = new int[size];
		shuffle(arr);
		Random rd = new Random();
		int rdIndex = rd.nextInt(arr.length - size + 1);
		for (int i = 0; i < size; i++) {
			result[i] = arr[rdIndex + i];
		}
		return result;

	}

	private static void printArray(int[] arr) {
		if (arr == null) {
			System.out.println("ERROR: An array is null");
			return;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void shuffle(int[] arr) {
		Random rd = new Random();
		for (int i = 0; i < 11;) {
			int a = rd.nextInt(arr.length);
			int b = rd.nextInt(arr.length);
			if (a != b) {
				swap(arr, a, b);
				i++;
			}
		}
	}

	private static void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

}

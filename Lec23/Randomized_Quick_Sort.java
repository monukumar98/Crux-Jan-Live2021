package Lec23;

import java.util.Random;

import Lec24.Student;

public class Randomized_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 7, 3, 2, 5 };
		

	}

	public static void QuickSort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}

		int pivot_index = partion_inQuick_Sort(arr, si, ei);
		QuickSort(arr, si, pivot_index - 1);
		QuickSort(arr, pivot_index + 1, ei);

	}

	public static int partion_inQuick_Sort(int arr[], int si, int ei) {
		random(arr, si, ei);

		int pivot = arr[ei];
		int pi = si;// si to ei-1
		for (int i = si; i < ei; i++) {
			if (arr[i] < pivot) {
				int t = arr[i];
				arr[i] = arr[pi];
				arr[pi] = t;
				pi++;
			}
		}

		int t = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = t;
		// System.out.println(pi);
		return pi;

	}

	public static void random(int arr[], int si, int ei) {
		Random rn = new Random();
		int pi = rn.nextInt(ei - si) + si;
		int t = arr[pi];
		arr[pi] = arr[ei];
		arr[ei] = t;

	}
}

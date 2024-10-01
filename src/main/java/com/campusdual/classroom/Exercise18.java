package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {
	public static int[] createAndInitializeArray(int num) {
		int[] intArray = new int[num];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
		return intArray;
	}

	public static void showInlineArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
			if (i == intArray.length - 1) {
				System.out.println(intArray[i]);
			} else {
				System.out.print(intArray[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		showInlineArray(new int[Utils.integer()]);
	}
}

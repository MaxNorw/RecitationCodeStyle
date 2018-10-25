package codeStyle;

import java.util.ArrayList;

public class MessyCode {
	public static void main(String[] args) {

		//////////////////////////////////////////////////////////

		System.out.println("PART ONE\n");

		// matrix a and b are to be added
		int[][] a = { { 1, 2, 3 }, { 2, 7, 9 } };
		int[][] b = { { 2, 3, 1 }, { 3, 6, 2 } };

		// holds sum of a and b
		int[][] sumMatrix = addTwoMatrices(a, b);

		System.out.println("Sum of Matrix a and b is: ");
		for (int i[] : sumMatrix) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

		// checks to see if all values in array are even or not
		int[] e = { 2, 4, 8, 4, 24, 10 };
		int[] f = { 2, 4, 8, 6, 3, 22 };

		System.out.println("Do arrays e and f contain all even numbers?");
		System.out.println("-e is: " + isAllNumbersEven(e));
		System.out.println("-f is: " + isAllNumbersEven(f));
		System.out.println();


		// 
		ArrayList<Double> arr = new ArrayList<Double>();
		ArrayList<Double> arr2 = new ArrayList<Double>();

		arr.add(2.0);
		arr.add(3.5);
		arr.add(4.2);
		arr2.add(2.1);
		arr2.add(3.5);
		arr2.add(5.9);

		System.out.println(isCommonElementExist(arr, arr2));

		arr.clear();
		arr2.clear();

		arr.add(1.2);
		arr.add(2.3);
		arr.add(3.4);
		arr2.add(4.5);
		arr2.add(5.6);
		arr2.add(6.7);

		System.out.println(isCommonElementExist(arr, arr2));

		System.out.println();

		//////////////////////////////////////////////////////////

		System.out.println("PART TWO\n");
		anotherMethod(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(fact(5));

		System.out.println();

		//////////////////////////////////////////////////////////

		System.out.println("PART THREE\n");

		System.out.println(digitMethod(5));
		System.out.println(digitMethod(214));

		System.out.println();

		System.out.println(contains("kmp"));
		System.out.println(contains("Gary Bishop"));

		System.out.println();

		System.out.println(isLongString("Computer Science"));
		System.out.println(isLongString("KMP"));

	}

	// PART ONE
	public static int[][] addTwoMatrices(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = a[i][j] + b[i][j];
			}
		}
		return a;
	}

	public static boolean isAllNumbersEven(int[] x) {
		for (int i : x){
			// checks to see if remainder of division is 1, which means number is odd
			if (x[i] % 2 == 1){
				return false;
			}
		}
		return true;
	}

	public static <E> boolean isCommonElementExist(ArrayList<E> list1, ArrayList<E> list2) {
		for (E element1 : list1) {
			for (E element2 : list2) {
				// returns true as soon as one common element is found
				if (element1.equals(element2)) {
					return true;
				}
			}
		}
		return false;
	}

	// PART TWO -- focus on whitespace
	public static void anotherMethod(int first, int second, int third, int fourth, int fifth, int sixth, int seventh,
			int eighth, int ninth, int tenth) {
		System.out.println(first + second + third + fourth + fifth + sixth + seventh + eighth + ninth + tenth);
	}

	public static int fact(int x) {
		int s = 1;
		for (int i = x; i > 0; i--) {
			s *= i;
		}
		return s;
	}

	// PART THREE -- focus on boolean expressions

	public static boolean digitMethod(int x) {
		if (x > 0 && x < 10) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean contains(String s) {
		char[] w = s.toCharArray();
		for (int i = 0; i < w.length; i++) {
			if (w[i] == 'a' || w[i] == 'e' || w[i] == 'i' || w[i] == 'o' || w[i] == 'u') {
				return true;
			}
		}
		return false;
	}

	public static boolean isLongString(String s) {
		if (s.length() > 8) {
			return true;
		} else {
			return false;
		}
	}

}

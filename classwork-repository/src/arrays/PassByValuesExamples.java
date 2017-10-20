package arrays;

import java.util.Arrays;

public class PassByValuesExamples {
	
	public static void main(String[] args) {
		String s = "Hello";
		Person p = new Person("Random", "Dude", Borough.NY_BOROUGNS[0]);
		int x = 5;
		int[] arr = {1,2,3};
		changeEVERYTHING(s,x,arr);
		test2(p, x, arr);
		System.out.println("p is now " + p + ", x is " + x + ", arr is " + 
		Arrays.toString(arr));
	}

	private static void test1(Person p, int x, int[] arr) {
		String name = p.getFirstName();
		name = "Original";
	}
	
	private static void test2(Person p) {
		String name = p.getFirstName();
		name = "Original";
	}
	
	/*
	 * This is how you can change arrays via the local variable:
	 * through its references (i.e. indices)
	 * because primitives don't reference other data (that's why they're called primitives)
	 * it is not possible to change them via a local variable
	 * like we did with Objects and arrays
	 * 
	 */
	private static void test3(int[] arr) {
		arr[0] = 999;
		arr[1] = 998;
	}

	private static void changeEVERYTHING(String s, int x, int[] arr) {
		s = "Goodbye";
		x = -5;
		arr = new int[2];
		arr[0] = -1;
		arr[1] = -2;
	}
}

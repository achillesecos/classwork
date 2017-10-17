package arrays;

import java.util.*;

public class ArraysMain {
	
	private String[] suits;
	private String[] values; 
	
	public ArraysMain() {
		tuesdayMethods();
	}
	
	private void tuesdayMethods() {
		int[] orderTest = {1,2,3,4,5,6,7,8,9,10};
		cycleThrough(orderTest, 5);
		System.out.println(Arrays.toString(frontToBack(orderTest)));
		
	}
	
	private int logestConsecutiveSequence(int[] arr) {
		int maxLength = 1;
		int currentCount = 1;
		for(int i = 0; i < arr.length; i++) {			
			while(i + currentCount < arr.length && isConsecutive(arr, i, i + currentCount)) {
				currentCount ++;
			}
			if(currentCount > maxLength) {
				maxLength = currentCount;
			}
			i = i + currentCount -1; //saves time
			currentCount = 1;
		}
		return maxLength;
	}
	
	private boolean isConsecutive(int[] arr, int start, int end) {
		for(int i = start; i <= end; i++) {
			if(arr[i] != (arr[i+1] - 1)) {
				return false;
			}
		}
		return true;
	}

	private void cycleThrough(int[] orderTest, int z) {
		for(int i = 0; i < z; i++) {
			frontToBack(orderTest);
		}
		
	}

	private void frontToBack(int[] arr) {
		int[] first = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] += arr[i+1];
		}
		arr[arr.length-1] = x;
	}

	private void warmUpMethods() {
		int[] orderTest = {1,2,3,4,5,6,7,8,9,10};
		reverseOrder(orderTest);
		System.out.println(Arrays.toString(orderTest));
		System.out.println(Arrays.toString(subArray(orderTest,3,4)));
	}
	
	private int[] subArray(int[] arr, int start, int length) {
		int[] output = new int[length];
		for(int i = 0; i < length; i++) {
			output[i] = arr[i + start];
		}
		return output;
	}
	
	
	private void reverseOrder(int[] arr) {
		for(int i = arr.length/2; i > 0; i--) {
			swap(arr,i,arr.length-1);
		}
	}
	
	private int[] testArray;
	
	
	
	public ArraysMain() {
		
		suits = new String[4];
		suits[0] = "Clubs";
		suits[1] = "Hearts";
		suits[2] = "Diamonds";
		suits[3] = "Spades";
		
		values = new String[13];
		
		for(int i= 0; i < values.length; i++) {
			values[i] = "" + (i +1);
		}
		values[0] = "Ace";
		values[12] = "King";
		values[11] = "Queen";
		values[10] = "Jack";
		printDeck();
		
//		System.out.println(Arrays.toString(testArray));
		
		
		private String[] printDeck() {
			String[] deck = new String[52];
			int index = 0;
			for(String suit: suits) {
				for(String value: values) {
					System.out.println(value + " of " + suit);
				}
			}
		}
		
		
		
		testArray = new int[50];
		populate1toN(testArray);
		swap(testArray, 0, 1);
		shuffle(testArray);
		countOccurences(testArray,2,12);
		System.out.println(Arrays.toString(testArray));
	}
	
	private void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			swap(arr, i, (int)(Math.random()*arr.length));
		}
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp1 = arr[i];
		arr[i] = arr[j];
		arr[j] = temp1;
	}
	
	private void populate1toN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] =  i + 1;
		}
	}
	
	private void countOccurences(int[] arr, int start, int end) {
		//why create an array with this length?
		int[] counter = new int[end - start +  1];
		for(int value: arr) {
			//why value - start?
			counter[value - start]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("The value " + (i + start) + " was rolled "+counter[i] + "tiems. ");
		}
	}
	
	
	private void populate(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = diceRoll(2);
		}
	}
	
	public void arrayNotes() {
		//two ways to construct an array:
		int[] firstWay = {0,1,2,3,4,5};
		//this way will only work with the declaration.
		//will not work:
//		firstWay = {6,7,8,9,10};
		
		int[] secondWay = new int[5];
		//you can go on like so, creating values at each index:
		secondWay[0] = 1;
		secondWay[1] = 10;
		
		//TWO WAYS TO ITERATE THROUGH AN ARRAY:
		for(int i = 0; i < secondWay.length;i++) {
			System.out.println("The #"+i+" element is "+secondWay[i]);
		}
		//"For each int in secondWay"
		for(int value: secondWay) {
			System.out.println("Element is "+value);
		}
		//NOTE: [primitive arrays are autom-populated with 0s
	}
	
	public static void main(String[] args) {
		ArraysMain sample = new ArraysMain();
		//1. Arrays are collections of primitives and Objects
		//SPECIAL NOTE: This is the ONLY collection of primitives
		
		//2. Size cannot be edited
		
		/*3. Elements of an array are REFERENCES to objects. In
		 * other words, changing an element of an array changes the reference, 
		 * not the object.
		*/
	}
	
	public int diceRoll(int n) {
		int output = 0;
		
		for(int i = 0; i < n; i++) {
			int randNum = (int)(Math.random() * 6);
			output += randNum;
		}
		return output;
	}

}

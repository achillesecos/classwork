package algorithms;

public class RecursionExcercises {

	 private static int output;

	public static void main(String[] args){
		 int value = 28;
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 }

		 public static int countPrimeFactors(int value, int testPrime) {
			 if(testPrime == value) {
				 return 1;
			 }
			 if(value % testPrime == 0) {
				 int div = value/testPrime;
				 return countPrimeFactors(div,testPrime) + 1;
				 
			 }
			 else
			 {
				 testPrime++;
				 return countPrimeFactors(value,testPrime);
			 }
			 
		 
		 }

		 public static int factorial(int value) {
			 
			 
			 if(value == 1) {
				 return 1;
			 }
			 else {
				 int output = value * factorial(value - 1);
			 }
			return output;
		 }
	
}

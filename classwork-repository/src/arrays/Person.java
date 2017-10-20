package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"Chr", "Am", "L", "D", "Th", "Br", "B"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "e", "o", "anna", "ola", "a"};
	public static final String[] FIRST_LAST = {"na", "ck", "n", "tt", "rian", "lius"};
	
	public static final String[] LAST_START = {"Bl", "Gr", "Ph", "M", "Thr", "Sh", "Br"};
	public static final String[] LAST_MIDDLE = {"an", "in", "ast", "own", "il"};
	public static final String[] LAST_LAST = {"strom", "son", "rack", "les", "vin", "ston"};
	
	
	private String firstName;
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private 
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		this.friends = new Person[3];
		hobby = Hobby.randomHobby();
		nickname = createNickname(firstName);
	}
	
	/*
	 * PASS BY VALUE
	 * the parameters of a method contain only values, not references
	 * therefore, when they are changed, the REFERNCE to the original
	 * object does not change
	 * 
	 */
	
	public static String createNickname(String name) {
		String nickname = "";
		int vowelCount = 0;
		for(int i = 1; i < name.length(); i ++) {
			String letter = name.substring(i, i+1);
			if(isVowel(letter)) {
				vowelCount ++;
				if(vowelCount != 2) {
					nickname += letter;
				}
				else {
					return nickname;
				}
			}
			else {
				//add the letter when not a vowel
				nickname += letter;
			}
		}
		return name;
	}
	
	private static boolean isVowel(String letter) {
		if(letter.equals("a") || letter.equals("e")
				|| letter.equals("i") || letter.equals("o") || letter.equals("u")) {
			return true;
		}
			
	}
	
	public String toString() {
		return "My name is " + firstName + " " + lastName + ". Call me " + nickname + " and I am from " + home + ".";
	}
}

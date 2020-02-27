class Palindrome{

	public static void main (String [] args){
		
		String word = "level";
		if(checkPalindrome(word)){
			System.outprintln("This is a palindrome.")
}
		else{
			System.out.println("This is not a palindrome.");	
	}	

	public boolean checkPalindrome(String word){
		
		int i = 0; j = word.length - 1;

		while(i < j){
		
			if (word.charAt(i) ! word.charAt(j)){
				return false;

			i++;
			j--;
			
		}
		
		return true;			 

} 
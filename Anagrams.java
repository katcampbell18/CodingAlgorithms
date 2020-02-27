class Anagrams{

	public static void main (String [] args){
		
		checkAnagrams = ("listen", "silent");
		
	}	


	public boolean checkAnagrams(String word1, String word2){

		if(word1.length() != word2.length())

			return false;

		else{
		
			for(int i = 0; i < word1.length(); i++){
			
				for(int j = i + 1; j < word2.length(); j++){
				
					if(word1.charAt(i).equals(word2.charAt(j))){
					
						word2 = word2.substring(0, j) + word2.substring(j + 1);
						}
						
						if(word2.length() == 0){

							return true;
						}
						else{
							return false;
						}

				
					}
				}
			}			
	}
}

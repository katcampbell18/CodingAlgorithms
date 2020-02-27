class Duplicates{

	public static void main (String [] args){
		
		List<String> strings = new ArrayList<>(Arrays.asList("Apple", "Bat", "Bat", "Capable", "Donut", "Egg", "Egg"));
		
	}	


	public void findDuplicates(List<String>strings){
			
			List<String> list = new List<>();
		
			for(int i = 0; i < strings.length(); i++){
			
				for(int j = i + 1; j < strings.length(); j++){
				
					if(strings.get(i).equals(strings.get(j))){
						
						System.out.println(strings.get(i));
					}
				}
			}			
	}
}; 

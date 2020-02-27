class MultiplicationTable{

	public static void main(String [] args){
		
		int row, col;
		int[][]tableSize = new int[10][10];
		printTables(tableSize);
	}

	public void printTables(int tableSize){

		for(int row = 1, row < 10; row++){

			for(int col = 1; col < 10; col++){
				
				tableSize[row][col] = (row + 1) * (col + 1);
				
				System.out.println([row][col] = "\t");

			}
		System.out.print("\n");
		}
	}	
	
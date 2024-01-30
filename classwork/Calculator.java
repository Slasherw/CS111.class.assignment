public class Calculator {
	// Calculate and Print summation of x1 to x2 (series of x1 and x2)
	public void printSummationBetween(int x1, int x2) {
		for(int i = x1;i<=x2;i++){
			summation = summation + i;
		}
		System.out.println("Summation between "+ x1 + " to " + x2 + " = " + summation
	}

	public int countOddNumbersBetween(int x1, int x2) {
		int count = 0;
		for(int i = x1;i<=x2;i++){
			if(i%2!=0){
				count++;
			}
		}
		return count ;
	}

	public int countEvenNumbersBetween(int x1, int x2) {
		int count = 0;
		for(int i = x1;i<=x2;i++){
			if(i%2==0){
				count++;
			}
		}
		return count ;
	}
}
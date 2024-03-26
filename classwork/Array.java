public class Array {
	
	public static void countPrime(int[] primes) {
        int primeGreaterThan10 = 0;
        int primeLessThan10 = 0;
       
        for (int i : primes) {
            if(i>10){
                primeGreaterThan10++;
            }
            else if(i<10){
                primeLessThan10++;
            }
        }
        System.out.println("Number of primes greater than 10 = "+primeGreaterThan10);
        System.out.println("Number of primes less than 10 = "+primeLessThan10);
	}
	
    public static void main(String[] args) {
       int[] primes = {2,3,5,7,11,13};
       Array.countPrime(primes);
       Array.countPrime(new int[] {2,3,5,7,11,13});
    }
}
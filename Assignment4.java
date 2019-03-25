
public class Assignment4 {

	public static void main(String[] args) {
		writeSquares(11);
		
	}

	private static void writeSquares(int n) {
	
		if(n==1) {
			System.out.print(1);
			return;
		}
		if(n%2==1) {
			writeSquares(n-1);
			System.out.print(","+n*n);
			
			
		}
		else {
			System.out.print(n*n+",");
			writeSquares(n-1);
			
		}
		
		
		
	}

}

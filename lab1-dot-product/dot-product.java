import java.util.Scanner;
public class {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the arrays: ");
		int n = scanner.nextInt();
		int[] a = new int [n];
		int[] b = new int [n];
		int[] c = new int [n];
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
			b[i] = (int) (Math.random() * 100) + 1;
			c[i] = a[i] * b[i];
		}
  	System.out.print("Array a: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	
		System.out.println();
		
		System.out.print("Array b: ");
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Array c (a * b): ");
		for (int i = 0; i < n; i++) {
			System.out.print(c[i] + " ");
	  }
	System.out.println();
	
	scanner.close();
	}

}

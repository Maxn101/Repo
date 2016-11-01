import java.util.Scanner;

public class Nil {
	public static void main(String[] args) {
	Scanner myscan = new Scanner(System.in);
	System.out.println("Enter youngest: ");
	int y = myscan.nextInt();
	System.out.println("Enter middle: ");
	int m = myscan.nextInt();
	int o = (m-y) + m;
	System.out.println("Oldest sibling is " + o + " years old");
}
}



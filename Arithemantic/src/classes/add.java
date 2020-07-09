package classes;
import java.util.*;


public class add {
	

	int num1;
	int num2;
	
	
	public void readInfo () {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter First Number: ");
	    num1 = sc.nextInt();
	    System.out.println("Enter second Number: ");
	    num2 = sc.nextInt();	
	}

	public void ADD() {

	    int sum = num1 + num2;
	    System.out.println("Sum: "+sum);
		
	}

	public void SUB() {

	    int sub = num1 - num2;
	    System.out.println("sub: "+sub);
		
	}
	
	public void MUL() {

	    int mul = num1 * num2;
	    System.out.println("mul: "+mul);
		
	}
	
	public void DIV() {

	    float div = num1 / num2;
	    System.out.println("DIV: "+div);
		
	}

}

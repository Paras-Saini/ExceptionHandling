
public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,a;
		try {
			d=0;
			a=34/d;
			System.out.println("This will not be printed.");
			
		}catch(Exception e)
		{
			System.out.println("Division by zero");
		}
		System.out.println("After catch statement.");

	}

}

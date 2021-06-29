
public class ThrowsDemo {
	static void throwone() throws IllegalAccessException{
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		throwone();
		}catch(Exception e)
		{
			System.out.println("Caught: "+e);
		}
		

	}

}

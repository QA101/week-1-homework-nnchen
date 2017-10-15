
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Write a program that will change values of variables:
//x=10 and y=5 => swap to make x=5 and y=10
//x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5
//x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5		

		Integer x = new Integer(10);
		Integer y = new Integer(5);
		setToThree(x, y);
		System.out.println(x);
		System.out.println(y);
		
		
	}

	private static void setToThree(Integer x, Integer y) {
		// TODO Auto-generated method stub
		x = new Integer(5);
		y = new Integer(10);
	}

}


//Convert Primitive Type to Wrapper Objects

package wrapperclass;

public class PrimitiveToWrapper {
	public static void main(String[] args) {

		// create primitive types
		int a = 6;
		double b = 8.65;

		// converts into wrapper objects
		Integer aObj = Integer.valueOf(a);
		Double bObj = Double.valueOf(b);

		if (aObj instanceof Integer) {
			System.out.println("An object of Integer is created.");
		}

		if (bObj instanceof Double) {
			System.out.println("An object of Double is created.");
		}
	}
}
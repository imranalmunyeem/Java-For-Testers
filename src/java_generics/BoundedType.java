
//Create bounded type generic class
package java_generics;

public class BoundedType {
	class GenericsClass <T extends Number> {

		  public void display() {
		    System.out.println("This is a bounded type generics class.");
		  }
		}

		class Main {
		  public void main(String[] args) {

		    // create an object of GenericsClass
		    GenericsClass<String> obj = new GenericsClass<>();
		  }
}
		}

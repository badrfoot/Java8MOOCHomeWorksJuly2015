
public class Car extends Vehicle{
	public static void main(String[] args) {
		Vehicle a = new Car();
		Vehicle b =  new Vehicle();
		
		System.out.println(a instanceof Car);
		System.out.println(a instanceof Vehicle);
		System.out.println(b instanceof Car);
		
		String s = "Yes I will";
		
		//s = (s) -> System.out.println("just ");
	}

}

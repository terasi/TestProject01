
public class HelloWorld {

	public static void main(String[] args) {

		for(int i=0; i<=5; i++){
			String b = i%2 == 0 ? "☆":"★";
			System.err.println(b);
		}
	}

}

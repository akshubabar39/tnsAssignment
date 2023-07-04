package javaPrograms;

public class changeCharBuffer {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("akanksha");
		System.out.println(name.charAt(0));
		
		 name.setCharAt(2,'h'); 
		 System.out.println(name);
		
	}

}

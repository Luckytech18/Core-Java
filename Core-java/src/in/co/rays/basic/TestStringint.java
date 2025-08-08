package in.co.rays.basic;

public class TestStringint {
	public static void main(String[] args) {
		String name = "Vijay dinanath chouhan";
		
		System.out.println("Name :"+ name);
		
		System.out.println("Lenghth:"+name.length());
		
		System.out.println("4th char: "+ name.charAt(4));
		
		System.out.println("index of a is :" + name.indexOf('a'));
		
		System.out.println("Last index of a is "+ name.lastIndexOf('a'));
		
		System.out.println( " a is replace by b:" + name.replace('a', 'b'));
		
		System.out.println(" name in capital :"+ name.toUpperCase());
		
		System.out.println( " name in small:" + name.toLowerCase());
		
		System.out.println(name.startsWith("Vijay"));
		
		System.out.println(name.endsWith("han"));
		
		System.out.println(name.substring(6,20));
	}
	

}

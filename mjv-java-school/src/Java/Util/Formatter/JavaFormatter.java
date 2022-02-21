package Java.Util.Formatter;



public class JavaFormatter {

	public static void main(String[] args) {
		
		
		
		System.out.printf("%d%n",10);
		System.out.printf("%f%n",10.1);
		System.out.printf("%c%n", 'a');
		System.out.printf("%C%n", 'a');
		System.out.printf("%b%n", 5<4);
		System.out.printf("%b%n", 5>4);
		System.out.printf("%B%n", 5<4);
		System.out.printf("%B%n", 5>4);
		System.out.printf("%s%n", "String");
		System.out.printf("%S%n", "String");
		
		String a = String.format("Olá %s","Todos");
		System.out.println(a);
		
		Pessoa p = new Pessoa();
		System.out.println(p);
		p.toString();
		
		
		

	
	}

}

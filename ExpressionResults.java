
public class ExpressionResults {

	public static void main(String s[])
	{
		int a = 20;
		int b = 10;
		
		int b1 = a-- - --a;
		System.out.println("B1 = "+b1);
		
		int c = a--;
		System.out.println("C = "+c);
		
		int d = a >> 2;
		System.out.println("D = "+d);
		
		int e = a&b;
		System.out.println("E = "+e);

	}
}

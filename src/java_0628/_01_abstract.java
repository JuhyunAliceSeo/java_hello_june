package java_0628;
abstract class Calc{
    protected int a;
    protected int b;
    void setValue(int a, int b) {this.a = a; this.b = b;}
    abstract int calculate();
}

public class _01_abstract {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("두 정수와 연산자를 입력하시오>> ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        char c = sc.next().charAt(0);

	        if(c == '+'){
	            Add add = new Add();
	            add.setValue(a, b);
	            System.out.println(add.calculate());
	        }
	        else if(c == '-'){
	            Sub sub = new Sub();
	            sub.setValue(a, b);
	            System.out.println(sub.calculate());
	        }
	        else if(c == '*'){
	            Mul mul = new Mul();
	            mul.setValue(a, b);
	            System.out.println(mul.calculate());
	        }
	        else if(c == '/'){
	            Div div = new Div();
	            div.setValue(a, b);
	            System.out.println(div.calculate());
	        }
	}

}

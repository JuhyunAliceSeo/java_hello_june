package java_0626;

	//상속
	//기존에 있던것 =선배가 만든것 = 건들면 안된다= 건들수도 없는것
//	class A{
//	   private int a ;
//	   
//	   public A() {
//	      
//	   }
//	   
//	   public A(int a) {
//	      this.a = a;
//	   }
//	   
//	   public void aa() {
//	      System.out.println(a);
//	   }   
//	}
//	//reuse 재사용 하기 위해 상속이 나왔음
//	class B extends A {   
//	   
//	   private int b;
//	   
//	   public B(int b) {
//	      this.b = b;
//	   }
//	   //기본적으로 부모의 함수및 변수의 접근 방법은 super=부모
//	   public B(int a, int b) {
//	      //this.a = a; 
//	      //super.a = a;
//	      super(a); //부모 멤버변수 접근 방법 = super 생성자를 통해 기본적으로 접근한다.
//	      this.b = b;
//	   }
//	   
//	   public void bb() {
//	      System.out.println(b);
//	   }
//	}
//
//
//
//public class _07_ {
//	   public static void main(String[] args) {
//	      A a = new A();
//	      System.out.println(a.a);
//	      
//	      B b = new B()); 
//	      
//	      System.out.println(b.a);
//	      System.out.println(b.b);
//	      
//	      b.aa();
//	      b.bb();
//	      
//	   }
//	}
package java_0626;

class A{
	int a = 10;
	
	public void aa(){
		System.out.println(a);
	}
}

//reuse 재사용
class B extends A{ //부모 A에 있는 것을 그대로 받아드리겠다.
	
}

public class _05_Heritage {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		
		B b = new B();
		System.out.println(b.a); //A를 상속했다
		b.aa();

	}

}

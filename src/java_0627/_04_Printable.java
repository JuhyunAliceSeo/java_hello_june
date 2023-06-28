package java_0627;

//인터페이스 안에 올수 있는 것은 함수구현(X) -> 추상메서드 와 상수만 올수 있음
//인터페이스 자손이 구현하라.

//인터페이스를 사용하는 이유 
//1.선배들이 사용 하기 때문에(표준 = 강제 = 규약 = 프린트 드라이버)
//2.다중 상속지원

interface Printable {
   abstract public void print(String doc); // 함수선언 = 함수정의 =  abstract = 추상메서드
}

interface Movable {
   abstract public void move(); // 함수선언 = 함수정의 =  abstract = 추상메서드
}

class Printer implements Printable,Movable {

   @Override
   public void print(String doc) {
      System.out.println(doc);      
   }

   @Override
   public void move() {
      System.out.println("움직입니다.");   
      
   }
}

interface ICalculator{
	   public int add(int num1,int num2);
	   public int sub(int num1,int num2);
	   public int mul(int num1,int num2);
	   public int div(int num1,int num2);
	}


public class _04_Printable {

   public static void main(String[] args) {
      Printer printer = new Printer(); //인터페이스도 다형성이 적용됨 
      printer.move();
      printer.print("아아아");

   }

}

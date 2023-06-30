package java_0628;
import java.util.Scanner;

abstract class House {
   public abstract void build2();

   public void build() {
      System.out.println("집을 짓습니다.");
   }
}

class House2 extends House {

   @Override
   public void build2() {
      System.out.println("집을 짓습니다.2");
   }

}

abstract class Calc {
   protected int a;
   protected int b;

   void setValue(int a, int b) {
      this.a = a;
      this.b = b;
   }

   abstract int calculate();
}

class Add extends Calc{

   @Override
   int calculate() {
      return super.a + super.b;
   }
   
}

class Sub extends Calc{

   @Override
   int calculate() {
      return super.a - super.b;
   }
   
}

class Mul extends Calc{

   @Override
   int calculate() {
      return super.a * super.b;
   }
   
}

class Div extends Calc{

   @Override
   int calculate() {
      if(super.b == 0) {
         return 0;
      }
      return super.a / super.b;
   }
   
   
}

class AAA{

   @Override
   public String toString() {
      return "aaa의 주소= 0x" + Integer.toHexString(hashCode());
   }
   
}

class Circle5{

   private double radius;
   
   
   public Circle5(double radius) {
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }
   
   public double getArea() {
      
      return radius*radius*Math.PI;
   }
   
   @Override
   public String toString() {
      return "원의 넓비는 " +getArea()+" 이고 반지름은 "+getRadius() +"인 원";
   }
   
	@Override
	public boolean equals(Object obj) {
		
		Rectangle rec = (Rectangle) obj;  // 자식 = 부모 되는 케이스트 자식 = (자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함
		
		if( (this.width == rec.width) && ((this.height == rec.heght) )
		return true;
		
		return false;
		
}
}


public class AbstractMain {
   public static void main(String[] args) {
      
      Circle5 circle = new Circle5(10);
      
      System.out.println(circle); //원의 넓이는 314.1592... 이고 반지름은 10인 원
      
//      Rectangle4 rect1 = new Rectangle4();
//      Rectangle4 rect2 = new Rectangle4();
//      
//      boolean bool = rect1.equals(rect2);
//      
//      System.out.println(bool);
      
//      Scanner sc = new Scanner(System.in);
//      System.out.print("두 정수와 연산자를 입력하시오>> ");
//      int a = sc.nextInt();
//      int b = sc.nextInt();
//      char c = sc.next().charAt(0);
//
//      if (c == '+') {
//         Add add = new Add();
//         add.setValue(a, b);
//         System.out.println(add.calculate());
//      } else if (c == '-') {
//         Sub sub = new Sub();
//         sub.setValue(a, b);
//         System.out.println(sub.calculate());
//      } else if (c == '*') {
//         Mul mul = new Mul();
//         mul.setValue(a, b);
//         System.out.println(mul.calculate());
//      } else if (c == '/') {
//         Div div = new Div();
//         div.setValue(a, b);
//         System.out.println(div.calculate());
//      }
   }
}

class Rectangle4{
   private int width;
   private int height;
   
   public int getWidth() {
      return width;
   }
   public void setWidth(int width) {
      if(width < 0)
         return;
      this.width = width;
   }
   public int getHeight() {
      return height;
   }
   public void setHeight(int height) {
      if(height <0 )
         return;
      this.height = height;
   }
   
   
   @Override
   public String toString() {
      return getClass().getName() + " [width=" + width + ", height=" + height + "]";
   }
   
   @Override
   public boolean equals(Object obj) {
      Rectangle4 rect = (Rectangle4) obj;
      if(this.width == rect.width && this.height == rect.height) {
         return true;
      }
      return false;
   }
   
   
   
}


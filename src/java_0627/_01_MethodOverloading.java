package java_0627;
//메소드 오버라이딩 = 상속관계에서 똑같은 함수(이름,리턴타입,파라미터갯수와 종류)로 바디{}(실행 내용)만 달리 하는것 
class Cake {
  public void yummy() { 
      System.out.println("Yummy Cake");
  }
}
 
class CheeseCake extends Cake { 
  // Cake의 yummy 메소드를 오버라이딩 함
  public void yummy() { 
      System.out.println("Yummy Cheese Cake");
  }
}

//다형성 + 오버라이딩 = 응용
class Robot{
 public void work() {}
}

class DanceRobot  {
 public void work() {
    System.out.println("춤추는 로봇입니다.");
 }
}

class DrawRobot {
 public void work() {
    System.out.println("그림을 그리는 로봇입니다.");
 }
}

class WashRobot {
 public void work() {
    System.out.println("세탁 로봇입니다.");
 }
}

class YummyCakeOverriding {
  public static void main(String[] args) {
     DanceRobot draw = new DanceRobot();
     draw.work();
     
     WashRobot wash = new WashRobot();
     wash.work();
     
     
//     Robot[] arrRobot = {new DanceRobot(), new DrawRobot(),new WashRobot()};
     
//     for(Robot robot : arrRobot) {
//        robot.work();
//     }
     
  }
}

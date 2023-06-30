package java_0629;

public class _05_NumberMethod {

	public static void main(String[] args) {
		
		Integer num1 = new Integer(29);
		Integer i0bj = 10; //오토박싱 진행
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(i0bj.intValue());
		
		int num = i0bj;
		
		System.out.println(i0bj.doubleValue());
		
		Double num2 = new Double(3.14);
		
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
		
		// 줄 그어진 거 = 디플리케이트 = 공식적인 지원 종료 
		
		   // 클래스 메소드를 통한 인스턴스 생성 방법 두 가지
		   Integer n1 = Integer.valueOf(5);   // 숫자 기반 Integer 인스턴스 생성
		   Integer n2 = Integer.valueOf("1024");   // 문자열 기반 Integer 인스턴스 생성
		   
		   // 대소 비교와 합을 계산하는 클래스 메소드
		   System.out.println("큰 수: " + Integer.max(n1, n2));
		   System.out.println("작은 수: " + Integer.min(n1, n2));
		   System.out.println("합: " + Integer.sum(n1, n2));
		   System.out.println();
		  
		   // 정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드
		   System.out.println("12의 2진 표현: " + Integer.toBinaryString(12));
		   System.out.println("12의 8진 표현: " + Integer.toOctalString(12));
		   System.out.println("12의 16진 표현: " + Integer.toHexString(12));


	}

}

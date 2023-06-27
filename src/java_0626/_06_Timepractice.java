package java_0626;

import java.util.Scanner;

class Grade{
	private int kor, eng, math;
	private String name;
	
	public Grade(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public double gradeAvg(){
		return (kor + eng + math) / 3;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 평균은 " + gradeAvg() + " 성적은 " + getGrade() +  "입니다.");
	}
	
	public char getGrade() {
	      char ch = '가';
	      double avg = gradeAvg();

	      if (avg >= 90) {
	         ch = '수';
	      } else if (avg >= 80) {
	         ch = '우';
	      } else if (avg >= 70) {
	         ch = '미';
	      } else if (avg >= 60) {
	         ch = '양';
	      }else {
	         ch ='가';
	      }

	      return ch;
	   }
}

public class _06_Timepractice {

	public static void main(String[] args) {
		int [] arrLotto = new int[6];
		
		for(int i = 0; i < arrLotto.length; i++) {
			arrLotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j <i ; j++) {
				if(arrLotto[i] == arrLotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0 ; i < arrLotto.length; i++) {
			System.out.println(arrLotto[i] + " ");
		}
		Scanner sc;
        Grade grade;
        int kor, eng, math;
        String name; //변수를 한번 쫙  선언함
        
        

        while (true) {
        	sc = new Scanner(System.in);
        	
        	
        	System.out.print("이름: ");
        	name = sc.nextLine();
        			
            System.out.print("국어: ");
            kor = sc.nextInt();
            
            System.out.print("영어: ");
            eng = sc.nextInt();
            
            System.out.print("수학: ");
            math = sc.nextInt();

            grade = new Grade(name, kor, eng, math);
            
            grade.showInfo();
            


            System.out.print("계속하시겠습니까? (Yes/No): ");
            String continueChoice = sc.next();

                if(continueChoice.compareToIgnoreCase("yes")==0)
                	continue;
                else
                	break; 
            }

	}

}

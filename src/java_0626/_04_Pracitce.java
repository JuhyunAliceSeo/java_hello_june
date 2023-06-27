package java_0626;
import java.util.Scanner;
import java.util.Random;

public class _04_Pracitce {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rows = getValidInput(sc, "행크기: ");
		int columns = getValidInput(sc, "열크기: ");
		
		char[][] arr = new char[rows][columns];
		Random rd = new Random();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				arr[i][j] = (char)(rd.nextInt(26) + 65);
			}
		}
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

	}

	}


public static int getValidInput(Scanner scanner, String message) {
    int input;
    do {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
            System.out.print(message);
            scanner.next();
        }
        input = scanner.nextInt();
    } while (input < 1 || input > 10);
    return input;
}
}

//import java.util.Scanner;
//import java.util.Random;
//
//public class Java_05 {
//	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int rows;
//        int columns;
//
//        // 행 크기 입력 받기
//        while (true) {
//            System.out.print("행 크기: ");
//            rows = scanner.nextInt();
//            
//            if (rows >= 1 && rows <= 10) {
//                break; }
//             else {
//                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다."); }
//        }
//
//        // 열 크기 입력 받기
//        while (true) {
//            System.out.print("열 크기: ");
//            columns = scanner.nextInt();
//            if (columns >= 1 && columns <= 10) {
//                break; }
//             else {
//                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다."); }
//        }
//
//        // 이차원 배열 생성 및 랜덤 값 할당
//        char[][] arr = new char[rows][columns];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                arr[i][j] = (char) (random.nextInt(26) + 65); // 65부터 90까지의 랜덤 값으로 대문자 할당
//            }
//        }
//
//        // 배열 출력
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//
//public class MainParameter {
//   
//   public static int getArr() {
//      Scanner sc = null;
//      int num =0;
//      
//      while(true) {
//         sc = new Scanner(System.in);
//         num = sc.nextInt();
//         
//         if(num < 1 || num >10 ) {
//            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
//            continue;
//         }else {
//            
//            break;
//         }         
//      }
//   
//
//      return num;
//      
//   }
//   
//   public static void main(String[] args) {
//      //변수 선언
//      int row,col;
//      int[][] arr;
//      
//      System.out.print("행크기:");
//      row = getArr();
//      
//      System.out.print("열크기:");
//      col = getArr();
//      
//      arr = new int[row][col];
//      
//      //알파벳 입력및 출력
//      for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[i].length; j++) {
//            arr[i][j] = (int)(Math.random() * 26 + 65);
//            
//            System.out.print((char)arr[i][j] + " ");
//         }
//         System.out.println();
//      }
//            
//   }
//}

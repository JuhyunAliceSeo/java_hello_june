package java_0626;

public class _03_array {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		int num = 1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j] + "\t");
				}
			System.out.println();
			}
		
		int [][] arr1 = {
				{11},
				{22, 33},
				{44, 55, 66}
		};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				}
			System.out.println();
			}

	}

}

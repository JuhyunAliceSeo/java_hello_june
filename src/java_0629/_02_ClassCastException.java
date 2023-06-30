package java_0629;
class Board{}
class PBoard extends Board{}

public class _02_ClassCastException {
	public static void main(String[] args) {
		PBoard pbd1 = new Board();
		PBoard pbd2 =(PBoard)pbd1;
		
		System.out.println(".. intermdeiate location .");
		PBoard pbd1 = new Board();
		PBoard pbd2 =(PBoard)pbd1;
		
	}
}

package java_0627;

class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   public int getSize() { return size; }
	}
class ColorTV extends TV{
	public int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
		}
	public void printProperty() {
		System.out.println(getSize() + " inchese " + color + " color");
		}
	}


public class _03_Practice {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
		}
	}



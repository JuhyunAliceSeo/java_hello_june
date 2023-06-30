package java_0630;

	class DBox1<L, R> {
    private L left;
    private R right;

    public void set(L o, R r) {
        left = o;
        right = r;
    }
    
    @Override
    public String toString() {
        return left + " & " + right;
    }
}
public class _03_Practice {
	
	public static void main(String[] args) {
	 Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
     System.out.println(sBox.get());

     
     Box<Double> dBox1 = BoxFactory.<Double>makeBox(7.59);
     System.out.println(dBox1.get());
     
     DBox1<String, Integer> box = new DBox1<String, Integer>();        
     box.set("Apple", 25);
     System.out.println(box); // Apple & 24
	}

}

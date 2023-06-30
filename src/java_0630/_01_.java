package java_0630;
class Box<T> {
	   private T ob;

	   public void set(T o) {
	      ob = o;
	   }

	   public T get() {
	      return ob;
	   }
	}

	class Apple {
	    public String toString() {
	        return "I am an apple.";
	    }    
	}

	class Orange {
	    public String toString() {
	        return "I am an orange.";
	    }
	}
	
public class _01_ {
	
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}
	

}

package java_0626;

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class ColorTV extends TV {
    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() {
        System.out.println(getSize() + " inches " + color + " color");
    }
}

class IPTV extends ColorTV {
    private String ip;

    public IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip;
    }

    public void printProperty() {
        System.out.println(ip + " 주소에");
        super.printProperty();
    }
}

public class _08_Practice {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();

        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
	
//	1. 
//	class TV{
//	   private int size;
//	   public TV(int size) { this.size = size; }
//	   public int getSize() { return size; }
//	}
//	[1번] 다음 main() 메소드와 실행 결과를 참고하여 
//	TV를 상속받은 ColorTV 클래스를 작성하라.
//
//	public static void main(String[] args) {
//	   ColorTV myTV = new ColorTV(32, 1024);
//	   myTV.printProperty();
//	}
//	32인치 1024컬러
	
//	[2번] 다음 main() 메소드와 실행 결과를 참고하여 ColorTV를 상속받는 IPTV 클래스를 작성하라.
//
//	public static void main(String[] args) {
//	   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
//	   iptv.printProperty();
//	}
//	나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러


//class TV {
//	   private int size;
//
//	   public TV(int size) {
//	      this.size = size;
//	   }
//
//	   public int getSize() {
//	      return size;
//	   }
//	}
//
//	class ColorTV extends TV {
//	   private int color;
//
//	   public ColorTV(int size, int color) {
//	      super(size);
//	      this.color = color;
//	   }
//
//	   public void printProperty() {
//	      System.out.println(super.getSize() + "인치 " + this.color + "컬러");
//	   }
//	}
//
//	class IPTV extends ColorTV {
//
//	   private String ip;
//
//	   public IPTV(String ip, int size, int color) {
//	      super(size, color);
//	      this.ip = ip;
//	   }
//	   
//	   public void printProperty() {
//	      System.out.print(this.ip + " 주소에 ");
//	      super.printProperty();
//	   }
//	}
//
//	public class MainParameter {
//	   public static void main(String[] args) {
//	      ColorTV myTV = new ColorTV(32, 1024);
//	      myTV.printProperty(); // 32인치 1024컬러
//
//	      IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048컬러
//	      iptv.printProperty();
//
//	   }
//	}



package java_0630;

import java.util.ArrayList;
import java.util.List;

class MyLinkedList{
	int num;
	MyLinkedList myLinkedList;
	
}

public class _04_Framework {

	public static void main(String[] args) {
		MyLinkedList my1 = new MyLinkedList();
		my1.num = 10;
		
		MyLinkedList my2 = new MyLinkedList();
		my1.num = 11;
		my2.myLinkedList= my2;
		
		my2.myLinkedList = new MyLinkedList();
		
		List<String> list = new ArrayList<>(); //유일한 변화
		
		
		//컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 저장된 문자열 인스턴스의 참조
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		for(String str : list) {
			System.out.print(str + '\t');
		}
		System.out.println();
		
		list.remove(0); //첫번째 인스턴스 삭제
		
		// 첫번째 인스턴스 삭제후 나머지 인스턴스들을 참조
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();

	}

}


//import java.util.LinkedList;
//import java.util.List;
//
//public class _04_Framework {
//
//	public static void main(String[] args) {
//		List<String> list = new LinkedList<>();
//		
//		//컬렉션 인스턴스에 문자열 인스턴스 저장
//		list.add("Toy");
//		list.add("Box");
//		list.add("Robot");
//		
//		// 저장된 문자열 인스턴스의 참조
//		for(int i = 0; i < list.size(); i++)
//			System.out.println(list.get(i) + '\t');
//		
//		for(String str : list) {
//			System.out.println(str + '\t');
//		}
//		System.out.println();
//		
//		list.remove(0); //첫번째 인스턴스 삭제
//		
//		// 첫번째 인스턴스 삭제후 나머지 인스턴스들을 참조
//		for(int i = 0; i < list.size(); i++)
//			System.out.println(list.get(i) + '\t');
//		System.out.println();
//
//	}
//
//}

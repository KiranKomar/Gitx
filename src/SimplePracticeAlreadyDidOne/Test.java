package SimplePracticeAlreadyDidOne;

public class Test {

	public static void main(String[] args) {
		Person p=new Person(45);
		Person p1=new Person(45);
		
		System.out.println(p.equals(p1));
System.out.println(p.hashCode());
System.out.println(p1.hashCode());
	}

}

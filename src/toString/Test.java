package toString;

public class Test {
	
	String name;
	int age;

	public Test(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
	
		Test t= new Test("Kishore",22);
		System.out.println(t);
		
	}
    
    public String toString() {
		return this.name +" "+this.age;
    	
    }
}

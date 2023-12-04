package DynamicBinding;

public class Staff extends CEO {
	
	
	public static void main(String[] args) {
		CEO s = new Staff();  // Dynamic Binding
		s.work();    //Parent class reference pointing to Child class memory
		
	}
	
	public void work() {
		System.out.println("Working in Chennai");
	}
	
	public void attendMeetings() {
		System.out.println("Staff meeting");
	}

}

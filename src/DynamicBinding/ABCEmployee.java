package DynamicBinding;

public class ABCEmployee implements EmployeeRules, FamilyRules {

	
	
	public static void main(String[] args) {
		
		FamilyRules abc =new ABCEmployee();  //Dynamic Binding. Can only access FamilRules methods in this case
		abc.eatTogether();                       //Interface name pointing to implementing Class memory
		System.out.println(ABCEmployee.LEAVES);
		System.out.println(ABCEmployee.SALARY);
	}
	
	

	@Override
	public void takeCareParents() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatTogether() {
		// TODO Auto-generated method stub
	}

	@Override
	public void helpMembers() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void reportToManager() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void maintainHours() {
		// TODO Auto-generated method stub
	}

	@Override
	public void maintaingHours() {
		// TODO Auto-generated method stub

	}
	

}

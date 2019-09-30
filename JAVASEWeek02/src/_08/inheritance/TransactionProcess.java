package _08.inheritance;

public abstract class TransactionProcess {
	
	public void ortakMethod() {
		
	}
	
	public abstract void ortakOlmayanMethod();
	
	public void kismiOrtakMethod() {
		
	}
	

}

class CustomerTransactionProcess extends TransactionProcess{

	@Override
	public void ortakOlmayanMethod() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class EmployeeTransactionProcess extends TransactionProcess {

	@Override
	public void ortakOlmayanMethod() {
		//
	}
	
	public void kismiOrtakMethod() {
		//
	}

}



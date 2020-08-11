package javaCocepts;

public class ClassImplementingMethods implements Interface_Banking,Interface_HealthCare{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassImplementingMethods m=new ClassImplementingMethods();
		m.checkCreditScore();
		m.depositeAmount();
		m.payEMI();
		m.onyToThisMethod();
		
		Interface_Banking m1=new ClassImplementingMethods();//Runtime polymorphism
		m1.payEMI();
		m1.checkCreditScore();
		m1.depositeAmount();
		
		Interface_HealthCare m2=new ClassImplementingMethods();
		m2.candidateProfile();
		m2.insurance();
	}

	public void payEMI() {
		// TODO Auto-generated method stub
		System.out.println("This is to pay EMI");
	}

	public void depositeAmount() {
		// TODO Auto-generated method stub
		System.out.println("This is to deposite amount");
	}

	public void checkCreditScore() {
		// TODO Auto-generated method stub
		System.out.println("This is to check credit scrore");
	}
	public void onyToThisMethod() {
		// TODO Auto-generated method stub
		System.out.println("Only for this method");
	}

	public void candidateProfile() {
		// TODO Auto-generated method stub
		System.out.println("This is for candidate profile");
	}

	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("This is to check insurance");
	}

}

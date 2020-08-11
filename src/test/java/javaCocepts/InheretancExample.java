package javaCocepts;

public class InheretancExample implements Interface_HealthCare {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Interface_HealthCare i=new InheretancExample();
		i.candidateProfile();
		i.insurance();

	}

	@Override
	public void candidateProfile() {
		// TODO Auto-generated method stub
		System.out.println("vandiatepri");
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("insurace");
	}

}

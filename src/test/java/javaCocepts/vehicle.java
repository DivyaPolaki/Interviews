package javaCocepts;

public abstract class vehicle {
	public abstract int getnumberofwheels();

}
class Bus extends vehicle{

	@Override
	public int getnumberofwheels() {
		// TODO Auto-generated method stub
		return 4;
	}
}
	class Auto extends vehicle{

		@Override
		public int getnumberofwheels() {
			// TODO Auto-generated method stub
			return 3;
		}
	}
	


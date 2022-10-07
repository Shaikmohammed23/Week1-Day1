package Assignment2;

public class Mobile {
	private void makeCall() {
		// TODO Auto-generated method stub
		String MobileModel="Oneplus";
		float mobileWeight=287.6f;
		System.out.println("Mobile model is"+MobileModel);
		System.out.println("Mobile weight is"+mobileWeight);
	}
	private void sendMsg() {
		// TODO Auto-generated method stub
		boolean fullyCharged=false;
		int mobileCost= 2999;
		System.out.println("Full charged"+fullyCharged);
		System.out.println("Mobile Cost is"+mobileCost);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println("This is my mobile");
		m.makeCall();
		m.sendMsg();
	}
}

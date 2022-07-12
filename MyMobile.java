package week1.day1;

public class MyMobile {
	int id=12345678;
	String name="mobile";
	long mobilenumber=8610606210l;
	public void makeCall(){
		System.out.println(id);
	}
	public void sendMsg() {
		System.out.println(name);
	}
    public void payBill() {
    	System.out.println();
    }
	public static void main(String[] args) {
	MyMobile vivo=new MyMobile();
	System.out.println(vivo.id);
    vivo.makeCall();
	}

}

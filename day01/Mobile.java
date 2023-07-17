package week01.day01;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Make a Call");
	}
	public void sendTextMsg() {
		System.out.println("Send Txt Msg");
		}
	public void shareDoc() {
		System.out.println("Share Document");
	}
	
	public static void main(String[] args) {
		Mobile newMobile= new Mobile();
		newMobile.makeCall();
		newMobile.sendTextMsg();
		newMobile.shareDoc();
	}

}

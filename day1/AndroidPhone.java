package week3.day1;

public class AndroidPhone extends SmartPhone {
	
	public void takeVideo(){
		System.out.println("Send me a video");	
			
		}
public static void main(String[] args) {
	
	AndroidPhone obj = new AndroidPhone();
	obj.accessWhatsApp();
	obj.sendMsg();
	obj.takeVideo();
	obj.makeCall();
	obj.saveContact();
	
	SmartPhone smp = new SmartPhone();
	smp.takeVideo();
	
}

}

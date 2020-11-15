package helpers;

public class Helper {
	public void sleepSeconds(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
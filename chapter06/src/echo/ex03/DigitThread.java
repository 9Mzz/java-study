package echo.ex03;

public class DigitThread extends Thread {
		
//		쓰레드를 이용해보자
		
		@Override
		public void run() {
			for (int cnt=0; cnt<=10; cnt++) {
				
				System.out.println(cnt);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	
	
	
	
	

}

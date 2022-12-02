package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		//Runnable: 스레드 실행을 위한 인터페이스
		Thread thread = new Thread(new Runnable() {
			
			//run(): 실제 스레드가 실행되는 코드
			@Override
			public void run() {
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i =0; i < 5; i++) {
					toolkit.beep(); //빔소리를 냄
					try {
						Thread.sleep(500); //0.5초
					}catch(Exception e){}
				}
				
				
			}
		});
		
		thread.start();
		
		
		for(int i =0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //0.5초 간 일시정지
			}catch(Exception e){}
	}

}
}

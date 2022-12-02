package test.ch13.sync;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	//메소드에 동기화 걸기
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
	
	//코드 블록에 동기화 걸기 (내가 동기화 걸기를 원하는 코드 범위 선택)
	public void setMemory2(int memory) {
		synchronized (this) {
			this.memory = memory;		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
		}
	}
}
	
	

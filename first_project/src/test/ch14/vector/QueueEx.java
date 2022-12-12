package test.ch14.vector;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> msgQ = new LinkedList<>();
		
		//메세지 넣기
		msgQ.offer(new Message("sendMain","홍길동"));
		msgQ.offer(new Message("sendSMS","김명현"));
		msgQ.offer(new Message("sendkakao","김자바"));
		
		//메세지 내보내기
		while(!msgQ.isEmpty()) {
			Message msg = msgQ.poll();
			System.out.println(msg.command + "," +msg.to);
		}
	}
	

}

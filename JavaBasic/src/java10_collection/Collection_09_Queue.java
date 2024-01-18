package java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_09_Queue {

	public static void main(String[] args) {
		
//		큐, Queue      솔큐 다인큐   큐잉
//						은행 번호표     서비스에서는 First Come First Service
//		FIFO, Fisrt Input First Output,	선입선충
//		LILO, Last Input Last Output, 	후입후출
		
//		대기열 시스템을 구축할 때 사용한다
		
//		큐의 메소드
//		offer()	: 데이터 입력, enqueue(인큐)
//		poll()	: 데이터 출력 및 삭제, dequeue(데크)
		
//		peek()	: 데이터 확인, poll()될 데이터 확인 (삭제x) 
//		-------------------------------------------------
		
		Queue queqe = new LinkedList();
		
		queqe.offer("Alice");
		queqe.offer("Bob");
		queqe.offer("Clare");
		
		System.out.println(queqe);
		
		System.out.println("-----------------");
		
		System.out.println(queqe.poll());
		System.out.println(queqe.poll());
		
		System.out.println("------------------");
		
		System.out.println(queqe.peek());
		
		System.out.println(queqe);
		
	}

}

package _18_javaThreads2;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit.*;

public class LessonEighteen {

	public static void main(String[] args) {
		addThreadsToPool();
		
			
	}
	public static void addThreadsToPool() {
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
	
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 5, 5, TimeUnit.SECONDS);
	
		System.out.println("Number of Threads: " + Thread.activeCount());
		
		Thread[] listOfThreeads = new Thread[Thread.activeCount()];
		Thread.enumerate(listOfThreeads);
		
		for(Thread i : listOfThreeads) {
			System.out.println(i.getName());
		}
		
		for(Thread i : listOfThreeads) {
			System.out.println(i.getPriority());
		}
		eventPool.shutdown();
		
		try {
			Thread.sleep(20000);
		}
		catch(InterruptedException e) {}
		
	}
}

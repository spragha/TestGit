package com.raghav.corejava.thread;

public class ThreadExtends extends Thread {


	public void run() {

	for (int i = 1; i < 5; i++) {
			try {
				//System.out.println("Thead is running" + this.getName());
				System.out.println("Thead is running" + Thread.currentThread().getName());
				System.out.println(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadExtends te = new ThreadExtends();
		ThreadExtends te1 = new ThreadExtends();
	    te.setName("Raghavan"); // to set thread name
		te.setPriority(Thread.MAX_PRIORITY); // set thread priority default is Norm 5 MIN 0 MAX 10
		te.start();
		try {
			te.join(); // it make sure that Raghavan is completed then it gives chance to next thread we can use join(1500)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		te1.start();
		te.start();
		//te.setDaemon(true); //to set the thread as daemon thread make sure thread is started to make it daemon
		//te.isDaemon(); // to check whether the thread is Daemon Thread
		//te.run(); this will result in single thread
		//te1.run();
	}

}

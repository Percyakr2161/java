) Write a program in which thread sleep for 6 sec in the loop in reverse order from 100
to 1 and change the name of thread.


class ReverseThread extends Thread {

	public ReverseThread(String name) {
		
		super(name);
	}
	public void run() {
	
		for(int i=100 ; i>= 1 ; i--) {
		
			System.out.println(getName() + ":" + i);

			try {
				Thread.sleep(600);
			}
			catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}
class ReverseCount {

	public static void main(String[] args) {
	
		ReverseThread rt = new ReverseThread("CountdownThread");
		rt.start();
	}
}

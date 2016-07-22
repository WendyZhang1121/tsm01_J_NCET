package tsm01_J_NCET;

final class ThreadStarter implements Runnable { 
	public ThreadStarter() {
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override 
	public void run() { 
		// ...
	} 
	public static void main(String[] args) { 
			for (int i = 0; i < 2; i++) {
				new Thread(new ThreadStarter()).start(); 
				}
	}
}
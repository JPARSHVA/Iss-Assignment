 package ISSPackage;

 public class VolatileExample {
	    private volatile boolean flag = false;

	    public static void main(String[] args) {
	        VolatileExample example = new VolatileExample();

	        Thread writerThread = new Thread(() -> {
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            example.setFlag(true);
	            System.out.println("Flag set to true.");
	        });

	        Thread readerThread = new Thread(() -> {
	            while (!example.isFlag()) {
	                // Loop until flag becomes true
	            }
	            System.out.println("Flag is now true.");
	        });

	        writerThread.start();
	        readerThread.start();
	    }

	    public boolean isFlag() {
	        return flag;
	    }

	    public void setFlag(boolean flag) {
	        this.flag = flag;
	    }
	}

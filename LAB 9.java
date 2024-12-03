class BMSPrinter extends Thread {
   
    public void run() {
        try {
            while (true) {
                System.out.println("BMS college of engineering");
                Thread.sleep(10000);           
	    }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class CSEPrinter extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000);             }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class threads1 {
    public static void main(String[] args) {
        BMSPrinter bmsThread = new BMSPrinter();
        CSEPrinter cseThread = new CSEPrinter();

        bmsThread.start();
        cseThread.start();
    }
}

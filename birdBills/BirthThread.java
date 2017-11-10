public class BirthThread extends Thread {
    private char dBill[] = new char[2];
    private boolean side;
    private int bill = 0;
    public int speed = 1000;

    public BirthThread(char bill0, char bill1, boolean isRight){
        dBill[0] = bill0;
        dBill[1] = bill1;
        side = isRight;
    }

    public String toString(){
        String firstPart = side ? ("__(*" + dBill[bill]) : (dBill[bill] + "*)__");
        return (firstPart + "\n \\__/ \n");
    }

    public void run(){
        while (true){
            bill = (bill + 1) % 2;

            try {
                Thread.sleep(speed);
            } catch(InterruptedException ex) {}  
        } 
    }
}
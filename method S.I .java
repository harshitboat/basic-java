public class SimpleIntrest {
    public void calculateInterest() {
        int P = 1000;  
        int T = 3;     
        int R = 8;    

        int SI = (P * T * R) / 100;
        System.out.println("Simple Interest: " + SI);
    }

    public static void main(String[] args) {
        SimpleIntrest interest = new SimpleIntrest();
        interest.calculateInterest();
    }
}

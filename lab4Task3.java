import java.util.Scanner;

class BankAccount{
    private int StartingPeriod, EndingPeriod, interestrate, CurrentBalance;
    private double interest;

    public void CalculateTotalInterst(){
        int gapBetweenPeriod;
        interest = (double)((double)(interestrate/100) * CurrentBalance);
        gapBetweenPeriod = StartingPeriod - EndingPeriod;
        interest *= gapBetweenPeriod;
    }

    public int getStartingPeriod() {
        return StartingPeriod;
    }

    public int getCurrentBalance() {
        return CurrentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        CurrentBalance = currentBalance;
    }

    public int getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(int interestrate) {
        this.interestrate = interestrate;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public void setStartingPeriod(int startingPeriod) {
        StartingPeriod = startingPeriod;
    }

    public int getEndingPeriod() {
        return EndingPeriod;
    }

    public void setEndingPeriod(int endingPeriod) {
        EndingPeriod = endingPeriod;
    }


    
}

class lab4Task3{
    public static void main(String argv[]){
        BankAccount a = new BankAccount();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Starting period");
            a.setStartingPeriod(sc.nextInt());
            System.out.println("Enter Ending period");
            a.setEndingPeriod(sc.nextInt());
            System.out.println("Enter Current Account Balance");
            a.setCurrentBalance(sc.nextInt());
            System.out.println("Enter InterestRate");
            a.setInterestrate(sc.nextInt());
        }

        a.CalculateTotalInterst();
        System.out.println("Interest according to " + a.getInterestrate() + " is " + a.getInterest());
    }
}
class customer{
    int balanceAtTheBeginning, ItemsChargedThisMonth, TotalCreditThisMonth, aloowedCradit;
    String acountNumber;

    public customer(String acountNumber, int balanceAtTheBeginning, int itemsChargedThisMonth, int totalCreditThisMonth,
            int aloowedCradit) {
        this.acountNumber = acountNumber;
        this.balanceAtTheBeginning = balanceAtTheBeginning;
        ItemsChargedThisMonth = itemsChargedThisMonth;
        TotalCreditThisMonth = totalCreditThisMonth;
        this.aloowedCradit = aloowedCradit;
    }

   public boolean exceededLimit(){
    // 10 is supposed price of the items
    // if the total price is bigger then allowed cradit then credit is exceeded
    if(ItemsChargedThisMonth * 10 > aloowedCradit){
        return true;
    }
    return false;
   }

public String getAcountNumber() {
    return acountNumber;
}
    
}

class CraditCalculator{
    public static void main(String[] args){
        customer c = new customer("0001", 2000, 310, 4000, 3000);
        if(c.exceededLimit()){
            System.out.println("customer with account number " + c.getAcountNumber() + " has exceeded account Limit");
        }
        else{
            System.out.println("customer with account number " + c.getAcountNumber() + " has not exceeded account limit");
        }
    }
}

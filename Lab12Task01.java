import java.util.Date;

class Customer{
    private String name, memberType;
    private boolean member = false;
    
    Customer(String name){
        name = name;
    }

    String getName(){
        return name;
    }

    boolean isMember(){
        return member;
    }

    void setMember(boolean member){
        this.member = member;
    }

    String getMemberType(){
        return memberType;
    }

    void setMemberType(String memberType){
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", memberType=" + memberType + ", member=" + member + "]";
    }

}

class Visit{
    private Customer customer;
    private Date date = new Date();
    private double serviceExpense, productExpense;

    Visit(String name, Date date){
        customer = new Customer(name);
        this.date = date;
    }

    String getName(){
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return serviceExpense + productExpense;
    }

    @Override
    public String toString() {
        return "Visit [customer=" + customer.toString() + ", date=" + date + ", serviceExpense=" + serviceExpense
                + ", productExpense=" + productExpense + "]";
    }

}

class DiscountRate{
    private double serviceDiscountPremium = 0.2, serviceDiscountGold = 0.15, serviceDiscountSilver = 0.1;
    private double productDiscountGold = 0.1, productDiscountSilver = 0.1, productDiscountPremium = 0.1;

    double getServiceDiscountRate(String type){
        return serviceDiscountGold + serviceDiscountPremium + serviceDiscountSilver;
    }

    double getProductDiscountRate(String type){
        return productDiscountGold + productDiscountPremium + productDiscountSilver;
    }
}
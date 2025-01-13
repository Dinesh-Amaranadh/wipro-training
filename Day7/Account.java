package Day7;

public class Account {
    private String accountNumber="1234567";
    private double balance =0;

    


    public String deposite(double money){
        balance += money;
        return money+" Deposite sucessfull";
    }

    public String widthdraw(double money){
        if(balance < money){
            return "You don't have sufficient balance";
        }
        balance -= money;
        return money+" Money widthdraw";
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance =balance;
    }

    public String getAccountDetails(){
        return this.accountNumber+" have money "+getBalance();
    }
    
    public static void main(String [] args){
        Account account = new Account();
        System.out.println(account.deposite(5000));
        System.out.println(account.widthdraw(2343));
        System.out.println("Total balance: "+ account.getBalance());
        System.out.println("Account details: "+account.getAccountDetails());
    }
}

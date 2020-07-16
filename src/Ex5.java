import java.util.Date;

public class Ex5 {
    public static void main(String[] args) {
        Account Account1 = new Account(1122, 20000);
        Account1.setAnnualInterestRate(4.5);
        Account1.withdraw(2500);
        Account1.deposit(3000);
        System.out.println(Account1.getBalance() + " " + Account1.getMonthlyInterest() + " " + Account1.getDateCreate());
    }
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    public Account(int ID, double Balance){
        id = ID;
        balance = Balance;
    }
    public void setId(int a){
        id = a;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double a){
        balance = a;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double a){
        annualInterestRate = a;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public Date getDateCreate(){
        return dateCreate;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/1200;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double a){
        double temp = balance - a;
        balance = temp;
    }
    public void deposit(double a){
        double temp = balance + a;
        balance = temp;
    }
}

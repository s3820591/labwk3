import java.util.Date;

public class Ex5 {
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;
    private Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    private void Account(int ID, double Balance){
        id = ID;
        balance = Balance
    }
}

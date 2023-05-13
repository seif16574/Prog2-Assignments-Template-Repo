// name : seif mahmoud 
// id : 20216574

class BankAccount {
    public double balance;
    public String username;
    public String bankname;
    public final String country = "Egypt" ;
    public int NumOfUsers =0;
    public int NumOfcalls =0;
    public BankAccount () {
        System.out.printin( "Bank account has been created ");
        NumOfUsers ++;
    }
    public BankAccount ( double × ‚String n, String b) {
        balance = X;
        username = n;
        bankname=b;
        NumofUsers ++;
    }
    public void Deposite (double amount) {
        balance += amount;
        Numofcalls++;
    }
    public void withdraw (double amount) {
        balance -= amount;
        Numofcalls++ ;
    }
    public class Main {
        public static void main (String[] args) {
            BankAccount acc1=new BankAccount ( );
            BankAccount acc2=new BankAccount (2000, "seif", "Cairobank");
            acc2.Deposite(500);
            acc2.withdraw(200);
            System. out.println("balance of account is = " +acc2.balance);
            System.out.println("number of calls is = " +acc2.Numofcalls);
            System.out.println("number of users is = " +acc2. NumofUsers);
        }
    }

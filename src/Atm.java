import java.util.Scanner;

public class Atm {
    int Pin = 1234;
    String Name = "Chirag Garg";
    float Balance;

   public void menu(){
       System.out.println("Welcome To SBI ATM");
       System.out.println("Select Any Option");
       System.out.println("1) Deposit Money");
       System.out.println("2) Withdraw Money");
       System.out.println("3) Check Balance");
       System.out.println("0) Exit");
       Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
       if(choice==1){
           depositMoney();
           menu();
       } else if (choice==2) {
           withdrawMoney();
           menu();

       } else if (choice==3) {
           checkBalance();
           menu();

       } else if (choice==0) {
           return;


       }
       else {
           System.out.println("Enter A Valid Choice");
       }

   }
    public void checkpin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pin");
        int enterpin = sc.nextInt();
        if(enterpin == Pin){
            System.out.println("Welcome "+Name);
            menu();
        }
        else {
            System.out.println("Incorrect Pin");
            checkpin();

        }
    }

    public void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit");
        float dep = sc.nextFloat();
        Balance = Balance+dep;
        System.out.println("Money Deposited Successfully");
        menu();


    }
    public void withdrawMoney(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        float wid = sc.nextFloat();
        Balance = Balance-wid;
        System.out.println("Money Withdrawn Successfully");
    }
    public void checkBalance(){
        System.out.println("Your Balance is:"+Balance);
    }

}
class Atmmachine{
    public static void main(String[] args){
        Atm obj = new Atm();
        obj.checkpin();
    }
}

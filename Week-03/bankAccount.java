import java.util.*;
class bankAccount

           

   {
      public String Customer_name; 
      public String Account_type;
      public int amount;
      public int withdraw;
      public int balance;
      public int cash;
      public int deposit;


      public void withdrawl()
      {
          if(withdraw>balance)
          System.out.println("Insufficient funds");
          else
     
          System.out.println("Enter withdrawal amount:");
          withdraw = sc.nextInt();
          amount = balance-withdraw;
          
          System.out.println("Enter balance amount:");
          balance = sc.nextInt();
          System.out.println("Withdrawl amount is:"+withdraw);
          System.out.println("Remaining balance is:"+amount);
      }
      public void deposit()
      {
         
          
         System.out.println("Amount deposited");
          amount = deposit+balance;
          System.out.println("Balance is :"+amount);
      }
      public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
          bankAccount b1 = new bankAccount();
          b1.withdrawl();
          
          bankAccount b2 = new bankAccount();
   System.out.println("Enter deposit amount:"+cash);
          int cash = sc.nextInt(); 
          b2.deposit();
       }
}

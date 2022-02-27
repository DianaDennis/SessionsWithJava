package trials;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Authountication for ATMDemo 
  Enter 
  Account number : MSBANK01817
  password       :1234
 */
public class Customer {
	private String accNo;
    private int password;
    
    public String  getaccNo()
    {
     return accNo ;
    }
    public int getPassword()
    {
        return password  ;
    }
    public void setaccNo (String accNo )
    {
        this.accNo = accNo ;
    }
    public void setPassword(int password )
    {
        this.password = password ;
    }

    public class Account{
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        Customer c = new Customer();
        public void login(){
         try{
            list.add("MSBANK01817");
            list.add(1234);
            list.add("MSBANK01832");
            list.add(1832);
            System.out.println("Welcome To ATM machine ");
           System.out.println("Enter AcountNo :");
           c.setaccNo(sc.nextLine());
          System.out.println("Enter password :");
          c.setPassword(sc.nextInt());
          for(int i=0;i<list.size();i++)
          {
         if(list.get(i).equals(c.getaccNo()) || list.get(i).equals(c.getPassword()))
          {
           System.out.println("login succesful...!");
           System.out.println("Account Number :"+c.getaccNo());
           System.out.println("Password    : "+c.getPassword());
              accessAccount();
          }
          else
          System.out.println("login failed...!");
          break ;
        }
        }
        catch(Exception e)
        {
            System.out.println("please enter valid data");
        }
        
    }


        public void accessAccount()
        {
        
          try
          {
            System.out.println("Choose your Account type :");
            System.out.println("1.Saving Account");
            System.out.println("2.Checking Account");
            System.out.println("3.exit");
            System.out.println("4.logout");
            int x = sc.nextInt();
            switch(x)
            {
                case 1 :
                System.out.println("Saving Account*");
                savingAccount();
                break;
                case 2 :
                System.out.println("Checking Account*");
                checkingAccount();
                break;
                case 3:
                 accessAccount ();
                 break;
                 case 4 :
                System.out.println("logout successfully...!");
                break;
                default :
                System.out.println("Invalid input*");
                accessAccount();
                break; 
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
            
        }
        
        public void savingAccount()
        {
          try
          {
            System.out.println("Choose your operations :");
            System.out.println("1.BalInfo ");
            System.out.println("2.AddBalance");
            System.out.println("3.Withdraw");
            System.out.println("4.exit");
            System.out.println("5.logout");
            int x = sc.nextInt();
            switch(x)
            {
                case 1 :
                System.out.println("Balance INFO*");
                checkBalance();
                savingAccount ();
                break;
                case 2 :
                System.out.println("AddBalance*");
                addBalance();
                savingAccount();
                break;
                case 3:
                System.out.println("Wihtdraw*");
                withDrawal();
                savingAccount();
                 break;
                 case 4:
                System.out.println("Exit*");
                 savingAccount();
                 break;
                 case 5:
                System.out.println("logout successfully...!");
                 break;
                default :
                System.out.println("Invalid input*");
                savingAccount();
                break; 
            }
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
        }
        
        public void checkingAccount()
        {
          try{
            System.out.println("Choose your operations :");
            System.out.println("1.BalInfo ");
            System.out.println("2.AddBalance");
            System.out.println("3.Withdraw");
            System.out.println("4.exit");
            System.out.println("5.logout");
            int x = sc.nextInt();
            switch(x)
            {
                case 1 :
                System.out.println("BalInfo*");
                checkBalance();
                checkingAccount();
                break;
                case 2 :
              System.out.println("AddBalance*");
                addBalance();
                checkingAccount();
                break;
                case 3:
                System.out.println("Wihtdraw*");
                withDrawal();
                checkingAccount();
                 break;
                 case 4:
                System.out.println("Exit*");
                 checkingAccount ();
                 break;
                 case 5:
                System.out.println("logout successfully...!");
                 break;
                default :
                System.out.println("invalid input* ");
                checkingAccount();
                break; 
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
     }   
            double balance = 0;
            double  amount = 0 ;
        
        public void checkBalance()
        {
            System.out.println("Available Balance is  : INR " +balance);
        }
        
        public void addBalance()
        {
            System.out.println("Enter amount  :");
            amount=sc.nextDouble();
            if(amount >=0)
            {
            balance += amount ;
            System.out.println(" New Balance is :   INR "+balance);
            }
            else
            System.out.println("balance can\'t be negative ");
            
        }
        
        public void withDrawal()
        {
            System.out.println("Enter amount  :");
            amount=sc.nextDouble();
            if(amount>=0 && amount<=balance)
            {
            balance -= amount ;
            System.out.println(" Available Balance is :   INR "+balance);
            }
            else
            {
                System.out.println("insufficient Balance ");
            }
        }
    }
	public static void main(String[] args) {
		

		
	      // Account b = new Account();
	       // b.login();
	    }
	}
	



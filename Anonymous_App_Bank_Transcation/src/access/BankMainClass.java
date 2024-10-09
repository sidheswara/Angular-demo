package access;
import test.*;
import java.util.*;
public class BankMainClass {
	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int count=0;
     pqr:
     while(true)
     {
    	System.out.println("Enter the pinNo:");
    	int pinNo=s.nextInt();
    	if(pinNo>=1111 && pinNo<=9999)
    	{
    		CheckPin cpn = new CheckPin();
    		boolean k=cpn.verify(pinNo);
    		if(k)
    		{
    			System.out.println("===Choice===");
    			System.out.println("1.WithDraw\n2.Deposite");
    			System.out.println("Enter the Choice:");
    			switch(s.nextInt())
    			{
    			case 1:
    				System.out.println("Enter the amt :");
    				int a1=s.nextInt();
    				if(a1>0&& a1%100==0)
    				{
    					Transaction ob = new Transaction()
    					{
    						 public  void process(int amt)
    						  {
    							  if(amt<=b.bal)
    							  {
    								  System.out.println("Amt WithDraw:"+amt);
    								  b.bal=b.bal-amt;
    								  System.out.println("Balance Amt:"+b.getBalance());
    								  System.out.println("Transaction Successfull...");
    							  }//end of if
    							  else
    							  {
    								  System.out.println("Insufficient fund..");
    							  }
    						  }
    					};
    					ob.process(a1);
    				}//end of if
    				else
    				{
    					System.out.println("Invaild amt..");
    				}
    				break pqr;
    			case 2:
    				System.out.println("Enter the amt :");
    				int a2=s.nextInt();
    				if(a2>0&& a2%100==0)
    				{
    					Transaction ob1=new Transaction()
    					{
    						 public void process(int amt)
    						    {
    						    	System.out.println("Amt Deposite:"+amt);
    						    	b.bal=b.bal+amt;
    						    	System.out.println("Balance Amt:"+b.getBalance());
    						    }
    					};
    					ob1.process(a2);
    				}//end of if
    				else
    				{
    					System.out.println("Invaild amt..");
    				}
    				break pqr;
    			}//end of switch
    		}//end of if
    		else
    		{
    			System.out.println("Invaild PinNo..");
    			count++;
    		}
    	}//end of if
    	else
    	{
    		System.out.println("Invaild PinNo..");
    		count++;
    	}
    	if(count==3)
		{
			System.out.println("Transaction blocked..");
			break;
		}
     }//end of loop
	}
}

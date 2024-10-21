package access;
import java.util.*;
import test.*;
public class BookMain {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    try(s;){
    	try {
    		 ArrayList<Book> al = new ArrayList<Book>();
    		 al.add(new Book("A101","Mou","XYZ",1200,12));
    		 al.add(new Book("A100","FSD","PQR",1000,10));
    		 al.add(new Book("A108","KBB","ABC",600,6));
    		 al.add(new Book("A111","CDR","KLM",1800,18));
    		 System.out.println("======Books====");
    		 al.forEach((y)->System.out.println(y));
    		 while(true) {
    			 System.out.println("*****Sorting*****");
    			 System.out.println("\t1.sort-by-code"
    					 + "\n\t2.sort-by-name"
    					 +"\n\t3.sort-by-author"
    					 + "\n\t4.sort-by-price"
    					 + "\n\t5.sort-by-qty"
    					 + "\n\t6.exit");
    			 System.out.println("Enter the choice :");
    			 switch(Integer.parseInt(s.nextLine())) {
    			 case 1:
    				 al.sort(new SortByCode());
    				 System.out.println("======Books(sort-by-code)====");
    	    		 al.forEach((y)->System.out.println(y));
    				 break;
    			 case 2:
    				 al.sort(new SortByName());
    				 System.out.println("======Books(sort-by-name)====");
    	    		 al.forEach((y)->System.out.println(y));
    				 break;
    			 case 3:
    				 al.sort(new SortByAuthor());
    				 System.out.println("======Books(sort-by-author)====");
    	    		 al.forEach((y)->System.out.println(y));
    				 break;
    			 case 4:
    				 al.sort(new SortByPrice());
    				 System.out.println("======Books(sort-by-price)====");
    	    		 al.forEach((y)->System.out.println(y));
    				 break;
    			 case 5:
    				 al.sort(new SortByQty());
    				 System.out.println("======Books(sort-by-qty)====");
    	    		 al.forEach((y)->System.out.println(y));
    				 break;
    			 case 6:
    				 System.out.println("Operations stopped.....");
    				 System.exit(0);
    				 default:
    					 System.out.println("Invaild choice....");
    			 }//end of switch
    		 }//end of loop
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }//end of try resource
	}

}

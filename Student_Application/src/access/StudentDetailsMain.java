package access;
import java.util.*;
import test.*;
@SuppressWarnings("serial")
public class StudentDetailsMain extends Exception
{
	public StudentDetailsMain(String msg)
	{
		super(msg);
	}
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) throws StudentDetailsMain {
    Scanner s = new Scanner(System.in);
    try(s;)
    {
    try
    {
     List<StudentDetails> ob=null;
     String nm=null;
     while(true)
    {
     System.out.println("====Choice====");
     System.out.println("\t1.AarrayList<E>"
    		+"\n\t2.LinkedList<E>"
       		+"\n\t3.Vector"
      		+"\n\t4.Exit");
      System.out.println("Enter the Choice:");
      switch(Integer.parseInt(s.nextLine()))
      {
      case 1:
       	ob=new ArrayList<StudentDetails>();
       	nm="ArrayList<E>";
        	break;
      case 2:
       	ob=new LinkedList<StudentDetails>();
       	nm="LinkedList<E>";
        	break;
      case 3:
       	ob=new Vector<StudentDetails>();
       	nm="Vector<E>";
        	break;
      case 4:
       	System.out.println("Operations on List<E> stopped...");
       	System.exit(0);
        	break;
     	default :
       		System.out.println("Invaild Choice...");
       		continue;
    }//end of switch
    System.out.println("Perform Operations on "+nm);
    xyz:
    while(true)
    {
      System.out.println("****Choice****");
      System.out.println("\t1.add(E)"
    					 +"\n\t2.remove(object)"
    	  				 +"\n\t3.add(index,E"
    	   				 +"\n\t4.remove(index)"
    	   				 +"\n\t5.get(index)"
    	       			 +"\n\t6.set(index)"
    	       			 +"\n\t7.Sorting-by-Percentae"
    	       			 +"\n\t8.Exit");
    	 System.out.println("Enter the Choice:");
         switch(Integer.parseInt(s.nextLine()))
    	 {
    	 case 1:
    	 	System.out.println("Eenter the Stud-Name:");
       	    String name=s.nextLine();
    	  	System.out.println("Eenter the Stud-RollNo:");
    	    String rollNo=s.nextLine();
    		if(rollNo.length()!=10)
    		{
    		 StudentDetailsMain  sd1=new StudentDetailsMain("Invaild rollNo...");
    		 throw sd1;
    		}
    		String brCode = rollNo.substring(6,8);
    		GenerateBranch br = new GenerateBranch();
    		String branch = br.generate(brCode);
    		if(branch==null)
    		{
    		 StudentDetailsMain sd2 = new StudentDetailsMain("Roll-No holiding invalid brCode");
    		 throw sd2;
    		}
    		System.out.println("Eenter the Stud-Branch:");
    		String bran=s.nextLine().toUpperCase();
    		CheckBranch ob1 = new CheckBranch();
    		boolean z = ob1.verify(bran);
    		if(!z)
    		{
    		 if(bran.equals(branch))
    		 {
    		   System.out.println("====Enter Subject Marks====");
    		   int i=1,totMarks=0;
    		   boolean p=false;
    		   while(i<=6)
    		   {
    		   	System.out.println("Enter the sub-"+i);
    		   	int mark=Integer.parseInt(s.nextLine());
    		  	if(mark<0 || mark>100)
    		  	{
    		    	StudentDetailsMain sd=new StudentDetailsMain ("Invaild Marks..");
    		   		throw sd;
    		    }
    		    p=true;
    		    totMarks=totMarks+mark;
    		    i++;	
    		   }//end of loop
    		   Percentage ob2= new Percentage();
    		   float per=ob2.results(totMarks);
    		   StudentResults rs=new StudentResults();
    		   String result=rs.grade(per);
    		   ob.add(new StudentDetails(rollNo,name,branch,totMarks,per,result));
    	   	   Iterator<StudentDetails> it1=ob.iterator();
    	   	   while(it1.hasNext())
    	   	   {
    	   	   	System.out.println(it1.next());
    	   	   }//end of loop
             }
    		 else
             {
    		  System.out.println("Invaild branch...");
    		  break;
    		 }
       	    }
         	 break;
    	case 2:
    	if(ob.isEmpty())
    	{
    	  System.out.println("List<E> is empty...");
    	}
    	else
    	{
           System.out.println("Enter the rollNo to remove  StudentDetails:");
           String rN=s.nextLine();
    	   boolean v=false;
    	   Iterator<StudentDetails> it2 = ob.iterator(); 
    	   while(it2.hasNext())
     	   {
    	     StudentDetails sd=(StudentDetails)it2.next();
    		 if(rN.equals(sd.rollNo))
    		 {
    		   ob.remove(sd);
    		   v=true;
    		 }//end of if
    	   }//end of loop
    	   if(!v)
    	   {
    	    System.out.println("Invaild rollNo...");
           }
    	    Iterator<StudentDetails> it3 = ob.iterator(); 
    		while(it3.hasNext())
    		{
    		  System.out.println(it3.next());
    		}//end of loop
    	   }
    	   break;
   	 case 3:
       if(ob.isEmpty())
    	{
    	 System.out.println("List<E> is empty..."); 
    	}
		else
   	    {
 		  System.out.println("Enter the index to add StudentDetails:");
       	  int i1=Integer.parseInt(s.nextLine());
   	      if(i1>=0 && i1<ob.size())
	      {
	        System.out.println("Eenter the Stud-Name:");
	        String name1=s.nextLine();
	        System.out.println("Eenter the Stud-RollNo:");
	        String rollNo1=s.nextLine();
		    if(rollNo1.length()!=10)
            {
  	          StudentDetailsMain  sd1=new StudentDetailsMain("Invaild rollNo...");
    	      throw sd1;
	        }
	        String brCode1 = rollNo1.substring(6,8);
            GenerateBranch br1 = new GenerateBranch();
            String branch1 = br1.generate(brCode1);
            if(branch1==null)
            {
       	      StudentDetailsMain sd2 = new StudentDetailsMain("Roll-No holiding invalid brCode");
  	          throw sd2;
            }
	        System.out.println("Eenter the Stud-Branch:");
		    String bran1=s.nextLine().toUpperCase();
 		    CheckBranch ob2 = new CheckBranch();
			boolean x = ob2.verify(bran1);
	        if(!x)
	        {
	          if(bran1.equals(branch1))
		      {
	           System.out.println("====Enter Subject Marks====");
    	       int i=1,totMarks1=0;
    		   boolean p=false;
    	       while(i<=6)
    		   {
       	        System.out.println("Enter the sub-"+i);
    	   	    int mark1=Integer.parseInt(s.nextLine());
    		    if(mark1<0 || mark1>100)
    		    {
    	  		 StudentDetailsMain sd=new StudentDetailsMain ("Invaild Marks..");
    		     throw sd;
    	        }
    	  	    p=true;
    			totMarks1=totMarks1+mark1;
    		 	i++;	
    	      }//end of loop
    	      Percentage ob3= new Percentage();
    	      float per1=ob3.results(totMarks1);
    		  StudentResults rs=new StudentResults();
    	      String result1=rs.grade(per1);
              ob.add(i1,new StudentDetails(rollNo1,name1,branch1,totMarks1,per1,result1));
    	      Iterator<StudentDetails> it1=ob.iterator();
              while(it1.hasNext())
    	      {
    		    System.out.println(it1.next());
    	      }//end of loop
    	     }
             else
             {
    	      System.out.println("Invaild branch...");
    		  break;
    	     }
          }
   	     }
        else
  	    {
    	 System.out.println("Invaild index...");
  	    }
   	   }
        break;
  	 case 4:
   	 if(ob.isEmpty())
	 {
	   System.out.println("List<E> is empty....");
	 }
	 else
	 {
	  System.out.println("Enter the index to remove StudentDetails:");
	  int i2 = Integer.parseInt(s.nextLine());
	  if(i2>=0 && i2<ob.size())
	  {
		ob.remove(i2);
 	    Iterator<StudentDetails> it3=ob.iterator();
  	    while(it3.hasNext())
		{
	     System.out.println(it3.next());
		}//end of loop
	   }
       else
 	   {
	    System.out.println("Invaild index...");
       }
      }
	  break;
    case 5:
    if(ob.isEmpty())
    {
	  System.out.println("List<E> is empty....");
  	}
  	else
   	{
   	  System.out.println("Enter the index to get StudentDetails:");
      int i3=Integer.parseInt(s.nextLine());
	  if(i3>=0 && i3<ob.size())
	  {
	    StudentDetails sd = (StudentDetails)ob.get(i3);
		System.out.println(sd.toString());
	  }
	  else
	  {
	    System.out.println("Invaild index....");
	  }
	}
	 break;
  	case 6:
	if(ob.isEmpty())
	{
	  System.out.println("List<E> is empty...");
    }
	else
 	{
   	  System.out.println("Enter the index to set new StudentDetails:");
	  int i4=Integer.parseInt(s.nextLine());
	  if(i4>=0 && i4<ob.size())
	  {
   		System.out.println("Eenter the Stud-Name:");
	    String name1=s.nextLine();
		System.out.println("Eenter the Stud-RollNo:");
	    String rollNo1=s.nextLine();
	    if(rollNo1.length()!=10)
 	    {
 		  StudentDetailsMain  sd1=new StudentDetailsMain("Invaild rollNo...");
 	   	  throw sd1;
 	    }
	    String brCode1 = rollNo1.substring(6,8);
        GenerateBranch br1 = new GenerateBranch();
        String branch1 = br1.generate(brCode1);
        if(branch1==null)
	    {
     	 StudentDetailsMain sd2 = new StudentDetailsMain("Roll-No holiding invalid brCode");
 	     throw sd2;
 	    }
	    System.out.println("Eenter the Stud-Branch:");
	    String bran1=s.nextLine().toUpperCase();
        CheckBranch ob2 = new CheckBranch();
	    boolean x = ob2.verify(bran1);
        if(!x)
	    {
 	      if(bran1.equals(branch1))
 	      {
 	        System.out.println("====Enter Subject Marks====");
            int i=1,totMarks1=0;
            boolean p=false;
            while(i<=6)
 	       {
 		  	 System.out.println("Enter the sub-"+i);
    	     int mark1=Integer.parseInt(s.nextLine());
    	     if(mark1<0 || mark1>100)
     	     {
  		      StudentDetailsMain sd=new StudentDetailsMain ("Invaild Marks..");
		      throw sd;
 	   	     }
 			p=true;
 	 	    totMarks1=totMarks1+mark1;
	    	i++;	
         }//end of loop
 	     Percentage ob3= new Percentage();
 	     float per1=ob3.results(totMarks1);
 		 StudentResults rs=new StudentResults();
	     String result1=rs.grade(per1);
	     ob.set(i4,new StudentDetails(rollNo1,name1,branch1,totMarks1,per1,result1));
 		 Iterator<StudentDetails> it1=ob.iterator();
	     while(it1.hasNext())
   	     {
  	      System.out.println(it1.next());
	     }//end of loop
	   }
       else
	   {
	    System.out.println("Invaild branch...");
        break;
	   }
	  }
     }
     else
     {
	  System.out.println("Invaild index...");
	 }
   }
     break;
     case 7:
 	 Collections.sort(ob);
	 Iterator<StudentDetails> it3=ob.iterator();
  	 while(it3.hasNext())
  	 {
   	   System.out.println(it3.next());
     }//end of loop
      break;
	 case 8:
	    System.out.println("Operations stopped on "+nm);
        break xyz;
        default :
    	System.out.println("Invaild Choice...");
     }//end of switch
   }//end of loop
  }//end of loop
  }
   catch(Exception e)
    {
      e.printStackTrace();
    }
   }//try end with resource
	}

}

package test;

public class StudentResults {
	
	public String grade (float per)
	{
		
		if(per>=70 && per<=100)
		{
			
			return "Distinction";
		}
		if(per>=60 && per<70)
		{                 
			return "First-Calss";
		}
		if(per>=50 && per<60)
		{
			return "Second-Class";
		}
		if(per>=35 && per<50)
		{
			return "Third-Class";
		}
		else
		{
			return "fail";
		}
		
		
	}
	

}

package test;
public class StudentDetails implements Comparable{
    public String rollNo,name,branch, result;
    public float per;
    public int totMarks;
    public StudentDetails(String rollNo, String name, String branch, int totMarks, float per,String result)
    {
    	this.rollNo=rollNo;
    	this.name=name;
    	this.branch=branch;
    	this.per=per;
    	this.result=result;
    	this.totMarks=totMarks;
	}
	public String toString()
    {
    	return  rollNo+"\t"+name+"\t"+branch+"\t"+totMarks+"\t"+per+"\t"+result;
    }
	public int compareTo(Object o)
	{
		StudentDetails sd = ( StudentDetails)o;
		int z = result.compareTo(sd.result);
		if(z==0) return 0;
		else if(z>0) return 1;
		else return -1;
	}
}

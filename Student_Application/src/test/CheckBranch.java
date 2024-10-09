package test;

public class CheckBranch {
	boolean k=false;
	public boolean verify(String bran)
	{
		switch (bran)
		{
			case "B.SC" : k=true;
			case "B.COM" : k=true;
			case "B.ZC" : k=true;
			case "B.BA" : k=true;
			break;
		}
		return k;
	}

}

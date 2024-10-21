package test;
import java.util.*;
@SuppressWarnings("rawtypes")
public class SortByCode implements Comparator{
	public int compare(Object ob1,Object ob2) {
		Book b1=(Book)ob1;
		Book b2=(Book)ob2;
		int z = b1.code.compareTo(b2.code);
		if(z==0) return 0;
		if(z>0) return 1;
		else return -1;
	}

}

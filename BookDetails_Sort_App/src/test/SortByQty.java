package test;
import java.util.*;
@SuppressWarnings("rawtypes")
public class SortByQty implements Comparator{
	public int compare(Object ob1,Object ob2) {
		Book b1=(Book)ob1;
		Book b2=(Book)ob2;
		if(b1.qty==b2.qty) return 0;
		if(b1.qty>b2.qty) return 1;
		else return -1;
	}
}

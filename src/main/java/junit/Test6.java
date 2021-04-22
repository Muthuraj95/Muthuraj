package junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test6 {
public static void main(String[] args) {
	Result r = JUnitCore.runClasses(Task5.class,Test4.class);
	int i = r.getFailureCount();
	System.out.println( "COUNT IS"  + r.getFailureCount());
	boolean b = r.wasSuccessful();
	System.out.println(b);
	int j = r.getIgnoreCount();
	System.out.println(j);
	int k = r.getRunCount();
	System.out.println(k);
	 long l = r.getRunTime();
	System.out.println(l);
	List<Failure> list = r.getFailures();
	for (Failure failure : list) {
		System.out.println(failure);
	}
//for (int m = 0; m < list.size(); m++) {
//	Failure failure = list.get(m);
//	System.out.println(failure);
//}	
	
	
	
}
}

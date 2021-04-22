package junit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.TestCase;
@RunWith(Suite.class)
@Suite.SuiteClasses({Task5.class,Test4.class})
public class AllClasses {
//	@RunWith(Suite.class)
//	@Suite.SuiteClasses({Junitclass.class,JunitSample.class})

//	@RunWith(Suite.class)
//	@Suite.SuiteClasses({Junitclass.class,JunitSample.class})

//public class AllClasses {
//	public static void main(String[] args) {
//		Result r = JUnitCore.runClasses(Task5.class,Test4.class);
//		System.out.println(r.getFailureCount());
//		System.out.println(r.getIgnoreCount());
//		System.out.println(r.getRunCount());
//		System.out.println(r.wasSuccessful());
//		System.out.println(r.getClass());
		

	
}
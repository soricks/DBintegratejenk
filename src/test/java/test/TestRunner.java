package test;

import com.connectdb.OracleJavaJDBCExample;

import org.junit.Test;

public class TestRunner {
	

		
		@Test
		public void TestRunner() {

	        try {
	            
	        	OracleJavaJDBCExample.connectDB();
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
		
		
		   
	}



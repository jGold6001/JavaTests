package org.itstep.PostgreSQLtest;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class PostgreSQLJDBC {
	   public static void main( String args[] ) {
	      Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/TEST_PROJECT",
	            "postgres", "postgres");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM public.\"TEST_DATAS\";" );
	         while ( rs.next() ) {
	            int id = rs.getInt("ID");
	            String  name = rs.getString("NAME");
	            int status = rs.getInt("STATUS");
	   
	            System.out.println( "ID = " + id );
	            System.out.println( "NAME = " + name );
	            System.out.println( "STATUS = " + status );
	            System.out.println();
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	   }
	}

	
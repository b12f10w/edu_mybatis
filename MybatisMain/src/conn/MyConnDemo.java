package conn;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConnDemo {
	private static DataSource ds;
	
	static {
		try {
			// META-INF/context.xml --> DataSource ·Î Connection
			/*
			 * 
			 * // JEUS
					ds[0] = (DataSource) ctx.lookup(DB_NAME);
				// TOMCAT
					Context envCtx = (Context)ctx.lookup("java:/comp/env");
					ds[0] = (DataSource)envCtx.lookup(DB_NAME);
			 */
			InitialContext ctx = new InitialContext();
		    ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mybatis");
		} catch(NamingException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getDs() throws SQLException {
		return ds.getConnection();
	}
}

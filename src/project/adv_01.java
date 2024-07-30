package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class adv_01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","tiger");
			Statement stm=con.createStatement();
			ResultSet rs =stm.executeQuery("select * from book");
			System.out.println("4");
			System.out.println(" user details ....");
			
			System.out.println(con);
			while (rs.next())
			{
				System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
			}
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		//System.out.println(e.toString());
		}
	}

}

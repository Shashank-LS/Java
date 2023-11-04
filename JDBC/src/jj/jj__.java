package jj;

import java.sql.*;

public class jj__ {

    public static void main(String [] args)
    {


        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db","root","9845621");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from db");
            while(rs.next())
            {
                System.out.println(" "+rs.getInt(1)+" "+rs.getString(2));
            }
        }

        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}
package com.illya.web.repository;

import com.illya.web.domain.Complaint;
import com.illya.web.domain.ProblemType;
import com.illya.web.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProblemRepository {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/healthyhabits";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "admin";


    public List<ProblemType> problemTypeList() {
        List<ProblemType> problemTypeList  = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstmt = null;
        Statement statement = null;



        //User registeredUser = new User();

        try
        {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Creating prepared statement...");
            String SQL;
            SQL = "SELECT * FROM problemtypes ORDER BY name";
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(SQL);

            while (result.next()) {
                String problemTypeID = result.getString("problemtype_id");
                String problemTypeShortName = result.getString("problemtype_shortname");
                String problemTypeFullName = result.getString("problemtype_fullname");
                String problemTypeDescription = result.getString("problemtype_description");
                ProblemType problemType = new ProblemType(problemTypeID, problemTypeShortName,
                                                            problemTypeFullName,problemTypeDescription);
                problemTypeList.add(problemType);
            }
            System.out.println("successfully List received");

            pstmt.close();
            conn.close();
        }
        catch(SQLException se)
        {
            //Handle errors for JDBC
            System.out.println(se);
            se.printStackTrace();
        }catch(Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally
        {
            closeConnectionStatement(conn,pstmt);
        }//end try
        System.out.println("Goodbye!");
        return  problemTypeList;
    }

    //-----------------------------------------------------------------


    public User findUserByUsername(User user){
        Connection conn = null;
        PreparedStatement pstmt = null;
        User wantedUser = new User();

        try
        {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Creating prepared statement...");
            String SQL;
            SQL = "SELECT * FROM users WHERE user_username =?";
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,user.getUserName());

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) //while(rs.next())
            {
                // from DB
                //Retrieve by column name
                wantedUser.setUserID(rs.getString("user_id"));
                wantedUser.setUserFirstName(rs.getString("user_firstname"));
                wantedUser.setUserSecondName(rs.getString("user_secondname"));
            }
            rs.close();
            pstmt.close();
            conn.close();
        }
        catch(SQLException se)
        {
            //Handle errors for JDBC
            System.out.println(se);
            se.printStackTrace();
        }catch(Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally
        {
            closeConnectionStatement(conn,pstmt);
        }//end try
        System.out.println("Goodbye!");
        return wantedUser;
    }

    private void closeConnectionStatement(Connection cn,PreparedStatement  pst){
        //finally block used to close resources
        try{
            if(pst!=null)
                pst.close();
        }catch(SQLException se2){
        }
        try{
            if(cn!=null)
                cn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }
    }


}
package com.illya.web.view;

import com.illya.web.domain.User;
import com.illya.web.service.UserService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static java.lang.System.out;


public class RegistrationController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //String userID;
        String userFirstName=  request.getParameter("userfirstname");
        String userSecondName= request.getParameter("usersecondname");
        String userName=       request.getParameter("username");
        String userPassword=   request.getParameter("userpassword");
        String stringUserAge = request.getParameter("userage");
        //String stringUserAge = Integer.parseInt(stringUserAge);
        String userGender=     request.getParameter("usergender");
        String userEmail=      request.getParameter("useremail");
        String userAddress=    request.getParameter("useraddress");

        // validate given input
        if (userFirstName.isEmpty() || userSecondName.isEmpty() || userName.isEmpty() || userPassword.isEmpty()
                || stringUserAge.isEmpty() || userGender.isEmpty()  || userEmail.isEmpty()|| userAddress.isEmpty())
        {
            RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
            out.println("<font color=red>Please fill all the fields</font>");
            rd.include(request, response);
        } else{
            User newUser = new User(userFirstName,
                                    userSecondName,
                                    userName,
                                    userPassword,
                                    Integer.parseInt(stringUserAge),
                                    userGender,
                                    userEmail,
                                    userAddress);

            UserService userService = new UserService();
            User registeredUser = userService.registrationNewUser(newUser);

            HttpSession session = request.getSession();
            session.setAttribute("user", registeredUser);
            response.sendRedirect("userRegistered.jsp");
        }
    }
}
package com.illya.web.view;

import com.illya.web.domain.User;
import com.illya.web.repository.UserRepository;
import com.illya.web.service.UserService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LogInController
 */
public class LogInController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("username");
        String userPassword = request.getParameter("password");

        User requeredUser = new User(userName,userPassword);
        System.out.println("---LogInController requeredUserName: "+ requeredUser.getUserName());

        UserService userService =new UserService();
        User wantedUser = userService.findUserByUsername(requeredUser);

        System.out.println("----LogInController userService.findUserByUsername(requeredUser).getUserFirstName(): "
                + wantedUser.getUserID());

        HttpSession session = request.getSession();
        if(wantedUser.getUserID() == null){
            session.setAttribute("user", wantedUser);
            response.sendRedirect("login.jsp");
        }else{
            session.setAttribute("user", wantedUser);
            response.sendRedirect("userRegistered.jsp");
        }
    }
}
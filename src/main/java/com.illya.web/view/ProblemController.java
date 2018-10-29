package com.illya.web.view;

import com.illya.web.domain.Complaint;
import com.illya.web.domain.User;
import com.illya.web.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.lang.System.out;

public class ProblemController extends HttpServlet {

//    public ProblemController() {
//        System.out.println("ProblemController");
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //String userID;
        User user = (User)request.getSession().getAttribute("user");
        String problemType =        request.getParameter("problemType");
        String problemPart =        request.getParameter("problemPart");
        String problemDescription = request.getParameter("problemDescription");

        // validate given input
        if (problemType.isEmpty() || problemPart.isEmpty() || problemDescription.isEmpty())
        {
            RequestDispatcher rd = request.getRequestDispatcher("userComplaint.jsp");
            out.println("<font color=red>Please fill all the fields</font>");
            rd.include(request, response);
        } else{
            Complaint newComplaint = new Complaint(problemType,problemPart,problemDescription);

//     ?       UserService userService = new UserService();
//      ?      User registeredUser = userService.registrationNewUser(newUser);
//
//      ?      HttpSession session = request.getSession();
//      ?      session.setAttribute("user", registeredUser);
//      ?      response.sendRedirect("userRegistered.jsp");
        }
    }
}
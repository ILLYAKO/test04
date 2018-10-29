<%@page import="com.illya.web.domain.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>User Data</title>
    </head>
    <style>
        div.ex {
            text-align: right width:300px;
            padding: 10px;
            border: 5px solid grey;
            margin: 0px
        }
    </style>
    <body>
        <%
            User complUser = (User)session.getAttribute("user");
            out.println("<p>Welcome " + complUser.getUserFirstName() + ", in your Healthy Habits site.</p>");
            System.out.println("Welcome " + complUser.getUserFirstName() + ", thank you for your complaint.");
        %>


        <h1>Complain Form</h1>

        <div class="ex">
        <form action="complaintForm" method="post">
            <table style="with: 50%">
                <tr>
                    <td>What is your health problem?</td>
                    <td>
                        <select id="problemType" name="problemType" onchange="return setValue();">
                            <option value="dropdown">Please select
                            <option value="parasites">-Certain infectious and parasitic Problems
                            <option value="neoplasms">-Neoplasms
                            <option value="blood">-Problems of the blood and blood-forming organs and certain disorders involving the immune mechanism
                            <option value="metabolic">-Endocrine, nutritional and metabolic Problems
                            <option value="mental">-Mental and behavioural disorders
                            <option value="nervous">-Problems of the nervous system
                            <option value="eye">-Problems of the eye and adnexa
                            <option value="ear">-Problems of the ear and mastoid process
                            <option value="circulatory">-Problems of the circulatory system
                            <option value="respiratory">-Problems of the respiratory system
                            <option value="digestive">-Problems of the digestive system
                            <option value="skin">-Problems of the skin and subcutaneous tissue
                            <option value="musculoskeletal">+Problems of the musculoskeletal system and connective tissue
                            <option value="genitourinary">-Problems of the genitourinary system
                            <option value="pregnancy">-Pregnancy, childbirth and the puerperium
                            <option value="perinatal ">-Certain conditions originating in the perinatal period
                            <option value="chromosomal">-Congenital malformations, deformations and chromosomal abnormalities
                            <option value="notClassified">-Symptoms, signs and abnormal clinical and laboratory findings, not elsewhere classified
                            <option value="injury">-Injury, poisoning and certain other consequences of external causes
                            <option value="externalCauses">-External causes of morbidity and mortality
                            <option value="factors">-Factors influencing health status and contact with health services
                            <option value="goToHospital">-Go to the hospital
                        </select>
                        <%-- <input type="hidden" name="problemType" id="dropdown">--%>
                        <%-- <input type="submit" value="click" name="btn_dropdown"> --%>
                    </td>
                </tr>
                <tr>
                    <td>What part of the problem</td>
                    <td><input type="text" name="problemPart" /></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><textarea type="text" name="problemDescription" cols="60" rows="6"/></textarea>
                    </td>
                </tr>
            </table>
            <input type="submit" value="Ask Us!" />
        </form>
        </div>
    </body>
</html>
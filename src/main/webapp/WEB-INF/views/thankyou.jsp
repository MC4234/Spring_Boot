<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SDET WebDev Training</title>
<link rel="stylesheet" href="../../css/style.css"></link>
</head>

<body id="body-id" class="body-class">
    <img src="../../images/web-dev-2.png" alt="sdet-web"></img>
    
    <h2>SDET WEB DEVELOPMENT TRAINING</h2>
    <div id="thankyou">
        <h3>Thank you ${param.name} for submitting the feedback. Here are
            your details:</h3>
        <table class="tclass1">
            <tr>
                <td>Name</td>
                <td>${param.name}</td>
            </tr>
            <tr>
                <td>Mode</td>
                <td>${param.mode}</td>
            </tr>
            <tr>
                <td>Rating</td>
                <td>${param.rating}</td>
            </tr>
            <tr>
                <td>Feedback</td>
                <td>${param.feedback}</td>
            </tr>
        </table>
    </div>

    <footer>
        <%@ include file="footer.jsp"%>
    </footer>

</body>
</html>
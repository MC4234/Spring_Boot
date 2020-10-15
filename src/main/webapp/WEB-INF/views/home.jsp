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
    <link rel="stylesheet" href="../../css/style.css"></link>
    <img src="../../images/web-dev-2.png" alt="sdet-web"></img>
    <h2>SDET WEB DEVELOPMENT TRAINING</h2>
    <div id="participants">
        <h3 id="h3id">Training Participants</h3>
        <c:choose>
            <c:when test="${not empty studentList}">
                <table class="tclass">
                    <tr>
                        <th>S1 No</th>
                        <th>Name</th>
                        <th>Experience</th>
                    </tr>
                    <c:forEach var="participant" items="${studentList}" varStatus="counter">
                        <tr>
                            <td>${counter.count}.</td>
                            <td>${participant.name}</td>
                            <td>${participant.exp}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:when>
            <c:otherwise>
            <div class="error">
             <p>No participants are enrolled yet!</p>
             </div>
            </c:otherwise>
        </c:choose>
        <p><a href="/add-student.html">Add Participant</a></p>
        <h3>Provide your Feedback</h3>
        <form action="thankyou" method="get">
            <p>
                <label for="name">Name:<input type="text" id="name" name="q"></label>
            </p>
            <p>
                Mode:<input type="radio" name="mode" value="online">Online <input
                    type="radio" name="mode" value="classroom">Classroom
            </p>
            <p>
                Rating:<select name="rating">
                    <option value="1">&#9734;</option>
                    <option value="2">&#9734;&#9734;</option>
                    <option value="3">&#9734;&#9734;&#9734;</option>
                    <option value="4">&#9734;&#9734;&#9734;&#9734;</option>
                    <option value="5">&#9734;&#9734;&#9734;&#9734;&#9734;</option>
                </select>
            </p>

            <p>
                Feedback
                <textarea name="feedback" placeholder="Your feedback goes here"
                    rows="5" cols="50"></textarea>
            </p>
            <br> <input type="submit" value="Submit">&nbsp;&nbsp;
            <button type="reset">Reset</button>
            <br>
        </form>
    </div>
    <div id="course">
        <h3 id="h3id">Course Outline</h3>
        <p>In the upcoming sessions, we will learn web development
            concepts</p>
        <ul>
            <li>Web Introduction</li>
            <li>HTML/CSS</li>
            <li>Servlets/JSP</li>
            <li>Spring Framework</li>
            <ol>
                <li>Spring Core</li>
                <li>Spring Boot</li>
                <li>Spring MVC</li>
                <li>Spring JDBC</li>
            </ol>
        </ul>
    </div>
    <p>
            Checkout for more courses <a href="http://www.devlabsalliance.com"
                target="_blank">@DevLabs.com</a> on trending technologies
        </p>
</body>
</html>
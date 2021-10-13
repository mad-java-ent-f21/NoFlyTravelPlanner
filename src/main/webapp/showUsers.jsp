
<!DOCTYPE html>
<html lang="en">


<head>
    <title>The NoFly Travel Planner</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/styles.css">
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<header>
    <div class="banner">
        <img src="images/logo.JPG" alt="No Fly Logo" />
    </div>
    <div class="quote">
        <h1>We Love to Travel, But Not in the Sky!</h1>
        <p>No matter the reason, we will help you find a way to reach the next
            place on your bucket list, without going airborne.</p>
    </div>
</header>
<nav>
    <ul class="myNav">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="login.jsp">Login</a></li>
        <li><a href="showUsers.jsp">CRUD test (temporary)</a></li>
    </ul>
</nav>

<%--TODO Pretty up the results!--%>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <table>
        <tr><td>First Name</td><td>Last Name</td><td>Username</td><td>ScreenName</td></tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.screenName}</td>
            </tr>
        </c:forEach>
    </table>
</div>

</html>
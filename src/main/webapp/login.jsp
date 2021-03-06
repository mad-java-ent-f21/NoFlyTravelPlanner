<!DOCTYPE html>
<html lang="en">

<head>
    <title>The NoFly Travel Planner</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/styles.css">
</head>

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
<main>
    <form id="multipleForm" method="post" action="http://itins3.madisoncollege.edu/echo.php">
        <h3>Sign in to post content.</h3>
        <label for="id">User ID</label>
        <input type="text" required id="id" placeholder="id (required)" name="id">
        <br>

        <label for="password">Last Name</label>
        <input type="text" id="password" placeholder="password (required)" name="password" required>
        <br>

        <button class="Sbutton" type="submit">Submit</button>
        <button class="Cbutton" type="reset">Clear</button>
    </form>
</main>
</body>
</html>
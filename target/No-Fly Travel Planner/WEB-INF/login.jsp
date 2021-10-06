<!DOCTYPE html>
<html lang="en">

<head>
    <title>The Fortress</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/styles.css">
</head>

<body>
<header>
    <div class="fort">
        <img src="images/FortressLogo.jpg" alt="Medivel Fort" />
        </br>
        Image by <a href="https://pixabay.com/users/hans-2/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=117300">Hans Braxmeier</a> from <a href="https://pixabay.com/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=117300">Pixabay</a>
    </div>
    <div class="quote">
        <h1>Welcome to The Fortress</h1>
        <p>The art of war teaches us to rely not on the likelihood of the enemy's not coming, but on our own readiness to receive him; not on the chance of his not attacking, but rather on the fact that we have made our position unassailable.</p>
        <p>Sun Tzu</p>
    </div>
</header>
<nav>
    <ul class="myNav">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="rules.jsp">Rules</a></li>
        <li><a href="login.jsp">Login</a></li>
    </ul>
</nav>
<main>
    <form id="multipleForm" method="post" action="http://itins3.madisoncollege.edu/echo.php">
        <h3>Login If You Can!</h3>
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
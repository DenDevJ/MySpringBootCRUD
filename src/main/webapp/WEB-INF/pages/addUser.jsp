<!DOCTYPE html>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<h2>Add New User</h2>
<form action="/addUser" method="post">
    <label>Name:</label>
    <input type="text" name="name" required/><br/><br/>

    <label>Email:</label>
    <input type="email" name="email" required/><br/><br/>

    <label>Age:</label>
    <input type="number" name="age" required/><br/><br/>

    <input type="submit" value="Save"/>
    <a href="/users">Cancel</a>
</form>
</body>
</html>
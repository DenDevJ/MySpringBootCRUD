<!DOCTYPE html>
<html>
<head>
    <title>Edit User</title>
</head>
<body>
<h2>Edit User</h2>
<form action="/editUser" method="post">
    <input type="hidden" name="id" value="${user.id}"/>

    <label>Name:</label>
    <input type="text" name="name" value="${user.name}" required/><br/><br/>

    <label>Email:</label>
    <input type="email" name="email" value="${user.email}" required/><br/><br/>

    <label>Age:</label>
    <input type="number" name="age" value="${user.age}" required/><br/><br/>

    <input type="submit" value="Update"/>
    <a href="/users">Cancel</a>
</form>
</body>
</html>
<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<!--FORM-->
<div class="form-style-2">
    <form method="post" action="/users">
        <label for="firstName">First name
            <input class="input-field" type="text" id="firstName" name="firstName">
        </label>
        <label for="lastName">Last name
            <input class="input-field" type="text" id="lastName" name="lastName">
        </label>
        <input type="submit" value="Add user">
    </form>
</div>
<!--FORM-->

<div class="form-style-2">
    <table>
        <tr>
            <th>First name</th>
            <th>Last name</th>
        </tr>
        <#list usersFromServer as user>
        <tr>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
        </tr>
        </#list>
    </table>
</div>
</body>
</html>
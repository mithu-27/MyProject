<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="supplier/save" method="post">
<table>
<tr> <td>Email ID:</td> <td> <input type="text" name="emailID"> </td> </tr>

<tr> <td>Supplier Name:</td> <td> <input type="text" name="name"></td> </tr>
<tr> <td> Password:</td> <td> <input type="password" name="password"> </td></tr>
<tr> <td> Confirm Password: </td> <td> <input type="password" name="confirm_password"> </td> </tr>
<tr> <td> Mobile: </td> <td> <input type="text" name="mobile"> </td> </tr>
<tr> <td>Address: </td> <td> <input type="text" name="address"> </td> </tr>
<tr> <td> <input type="submit" value="Save"> </td>
</table>
</form>
</body>
</html>
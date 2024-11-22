<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="width: 1068px; height: 277px; ">
<head>
<meta charset="UTF-8">
<title>Feedback Submit</title>
</head>
<body>
	<h2>This is feedback form!!..</h2>
	<form action="feedbckServlet" method="post">
		<textarea rows="5" cols="10" name="submitText" placeholder="Please enter your feedback here...!!" style="width: 339px; "></textarea><br>
		<input type="submit" value="Submit Feedback" name="submitbttn" />
	</form>
</body>
</html>
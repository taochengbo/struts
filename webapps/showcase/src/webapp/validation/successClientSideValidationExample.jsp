<%--
	successFieldValidatorsExample.jsp

	@author tm_jee
	@version $Date: 2006/01/13 16:23:45 $ $Id: successClientSideValidationExample.jsp,v 1.1 2006/01/13 16:23:45 rainerh Exp $
--%>

<%@taglib prefix="ww" uri="/webwork" %>

<html>
	<head><title>Showcase - Validation - SuccessFieldValidatorsExample</title></head>
	<body>
		<h1>Success !</h1>
		<table>
			<tr>
				<td>Required Validator Field:</td>
				<td><ww:property value="requiredValidatorField" /></td>
			</tr>
			<tr>
				<td>Required String Validator Field:</td>
				<td><ww:property value="requiredStringValidatorField" /></td>
			</tr>
			<tr>
				<td>Integer Validator Field: </td>
				<td><ww:property value="integerValidatorField" /></td>
			</tr>
			<tr>
				<td>Date Validator Field: </td>
				<td><ww:property value="dateValidatorField" /></td>
			</tr>
			<tr>
				<td>Email Validator Field: </td>
				<td><ww:property value="emailValidatorField" /></td>
			</tr>
			<tr>
				<td>URL Validator Field: </td>
				<td><ww:property value="urlValidatorField" /></td>
			</tr>
			<tr>
				<td>String Length Validator Field: </td>
				<td><ww:property value="stringLengthValidatorField" /></td>
			</tr>
			<tr>
				<td>Regex Validator Field: <ww:property value="regexValidatorField" /></td>
				<td>Field Expression Validator Field: <ww:property value="fieldExpressionValidatorField" /></td>
			</tr>
		</table>

		<ww:include value="footer.jsp" />
	</body>
</html>


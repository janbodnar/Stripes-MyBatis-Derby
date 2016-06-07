<%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new book</title>
    </head>
    <body>
        
        <stripes:form beanclass="com.zetcode.action.AddBookActionBean">
            <stripes:errors/>
                Author:
                <stripes:text name="author"/><br>
                
                Title:
                <stripes:text name="title"/><br>                
                
                Year of publishing:
                <stripes:text name="published"/><br>
                
                Remark
                <stripes:text name="remark"/><br>                
                
                <stripes:submit name="save" value="Submit"/>
        </stripes:form>        
        
    </body>
</html>

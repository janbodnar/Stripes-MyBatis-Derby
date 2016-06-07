<%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome page</title>
    </head>
    <body>

        <stripes:link href="addBook.jsp">
            Add a new book
        </stripes:link>      
            
        <stripes:link href="findBook.jsp">
            Find one book
        </stripes:link>                  
            
        <stripes:link beanclass="com.zetcode.action.SelectAllBooksActionBean">
            Show all books
        </stripes:link>    
            
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show all books</title>
    </head>
    <body>
        <h3>All books</h3>
        
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Author</th>
                    <th>Title</th>
                    <th>Published</th>
                    <th>Remark</th>
                </tr>
            </thead>
            
            <c:forEach items="${actionBean.books}" var='book'>
                <tr>
                    <td>
                        <c:out value="${book.id}"/>
                    </td>
                    <td>
                        <c:out value="${book.author}"/>
                    </td>
                    <td>
                        <c:out value="${book.title}"/>
                    </td>        
                    <td>
                        <c:out value="${book.published}"/>
                    </td>  
                    <td>
                        <c:out value="${book.remark}"/>
                    </td>                      
                </tr>
            </c:forEach>          

        </table>
    </body>
</html>

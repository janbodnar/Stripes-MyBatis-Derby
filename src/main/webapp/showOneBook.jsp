<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show one book</title>
    </head>
    <body>
        <h3>A book</h3>

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

            <tr>
                <td>
                    <c:out value="${actionBean.book.id}"/>
                </td>
                <td>
                    <c:out value="${actionBean.book.author}"/>
                </td>
                <td>
                    <c:out value="${actionBean.book.title}"/>
                </td>        
                <td>
                    <c:out value="${actionBean.book.published}"/>
                </td>  
                <td>
                    <c:out value="${actionBean.book.remark}"/>
                </td>                      
            </tr>

        </table>
    </body>
</html>

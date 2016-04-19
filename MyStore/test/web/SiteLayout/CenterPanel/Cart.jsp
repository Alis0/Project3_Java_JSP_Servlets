<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" type="text/css" href="SiteLayout/LayoutIncludes/style.css"/>


<c:import url="../LayoutIncludes/topPanel.html" />
<c:import url="../LayoutIncludes/leftPanel.html" />


<td colspan="4" class="testclass3" valign="top">




    <h1>Cart</h1>     




    <h2></h2>
    <c:forEach var="cart" items="${cartArr}"  varStatus="loopStatus" >



        <table border="3" class="cart">
            <tr><th></th><th>Name</th><th>Scent</th><th>Price</th><th>Total</th><th>Qty</th><th></th></tr>
                 

            <tr>

                <td><img src="SiteLayout/CenterPanel/Products${cart.bpimage}"/></td>
                <td>${cart.name}</td>
                <td>${cart.scent}</td>

            <form method = "GET" action = "SPServlet4">
                <td><input type="hidden" name="Price" value="${cart.price}" />${cart.price}</td>
                <td><input type="hidden" name="Total" value="${cart.total}" />${cart.total}

                </td>

                <td><input type="text" name="Qty" value="${cart.qty}" /></td>





                <td><input type="submit" name="action" value="update qty" class="button" />


                    <br>
                    <br>
                    
                    <input type="submit" name="action" value="remove from cart" class="button" />


                    <input type="hidden" name="index" value="${loopStatus.index}"/>
            </form>


    </td>

</tr>


</c:forEach>
</table>
    

    
</td> 


</tr>


<c:import url="../LayoutIncludes/bottomPanel.html" />

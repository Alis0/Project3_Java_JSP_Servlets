


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" type="text/css" href="SiteLayout/LayoutIncludes/style.css"/>


<c:import url="../../../LayoutIncludes/topPanel.html" />
<c:import url="../../../LayoutIncludes/leftPanel.html" />

<form action="SPServlet4" >
    <td colspan="4" class="testclass3" valign="top" >
        <form method = "POST" action = "SPServlet4">
            <table>

                <c:forEach var="Soap" items="${Soap}"  varStatus="loopStatus" >


                    <c:choose>
                        <c:when test="${Soap.code  eq 'A1003'}">


                            <tr>
                                <td colspan="6" class="tablepadding2"><input type ="hidden" name="Name" value="${Soap.name}" ><h1>${Soap.name}</h1></input></td>

                            </tr>
                            <tr>
                                <td rowspan="3"><img src="SiteLayout/CenterPanel/Products${Soap.image}"/></td>
                            <input type ="hidden" name="Bpimage" value="${Soap.bpimage}" >

                            </tr>
                            <tr>


                                <td colspan="3" class="tablepadding"><h2>${Soap.description}</h2></td>

                            </tr>
                            <tr>


                                <td colspan="3" class="tablepadding"><h3>${Soap.ingredients}</h3></td>

                            </tr>
                            <tr>

                                <td class="tablepadding"><input type ="hidden" name="Price" value="${Soap.price}" >Price: $${Soap.price}</td>
                                <td class="tablepadding">

                                    <select name="Scent" >
                                        <c:forEach var="Options" items="${Options}"  varStatus="loopStatus" >  
                                            <c:choose>
                                                <c:when test="${Options.code  eq 'A1003'}">

                                                    <option  value="${Options.scent}"  class="textcolor" ><p class="textcolor">${Options.scent}</p></option>

                                                </c:when>
                                            </c:choose>
                                        </c:forEach>
                                    </select>

                                </td>
                                <td class="tablepadding">


                                    Quantity:<input type="text" name="Qty" size="1" />
                                    <input type="submit" name="action" value="add" class="button" />


                                </td>

                            </tr>


                        </c:when>        
                    </c:choose>

                </c:forEach>
            </table>

    </td> 
</tr>
</form>
<c:import url="../../../LayoutIncludes/bottomPanel.html" />

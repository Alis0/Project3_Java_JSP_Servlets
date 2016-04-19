<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" type="text/css" href="SiteLayout/LayoutIncludes/style.css"/>

<c:import url="../LayoutIncludes/topPanel.html" />
<c:import url="../LayoutIncludes/leftPanel.html" />


<td colspan="4"  class="testclass3" valign="top">
    
      <table >
       
            <c:forEach var="Soap" items="${Soap}"  varStatus="loopStatus" >
            <tr>
                <td><img src="SiteLayout/CenterPanel/Products${Soap.bpimage}"/></td>
                <td><a href="SPServlet3?param=${Soap.code}"><h1>${Soap.name}</h1></a></td>
            </tr>
         </c:forEach>
        </table>              
                      
</td> 
               
</tr>
                
           <c:import url="../LayoutIncludes/bottomPanel.html" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" type="text/css" href="SiteLayout/LayoutIncludes/style.css"/>


<c:import url="../LayoutIncludes/topPanel.html" />
<c:import url="../LayoutIncludes/leftPanel.html" />

<td colspan="4" class="testclass3" valign="top">
        <h1>Quiz</h1>

        <form method = "POST" action = "SPServlet5">

            <h2>1. What is your gender?</h2>
            <input type="checkbox" name="Female" value="Female" /> female
            <input type="checkbox" name="Male" value="Male" /> male

            <h2>2. What kinds of scents do you prefer?</h2>
            <input type="radio" name="Category" value="Floral" /> Floral
            <input type="radio" name="Category" value="Fresh" /> Fresh
            <input type="radio" name="Category" value="Warm" /> Warm
            <input type="radio" name="Category" value="Fruity" /> Fruity

            <h2>3. How would you describe your skin?</h2>
            <input type="radio" name="Skintype" value="Dry" /> Dry Skin
            <input type="radio" name="Skintype" value="Oily" /> Oily Skin
            <input type="radio" name="Skintype" value="Sensitive" /> Sensitive Skin
            <input type="radio" name="Skintype" value="Combination" /> Combination Skin
            <input type="radio" name="Skintype" value="Antiage" /> Aging Skin




            <input type="submit" name="mySubmit" value="Submit Results" class="button" />

        </form>

        <br><br><br>
        <h1>Here are some product and scent combinations that you might like:</h1>
          <table border="5" class="cart">
                <tr>
                    <td colspan="2"><h1>Product</h1></td>
                    <td colspan="2"><h1>Scent</h1></td>
                </tr>
        <c:forEach var="quiz" items="${qrb}"  varStatus="loopStatus" >
          
                <tr>
                    <td><image src="SiteLayout/CenterPanel/Products${quiz.bpimage}"/></td>
                    <td><h2>${quiz.name}</h2></td>
                    <td><image src="SiteLayout/CenterPanel/Products${quiz.scentimage}"/></td>
                    <td><h2>${quiz.scent}</h2></td>
                </tr>
                 </c:forEach>
                
            </table>
                

           

       
</td> 


</tr>


<c:import url="../LayoutIncludes/bottomPanel.html" />
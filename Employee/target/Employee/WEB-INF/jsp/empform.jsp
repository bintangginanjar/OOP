<%-- 
    Document   : empform
    Created on : 17 Nov 2024, 17:34:24
    Author     : bintang
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Add New Employee</h1>  
<form:form method="post" action="save">    
<table >    
 <tr>    
  <td>Name : </td>   
  <td><form:input path="name"  /></td>  
 </tr>    
 <tr>    
  <td>Salary :</td>    
  <td><form:input path="salary" /></td>  
 </tr>   
 <tr>    
  <td>Designation :</td>    
  <td><form:input path="designation" /></td>  
 </tr>   
 <tr>    
  <td> </td>    
  <td><input type="submit" value="Save" /></td>    
 </tr>    
</table>    
</form:form>

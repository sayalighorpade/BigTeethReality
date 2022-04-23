<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BigTeethReality</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script type="text/javascript">
    function clearSearch() {
        window.location = "[[@{/}]]";
    }
</script>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>Application Form</h2>
   <hr />

   <input type="button" value="Add Backgroundcheck"
    onclick="window.location.href='showBackgroundForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>

   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Applicant List</div>
</div>
</div>


    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <thead>
      <tr>
       <th>religion</th>
       <th>appearance_rating</th>
       <th>strength_rating</th>

      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="tempBackground" items="${background}">



 </thead>
  <tbody>
       <tr>
        <td>${tempBackground.religion}</td>
        <td>${tempBackground.appearance_rating}</td>
        <td>${tempBackground.strength_rating}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this applicant?'))) return false">Delete</a>
        </td>

       </tr>
 </tbody>
      </c:forEach>

     </table>
     </form>
</div>
    </div>


 </div>
 </div>
</body>
</html>


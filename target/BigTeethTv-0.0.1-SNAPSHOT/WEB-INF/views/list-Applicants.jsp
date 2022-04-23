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
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>Application Form</h2>
   <hr />

   <input type="button" value="Add Applicant"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>

   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Applicant List</div>
</div>
</div>
 <div class="input-group">
      <div class="form-outline">
      <form action="<s:url value="/list/search"/>"
        <input type="search" id="form1" class="form-control" name="keyword" />
        <label class="form-label" for="form1">Search</label>
      </div>
      <button type="button" class="btn btn-primary">
        <i class="fas fa-search"></i>
      </button>
    </div>
</form>


    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <thead>
      <tr>
       <th>First Name</th>
       <th>Last Name</th>
       <th>Email</th>
       <th>address</th>
       <th>daytime_phone</th>
       <th>night_phone</th>
       <th>dob</th>
       <th>gender</th>
       <th>photo</th>
       <th>video_id</th>
       <th>candidate_essay</th>
       <th>producer_rating</th>
       <th>director_rating</th>
       <th>Action</th>
      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="tempApplicant" items="${applications}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/application/updateForm">
        <c:param name="app_id" value="${tempApplicant.app_id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/application/delete">
        <c:param name="app_id" value="${tempApplicant.app_id}" />
       </c:url>
 </thead>
  <tbody>
       <tr>
        <td>${tempApplicant.first_name}</td>
        <td>${tempApplicant.last_name}</td>
        <td>${tempApplicant.email}</td>
        <td>${tempApplicant.address}</td>
        <td>${tempApplicant.daytime_phone}</td>
        <td>${tempApplicant.night_phone}</td>
        <td>${tempApplicant.dob}</td>
        <td>${tempApplicant.gender}</td>
        <td>${tempApplicant.photo}</td>
        <td>${tempApplicant.video_id}</td>
        <td>${tempApplicant.candidate_essay}</td>
        <td>${tempApplicant.producer_rating}</td>
        <td>${tempApplicant.director_rating}</td>
        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
        </td>

       </tr>
 </tbody>
      </c:forEach>

     </table>
</div>
    </div>

 </div>
 </div>
</body>
</html>


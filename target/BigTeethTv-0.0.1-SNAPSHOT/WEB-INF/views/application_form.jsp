<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Application Form</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Applicant</div>
    </div>
    <div class="panel-body">
     <form:form action="saveApplicant" cssClass="form-horizontal"
      method="post" modelAttribute="application">


<form:hidden path = "app_id"/>

      <div class="form-group">
       <label for="first_name" class="col-md-3 control-label">first_name</label>
       <div class="col-md-9">
        <form:input path="first_name" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <label for="last_name" class="col-md-3 control-label">last_name</label>
       <div class="col-md-9">
        <form:input path="last_name" cssClass="form-control" />
       </div>
      </div>


<div class="form-group">
             <label for="address" class="col-md-3 control-label">address</label>
             <div class="col-md-9">
              <form:input path="address" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="daytime_phone" class="col-md-3 control-label">daytime_phone</label>
             <div class="col-md-9">
              <form:input path="daytime_phone" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="night_phone" class="col-md-3 control-label">night_phone</label>
             <div class="col-md-9">
              <form:input path="night_phone" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="dob" class="col-md-3 control-label">dob</label>
             <div class="col-md-9">
              <form:input path="dob" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="gender" class="col-md-3 control-label">gender</label>
             <div class="col-md-9">
              <form:input path="gender" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="photo" class="col-md-3 control-label">photo</label>
             <div class="col-md-9">
              <form:input path="photo" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="video_id" class="col-md-3 control-label">video_id</label>
             <div class="col-md-9">
              <form:input path="video_id" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="candidate_essay" class="col-md-3 control-label">candidate_essay</label>
             <div class="col-md-9">
              <form:input path="candidate_essay" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="producer_rating" class="col-md-3 control-label">producer_rating</label>
             <div class="col-md-9">
              <form:input path="producer_rating" cssClass="form-control" />
             </div>
            </div>

<div class="form-group">
             <label for="director_rating" class="col-md-3 control-label">director_rating</label>
             <div class="col-md-9">
              <form:input path="director_rating" cssClass="form-control" />
             </div>
            </div>







      <div class="form-group">
       <label for="email" class="col-md-3 control-label">email</label>
       <div class="col-md-9">
        <form:input path="email" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>

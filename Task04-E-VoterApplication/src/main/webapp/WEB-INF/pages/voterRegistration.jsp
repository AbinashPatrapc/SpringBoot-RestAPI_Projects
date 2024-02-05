<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Voter Registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-5">
    <h1 class="text-center mb-4">Voter Registration</h1>

    <form modelAttribute="vote" method="post">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="voterName">Voter Name:</label>
                    <input type="text" class="form-control" id="voterName" name="voterName" placeholder="Enter Voter Name">
                </div>
                <div class="form-group">
                    <label for="Dob">Date of Birth:</label>
                    <input type="date" class="form-control" id="Dob" name="Dob">
                </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label for="voterCity">Voter City:</label>
                    <input type="text" class="form-control" id="voterCity" name="voterCity" placeholder="Enter Voter City">
                </div>
                <div class="form-group">
                    <label for="Nationality">Nationality:</label>
                    <select class="form-select" id="Nationality" name="Nationality">
                        <option value="">Select Nationality</option>
                        <option value="Indian">Indian</option>
                        <option value="NRI">NRI</option>
                        <option value="Non-Indian">Non-Indian</option>
                        </select>
                </div>
                <div class="form-group">
                    <label for="state">State:</label>
                    <input type="text" class="form-control" id="state" name="state" placeholder="Enter State">
                </div>
            </div>
        </div>
        <button align="center" type="submit" class="btn btn-primary btn-block">Register</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

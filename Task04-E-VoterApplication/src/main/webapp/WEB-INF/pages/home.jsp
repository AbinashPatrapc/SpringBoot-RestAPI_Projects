<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Election Commission</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            /* Set the background image */
            background-image: url("images/vote.jpg");
            /* Other background properties */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            padding-top: 50px;
            margin-bottom: 60px; /* Adjust margin to accommodate the footer */
        }
        .jumbotron {
            background-color: rgba(52, 58, 64, 0.8); /* Adjust background color opacity if needed */
            color: white;
            text-align: center;
            margin-bottom: 20px; /* Add margin to separate from buttons */
        }
        .btn-container {
            margin-top: 30px;
            margin-bottom: 30px; /* Adjust margin to separate from footer */
        }
        .btn {
            margin: 5px;
        }
        footer {
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: rgba(0, 0, 0, 0.8); /* Adjust footer background color */
            color: white;
            text-align: center;
            padding: 10px 0;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="jumbotron">
            <h1>Election Commission of India</h1>
            <p>Your Vote, Your Voice</p>
        </div>
        <div class="btn-container text-center">
            <a href="vregister" class="btn btn-primary btn-lg">Register as Voter</a>
            <a href="status.jsp" class="btn btn-secondary btn-lg">Check Registration Status</a>
            <a href="rules.jsp" class="btn btn-danger btn-lg">Learn Rules & Regulations</a>
            <a href="report" class="btn btn-success btn-lg">View Voter List</a>
        </div>
    </div>
    
    <!-- Footer -->
    <footer>
        <p>&copy; Election Commission 2024</p>
    </footer>
    
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

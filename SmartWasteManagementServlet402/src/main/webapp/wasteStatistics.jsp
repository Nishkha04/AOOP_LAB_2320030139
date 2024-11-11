<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Waste Statistics</title>
</head>
<body>
    <h2>Waste Statistics</h2>
    <p>Total Collected Weight: <%= request.getAttribute("totalCollectedWeight") != null ? request.getAttribute("totalCollectedWeight") : "0" %> kg</p>
    <p>Organic Waste: <%= request.getAttribute("organicWaste") != null ? request.getAttribute("organicWaste") : "0" %> kg</p>
    <p>Recyclable Waste: <%= request.getAttribute("recyclableWaste") != null ? request.getAttribute("recyclableWaste") : "0" %> kg</p>
    <p>Hazardous Waste: <%= request.getAttribute("hazardousWaste") != null ? request.getAttribute("hazardousWaste") : "0" %> kg</p>

    <p><a href="index.jsp">Go Back</a></p>
</body>
</html>

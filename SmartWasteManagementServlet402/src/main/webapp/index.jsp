<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Smart Waste Management System</title>
</head>
<body>
    <h2>Smart Waste Management System</h2>
    
    <h3>Add Waste</h3>
    <form action="WasteCollectionServlet" method="post">
        <label for="wasteType">Select Waste Type:</label>
        <select name="wasteType" id="wasteType">
            <option value="Organic">Organic</option>
            <option value="Recyclable">Recyclable</option>
            <option value="Hazardous">Hazardous</option>
        </select>
        <label for="weight">Weight (in kg):</label>
        <input type="number" name="weight" id="weight" required />
        <input type="submit" value="Add Waste" />
    </form>

    <h3>Actions</h3>
    <form action="EmptyBinServlet" method="post">
        <input type="submit" name="action" value="emptyAll" /> Empty All Bins<br/>
        <input type="submit" name="action" value="emptyOrganic" /> Empty Organic Bin<br/>
        <input type="submit" name="action" value="emptyRecyclable" /> Empty Recyclable Bin<br/>
        <input type="submit" name="action" value="emptyHazardous" /> Empty Hazardous Bin<br/>
    </form>

    <h3>View Statistics</h3>
    <form action="WasteStatisticsServlet" method="get">
        <input type="submit" value="View Waste Statistics" />
    </form>
</body>
</html>

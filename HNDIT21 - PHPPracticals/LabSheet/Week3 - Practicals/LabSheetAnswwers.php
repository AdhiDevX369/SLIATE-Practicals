<!DOCTYPE html>
<html>

<head>
    <title>Employee Salary Details</title>
</head>

<body>
    <?php
    //* Employee details
    $employeeNumber = "EMP001";
    $employeeName = "Kamal Gunarathne";
    $basicSalary = 25000.00;
    $costOfLivingAllowance = 15000.00;
    ?>

    <h2>Employee Details</h2>

    <p>Employee Number: <?php echo $employeeNumber; ?></p>
    <p>Employee Name: <?php echo $employeeName; ?></p>
    <p>Basic Salary: <?php echo $basicSalary; ?></p>
    
    <?php
    //* Constants
    define('EPF_PERCENTAGE', 10); // EPF percentage

    //* Calculate Gross Salary
    $grossSalary = $basicSalary + $costOfLivingAllowance;

    //* Calculate Deductions
    $deductions = ($basicSalary * EPF_PERCENTAGE) / 100;

    //* Calculate Net Salary
    $netSalary = $grossSalary - $deductions;
    ?>

    <h2>Employee Details</h2>
    <p>Employee Number: <?php echo $employeeNumber; ?></p>
    <p>Employee Name: <?php echo $employeeName; ?></p>
    <p>Basic Salary: Rs.<?php echo $basicSalary; ?></p>
    <p>Gross Salary: Rs.<?php echo $grossSalary; ?></p>
    <p>Net Salary: Rs.<?php echo $netSalary; ?></p>
</body>

</html>
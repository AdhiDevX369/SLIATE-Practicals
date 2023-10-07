<!DOCTYPE html>
<html>
<head>
    <title>PHP Additional Things</title>
</head>
<body>
    <h2>Data Types</h2>
    <?php
    // Integer
    $integerVar = 42;
    echo "Integer: $integerVar<br>";

    // Floating-Point
    $floatVar = 3.14;
    echo "Floating-Point: $floatVar<br>";

    // String
    $stringVar = "Hello, World!";
    echo "String: $stringVar<br>";

    // Boolean
    $boolVar = true;
    echo "Boolean: $boolVar<br>";

    // Array
    $arrayVar = [1, 2, 3];
    echo "Array: ";
    print_r($arrayVar);
    echo "<br>";

    // Null
    $nullVar = null;
    echo "Null: $nullVar<br>";
    ?>
    
    <h2>Calculations</h2>
    <?php
    // Arithmetic Operations
    $result = 10 + 5;
    echo "Addition: 10 + 5 = $result<br>";

    // Modulo
    $remainder = 17 % 4;
    echo "Modulo: 17 % 4 = $remainder<br>";

    // Exponentiation
    $power = 2 ** 3;
    echo "Exponentiation: 2^3 = $power<br>";

    // Comparison Operators
    $isGreater = 10 > 5;
    echo "Comparison: 10 > 5 is $isGreater<br>";

    // Logical Operators
    $logicalResult = (true && false) || (true && true);
    echo "Logical: (true && false) || (true && true) is $logicalResult<br>";
    ?>
    
    <h2>Constants</h2>
    <?php
    define('PI', 3.14159265);
    $radius = 5;
    $area = PI * ($radius ** 2);
    echo "Constant PI: " . PI . "<br>";
    echo "Area of a circle with radius $radius: $area<br>";
    ?>

<h2>Double Floating-Point Calculations</h2>
    <?php
    // Double-precision floating-point calculations
    $num1 = 0.1;
    $num2 = 0.2;
    $sum = $num1 + $num2;
    echo "Double Addition: $num1 + $num2 = $sum<br>";

    // Rounding numbers
    $numberToRound = 3.75;
    $roundedNumber = round($numberToRound, 1);
    echo "Rounding: $numberToRound rounded to 1 decimal place is $roundedNumber<br>";

    // Formatting numbers
    $largeNumber = 1000000.12345;
    $formattedNumber = number_format($largeNumber, 2);
    echo "Formatting: $largeNumber formatted to 2 decimal places is $formattedNumber<br>";
    ?>
    
    <h2>Converting Methods</h2>
    <?php
    // Converting string to integer
    $stringNumber = "42";
    $intNumber = (int)$stringNumber;
    echo "String to Integer: \"$stringNumber\" converted to an integer is $intNumber<br>";

    // Converting string to float
    $stringFloat = "3.14";
    $floatNumber = (float)$stringFloat;
    echo "String to Float: \"$stringFloat\" converted to a float is $floatNumber<br>";

    // Converting float to string
    $floatValue = 2.718;
    $stringFloatValue = strval($floatValue);
    echo "Float to String: $floatValue converted to a string is \"$stringFloatValue\"<br>";
    ?>
</body>
</html>

<!DOCTYPE html>
<html>

<head>
    <title>PHP Examples</title>
</head>

<body>
    <h2>Question 1 - Greeting Based on Time</h2>
    <?php
    $hour = date("H"); // Get the hour from the current system timestamp
    
    if ($hour >= 5 && $hour < 12) {
        echo "Good morning!";
    } elseif ($hour >= 12 && $hour < 16) {
        echo "Good afternoon!";
    } elseif ($hour >= 17 && $hour < 20) {
        echo "Good evening!";
    } else {
        echo "Good night!";
    }
    ?>

    <h2>Question 2 - Arithmetic Operations with User Input</h2>
    <form method="POST" action="">
        <label for="num1">Enter the first number: </label>
        <input type="number" name="num1" id="num1"><br><br>

        <label for="num2">Enter the second number: </label>
        <input type="number" name="num2" id="num2"><br><br>

        <label for="operator">Select an operator: </label>
        <select name="operator" id="operator">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
            <option value="%">%</option>
        </select><br><br>

        <input type="submit" name="calculate" value="Calculate">
    </form>

    <?php
    if (isset($_POST['calculate'])) {
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $operator = $_POST['operator'];

        switch ($operator) {
            case '+':
                $result = $num1 + $num2;
                break;
            case '-':
                $result = $num1 - $num2;
                break;
            case '*':
                $result = $num1 * $num2;
                break;
            case '/':
                if ($num2 == 0) {
                    $result = "Division by zero is not allowed.";
                } else {
                    $result = $num1 / $num2;
                }
                break;
            case '%':
                $result = $num1 % $num2;
                break;
            default:
                $result = "Invalid operator";
                break;
        }

        echo "Result of $num1 $operator $num2 is: $result";
    }
    ?>
    <h2>Question 4 - Even Numbers with Do-While Loop</h2>
    <?php
    $num = 2;
    do {
        echo "$num ";
        $num += 2;
    } while ($num <= 10);
    ?>

    <h2>Question 5 - Square Numbers with For Loop</h2>
    <?php
    for ($i = 1; $i <= 10; $i++) {
        $square = $i * $i;
        echo "Square of $i is: $square<br>";
    }
    ?>

    <h2>Question 6 - Factorial of a Number</h2>
    <?php
    $number = 5; // Change to the desired number
    $factorial = 1;
    for ($i = 1; $i <= $number; $i++) {
        $factorial *= $i;
    }
    echo "Factorial of $number is: $factorial";
    ?>

    <h2>Question 7 - Prime Number Check</h2>
    <?php
    $numToCheck = 11; // Change to the desired number
    $isPrime = true;

    if ($numToCheck <= 1) {
        $isPrime = false;
    } else {
        for ($i = 2; $i <= sqrt($numToCheck); $i++) {
            if ($numToCheck % $i == 0) {
                $isPrime = false;
                break;
            }
        }
    }

    if ($isPrime) {
        echo "$numToCheck is a prime number.";
    } else {
        echo "$numToCheck is not a prime number.";
    }
    ?>
</body>

</html>
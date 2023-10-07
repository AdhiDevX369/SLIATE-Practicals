<!DOCTYPE html>
<html>

<head>
    <title>Learn PHP</title>
</head>

<body>
    <h1>Hello There</h1>
    <h3 style="color: green;">Welcome to Learn PHP</h3>

    <ul>
        <li>PHP is a server-side scripting language.</li>
        <li>It is widely used for web development.</li>
    </ul>


    <?php

    //? Start PHP Tag:'<?php'

    //TODO Echo Statements Explain 
    echo '<br>';

    //* Output the main heading in <h3> size
    echo '<h3>The PHP Echo Statement</h3>';

    //* Output a paragraph with explanations
    echo '<p>The echo statement can use with parameters or without parameters : <span style="color: red;">echo</span> or <span style="color: red;">echo()</span></p>';

    //* The <span> elements are used to apply inline CSS to make "echo" and "echo()" words red.

    //TODO Print Statement Explain
    echo '<br>';

    //* Output the main heading in <h3> size
    print '<h3>The PHP Print Statement</h3>';

    print '<p>The print statement can use with parameters or without parameters : <span style="color: red;">print</span> or <span style="color: red;">print()</span></p>';
    //* The <span> elements are used to apply inline CSS to make "print" and "print()" words red.

    //?End Of PHP Tag
    ?>

    <h1 style="color: purple;" align ="center">Compare Echo and Print</h1>

    <! Create a Table for Compare Them>

        <table border="1" align = "center">
            <tr>
                <th>Echo</th>
                <th>Print</th>
            </tr>
            <tr>
                <td>
                    <?php
                    //* echo to print content for Echo column
                    echo "Has no return value.";
                    ?>
                </td>
                <td>
                    <?php
                    //* print to print content for Print column
                    print "Has a return of value 1.";
                    ?>
                </td>
            </tr>
            <tr>
                <td>
                    <?php
                    //* echo to print content for Echo column
                    echo "Echo can take multiple parameters.";
                    ?>
                </td>
                <td>
                    <?php
                    //* print to print content for Print column
                    print "Print can take one argument.";
                    ?>
                </td>
            </tr>
            <tr>
                <td>
                    <?php
                    //* echo to print content for Echo column 
                    echo "Echo has marginally faster than print.";
                    ?>
                </td>
                <td>
                    <?php
                    //* print to print content for Print column
                    print "Slower than echo.";
                    ?>
                </td>
            </tr>
        </table>
</body>

</html>
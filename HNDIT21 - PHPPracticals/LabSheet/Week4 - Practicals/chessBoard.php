<!DOCTYPE html>
<html>
<head>
    <title>Chessboard</title>
    <style>
        table {
            border-collapse: collapse;
        }

        td {
            width: 40px;
            height: 40px;
            text-align: center;
        }

        .white {
            background-color: #fff;
        }

        .black {
            background-color: #000;
        }
    </style>
</head>
<body>
    <h2>Chessboard</h2>
    <table border="1">
        <?php
        for ($row = 1; $row <= 8; $row++) {
            echo "<tr>";
            for ($col = 1; $col <= 8; $col++) {
                $class = ($row + $col) % 2 == 0 ? 'white' : 'black';
                echo "<td class=\"$class\"></td>";
            }
            echo "</tr>";
        }
        ?>
    </table>
</body>
</html>

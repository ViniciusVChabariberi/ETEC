<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AulaPHP</title>
</head>
<body>
    <?php

    echo "<h1>Olá mundo do PHP, este é o meu primeiro programa.</h1> <br>";

    $a = 1;
    $b = 2;

    echo "Adição: " . $a + $b . "<P>";
    echo "Subtração: " . $a - $b . "<br>";
    echo "Multiplicação: " . $a * $b . "<br>";
    echo "Divisão: " . $a / $b . "<p>";

    $var1 = 1;
    $varX = 9.50;
    $varY = 9.50;
    $var2 = $varX + $varY;

    $varSTR = "Atribui String";
    $varletra = "a";
    $varbool = true;

    echo "Exemplo de uma aplicação em PHP";
    print "<p>";

    echo "Conteúdo de var1: ";
    echo $var1;
    print "<p>";

    echo "Conteúdo de varX: ";
    echo $varX;
    print "<p>";

    echo "Conteúdo de varY: ";
    echo $varY;
    print "<p>";

    echo "Conteúdo de var2: ";
    echo $var2;
    print "<p>";

    echo "Conteúdo de varSTR: ";
    echo $varSTR;
    print "<p>";

    echo "Conteúdo de varletra: ";
    echo $varletra;
    print "<p>";

    echo "Conteúdo de varbool: ";
    echo $varbool;
    print "<p>";
    ?>
</body>
</html>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>Sistema de Comentários</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/entrar.css">
    </head>

<body>
    <span>Miriam<br>TECHCOD</span>
    <form method="POST">
        <h1>Acesse a sua conta</h1>
        <img src="imagens/envelope.png">
        <input type="email" name="email" autocomplete="off" maxlength="40">
        <img src="imagens/cadeado.png">
        <input type="password" name="senha">
        <input type="submit" value="ENTRAR">
        <a href="cadastrar.php">Registre-se agora!</a>
    </form>
</body>
</html>

<?php

    if (isset($_POST['email'])) 
    {
        $email = addslashes($_POST['email']);
        $senha = addslashes($_POST['senha']);

        if (!empty($email) && !empty($senha))
        {
            require_once 'classes/usuarios.php';
            $us = new Usuario("projeto_comentarios", "localhost", "root", "");
            if ($us->entrar($email, $senha))
            {
                header("location: index.php");
            } else
            {
                echo "Email e/ou senha estão incorretos!";
            }
        } else
        {
            echo "Preencha todos os campos!";
        }
    }


?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>Sistema de Comentários</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/cadastrar.css">
    </head>

<body>
    <form method="POST">
        <h1>CADASTRE-SE</h1>

        <label for="nome">NOME</label>
        <input type="text" name="nome" id="nome">
        <label for="email">EMAIL</label>
        <input type="email" name="email" autocomplete="off" id="email">
        <label for="senha">SENHA</label>
        <input type="password" name="senha" id="senha">
        <label for="confSenha">CONFIRMAR SENHA</label>
        <input type="password" name="confSenha" id="confSenha">
        <input type="submit" value="cadastrar">
    </form>
</body>
</html>
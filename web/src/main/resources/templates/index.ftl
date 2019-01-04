<!doctype html>
<html lang="ja">
    <head>
        <meta charset="utf-8" />
    </head>
    <body>

    ${hello}

    <hr>
    register
    <form method="post" action="/todo/create">
        name<input type="text" name="name" />
        description<input type="text" name="description" />
        <input type="submit" />
    </form>
    <hr>

    <table>
    <#list todoList as todo>
        <tr>
            <td>${todo.id}</td>
            <td>${todo.name}</td>
            <td>${todo.description}</td>
        </tr>
    </#list>
    </table>

    </body>
</html>

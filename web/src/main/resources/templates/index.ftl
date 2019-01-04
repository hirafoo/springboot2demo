<!doctype html>
<html lang="ja">
    <head>
        <meta charset="utf-8" />
    </head>
    <body>

    ${hello}

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

<!doctype html>
<html lang="ja">
    <head>
        <meta charset="utf-8" />
    </head>
    <body>

    <a href="/">todo</a>
    <a href="/make_many">たくさん作る</a>
    <a href="/truncate">truncate</a>

    <hr>

    ${hello}

    <hr>
    register
    <form method="post" action="/todo/create">
        name<input type="text" name="name" />
        description<input type="text" name="description" />
        <input type="submit" />
    </form>
    <hr>

    <table border="1">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>description</td>
            <td>done?</td>
            <td>delete</td>
        </tr>
    <#list todoList as todo>
        <tr>
            <td>${todo.id}</td>
            <td>${todo.name}</td>
            <td>${todo.description}</td>
            <td>
                <#if todo.isDone() == true>
                    done
                <#else>
                    not yet
                <form method="post" action="/todo/done">
                    <input type="hidden" name="id" value="${todo.id}" />
                    <input type="submit" value="done" />
                </form>
                </#if>
            </td>
            <td>
                <form method="post" action="/todo/delete">
                    <input type="hidden" name="id" value="${todo.id}" />
                    <input type="submit" value="delete" />
                </form>
            </td>
        </tr>
    </#list>
    </table>

    </body>
</html>

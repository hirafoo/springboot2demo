<#import "/include/layout.ftl" as layout>
<#import "/include/macro.ftl" as macro>
<@layout.myLayout title="todo" subTitle="edit">

    <form method="post" action="/todo/edit/${todo.id}">
        name <input type="text" value="${todo.name}" name="name">
        description <input type="text" value="${todo.description}" name="description">
        <input type="submit" value="update">
    </form>
</@layout.myLayout>

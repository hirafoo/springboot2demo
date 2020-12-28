<#import "/include/layout.ftl" as layout>
<#import "/include/macro.ftl" as macro>
<@layout.myLayout title="todo" subTitle="edit">

    ${todo.id}
    <br/>
    ${todo.name}
</@layout.myLayout>

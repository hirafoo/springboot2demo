<#import "/include/layout.ftl" as layout>
<@layout.myLayout title="kotlin" subTitle="kt">
    <form method="get" action="/kt/loop/<#if type == "while">while_sample<#else>for_sample</#if>">
        <input type="text" name="num">
        <input type="submit" value="post">
    </form>
    result : ${result}
</@layout.myLayout>

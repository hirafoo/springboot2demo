<#import "/include/layout.ftl" as layout>
<@layout.myLayout title="kotlin" subTitle="kt">
    <form method="get" action="/kt/loop/while_sample">
        <input type="text" name="num">
        <input type="submit" value="post">
    </form>
    result : ${result}
</@layout.myLayout>

<#macro myLayout title="sample" subTitle="webapp" useVue=false>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta content="ie=edge" http-equiv="x-ua-compatible">
        <meta content="width=device-width, initial-scale=1, shrink-to-fit=no" name="viewport">
        <title>${title} - ${subTitle}</title>
    </head>

    <body>
    <div>header</div>
    <a href="https://github.com/hirafoo/springboot2-todoapp">repo</a>
    <hr/>
    <div>
        <a href="/">root</a>
    </div>
    <div>
        <a href="/make_many">たくさん作る</a>
    <a href="/truncate">truncate</a>
    </div>
    <div>
        <a href="/kt/hello">/kt/hello</a>
    </div>
    <div>
        <a href="/kt/loop/while_sample">/kt/loop/while_sample</a>
    </div>
    <div>
        <a href="/kt/loop/for_sample">/kt/loop/for_sample</a>
    </div>

    <hr>

    <#nested/>
    </body>
</html>

</#macro>

<#macro myLayout title="sample" subTitle="webapp" useVue=false>
<#import "/include/macro.ftl" as macro>

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
        <@macro.link link="/" />
    </div>
    <div>
        <@macro.link link="/make_many" />
    </div>
        <@macro.link link="/truncate" />
    <div>
        <@macro.link link="/kt/hello" />
    </div>
    <div>
        <@macro.link link="/kt/loop/while_sample" />
    </div>
    <div>
        <@macro.link link="/kt/loop/for_sample" />
    </div>
    <div>
        <@macro.link link="/kt/reflection/item" />
    </div>

    <hr>

    <#nested/>
    </body>
</html>

</#macro>

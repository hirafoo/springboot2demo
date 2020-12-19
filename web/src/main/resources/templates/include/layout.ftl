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
    <#nested/>
    </body>
</html>

</#macro>
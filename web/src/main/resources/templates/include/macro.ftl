<#macro link link="" text="">
    <a href="${link}"><#if text?has_content>${text}<#else>${link}</#if></a>
</#macro>

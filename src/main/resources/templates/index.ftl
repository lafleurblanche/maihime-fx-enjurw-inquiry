<#-- @ftlvariable name="articles" type="kotlin.collections.List<com.example.models.Article>" -->
<#import "_header_enjurw01.ftl" as layout />
<@layout.header>
    <table border=0>
      <tr><td>乗車駅コード<td>乗車駅名
      <#list articles as articles>
        <tr><td>${articles.fromStaCode}<td>${articles.fromStaName}
      </#list>
    </table>
</@layout.header>

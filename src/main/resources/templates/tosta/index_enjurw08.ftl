<#-- @ftlvariable name="toStaInfo" type="kotlin.collections.List<net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW08ToStaInfoData>" -->
<#import "_header_enjurw08.ftl" as layout />
<@layout.header>
    <table border=0>
      <tr><td>降車駅コード<td>降車駅名
      <#list toStaInfo as toStaInfo>
        <tr><td>${toStaInfo.toStaCode}<td>${toStaInfo.toStaName}
      </#list>
    </table>
</@layout.header>

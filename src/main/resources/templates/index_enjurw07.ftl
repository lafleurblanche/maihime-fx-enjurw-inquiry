<#-- @ftlvariable name="fromStaInfo" type="kotlin.collections.List<net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW07FromStaInfoData>" -->
<#import "_header_enjurw07.ftl" as layout />
<@layout.header>
    <table border=0>
      <tr><td>乗車駅コード<td>乗車駅名
      <#list fromStaInfo as fromStaInfo>
        <tr><td>${fromStaInfo.fromStaCode}<td>${fromStaInfo.fromStaName}
      </#list>
    </table>
</@layout.header>

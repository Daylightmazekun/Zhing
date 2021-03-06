<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="Author" content="Ma Zekun">
    <meta name="copyright" content="Ma Zekun All Rights Reserved">
    <script src="${request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
    <link href="${request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">
        .pageDetail {
            display: none;
        }
        .show {
            display: table-row;
        }
    </style>
    <script>
        $(function () {
            $('#list').click(function () {
                $('.pageDetail').toggleClass('show');
            });
        });
    </script>
    </head>
<body class="body">
<div class="wrapper">
    <br>
    <br>
    <br>
    <br>
    <br>
    <pre class="slogan">
  __
 / /       /  |                /|/|
( /   ___ (___|      ___      ( / | ___
 /  )|___)|\   |   )|   )     |   )|   )
/__/ |__  | \  |__/ |  /      |  / |__/|
</pre>

    <a name = "userid">${user.id}</a>
    <a name = "username">${user.name}</a>
    <button type="button">开始</button>
    <button type="button">输入</button>
    <button type="button">全部</button>

        <#if pageInfo??>
            <table class="gridtable" style="width:100%;">
            <tr>
                <th colspan="2">分页信息 - [<a href="javascript:;" id="list">展开/收缩</a>]</th>
            </tr>
            <tr class="pageDetail">
            <th style="width: 300px;">当前页号</th>
            <td>${pageInfo.pageNum}</td>
            </tr>
            <tr class="pageDetail">
        <th>页面大小</th>
            <td>${pageInfo.pageSize}</td>
            </tr>
            <tr class="pageDetail">
        <th>起始行号(>=)</th>
            <td>${pageInfo.startRow}</td>
            </tr>
            <tr class="pageDetail">
        <th>终止行号(<=)</th>
            <td>${pageInfo.endRow}</td>
            </tr>
            <tr class="pageDetail">
        <th>总结果数</th>
            <td>${pageInfo.total}</td>
            </tr>
            <tr class="pageDetail">
        <th>总页数</th>
            <td>${pageInfo.pages}</td>
            </tr>
            <tr class="pageDetail">
        <th>第一页</th>
            <td>${pageInfo.firstPage}</td>
            </tr>
            <tr class="pageDetail">
        <th>前一页</th>
            <td>${pageInfo.prePage}</td>
            </tr>
            <tr class="pageDetail">
        <th>下一页</th>
            <td>${pageInfo.nextPage}</td>
            </tr>
            <tr class="pageDetail">
        <th>最后一页</th>
            <td>${pageInfo.lastPage}</td>
            </tr>
            <tr class="pageDetail">
        <th>是否为第一页</th>
            <td>${pageInfo.isFirstPage?c}</td>
            </tr>
            <tr class="pageDetail">
        <th>是否为最后一页</th>
            <td>${pageInfo.isLastPage?c}</td>
            </tr>
            <tr class="pageDetail">
        <th>是否有前一页</th>
            <td>${pageInfo.hasPreviousPage?c}</td>
            </tr>
            <tr class="pageDetail">
        <th>是否有下一页</th>
            <td>${pageInfo.hasNextPage?c}</td>
            </tr>
            </table>
            <table class="gridtable" style="width:100%;">
            <#if msg??>
                <tr style="color:red;">
                <th colspan="5">${msg}</th>
                </tr>
            </#if>
            </table>
            <table class="gridtable" style="width:100%;">
            <thead>
            <tr>
            <th colspan="4">查询结果 - [<a href="${request.contextPath}/japanese/add">增加</a>]</th>
        </tr>
        <tr>
            <td>词：</td>
            <td>假名：</td>
            <td>意思：</td>
            <td>例句：</td>
        </tr>
            </thead>
            <tbody>
            <#list pageInfo.list as janpanese>
                <tr>
                <td>${janpanese.wordid}</td>
                <td>${janpanese.wordname}</td>
                <td style="text-align:center;">[<a
            href="${request.contextPath}/janpanese/modify/${janpanese.wordid}">修改</a>] -
            [<a href="${request.contextPath}/janpanese/delete/${janpanese.wordid}">删除</a>]
                </td>
                </tr>
            </#list>
            </tbody>
            </table>
            <table class="gridtable" style="width:100%;text-align: center;">
            <tr>
            <#if pageInfo.hasPreviousPage>
                <td>
                <a href="${request.contextPath}/janpanese?page=1&rows=${pageInfo.pageSize}&wordname=${queryParam.wordname}&wordid=${queryParam.wordid}">首页</a>
                </td>
                <td>
                <a href="${request.contextPath}/janpanese?page=${pageInfo.prePage}&rows=${pageInfo.pageSize}&wordname=${queryParam.wordname}&wordid=${queryParam.wordid}">前一页</a>
                </td>
            </#if>
            <#list pageInfo.navigatepageNums as nav>
                <#if nav == pageInfo.pageNum>
                    <td style="font-weight: bold;">${nav}</td>
                </#if>
                <#if nav != pageInfo.pageNum>
                    <td>
                    <a href="${request.contextPath}/janpanese?page=${nav}&rows=${pageInfo.pageSize}&wordname=<#if queryParam.wordname??>${queryParam.wordname}</#if>&wordid=<#if queryParam.wordid??>${queryParam.wordid}</#if>">${nav}</a>
                    </td>
                </#if>
            </#list>
            <#if pageInfo.hasNextPage>
                <td>
                <a href="${request.contextPath}/janpanese?page=${pageInfo.nextPage}&rows=${pageInfo.pageSize}&wordname=<#if queryParam.wordname??>${queryParam.wordname}</#if>&wordid=<#if queryParam.wordid??>${queryParam.wordid}</#if>">下一页</a>
                </td>
                <td>
                <a href="${request.contextPath}/janpanese?page=${pageInfo.pages}&rows=${pageInfo.pageSize}&wordname=<#if queryParam.wordname??>${queryParam.wordname}</#if>&wordid=<#if queryParam.wordid??>${queryParam.wordid}</#if>">尾页</a>
                </td>
            </#if>
            </tr>
            </table>
        </#if>
    </table>
</div>

</body>
</html>
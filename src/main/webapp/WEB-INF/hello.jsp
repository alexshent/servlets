<%@ page import="java.util.List, java.util.ArrayList, ua.alexshent.RequestItem" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<title>Hello</title>
</head>

<style>
table, td {
    border: 1px solid #333;
}

thead, tfoot {
    background-color: #333;
    color: #fff;
}
</style>

<body>
<table>
<thead>
<tr>
<th>ip address</th>
<th>user agent</th>
<th>datetime</th>
</tr>
</thead>
<tbody>
<%
List<RequestItem> list = (ArrayList<RequestItem>) request.getAttribute("list");
for (RequestItem item : list) {
%>
<tr>
<td><strong><%= item.ipAddress() %></strong></td>
<td><strong><%= item.userAgent() %></strong></td>
<td><%= item.datetime() %></td>
</tr>
<%}%>
</tbody>
</table>
</body>

</html>
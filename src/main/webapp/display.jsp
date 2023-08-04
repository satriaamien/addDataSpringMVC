<%-- <%@page import="com.telusko.model.Alien" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Berhasil tambahkan data </h1>
<% 
try {

String connectionURL = "jdbc:mysql://localhost:3306/sammy"; 

Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection(connectionURL, "root", "admin");
Statement st = con.createStatement();
%>

<% 
ResultSet rs = st.executeQuery("select * from tambah");
int id;
String nama;
String kelas;
int nomor=1;
while (rs.next()) {
    id = rs.getInt("id");
    nama = rs.getString("nama").trim();
    kelas = rs.getString("kelas").trim();
    out.println(nomor+ "." +" ID : " + id + " | Nama : " + nama + " | Kelas " + kelas +"<br />");
	nomor+=1;
}

}
catch(Exception ex){
%>

<%
out.println("Unable to connect to database.");
}
%>




  <%-- 	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/sammy" user="root" password="admin" />
	
	<sql:query var="rs" dataSource="${db}">select * from tambah</sql:query>
	<c:forEach items="${rs.rows}" var="siswa" >
		<c:out value="${siswa.id}"></c:out>. <c:out value="${siswa.nama}"></c:out> : <c:out value="${siswa.kelas}"></c:out> 
		<br>
	</c:forEach>   --%>

<%--  <%
	Alien a1= (Alien) request.getAttribute("alien");
 	out.println(a1);
%> --%>


	<%--  Result is ${resultt} --%>
	 <%-- <%= request.getAttribute("resultt") %> --%>
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, you are WELCOME!!!</h2>
<br>
<br>
<br>
<%--Your name: ${param.employeeName}--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your carBrand: ${employee.carBrand}
<br>
Foreign language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}"> <!--чтобы отобразить несколько вариантов-->
        <li>
            ${lang} <!-- чтобы отобразить во View-->
        </li>

    </c:forEach>
</ul>
Phone number: ${employee.phoneNumber}
</body>
</html>
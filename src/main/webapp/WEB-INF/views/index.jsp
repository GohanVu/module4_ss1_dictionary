<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dictionary</title>

</head>
<body>
<h2>Dictionary</h2>
<form method="post">
    <div class="mb-3 row">
        <label for="englishWord" class="col-sm-2 col-form-label">English</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="englishWord" id="englishWord"
            aria-describedby="helpId" placeholder="Enter English word">
        </div>
    </div>
    <button type="submit">
        Check up
    </button>
</form>
<div class="mb-3 row">
    <label for="vietnameseMeaning" class="col-sm-2 col-form-label">Vietnamese meaning</label>
    <div class="col-sm-10">
        <c:if test="${result == null}">
            Vui long nhap tu tieng anh
        </c:if>
        <c:if test="${result!= null}">
            <p id="vietnameseMeaning"> ${result}</p>
        </c:if>
    </div>
</div>
</body>
</html>
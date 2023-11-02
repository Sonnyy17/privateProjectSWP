

<%@page import="java.util.List"%>
<%@page import="sample.user.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Update Account</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <form action="UpdateController" enctype="multipart/form-data" method="POST">
                <h1>EDIT ACCOUNT ${requestScope.user.getFullname()}</h1>
                <div class="form-group">
                    <label for="fullName">Full Name:</label>
                    <input class="form-control" type="text" name="FullName" id="fullName" value="${requestScope.user.getFullname()}"required=""><br>
                </div>
                <input type="hidden" name="userID" id="userID" value="${requestScope.user.getEmployee_id()}"required=""><br>
                <div class="form-group">
                    <label for="Phone">Phone :</label>
                    <input type="tel" class="form-control" name="Phone" value="${requestScope.user.getPhone()}" id="Phone" required pattern="[0-9]{10}" title="Số điện thoại phải có 10 chữ số">
                </div>
                <div class="form-group">
                    <label for="Email">Email :</label>
                    <input type="email" class="form-control" name="Email" value="${requestScope.user.getEmail()}"id="Email" required=""><br>
                </div>
                <div class="form-group">
                    <label for="Gender">Gender:</label>
                    <select class="form-control" name="Gender" id="Gender">
                        <option value="Male" ${requestScope.user.getGender() == 'Male' ? 'selected' : ''}>Male</option>
                        <option value="FeMale" ${requestScope.user.getGender() == 'Female' ? 'selected' : ''}>Female</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="roleID">Role ID:</label>
                    <select class="form-control" name="roleID" id="roleID">
                        <option value="ADMIN" ${requestScope.user.getRoleID() == 'ADMIN' ? 'selected' : ''}>ADMIN</option>
                        <option value="MANAGER" ${requestScope.user.getRoleID() == 'MANAGER' ? 'selected' : ''}>MANAGER</option>
                        <option value="TRAINER" ${requestScope.user.getRoleID() == 'TRAINER' ? 'selected' : ''}>TRAINER</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="formFileSm" class="form-label">Small file input example</label>
                    <input onchange="previewImageBeforeSubmit()" class="form-control form-control-sm" name="image" id="photo" type="file">
                    <input type="hidden" name="photo" value="${requestScope.user.getPhoto()}" >
                </div>
                <img src="${user.photo}" alt="default" id="image" style="width: 50%">
                <div class="form-group">
                    <input type="submit" class="btn btn-info" value="Update">
                    <a href="MainController?action=BackAdminPage">Back</a>   
                </div>
            </form>
        </div>

        <script type="text/javascript">
            function previewImageBeforeSubmit() {
                const [file] = document.getElementById('photo').files;
                if (file) {
                    document.getElementById('image').src = URL.createObjectURL(file);
                }
            }
        </script>
    </body>
</html>

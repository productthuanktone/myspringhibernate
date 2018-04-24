<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerQL.jsp"></jsp:include>
	<div class="container main-content list">
        <div class="row">
            <a href="#" class="btn btn-success pull-left">
                <span class="glyphicon glyphicon-plus"></span> Add new contact
            </a>
            <form class="form-inline pull-right" action="#" method="GET">
                <div class="form-group">
                    <input type="text" class="form-control" name="q" placeholder="Type contact name..." />
                </div>
                <button type="submit" class="btn btn-primary">Search</button>
            </form>
            <a id="themKH"class="btn btn-primary" href="khachhang/themkhachhang" role="button">Link</a>
        </div>
        <div class="row">
            <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>Nguyen Tuan Anh</td>
                        <td>nguyentuananh11b6@gmail.com</td>
                        <td>0123456789</td>
                        <td><a href="#"><span class="glyphicon glyphicon-pencil"></span></a></td>
                        <td><a href="#"><span class="glyphicon glyphicon-trash"></span></a></td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>Nguyen Tuan Anh</td>
                        <td>nguyentuananh11b6@gmail.com</td>
                        <td>0123456789</td>
                        <td><a href="#"><span class="glyphicon glyphicon-pencil"></span></a></td>
                        <td><a href="#"><span class="glyphicon glyphicon-trash"></span></a></td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>Nguyen Tuan Anh</td>
                        <td>nguyentuananh11b6@gmail.com</td>
                        <td>0123456789</td>
                        <td><a href="#"><span class="glyphicon glyphicon-pencil"></span></a></td>
                        <td><a href="#"><span class="glyphicon glyphicon-trash"></span></a></td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>Nguyen Tuan Anh</td>
                        <td>nguyentuananh11b6@gmail.com</td>
                        <td>0123456789</td>
                        <td><a href="#"><span class="iconic" data-glyph="delete" title="delete" aria-hidden="true"></span></a></td>
                        <td><a href="#"><span class="glyphicon glyphicon-trash"></span></a></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
<jsp:include page="footerQL.jsp"></jsp:include>

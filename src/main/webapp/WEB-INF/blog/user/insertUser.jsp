<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/sblogheader.jsp" %>


  <form>
      <div class="mb-3 mt-3">
      <label for="uname">Username</label>
      <input type="text" class="form-control" id="username" placeholder="사용자이름" name="username">
    </div>
  
    <div class="mb-3 mt-3">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="mb-3">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
    </div>
    <div class="form-check mb-3">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button id="btn-save" type="submit" class="btn btn-primary">회원가입</button>
  </form>


<%@ include file="../layout/sblogfooter.jsp" %>

    
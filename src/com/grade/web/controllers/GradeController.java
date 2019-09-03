package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domain.GradeBean;
import com.grade.web.serviceImpls.GradeServiceImpl;
import com.grade.web.services.GradeService;

@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		String soc = request.getParameter("soc");
		GradeBean grade = new GradeBean();
		grade.setName(name);
		grade.setSsn(ssn);
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);
		grade.setSoc(soc);
		GradeService service = new GradeServiceImpl();
		service.createGrade(grade);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

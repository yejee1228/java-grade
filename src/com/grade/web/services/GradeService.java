package com.grade.web.services;

import com.grade.web.domain.GradeBean;

public interface GradeService {
	public void createGrade(GradeBean param);
	public String createHakbun(GradeBean param);
	public String sumGrade(GradeBean param);
	public String averGrade(GradeBean param);
}

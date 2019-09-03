package com.grade.web.serviceImpls;

import com.grade.web.DAOImpls.GradeDAOImpl;
import com.grade.web.DAOs.GradeDAO;
import com.grade.web.domain.GradeBean;
import com.grade.web.services.GradeService;

public class GradeServiceImpl implements GradeService {
	private GradeDAO dao;

	public GradeServiceImpl() {
		dao = new GradeDAOImpl();
	}

	@Override
	public void createGrade(GradeBean param) {
		param.setHakbun(createHakbun(param));
		param.setSum(sumGrade(param));
		param.setAver(averGrade(param));
		dao.insertGrade(param);
	}

	@Override
	public String createHakbun(GradeBean param) {
		String ssn = param.getSsn();
		String a = ssn.substring(7, 8);
		int b = (int) (Math.random() * 999) + 1;
		String hakbun = "2019-" + a + String.format("%03d", b);
		return hakbun;
	}

	@Override
	public String sumGrade(GradeBean param) {
		int kor = Integer.parseInt(param.getKor());
		int eng = Integer.parseInt(param.getEng());
		int math = Integer.parseInt(param.getMath());
		int soc = Integer.parseInt(param.getSoc());
		String sum = String.valueOf(kor + eng + math + soc);
		return sum;
	}

	@Override
	public String averGrade(GradeBean param) {
		String aver = Integer.parseInt(sumGrade(param))/4+"";
		return aver;
		
	}

}

package com.grade.web.DAOImpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.DAOs.GradeDAO;
import com.grade.web.domain.GradeBean;

public class GradeDAOImpl implements GradeDAO{
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresource%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator);

	@Override
	public void insertGrade(GradeBean param) {
		try{
			File file = new File(FILE_PATH+"grade.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("학번:%s, 이름:%s, 국어:%s, 영어:%s, 수학:%s, 사회:%s, 합계:%s, 평균:%s", 
					param.getHakbun(), param.getName(),param.getKor(),param.getEng(),param.getMath(),param.getSoc(),param.getSum(),param.getAver()));
			writer.newLine();
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

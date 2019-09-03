package com.grade.web.domain;

import java.io.Serializable;

public class GradeBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name, ssn, kor, eng, math, soc, hakbun, sum, aver;
	
	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getAver() {
		return aver;
	}

	public void setAver(String aver) {
		this.aver = aver;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getSoc() {
		return soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}

	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	@Override
	public String toString() {
		return "성적표 [name=" + name + ", hakbun=" + hakbun + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", soc=" + soc + ", sum=" + sum + ", aver=" + aver + "]";
	}


	
}

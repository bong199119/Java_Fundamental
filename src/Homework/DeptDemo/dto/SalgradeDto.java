package Homework.DeptDemo.dto;

public class SalgradeDto {
	private int grade;
	private int lo;
	private int hi;
	public SalgradeDto(int grade, int lo, int hi) {
		super();
		this.grade = grade;
		this.lo = lo;
		this.hi = hi;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getLo() {
		return lo;
	}
	public void setLo(int lo) {
		this.lo = lo;
	}
	public int getHi() {
		return hi;
	}
	public void setHi(int hi) {
		this.hi = hi;
	}
	
}

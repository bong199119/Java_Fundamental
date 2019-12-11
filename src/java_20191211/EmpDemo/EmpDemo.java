package java_20191211.EmpDemo;

import java.util.ArrayList;

import java_20191211.EmpDemo.dao.EmpDao;
import java_20191211.EmpDemo.dto.EmpDto;

public class EmpDemo {
	public static void main(String[] args) {
	EmpDao dao = EmpDao.getInstance();
	/*dao.insert(new EmpDto(9112,"bongg","salesman",7839,null,3004,0,20));*/
	
	
/*	dao.update(new EmpDto(9002,"burger","salesman",7839,null,2000,10,40));*/
	dao.delete(9012);
	
	/*
	ArrayList<EmpDto> list = dao.select(0,5);
	
	for(EmpDto dto : list){
		int no = dto.getNo();
		String name = dto.getName();
		String job = dto.getJob();
		int mgr = dto.getMgr();
		String hiredate = dto.getHiredate();
		double sal = dto.getSal();
		double comm = dto.getComm();
		int deptno = dto.getDeptNo();
		System.out.printf("%d, %s, %s, %d, %s, %.2f, %.2f, %d %n",
				no,name,job,mgr,hiredate,sal,comm,deptno);
	}
	
	
	
	
	EmpDto dto = dao.select(9000);
	if(dto != null){
		int no = dto.getNo();
		String name = dto.getName();
		String job = dto.getJob();
		int mgr = dto.getMgr();
		String hiredate = dto.getHiredate();
		double sal = dto.getSal();
		double comm = dto.getComm();
		int deptno = dto.getDeptNo();
		System.out.printf("%d, %s, %s, %d, %s, %.2f, %.2f, %d %n",
				no,name,job,mgr,hiredate,sal,comm,deptno);
	}else{
		System.out.println("데이터가 없습니다.");
	}
	*/
		
	}
}

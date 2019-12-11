package Homework.DeptDemo;

import java.util.ArrayList;

import Homework.DeptDemo.dao.SalgradeDao;
import Homework.DeptDemo.dto.SalgradeDto;
import java_20191210.dto.DeptDto;

public class SalgradeDemo {
	public static void main(String[] args) {
		SalgradeDao s = SalgradeDao.getInstance();
		
		/*boolean isSuccess = s.insert(new SalgradeDto(10,40,5000));
		System.out.println(isSuccess);*/
		
		// boolean isSuccess = s.update(new SalgradeDto(5,999,999));
		// System.out.println(isSuccess);
		
		/*boolean isSuccess = s.delete(2);
		System.out.println(isSuccess);*/
		
/*		ArrayList<SalgradeDto> list = s.select();
		
		for (SalgradeDto sto : list) {
			System.out.printf("%d, %d, %d, %n", sto.getGrade(), sto.getLo(), sto.getHi());
		}
		
		*/
		SalgradeDto sto = s.select(5);
		if (sto == null) {
			System.out.println("데이터가 존재하지 않습니다.");

		} else {
			System.out.printf("%d, %d, %d%n", sto.getGrade(), sto.getLo(), sto.getHi());
		}
		
		
		
	}

}

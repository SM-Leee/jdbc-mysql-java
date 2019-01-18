package com.douzon.jdbc.bookshop;

import java.util.List;
import java.util.Scanner;

import com.douzon.jdbc.bookshop.dao.BookDao;
import com.douzon.jdbc.bookshop.vo.BookVo;

public class MainApp {

	public static void main(String[] args) {
		
		displayBookInfo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여하고 싶은 책의 번호를 입력하세요 : ");
		long no = scanner.nextLong();
		scanner.close();
		
		rent(no);
		displayBookInfo();

	}
	private static void rent(long no) {
		new BookDao().update(no, "대여중");
	}
	
	private static void displayBookInfo() {
		System.out.println("------------도서정보 출력하기--------------");
		List<BookVo> list = new BookDao().getList();
		for(BookVo vo : list) {
			System.out.println("["+vo.getNo()+"] "+
								"책제목:"+vo.getTitle()+
								", 저자:"+vo.getAuthorName()+
								", 대여 유무:"+vo.getStatus());
		}
	}

}

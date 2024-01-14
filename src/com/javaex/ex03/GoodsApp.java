package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean tf = true;
		int totalCount = 0;
		List<Goods> gList = new ArrayList<Goods>();

		System.out.println("상품을 입력해주세요(종료 q)");

		do {
			String goods_info;
			goods_info = sc.nextLine();
			if (goods_info.equals("q")) {
				System.out.println("[입력완료]");
				break;
			}
			String[] gArray = goods_info.split(",");

			int gNum = Integer.parseInt(gArray[1]);
			int gNum2 = Integer.parseInt(gArray[2]);

			Goods gd = new Goods(gArray[0], gNum, gNum2);
			gList.add(gd);

		} while (tf);

		for (int i = 0; i < gList.size(); i++) {
			gList.get(i).showInfo();
			totalCount += gList.get(i).getCount();
		}

		System.out.println(totalCount);

		sc.close();
	}

}

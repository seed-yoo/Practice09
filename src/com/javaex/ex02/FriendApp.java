package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해주세요");
    	
    	
    	String f_info1 = sc.nextLine();
    	String[] fArray01 = f_info1.split(" ");
    	String f_info2 = sc.nextLine();
    	String[] fArray02 = f_info2.split(" ");
    	String f_info3 = sc.nextLine();
    	String[] fArray03 = f_info3.split(" ");
    	
    	Friend f1 = new Friend(fArray01[0], fArray01[1], fArray01[2]);
    	Friend f2 = new Friend(fArray02[0], fArray02[1], fArray02[2]);
    	Friend f3 = new Friend(fArray03[0], fArray03[1], fArray03[2]);
    	
    	fList.add(f1);
    	fList.add(f2);
    	fList.add(f3);
    	
    	for (int i = 0; i < fList.size(); i++) {
			fList.get(i).showInfo();
		}
    	
    	
    	
    	
    	sc.close();
    	
    	
    }

}

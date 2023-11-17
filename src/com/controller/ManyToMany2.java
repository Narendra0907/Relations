package com.controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysqlconnection.GetConnection;
import com.pojo.Person;

public class ManyToMany2 {

	
	public static List<String> intputcoursename_outputpersonname(String coursename) throws Exception {
		PreparedStatement ps = GetConnection.getconnection().prepareStatement("select p.personname from course c inner join person p inner join jointable jt where\r\n"
				+ "jt.FKPersonId=p.personid and c.courseid=jt.FkCourseId and c.coursename=?;");
				
		ps.setString(1, coursename);
		ResultSet rs = ps.executeQuery();
		List<String> list = new ArrayList();
		Person p=null;
		while (rs.next()) {
			 p=new Person();
			
			p.setPerson_name(rs.getString(1));
			list.add(rs.getString(1));
		}
		
		//System.out.println(list);
		return list ;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("enter coursename");
		System.out.println(ManyToMany2.intputcoursename_outputpersonname(new Scanner(System.in).next()));
		
	}
}

package com.controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysqlconnection.GetConnection;
import com.pojo.Course;

public class ManyToMany {

	
	public static List<String> inputpersonid_outputcourses(Integer id) throws Exception {
		PreparedStatement ps = GetConnection.getconnection().prepareStatement(
				"select coursename from course c inner join person p inner join jointable jt where\r\n"
						+ "jt.FKPersonId=p.personid and c.courseid=jt.FkCourseId and p.PersonId=?;");
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		List<String> list = new ArrayList();
		Course c=new Course();
		while (rs.next()) {

			list.add(rs.getString(1));
			
		}
		c.setCourse_name(list);
		//System.out.println(list);
		return c.getCourse_name();
	}

	public static void main(String[] args) throws Exception {
		System.out.println("enter id");
		System.out.println(ManyToMany.inputpersonid_outputcourses(new Scanner(System.in).nextInt()));
		
	}
}

package com.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysqlconnection.GetConnection;
import com.pojo.Person;

public class ManyToOne {

 public static Person inputMobiles_outPutPerson(String sim1,String sim2) throws Exception {
	 
	PreparedStatement ps= GetConnection.getconnection().prepareStatement("(select p.personname,p.personage"
			+ "  from person p inner join mobiles m on\r\n"
			+ " p.personid=m.fkpersonid  where m.mobilesim=?) \r\n"
			+ " intersect  \r\n"
			+ " (select p.personname,p.personage  from person p inner join mobiles m on\r\n"
			+ " p.personid=m.fkpersonid  where m.mobilesim=?);");
	
	ps.setString(1, sim1);ps.setString(2, sim2);
	ResultSet rs=ps.executeQuery();
	Person p=null;
	while(rs.next()) {
	 p=new Person();
	p.setPerson_name(rs.getString(1));
	p.setPerson_age(rs.getInt(2));
	
	}
	return p;
 }
 public static void main(String[] args) throws Exception {
	 System.out.println(ManyToOne.inputMobiles_outPutPerson("jio", "bsnl").getPerson_name());
	 
	}
}

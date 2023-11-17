package com.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysqlconnection.GetConnection;
import com.pojo.Passport;
import com.pojo.Person;
public class OneToOne {

	Person person = new Person();

	public static String inputperson_outputpassport() throws Exception {
		Person person = new Person();
		Passport pass=null; 
		Scanner scanner = new Scanner(System.in);
		PreparedStatement ps = GetConnection.getconnection()
				.prepareStatement("Select Passportnumber from passport inner join person\r\n"
						+ " where personid=fkpersonid and personid=?;");
		System.out.println("Enter id");
		Integer id=scanner.nextInt();
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		String num = null;
		
		while (rs.next()) {
			 pass=new Passport();
			pass.setPassport_number(rs.getString(1));
		pass.getPassport_number();
			num = rs.getString(1);
		}

		scanner.close();
		return pass.getPassport_number();
	}

	public static void main(String[] args) throws Exception {

		System.out.println(OneToOne.inputperson_outputpassport());

	}
}

package com.controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysqlconnection.GetConnection;
import com.pojo.Mobiles;
import com.pojo.Person;
public class OneToMany {

	public static List<String> inputperson_outputmobiles() throws Exception {
		Scanner scanner = new Scanner(System.in);
		PreparedStatement ps = GetConnection.getconnection().prepareStatement(
				"\r\n" + "select  mobilesim from mobiles inner join person on personid=fkpersonid  where personid=?;");
		System.out.println("Enter id");
		ps.setInt(1, scanner.nextInt());
		ResultSet rs = ps.executeQuery();
		List<String> mobs = new ArrayList();
		Mobiles mob = new Mobiles();
		while (rs.next()) {
			String s = rs.getString(1);
			mobs.add(s);
			// System.out.println(s);
		}
		mob.setMobile_sim(mobs);
		// System.out.println(mobs);
		 scanner.close();
		return mob.getMobile_sim();
	}

	public static void main(String[] args) throws Exception {
		System.out.println(OneToMany.inputperson_outputmobiles());

	}
}

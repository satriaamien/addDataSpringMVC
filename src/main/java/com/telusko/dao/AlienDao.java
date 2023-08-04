package com.telusko.dao;
import java.sql.*;

import com.telusko.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int id, String nama, String kelas){
		Alien a = new Alien();		
//		a.setId(909);
//		a.setNama("sam");
//		a.setKelas("XII");
//		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sammy","root","admin");
			Statement st = con.createStatement();
			
//			ResultSet rs = st.executeQuery("select * from tambah where id="+id);
//			if (rs.next()) {
//			a.setId(rs.getInt("id"));
//			a.setNama(rs.getString("nama"));
//			a.setKelas(rs.getString("kelas"));
			
			System.out.println("nama"+nama);
			System.out.println("id"+id);
			System.out.println("kelas"+kelas);
		
			String sql = "insert into tambah(id,nama,kelas) values('"+id+"','"+nama+"','"+kelas+"')"; 

			
//			Class.forName("com.mysql.jdbc.Driver"); 
//		      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kampus", "root", ""); 
//		      Statement st=conn.createStatement(); 
		    st.executeUpdate("insert into tambah(id,nama,kelas) values('"+id+"','"+nama+"','"+kelas+"')");
			
			
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1,id);
//			ps.setString(2, nama);
//			ps.setString(3, kelas);
//			
//			ps.execute();
//			con.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("error");
		}
		return a;
	}
}

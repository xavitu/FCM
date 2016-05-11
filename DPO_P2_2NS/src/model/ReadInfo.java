package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.utils.ConectorDB;
import com.db.utils.Config;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;



public class ReadInfo {
	
	public static Config carregaDades (){

		Scanner scanner;
		String info = "";
		Gson gson = new GsonBuilder().create();
		Config config;
	
		try {
			scanner = new Scanner(new FileReader("configuration.json"));
			while (scanner.hasNext()) {
				info = info + scanner.nextLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		JsonObject objecte = (JsonObject) gson.fromJson(info, JsonObject.class);
		JsonObject configuration = objecte.get("configuration").getAsJsonObject();
		
		int port = configuration.get("port").getAsInt();
		String ip = configuration.get("ip").getAsString();
		String nombbdd = configuration.get("nombbdd").getAsString();
		String user = configuration.get("user").getAsString();
		String password = configuration.get("password").getAsString();
		int portAvio = configuration.get("portAvio").getAsInt();
		int portClient = configuration.get("portClient").getAsInt();
		
		
		
		config = new Config (port,ip,nombbdd,user,password,portAvio,portClient);
		return config;
			
	}
	
	public static ArrayList<Object[]> ompleInfoAeroports(ConectorDB conn){
		Object a,b,c;
		a =  new Object();
		b =  new Object();
		c =  new Object();
		ArrayList<Object[]> infoaeroports = new ArrayList<Object[]>();
		ResultSet rs = conn.selectQuery("SELECT * FROM aeroport");
	try{
		while (rs.next()){
			a = rs.getObject("id_aerop");
			b = rs.getObject("nom_aerop");
			c = rs.getObject("coord");
			Object[] info = new Object[]{a,b,c};
			infoaeroports.add(info);
		}
		
		
		rs.close();
		return infoaeroports;
	}
	catch ( SQLException err) { err.printStackTrace();  }
	return null;
	}
	
	public static ArrayList<Object[]> ompleInfoVols(ConectorDB conn){
		Object a,b,c,d,e,f,g;
		a =  new Object();
		b =  new Object();
		c =  new Object();
		d =  new Object();
		e =  new Object();
		f =  new Object();
		g =  new Object();
		ArrayList<Object[]> infovols = new ArrayList<Object[]>();
		ResultSet rs = conn.selectQuery("SELECT * FROM vol");
	try{
		while (rs.next()){
			a = rs.getObject("id_vol");
			b = rs.getObject("data");
			c = rs.getObject("duracio");
			d = rs.getObject("retard");
			e = rs.getObject("estat");
			f = rs.getObject("origen");
			g = rs.getObject("desti");
			
			Object[] info = new Object[]{a,b,c,d,e,f,g};
			infovols.add(info);
		}
		
		
		rs.close();
		return infovols;
	}
	catch ( SQLException err) { err.printStackTrace();  }
	return null;
	}
	
	public static ArrayList<Object[]> ompleInfoAvions(ConectorDB conn){
		Object a,b,c,d,e,f,g;
		a =  new Object();
		b =  new Object();
		c =  new Object();
		d =  new Object();
		ArrayList<Object[]> infoavions = new ArrayList<Object[]>();
		ResultSet rs = conn.selectQuery("SELECT * FROM avio");
	try{
		while (rs.next()){
			a = rs.getObject("id_avio");
			b = rs.getObject("model");
			c = rs.getObject("capacitat");
			d = rs.getObject("altura_max");
			
			Object[] info = new Object[]{a,b,c,d};
			infoavions.add(info);
		}
		
		
		rs.close();
		return infoavions;
	}
	catch ( SQLException err) { err.printStackTrace();  }
	return null;
	}
	
	

}

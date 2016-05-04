package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

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

}

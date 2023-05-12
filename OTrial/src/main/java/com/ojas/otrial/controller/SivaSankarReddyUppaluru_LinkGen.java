package com.ojas.otrial.controller;



import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/linkgen")
public class SivaSankarReddyUppaluru_LinkGen {
	
//	private String ip = InetAddress.getLoopbackAddress().getHostAddress();
	
	
	
	@GetMapping("/welcome")
	public String dispaly() throws UnknownHostException {
		
		String ip = InetAddress.getLocalHost().getHostAddress();
		
		JSONObject obj = new JSONObject();
		JSONObject data = new JSONObject();
		
		
		
		for(int i=1;i<=3;i++) {
			data.put("m"+i,"http://"+ ip +":"+8080 +"/api/linkgen/welcome/"+encode(i));
		}
		
//		data.put("m1","http://192.168.6.170:8080/api/linkgen/welcome/1");
//		data.put("m2","http://192.168.6.170:8080/api/linkgen/welcome/2");
//		data.put("m3","http://192.168.6.170:8080/api/linkgen/welcome/3");
		
		
		
		obj.put("message", "Welcome User");
		obj.put("menu", data);
	String data1=obj.toString();
		return  data1;
		
	}
	@GetMapping("/welcome/{number}")
	public Map getData(@PathVariable("number") String number) {
		
		String num=number;
		int size = num.length();
		int halfNumber = size / 2;
		
		String middileNumber = num.substring(halfNumber, halfNumber+1);
		
		Map<String,String> map=new HashMap<>();
		
		map.put("Result", middileNumber);
		
		return map;
		
	}
	
	
	public String encode( int number) {
     
		String name="siva";
		int size = name.length();
		int halfNumber = size / 2;

		String halfString = name.substring(0, halfNumber);
		String secondHalf = name.substring(halfNumber, size);

		Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
		dictionary.put('a', 20);
		dictionary.put('b', 21);
		dictionary.put('c', 22);
		dictionary.put('d', 23);
		dictionary.put('e', 24);
		dictionary.put('f', 25);
		dictionary.put('g', 26);
		dictionary.put('h', 27);
		dictionary.put('i', 28);
		dictionary.put('j', 29);
		dictionary.put('k', 30);
		dictionary.put('l', 31);
		dictionary.put('m', 32);
		dictionary.put('n', 33);
		dictionary.put('o', 34);
		dictionary.put('p', 35);
		dictionary.put('q', 36);
		dictionary.put('r', 37);
		dictionary.put('s', 38);
		dictionary.put('t', 39);
		dictionary.put('u', 40);
		dictionary.put('v', 41);
		dictionary.put('w', 42);
		dictionary.put('x', 43);
		dictionary.put('y', 44);
		dictionary.put('z', 45);
		dictionary.put('A', 46);
		dictionary.put('B', 47);
		dictionary.put('C', 48);
		dictionary.put('D', 49);
		dictionary.put('E', 50);
		dictionary.put('F', 51);
		dictionary.put('G', 52);
		dictionary.put('H', 53);
		dictionary.put('I', 54);
		dictionary.put('J', 55);
		dictionary.put('K', 56);
		dictionary.put('L', 57);
		dictionary.put('M', 58);
		dictionary.put('N', 59);
		dictionary.put('O', 60);
		dictionary.put('P', 61);
		dictionary.put('Q', 62);
		dictionary.put('R', 63);
		dictionary.put('S', 64);
		dictionary.put('T', 65);
		dictionary.put('U', 66);
		dictionary.put('V', 67);
		dictionary.put('W', 68);
		dictionary.put('X', 69);
		dictionary.put('Y', 70);
		dictionary.put('Z', 71);
		
		

		char[] fristString = halfString.toCharArray();

		String numbers = "";

		for (int i = 0; i < fristString.length; i++) {
			System.out.print(fristString[i]);
			System.out.println(dictionary.get(fristString[i]));
			Object value = dictionary.get(fristString[i]);
			String num = value.toString();
			numbers = numbers + num;
			System.out.println(numbers);
		}

		char[] secondString = secondHalf.toCharArray();

		String numbers2 = "";

		for (int i = 0; i < secondString.length; i++) {
			System.out.print(secondString[i]);
			Object value = dictionary.get(secondString[i]);
			String num = value.toString();
			numbers2 = numbers2 + num;
			System.out.println(numbers2);
		}
		
		return numbers+number+numbers2;
	}

}



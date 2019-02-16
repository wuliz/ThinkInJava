package com.wlz.java.chapterSeventeen_Container;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	public static String GetValueByKey(String filePath, String key) {
		Properties pps = new Properties();

		try {
			BufferedInputStream in = new BufferedInputStream(
					new FileInputStream(filePath));
			pps.load(in);// 加载输入流的所有kv对
			String value = pps.getProperty(key);
			return value;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	// 读取Properties的所有信息
	public static void GetAllProperties(String filePath) throws IOException {
		Properties pps = new Properties();
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				filePath));
		pps.load(in);
		Enumeration<Object> en = pps.keys();
		/*while (en.hasMoreElements()) {
			String strKey = (String) en.nextElement();
			String strvalue = pps.getProperty(strKey);
			System.out.println(strKey + "=" + strvalue);
		}
		*/
	
		Set<Object> keySet = pps.keySet();
		for(Object s:keySet){
			String key=(String)s;
			String value=pps.getProperty(key);
			System.out.println(key + "=" + value);
		}
	}
	//写入Properties信息
	public static void WriteProperties(String filePath,String pKey,String pValue) throws IOException{
		File f = new File(filePath);
		if(!f.exists()){
			f.createNewFile();
		}
		Properties pps = new Properties();
		FileInputStream in = new FileInputStream(filePath);
		//从输入流中读取属性列表
		pps.load(in);
		//调用hashmap的put方法
		FileOutputStream out = new FileOutputStream(filePath);
		pps.setProperty(pKey, pValue);
		pps.store(out, "update"+pKey+"name");
		out.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//写入Properties文件
		System.out.println("写入Properties文件");
		WriteProperties("Test.properties","address","111111");
		
		//
		System.out.println("得到所有键值对");
		GetAllProperties("Test.properties");
		//
		System.out.println("得到相应键的值");
		String value = GetValueByKey("Test.properties","address");
		System.out.println(value);
	}

}

package com.wlz.java.chapterNight_interface;

import java.io.InputStream;
import java.util.Scanner;

public class Test01 {
public static void main(String[] args){
	/*
	 * ��̬��ʵ���˽ӿ���ʵ�ֵ�һ�ַ�ʽ
	 * �ӿں��ڲ����ṩ��һ�ֽ��ӿ���ʵ�ַ���ĸ��ӽṹ���ķ�ʽ
	 */
	/*
	 * 1��������ͳ��󷽷�:�ǽӿں����һ����ӹ֮��
	 * �ڵڰ����У�Instrument�౾����ûʲô���壬ֻҪΪ�˸����ĵ������ṩһ��ͨ�ýӿ�
	 * ͨ�ýӿڽ���һ�ֻ�����ʽ�����α�ʾ���е�����Ĺ��в��֣���һ��˵���ǽ�Instrment��Ϊ������࣬��Ƴ�����
	 * ��Instrment�Ķ������û�����壬��ֻ�Ǳ�ʾһ���ӿڣ���ʵ���Բ���Ҫ��ʵ������
	 * Instrment�Ķ���û�����壬Java�ṩ��һ�ֻ��ƿ�����ֹ���������Ķ���
	 * ���󷽷�������������û�к����� public abstract void name();
	 * ���һ�������һ���������󷽷�����������޶�Ϊ�����ࣨ����������ᱨ����
	 * ���һ�����ǳ����࣬���ܴ������󣨱������ᱨ����
	 * ��������������ṩ�ӿ�
	 * ���һ����̳г����࣬����ʵ�ֳ��󷽷������������Ҳ�ǳ�����
	 * abstract�ؼ��ʵ�ʹ��
	 * ��дInstument(ʾ����Music4.java)
	 * 
	 */
	/*
	 * 2���ӿڣ�interface
	 * abstract�ؼ����������������д���һ�������ĳ��󷽷����ṩ�ӿڲ���
	 * interface��һ����ȫ������࣬û���ṩ�κε�ʵ��
	 * ʵ�ֽӿڵ��࿴�������ͽӿ�һ����ʵ�ֽӿڵ���Ҳ��������ת�ͣ�
	 * �ӿ��еķ�����public�ģ�Ĭ��public
	 * �ӿ�ֻҪ�����ͳ��󷽷�
	 * ʵ�ֽӿڵ��������ʵ�ֳ��󷽷�������Ҳ������չ��������
	 */
	
	/*
	 * 3����ȫ����
	 * ֻҪһ������������������ǽӿڣ���ô���ֻ��ʹ������༰�����ࡣ������뽫�������Ӧ�õ����ټ̳нṹ�ľͲ���
	 * �ӿڿ��Էſ���һҪ��
	 */
	
	/*
	 * 4��Java�еö��ؼ̳�
	 * �ýӿ�ʵ�ֶ��ؼ̳�
	 * ������ֻ�ܼ̳�һ�����࣬������ʵ�ֶ���ӿ�
	 * ������ͽӿڵ�ѡ��
	 * 
	 */
	
	/*
	 * 5��ͨ���̳���չ�ӿ�
	 * ʾ������HorrorSHow�ࣩ
	 * һ���ӿڿ��Լ̳�һ���ӿ�����һ���½ӿ�
	 * һ�������ʵ�ֶ���ӿڲ��̳�һ����
	 * ֻҪ���ǽӿڵ�ʵ�־Ϳ���ʹ������ת��
	 * ���ʱ���ֳ�ͻ:
	 * �����һ���ӿں�һ����������ͬ�ķ��������ܱ�ͬʱ�̳к�ʵ�֣�
	 * ����������ӿ�������ͬ�ķ�����ʵ�ַ���ʱ��ֻʵ������һ����
	 */
	/*
	 * 6������ӿ�
	 * Scanner ��Ĺ�����public Scanner(InputStream source) ���յ���һ���ӿ����ͣ����캯�����ص���һ��InputStreamReader����InputStreamReader����������һ��InputStream����
	 */
	
	/*
	 * 7\�ӿ��е���
	 * �ӿ��е������Զ�static��final��
	 * ����Զ���һ����������࣬�������⣬Ҳ����ʹ��enum
	 * ʾ����Month��
	 * 7.1��ʼ���ӿ��е���
	 * �ӿڵ���һֱ�洢�ڽӿڵľ�̬�洢���У�����ı�
	 * ʾ����RandVals���TestRandVals�ࣩ
	 */
	int x=Month.APRIL;
	//Month.FEBRUARY=4;//The final field Month.FEBRUARY cannot be assigned
	
	/*
	 * 8��Ƕ�׽ӿڣ��ӿڿ���Ƕ�����������ӿ��У�
	 */
	
	/*
	 * 9���ӿ��빤��
	 * �ӿ���ʵ�ֶ��ؼ̳е���Ҫ;��
	 * ����ģʽ��ʾ��:Factories\Games��
	 * 
	 */
}
}
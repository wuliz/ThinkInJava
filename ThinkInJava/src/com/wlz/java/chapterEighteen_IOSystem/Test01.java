package com.wlz.java.chapterEighteen_IOSystem;

public class Test01 {
	/*
	 * 1��File�� File����ĵ����ڴ������ļ��Ĵ洢. File����������һ���ļ����ļ��С����ļ���Ҳ���Գ�ΪĿ¼��
	 * �ļ������ܶ����Ϣ:���ļ����������޸�ʱ�䡢��С���ɶ���д���Եȡ� ʾ����FileTest.java��
	 * �ļ����������Է��ʡ��ļ��ƶ��Ȼ�������
	 */

	/*
	 * 2��Ŀ¼ʵ�ù���ʾ����Directory.java��
	 */

	/*
	 * 2���������� ��Java���Զ����������ר�Ÿ�����ַ�ʽ����������������Щ�඼������java.io���С����У�
	 * �����������඼�ǳ�����InputStream(�ֽ�������)�����߳�����Reader(�ַ�������)�����ࣻ
	 * ��������������ǳ�����OutputStream(�ֽ������)����Writer(�ַ������)�����ࡣ
	 * ��������Ҫ���׵��ǣ����Ǹ�ʲô�ģ�������Ϊ�������Եı������ݣ� ������������Ĳ�ͬ��Ϊ��������������� ���ݴ����������͵Ĳ�ͬ��Ϊ�ַ������ֽ�����
	 * �� ��Ȼ����Ҫ���׵�������ģʽ�����ģʽ��˭����˭��
	 * InputStream(�ֽ�������)��Reader(�ַ�������)ͨ�׵���ⶼ�Ƕ���read���ġ�
	 * OutputStream(�ֽ������)��Writer(�ַ������)ͨ�׵���ⶼ��д(writer)�ġ� ��
	 */
	
	/*
	 * javaIO��
	 * �ļ�ϵͳ��Javaϵͳ������ϵͳ
	 * Java��д�ļ���ֻ��������������ʽ���ж�д
	 * Java.io����
	 * �ڵ��ֱࣺ�Ӷ��ļ����ж�д
	 * ��װ�ࣺת���ࣨ�ֽڡ��ַ����������͵�ת���ࣩ��װ���ࣨװ�νڵ���Buffer����������
	 * ע�⣺���ļ���Java������ƽ�е�ϵͳ�������ļ����ܴܺ�Java����һ�������ļ������ص��ڴ棬ֻ����������ʽ������ȡ��
	 * 
	 * Java�е���������������֮��
	 * �ļ��е�����ֻ���ֽڱ���
	 * ��˳��򽫱仯���浽�ļ���Ҫת��
	 * �ڵ��ֱࣺ�Ӳ����ļ���
	 * InputStream�� OutputStream�����ֽڣ�
	 * .FileInputStream��FileOutputStram��
	 * Reader��Writer(�ַ�)
	 * .FileReader��.FileWriter
	 * �ֽڵ�����Stream��β���ַ���һ����er��β
	 * ת���ࣺ�ַ����ֽ�֮���ת��
	 * InputStreamReader:�ļ���ȡ�ֽڣ�ת��ΪJava�������ַ���4���ֽ�תΪint��
	 * OutputStreamWrite:Java���ַ�ת��Ϊ�ֽ����뵽�ļ���
	 * װ���ࣺװ�νڵ���
	 * DataInputStream��DataOutputStream :��װ����������
	 * BufferedInputStream,BufferOutputStream:�����ֽ�����Ӳ�̵Ķ�ȡ�ļ��ٶȺ�������cpu�п��ٻ���������߶�ȡ�ٶȣ�
	 * 
	 * BufferedReader,BufferedWriter:�����ַ���
	 */
	
	/*
	 * �ı��ļ���д
	 * 1���ļ����ͣ�
	 * -һ���ı��ļ����������ַ����ɵ��ļ�������txt��
	 * -һ��������ļ����������ļ�dat
	 * -�������ʽ���ı��ļ�����xml
	 * -�������ʽ�Ķ������ļ�����doc,ppt��
	 * 2���ļ������ݵ�һ������
	 * 3���ļ����Դ�Ŵ���������
	 * 4���ļ��ܴ�ע��Javaֻ����������ʽ���δ���
	 * 
	 */
	/*
	 * ��Java�Ƕ�����д����
	 * -��������ݴ�Java���ļ��У�д����
	 * -���룺���ݴ��ļ���Java�У�������
	 * 
	 */
	/*
	 * д�ļ�
	 * -�ȴ����ļ���д�����ݣ��ر��ļ�
	 * -FileOutputStream(���ļ�д�ֽ�),OutPutStreamWriter���ֽں��ַ���ת����,BufferedWriter��д�������࣬����д������
	 *-	BufferWriter
	 *==write
	 *==newLine
	 *-try resource��䣬�Զ��ر���Դ������ļ�û�йرգ���������д���ݣ�
	 *-�ر���������������������������� ���������ر�
	 *ʾ����TxtFileWrite.java��
	 */
	/*
	 * ���ļ�
	 * -�ȴ��ļ������ж������ݣ��ر��ļ�
	 * -FileInputStream.InputStreamReader,BufferedReader
	 * -BufferedReader
	 * .readline
	 * -try resource��䣬�Զ��ر���Դ
	 * -�ر���������������������������е��������ر�
	 * �鿴����TxtFileRead.java
	 */
	
	/*
	 * �������ļ���д
	 * �����Ͻ����������ļ��������ֽڱ��룬���ַ�������ļ���
	 * �����Ͻ���һ���ļ����Ƕ������ļ�
	 * �ü��±��޷���/�Ķ�
	 * �������ļ��Ķ�д
	 * -������ݵ��ļ���
	 * -���ļ��ж�ȡ����
	 */
	/*
	 * д�ļ�
	 * -�����ļ���д�����ݡ��ر��ļ�
	 * -FileOutputStream��BufferedOutputStream,DataOutputStream
	 * -DataOutputStrream
	 * .flush
	 * .write/writeBoolean/writeByte/writeChars/writeDouble/writeInt/WriteUTF
	 * try-resource��䣬�Զ��ر���Դ
	 * ʾ����BinFileWrite.java��
	 */
	/*
	 * ���ļ�
	 * -�ȴ��ļ����������ݣ��ر��ļ�
	 * -FileInputStream,BufferredInputStream,DataInputStream 
	 * -DataInputStream 
	 * .read/readBoolean/readChar/readDouble/readFloat/readInt/readUTF
	 * try resource��ʹ��
	 * ʾ����BinFileRead.java��
	 */
	/*
	 * ���ڵ��࣬ת�����װ����
	 *��д��˳��Ҫһ��
	 *����ʹ��try resource�ر���Դ�ļ�
	 */
	
	/*
	 * zip�ļ��Ķ�д
	 * ѹ������zip,rar,gz
	 * java zip��֧��Zip��Gzip����ѹ���ͽ�ѹ
	 * zip�ļ������ࣺJava��util.zip����
	 * -java.io.inputStream��java.io.outputStream������
	 * -ZipInputStream,ZipOutputStreamѹ���ļ�����/�����
	 * -ZipEntryѹ����
	 * 
	 * 
	 * ѹ��
	 * ����/���ѹ��
	 * -�����zip�ļ�
	 * -���һ��zipEntry��ѹ�����ڵ�һ���ļ���
	 * -��һ�������ļ��������ݣ���ZIpEntryд���ݣ��ر������ļ�
	 * -�ظ������������裬д�����ļ���zip�ļ���
	 * �ر�zip�ļ�
	 * �鿴SimpleFileZip.java��MultiplyFileZip.java
	 */
	
	/*
	 * ��ѹ
	 * ����/�����ѹ
	 * �������zip�ļ�
	 * ��ȡ��һ��zipEntry
	 * �½�һ��Ŀ���ļ�����ZipEntry��ȡ���ݣ���Ŀ���ļ�д������
	 * �ر�Ŀ���ļ�
	 * �ظ������������裬��zip���ж�ȡ���ݵ����Ŀ���ļ�
	 * �ر�zip�ļ�
	 * �鿴SingleFileUnzip.java��MultipleFileUnzip.java
	 */
	static int $=11;
	public static void main(String args[]){
		System.out.println($);
	}
	
}

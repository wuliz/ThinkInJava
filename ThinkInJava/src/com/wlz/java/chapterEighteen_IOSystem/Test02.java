package com.wlz.java.chapterEighteen_IOSystem;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1��File�ࣺ�ļ����ļ�Ŀ¼
		/*
		 * �ļ����ԣ��ļ�Ŀ¼������Ŀ¼���ƶ�Ŀ¼
		 */
		
		/*
		 * 2����������
		 * ���룺InputStream��Reader �������඼��read������������ȡ�����ֽڻ��ֽ�����
		 * �����OutputStream��Writer �������඼��write��������������д�����ֽڻ�����
		 * 
		 * 2.1InputStream����
		 * InputStream�������Ǳ�ʾ��Щ�Ӳ�ͬ����Դ�������࣬��Щ���ݰ�����
		 * �ֽ�����
		 * String����
		 * �ļ�
		 * �ܵ���һ������һ�����
		 * һ�������������������������
		 * ��������Դ
		 * ÿһ������Դ��Ӧһ��InputStream�����࣬����FilterInputStreamҲ��InputStream�Ļ���
		 * ByteArrayInputStream:�����ڴ滺��������InputStreamʹ�ã�
		 * StringBufferInputStream:��Stringת����InputStream(�ײ�ʵ��StringBuffer)
		 * FileInputStream:���ڴ��ļ���ȡ��Ϣ
		 * PipedInputStream:ʵ�ֹܵ�������
		 * SequenceInputStream,����������InputStreamת���ɵ�һ��Stream����
		 * FilterInputStream:�b�����Ϊ����InputStream�ṩ���ù���
		 */
		/*
		 * 2.2OutputStream
		 * ����������ȥ����Ŀ��
		 * ByteArrayOutputStream:���ڴ洴����������������û�����
		 * FileOutputStream:����Ϣ�洢���ļ�
		 * PipedOutputStream:�ܵ���
		 * FilterOutputStream:�����࣬�b���
		 */
		/*
		 * 3��������Ժ����õĽӿ�
		 * FilterOutputStream��Ϊװ�����ýӿڣ�JavaIo�����ԭ����ǣ�������Ҫ��������࣬���ܵõ�����ϣ���ĵ���I/O����
		 * FilterInputStream��FilterOutputStream�����ṩ�b�����ӿ��Կ���inputStream��OutputStream
		 * 
		 * 3.1ͨ��FilterInputStream��InputStream��ȡ����
		 * DataInputStram��DataOutputStream���Զ�ȡ�������ͺ�String�������ǿ���ͨ�����������������ʹ�һ���ط�Ǩ�Ƶ���һ���ط�
		 */
		
		/*
		 * 4��Reader��writer
		 * InputStream��OutputStream�����ֽ�
		 * Reader��writer�����ַ�
		 * InputStreamReader���԰�InputStream��8λ��ת����Reader��16λ ��
		 * OutputStreamWriter���԰�OutputStreamת����Writer
		 */
		
		/*
		 * 6��IO���ĵ���ʹ�÷�ʽ
		 * 6.1���������ļ�
		 * 6.2���ڴ�����
		 * ʾ����BufferedInputFile.java��
		 * 6.3��ʽ�����ڴ�����
		 * ��ȡ��ʽ�����ݣ�����ʹ��DataInputStream,�����ֽڵģ����ǿ�����InputStream���ֽڵ���ʽ��ȡ�κ�����
		 * 6.4�����ļ����
		 * FileWriter�������ļ�д�����ݣ�������ͨ����ʹ��BufferedWriter�����װ�������Ի������
		 * 6.5�洢�ͻָ�����
		 * ʾ����StoringAndRecover.java��
		 * 6.7�ܵ���
		 * PipedInputStream PipedOutputStream PipedReader PipedWriter
		 */
		
		/*
		 * 7�ļ���д��ʵ�ù���
		 * 
		 */
		
		/*
		 * 8��׼IO
		 * ʾ������׼��������Echo.java��
		 */
		/*
		 * 10����I/O
		 * 
		 */
		
		/*
		 * 12���������л�
		 * ObjectInputStream
		 * ObjectOutputStream
		 * �����󱣴��ڳ�����������֮��
		 * 
		 */
		/*
		 * 13��XML
		 * ����Ƕ������л�����ֻ����Java�н����ʹ洢�����Խ�����ת����XML
		 * ͨ��XOM ��������ת��ΪXML��Element�����Person����
		 */
		
	}

}

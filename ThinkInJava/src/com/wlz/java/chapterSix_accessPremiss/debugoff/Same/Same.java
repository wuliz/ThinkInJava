package com.wlz.java.chapterSix_accessPremiss.debugoff.Same;

import com.wlz.java.chapterSix_accessPremiss.debug.PC1;

class PCson extends PC1{
	
}
public class Same {
	public static void main(String[] args) {
		//���PC1��Ĺ���������public����Ȩ�ޣ��������������д����������
		//PC1 pc1 = new PC1();����������
		//System.out.print(pc1.x);//Ȣ����x,��Ϊx�ǰ�����Ȩ��
		
		PCson p=new PCson();
		//System.out.println(p.x+" "+p.y);//���ܷ���x,��Ϊx�ǰ�����Ȩ�ޣ���ͬ���̳�ʱ����ֱ�Ӱ�����Ȩ�޵ĳ�Ա
	}
}

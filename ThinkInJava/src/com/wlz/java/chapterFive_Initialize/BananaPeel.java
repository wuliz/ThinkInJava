package com.wlz.java.chapterFive_Initialize;
class Banan{
	void peel(int i){
		
	}
}
class Aprioc{
	void pick(){
		
	}
	void pit(){
		//�������this
		pick();
	}
}

class Left{
	int i;
	Left comment(){
		i++;
		//��Ҫ���ص�ǰ���������
		return this;
	}
	void print(){
		System.out.println(i);
	}
}

public class BananaPeel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banan a=new Banan(),
			b=new Banan();
		a.peel(1);
		b.peel(2);
		
		//���ֻ��һ��peel�������������֪���Ǳ�˭���õ���
		//������Ϣ�����󣬱������ڲ����������Ĺ���
		//Banan(a,1)
		//Banan(b,1)
		//�������ڲ����Ĵ������ǲ���ֱ��������
		
		//������ϣ����ȡ��ǰ��������ã���һ��ר�ŵĹؼ��� this(��ʾ���÷������Ǹ�����)
		//�����ڲ����õ�ǰ�����һ�������������this,���������Զ���ӣ�ֻ����ȷ��Ҫָ��this�����ʱ����ʹ��
		Left l=new Left();
		//���ڷ��ص�ǰ��������ã����Կ���һֱִ�и���ķ���
		l.comment().comment().comment().print();//3
	}

}

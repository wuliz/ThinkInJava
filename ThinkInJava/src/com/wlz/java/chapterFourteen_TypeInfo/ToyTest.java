package com.wlz.java.chapterFourteen_TypeInfo;
interface HasBatteries{
	
}
interface Waterproof{
	
}
interface Shoots{
	
}
class Toy{
	Toy(){
		
	}
	Toy(int i){
		
	}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
	FancyToy(){
		super(1);
	}
}
public class ToyTest {
static void printInfo(Class cc){
	//�õ�ȫ�����Ǹ�
	System.out.println("Class name:"+cc.getName()+" is interface?["+cc.isInterface()+"]");
	//�õ�����
	System.out.println("Simple name:"+cc.getSimpleName());
	//
	System.out.println("Canonical name:"+cc.getCanonicalName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c=null;
		try {
			c=Class.forName("com.wlz.java.chapterFourteen_TypeInfo.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("can't find FancyToy");
			System.exit(1);
		}
		
		printInfo(c);
		//�õ����еĽӿ�����
		for(Class face:c.getInterfaces()){
			printInfo(face);
		}
		//�õ���������
		Class up=c.getSuperclass();
		Object obj=null;
		try {
			//����һ��Toy�Ķ���ʹ��newInstance()�����Ķ��󣬱�����һ��Ĭ�Ϲ�����
			obj=up.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
						System.out.println("can't instantiate");
						System.exit(1);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
						System.out.println("cannot access");
						System.exit(1);
		}
		printInfo(obj.getClass());
		
	}

}

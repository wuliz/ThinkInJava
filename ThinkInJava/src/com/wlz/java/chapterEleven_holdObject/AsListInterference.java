package com.wlz.java.chapterEleven_holdObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow{
	
}
class Powder extends Snow{
	
}
class Light extends Powder{
	
}
class Heavy extends Powder{
	
}
class Slush extends Snow{
	
}
class Crusty extends Snow{
	
}
public class AsListInterference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Snow> snow1=Arrays.asList(new Crusty(),new Slush(),new Powder());
		//List<Snow> snow2=Arrays.asList(new Light(),new Heavy());����������
		//������ֻ���ҵ�Powder�����ҵ�Snow
		List<Snow> snow3=new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(),new Heavy());
		//�����ʾ���Ͳ�������
		List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
		
	}

}

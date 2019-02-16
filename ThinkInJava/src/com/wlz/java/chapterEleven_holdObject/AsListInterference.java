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
		//List<Snow> snow2=Arrays.asList(new Light(),new Heavy());编译器错误
		//编译器只能找到Powder不能找到Snow
		List<Snow> snow3=new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(),new Heavy());
		//添加显示类型参数声明
		List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
		
	}

}

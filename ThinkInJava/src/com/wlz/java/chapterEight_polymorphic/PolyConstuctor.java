package com.wlz.java.chapterEight_polymorphic;

//字形类
class Glyph {
	void draw() {
		System.out.println("Glyp.draw()");

	}

	Glyph() {
		System.out.println("GLyph before draw");
		draw();
		System.out.println("Glyph after draw");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	private String str="11111";
	boolean b=true;
	RoundGlyph(int r) {
		this.radius = r;
		System.out.println("RoundGlyph.RoundGlpyh().radius=" );
	}

	void draw() {
		System.out.println("RoundGlpyh.draw().radius" + radius+ this.radius+this.str+this.b);
	}
}

public class PolyConstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
		/*
		 * GLyph before draw 
		 * RoundGlpyh.draw().radius0
		 *  Glyph after draw
		 * RoundGlyph.RoundGlpyh().radius=5
		 *如果在基类调用函数，无法确认函数是具体那个类调用：扩展 类覆盖基类方法
		 *在给对象分配空间时，先会将空间清理(基本类型为默认值，引用类型为null)
		 */
	}

}

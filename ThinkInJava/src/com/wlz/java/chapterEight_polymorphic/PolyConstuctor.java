package com.wlz.java.chapterEight_polymorphic;

//������
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
		 *����ڻ�����ú������޷�ȷ�Ϻ����Ǿ����Ǹ�����ã���չ �า�ǻ��෽��
		 *�ڸ��������ռ�ʱ���ȻὫ�ռ�����(��������ΪĬ��ֵ����������Ϊnull)
		 */
	}

}

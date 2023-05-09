package GAME;

import java.awt.Color;

import javax.swing.JOptionPane;

public class BackGround {
	
	public static Color textColor = new Color(85, 85, 85);
	public static Color trajectory = new Color(255, 255, 255,125);
	 Color color = new Color(255,240,0);
	void switchColor() {
		int random=(int) (1+Math.random()*(5-1+1));
//		System.out.println(random);
		switch (random) {
		
		case 1:color =new Color(119, 197, 245);break;//Çà
		case 2:color =new Color(52, 120, 246);break;//À¶
		case 3:color =new Color(163, 87, 215);break;//×Ï
		case 4:color =new Color(101, 196, 102);break;//ÂÌ
		case 5:color = new Color(0, 0, 0);break;//ºÚ
		
		}
		
	}
}

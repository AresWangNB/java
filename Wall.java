package GAME;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Wall {
	
    public void draw(Graphics g) {
    	if(Data.LevelNum==0) {
//		»­Ç½
		g.setColor(Data.Wall);
		g.fillRect( Data.wallX,Data.wallY,700,30);
		g.setColor(BackGround.textColor);
		g.setFont(new Font("111",Font.BOLD,30));
		g.drawString("TAP TO START", Data.wallX+100, Data.wallY+25);	
    	}else {
//		»­Ç½
		g.setColor(Data.Wall);
		g.fillRect( Data.wallX,Data.wallY,700,30);
		//Ð´×Ö
    	String show =  Integer.toString(Data.LevelNum);
    	g.setColor(BackGround.textColor);
		g.setFont(new Font("111",Font.BOLD,30));
		g.drawString(show, Data.wallX+210, Data.wallY+25);		
		//¸¨ÖúÏß
//		g.setColor(Color.red);
//		g.drawLine(0, 350, 450, 350);
//		g.drawLine(225, 0, 225, 700);
//		g.setColor(Color.green);
//		g.drawLine(205, 0, 205, 700);
//		g.drawLine(245, 0, 245, 700);
    	}

    }

}

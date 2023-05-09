package GAME;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ball {
	int initY = 550;
	int x;//坐标
	int y;
	int h;//范围
	int w;
	int speed = 1;
	int diameter = 40;//尺寸
	int tx1=100,tx2,tx3=100,tx4,ty1,ty2;//拖尾梯形�??
	int twxCut = 1; 
	public Ball() throws IOException {
		x = 205;
		y = 550;
		
	}
	public void Dash() {
		this.y = y-10-speed;
		speed ++;
		trajectory();
	}
	int getX() {
		return this.x;
	}
	int getY() {
		return this.y;
	}
	public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, diameter, diameter); // 绘制小球
      //轨迹拖尾
        
        g.setColor(BackGround.trajectory);
        g.fillPolygon(new int[] {x+twxCut,  x+40-twxCut,  x+40,x}, 
        		
        		new int[] {610,  610,  y+60, y+60}, 4);
    }
	void reset(){
		this.y = 550;
		
//		this.y = y+30;
	}
	void trajectory() {
		
		this.twxCut++;
	}


}

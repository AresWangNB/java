package GAME;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.Timer;
public class Level {
		int y = 0;//默认位置
	    int x =0;
	    int interval = 120;//默认间距
	    public void draw(Graphics g) {
	    	
	    } // 绘制方法
	    public void drawLeft(Graphics g) {
	    	
	    } // 分开绘制方法
	    public void drawLeft2(Graphics g) {
	    	
	    } // 分开绘制方法
	    public void drawRight(Graphics g) {
	    	
	    } // 分开绘制方法
	    public void drawRight2(Graphics g) {
	    	
	    } // 分开绘制方法
	    public boolean checkCollision(int ballX, int ballY, float angle) { return false; } // 碰撞检测方法
	    
}

class Level0 extends Level { // 第0关


}
class Level1 extends Level { // 第一关
	   public void draw(Graphics g) { // 绘制方法
	    	
	    	Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(4));
	    	g.setColor(Color.white);
	        g.drawRect(-90,-50,30,100);
	        g.drawRect(60,-50,30, 100);
//	        g.setColor(Color.blue);
//			g.drawLine(-90,50,90,-50);
//			g.drawLine(-90,-50,90,50);

	        
	    }
	    }
	

	



class Level2 extends Level { // 第二关

    public void draw(Graphics g) { // 绘制方法
    	
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
        g.drawRect(-90,-50,30,100);
        g.drawRect(60,-50,30, 100);
//        g.setColor(Color.blue);
//		g.drawLine(-90,50,90,-50);
//		g.drawLine(-90,-50,90,50);

        
    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//    	 return false; // 判断小球是否在圆形内有效度数113
        return (angle>=32&&angle<=145)||(angle>=212&&angle<=325); // 判断小球是否在圆形内有效度数113
    }
}
class Level3 extends Level { // 第3关
    public void draw(Graphics g) { // 绘制方法
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
        g.drawArc(-130, -90, 200, 200, -40, 90); 
        g.drawArc(-65, -90, 200, 200, 130, 90);
        
//        g.setColor(Color.blue);
//        g.drawLine(-90,50,90,-50);
//		g.drawLine(-90,-50,90,50);
    	/****drawArc(int x,int y,int width 
        ,int height,int startAngle,int arcAngle)
        x,y代表坐标  width,height代表弧要画的宽度与高度
        startAngle代表开始以哪个角度画起,arcAngle以startAngle为基础,横跨的角度
        ****/
    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//   	 return false; 
       return (angle>=20&&angle<=160)||(angle>=190&&angle<=346); // 判断小球是否在圆形内有效度数113
   }
//   
    
}
class Level4 extends Level { // 第4关
    public void drawLeft(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
        g.setColor(Color.blue);
//		g.drawLine(-90,50,90,-50);
//		g.drawLine(-90,-50,90,50);
//    	g2d.fillOval(-2, -70, 10, 10);
    	g.setColor(Color.white);

//        g.drawRect(-90,-50,30,100);
//        g.drawRect(60,-50,30, 100);
    	g.drawPolygon(new int[] {30, -30, 0}, 
				      new int[] {0,  0,  -60}, 3);
    }
    public void drawRight(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
        g.setColor(Color.blue);
//		g.drawLine(-60,50,90,-50);
//		
//		g.drawLine(-30,-20,90,50);
//        g2d.fillOval(30, 0, 10, 10);
    	g.setColor(Color.white);

		g.drawPolygon(new int[] {30,  90,     60}, 
				  new int[]     {60, 60,      0}, 3);
		
    	


    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//   	 return false; // 判断小球是否在圆形内有效度数113
       return (angle>=0&&angle<=20); // 判断小球是否在圆形内有效度数113
   }
//  
}
class Level5 extends Level { // 第5关
    public void draw(Graphics g) { // 绘制方法
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
//        g.setColor(Color.blue);
//        g.drawLine(-90,50,90,-50);
//		g.drawLine(-90,-50,90,50);
    	g.setColor(Color.white);
        g.drawRect(-120,-50,30,30);
        g.drawRect(90,-50,30,30);
        g.drawRect(30,0,30,30);
        g.drawRect(-60,0,30,30);
    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//      	 return false; // 判断小球是否在圆形内有效度数113
          return (angle>=20&&angle<=160)|| (angle>=200&&angle<=347); // 判断小球是否在圆形内有效度数113
      }
//  
}
class Level6 extends Level { // 第6关
    public void drawLeft(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
    	g.drawPolygon(new int[] {-90, -90, -30}, new int[] {50, -50, 0}, 3);

    }
    public void drawRight(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
    	g.drawPolygon(new int[] {90, 90, 30}, new int[] {50, -50, 0}, 3);

    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//     	 return false; // 判断小球是否在圆形内有效度数113
     	 
         return (angle>=287&&angle<=308); // 判断小球是否在圆形内有效度数113
     }
//  
}
class Level7 extends Level { // 第7关
    public void drawLeft(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
      g.drawRect(-80,-100,50,50);//左1
      g.drawRect(30,-25,50,50);//右2中
      g.drawRect(-80,50,50,50);//左3

    }
    public void drawRight(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
    	g.drawRect(30,-100,50,50);//右1
        g.drawRect(-80,-25,50,50);//左2中
    	
    	g.drawRect(30,50,50,50);//右3

    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//    	 return false; // 判断小球是否在圆形内有效度数113
    	 
        return (angle>=290&&angle<=300)|| (angle>=250&&angle<=260); // 判断小球是否在圆形内有效度数113
    }
}
class Level8 extends Level { // 第8关
//	public void draw(Graphics g) { // 绘制方法
//		Graphics2D g2d = (Graphics2D) g;
//        g2d.setStroke(new BasicStroke(4));
//        g.setColor(Color.blue);
//        g.drawLine(-90,50,90,-50);
//		g.drawLine(-90,-50,90,50);
//    	g.setColor(Color.white);
    	public void drawLeft(Graphics g) {
	    	Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(4));
	    	g.setColor(Color.white);
	        g.drawRect(-80,-100,50,50);//left1

	    }
	    public void drawLeft2(Graphics g) {
	    	Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(4));
	    	g.setColor(Color.white);
	    	g.drawRect(-80,50,50,50);//left2
	    }
	    public void drawRight(Graphics g) {
	    	Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(4));
	    	g.setColor(Color.white);
	    	g.drawRect(30,-100,50,50);//right1
	    }
	    public void drawRight2(Graphics g) {
	    	Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(4));
	    	g.setColor(Color.white);
	        g.drawRect(30,50,50,50);//right2
	    }
	    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//	    	 return false; // 判断小球是否在圆形内有效度数113
	    	 
	        return (angle>=280&&angle<=300); // 判断小球是否在圆形内有效度数113
	    }
        
    }
//  
//}
class Level9 extends Level { // 第9关



	public void drawLeft(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
    	
	g.drawPolygon(new int[] {-30, -30,-110}, 
       new int[] {-130, -50, -80}, 3);//left1

    }
    public void drawLeft2(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
	     g.drawPolygon(new int[] {-30, -30, -110}, 
        new int[] {130, 50, 80}, 3);
    	//left2
    }
    public void drawRight(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
	     g.drawPolygon(new int[] {30, 30, 110}, 
        new int[] {-130, -50, -80}, 3);
    	//right1
    }
    public void drawRight2(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
        g.drawPolygon(new int[] {30, 30, 100}, 
     new int[] {130, 50, 80}, 3);  
        //right2
    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//   	 return false; // 判断小球是否在圆形内有效度数113
   	 
       return (angle>=300)|| (angle>=250&&angle<=270); // 判断小球是否在圆形内有效度数113
   }
//  
}
class Level10 extends Level { // 第10关
	 public void drawLeft(Graphics g) { // 绘制方法
	    	
	    	Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(4));
	    	g.setColor(Color.white);

			g.drawPolygon(new int[] {-30,  30,15,-15}, 
	        		
	        		new int[] {65,  65,  50, 50}, 4);
			
			g.drawPolygon(new int[] {-15, 15,30,-30 }, 
	        		
	        		new int[] {  -50, -50,-65,  -65}, 4);
			
			g.drawPolygon(new int[] {-65,  -50,-50,-65}, //left
	        		
	        		new int[] {30,  15,  -15, -30}, 4);
			
			g.drawPolygon(new int[] {50,  65,65,50}, //right
	        		
	        		new int[] {15,  30,  -30, -15}, 4);
	        
	    }
	 public void drawRight(Graphics g) { // 绘制方法
	    	
	    	Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(4));
	    	g.setColor(Color.white);

			g.drawPolygon(new int[] {-105,  -105,-85},//L
	        		
	        		new int[] {-15,  15,  0}, 3);
			
	g.drawPolygon(new int[] {85,  105,105},//R
	        		
	        		new int[] {0,  -15,  15}, 3);
	//
	g.drawPolygon(new int[] {-15,  0,15},//U 
			
			new int[] {-105,  -85,  -105}, 3);		
	//
	g.drawPolygon(new int[] {-15,  0,15},//D
			
			new int[] {105,  85,  105}, 3);
	    }
	    public boolean checkCollision(int ballX, int ballY, float angle) { // 碰撞检测方法
//	      	 return false; // 判断小球是否在圆形内有效度数113
	      	 
	          return (angle>=0&&angle<=130)|| (angle>=140&&angle<=310)||(angle>=320&&angle<=360); // 判断小球是否在圆形内有效度数113
	      }
//  
}



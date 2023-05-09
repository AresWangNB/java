package GAME;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.Timer;
public class Level {
		int y = 0;//Ĭ��λ��
	    int x =0;
	    int interval = 120;//Ĭ�ϼ��
	    public void draw(Graphics g) {
	    	
	    } // ���Ʒ���
	    public void drawLeft(Graphics g) {
	    	
	    } // �ֿ����Ʒ���
	    public void drawLeft2(Graphics g) {
	    	
	    } // �ֿ����Ʒ���
	    public void drawRight(Graphics g) {
	    	
	    } // �ֿ����Ʒ���
	    public void drawRight2(Graphics g) {
	    	
	    } // �ֿ����Ʒ���
	    public boolean checkCollision(int ballX, int ballY, float angle) { return false; } // ��ײ��ⷽ��
	    
}

class Level0 extends Level { // ��0��


}
class Level1 extends Level { // ��һ��
	   public void draw(Graphics g) { // ���Ʒ���
	    	
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
	

	



class Level2 extends Level { // �ڶ���

    public void draw(Graphics g) { // ���Ʒ���
    	
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
        g.drawRect(-90,-50,30,100);
        g.drawRect(60,-50,30, 100);
//        g.setColor(Color.blue);
//		g.drawLine(-90,50,90,-50);
//		g.drawLine(-90,-50,90,50);

        
    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//    	 return false; // �ж�С���Ƿ���Բ������Ч����113
        return (angle>=32&&angle<=145)||(angle>=212&&angle<=325); // �ж�С���Ƿ���Բ������Ч����113
    }
}
class Level3 extends Level { // ��3��
    public void draw(Graphics g) { // ���Ʒ���
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
        x,y��������  width,height����Ҫ���Ŀ����߶�
        startAngle����ʼ���ĸ��ǶȻ���,arcAngle��startAngleΪ����,���ĽǶ�
        ****/
    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//   	 return false; 
       return (angle>=20&&angle<=160)||(angle>=190&&angle<=346); // �ж�С���Ƿ���Բ������Ч����113
   }
//   
    
}
class Level4 extends Level { // ��4��
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
    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//   	 return false; // �ж�С���Ƿ���Բ������Ч����113
       return (angle>=0&&angle<=20); // �ж�С���Ƿ���Բ������Ч����113
   }
//  
}
class Level5 extends Level { // ��5��
    public void draw(Graphics g) { // ���Ʒ���
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
    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//      	 return false; // �ж�С���Ƿ���Բ������Ч����113
          return (angle>=20&&angle<=160)|| (angle>=200&&angle<=347); // �ж�С���Ƿ���Բ������Ч����113
      }
//  
}
class Level6 extends Level { // ��6��
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
    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//     	 return false; // �ж�С���Ƿ���Բ������Ч����113
     	 
         return (angle>=287&&angle<=308); // �ж�С���Ƿ���Բ������Ч����113
     }
//  
}
class Level7 extends Level { // ��7��
    public void drawLeft(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
      g.drawRect(-80,-100,50,50);//��1
      g.drawRect(30,-25,50,50);//��2��
      g.drawRect(-80,50,50,50);//��3

    }
    public void drawRight(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
    	g.setColor(Color.white);
    	g.drawRect(30,-100,50,50);//��1
        g.drawRect(-80,-25,50,50);//��2��
    	
    	g.drawRect(30,50,50,50);//��3

    }
    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//    	 return false; // �ж�С���Ƿ���Բ������Ч����113
    	 
        return (angle>=290&&angle<=300)|| (angle>=250&&angle<=260); // �ж�С���Ƿ���Բ������Ч����113
    }
}
class Level8 extends Level { // ��8��
//	public void draw(Graphics g) { // ���Ʒ���
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
	    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//	    	 return false; // �ж�С���Ƿ���Բ������Ч����113
	    	 
	        return (angle>=280&&angle<=300); // �ж�С���Ƿ���Բ������Ч����113
	    }
        
    }
//  
//}
class Level9 extends Level { // ��9��



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
    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//   	 return false; // �ж�С���Ƿ���Բ������Ч����113
   	 
       return (angle>=300)|| (angle>=250&&angle<=270); // �ж�С���Ƿ���Բ������Ч����113
   }
//  
}
class Level10 extends Level { // ��10��
	 public void drawLeft(Graphics g) { // ���Ʒ���
	    	
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
	 public void drawRight(Graphics g) { // ���Ʒ���
	    	
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
	    public boolean checkCollision(int ballX, int ballY, float angle) { // ��ײ��ⷽ��
//	      	 return false; // �ж�С���Ƿ���Բ������Ч����113
	      	 
	          return (angle>=0&&angle<=130)|| (angle>=140&&angle<=310)||(angle>=320&&angle<=360); // �ж�С���Ƿ���Բ������Ч����113
	      }
//  
}



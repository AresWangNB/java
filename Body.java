package GAME;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Body  {
//	Level.left left;
	private Timer timer;//��ʱ��
	private final int delay = 10;// ת����������
	boolean clockwise= true;//˳
	boolean anticlockwise = false;//��ʱ��
	boolean swayOpen = true;
	boolean in= true;//���ڼ�ѹ
	boolean out = false;//�����ſ�
//	int swayleftx=-30;
//	int swaylefty=-30;
	float squNumL = 250;//ƽ�Ƶ�λ
	float squNumR = 310;//ƽ�Ƶ�λ
//	float squNumLY = 1;//��ֱ��λ
//	float squNumRY = 1;//��ֱ��λ
	float squNumDownY =430;//�½����
	float squNumUpY =450;//����
	double squNum = 0.05;//��ײ��ѹ�ٶ�
	double angleNum = 0.04;//��ײ��ѹ�ٶ�
	int routeX= 0;
	int routeY= 0;
	Level level;//�ؿ�
	Body(){
		level = new Level0();
	}
	   public void draw(Graphics g) {    	
	    	Graphics2D g2d = (Graphics2D) g;
	    	AffineTransform oldTransform = g2d.getTransform();
	    	g.setColor(Color.black);
			if(Data.LevelNum !=0){
				routeX = 0;
				routeY = 0;
				g2d.translate(Data.centerX,Data.centerY);
				g2d.rotate( Math.toRadians(Data.angle),routeX,routeY);
				level.draw(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
			}
			switch (Data.LevelNum) {
			case 0:break;
			case 1:
				break;
			case 2:
				spin();
				break;//����ת
			case 3:
				spin();
				break;//ҡ��
			case 4:
//				routeX = 0;
//				routeY = 0;
				g2d.translate(Data.centerX-30, Data.centerY);
				g2d.rotate( Math.toRadians(Data.angle),routeX,routeY-60);
				level.drawLeft(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
				g2d.translate(Data.centerX-30, Data.centerY);
				 g.setColor(Color.white);
//				g.fillOval(routeX+60, routeY-20, 10,10);
				g2d.rotate( Math.toRadians(Data.angle*-1),routeX+60,routeY);
				level.drawRight(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
//				AffineTransform at = new AffineTransform();
//			    // ������ϵ��ԭ���ƶ���Բ��λ��
//			    at.translate(Data.centerX+30, Data.centerY+90);
//			    at.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
//			    g2d.setTransform(at);
//				level.drawLeft(g); // ���ƹؿ�
//			    AffineTransform at2 = new AffineTransform();
//			    // ������ϵ��ԭ���ƶ���Բ��λ��
//			    at2.translate(Data.centerX+30, Data.centerY+90);
//			    at2.rotate(Math.toRadians(Data.angle*-1),routeX+90,routeY+60);		    
//			    g2d.setTransform(at2);
//				level.drawRight(g); // ���ƹؿ�
				
				
		       sway();
		        break;
			case 5:

				spin();
				break;
			case 6:
				
//				g2d.translate(Data.centerX-30, Data.centerY);
				g2d.translate(squNumL-60, Data.centerY);
				level.drawLeft(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//		        g2d.translate(Data.centerX-30, Data.centerY);
		        g2d.translate(squNumR-60, Data.centerY);
				level.drawRight(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
				//-----------------------
//				AffineTransform squeezing = new AffineTransform();
//				squeezing.translate(squNumL, Data.centerY+90);
//				g2d.setTransform(squeezing);
//				level.drawLeft(g); // ���ƹؿ�
//				
//				AffineTransform squeezing2 = new AffineTransform();
//				squeezing2.translate(squNumR, Data.centerY+90);
//				g2d.setTransform(squeezing2);
//				level.drawRight(g); // ���ƹؿ�
				squeezing();
//				System.out.println(Data.angle);
				break; 
			case 7:
				g2d.translate(squNumL-60, Data.centerY);
				level.drawLeft(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//		        g2d.translate(Data.centerX-30, Data.centerY);
		        g2d.translate(squNumR-60, Data.centerY);
				level.drawRight(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//				AffineTransform squeezing7 = new AffineTransform();
//				squeezing7.translate(squNumL, Data.centerY+90);
//				g2d.setTransform(squeezing7);
//				level.drawLeft(g); // ���ƹؿ�
//				
//				AffineTransform squeezing72 = new AffineTransform();
//				squeezing72.translate(squNumR, Data.centerY+90);
//				g2d.setTransform(squeezing72);
//				level.drawRight(g); // ���ƹؿ�
				squeezing();
				break;
			case 8:
				g2d.translate(squNumL-60,squNumDownY-90);
				level.drawLeft(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//		        g2d.translate(Data.centerX-30, Data.centerY);
		        g2d.translate(squNumL-60,squNumUpY-90);
				level.drawLeft2(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        g2d.translate(squNumR-60,squNumDownY-90);
				level.drawRight(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//		        g2d.translate(Data.centerX-30, Data.centerY);
		        g2d.translate(squNumR-60,squNumUpY-90);
				level.drawRight2(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		      
//				AffineTransform squeezing8 = new AffineTransform();
//				squeezing8.translate(squNumL,squNumDownY);
//				g2d.setTransform(squeezing8);
//				level.drawLeft(g); // ���ƹؿ�
//				
//				AffineTransform squeezing81 = new AffineTransform();
//				squeezing81.translate(squNumL,squNumUpY);
//				g2d.setTransform(squeezing81);
//				level.drawLeft2(g); // ���ƹؿ�
//				
//				AffineTransform squeezing82 = new AffineTransform();
//				squeezing82.translate(squNumR, squNumDownY);
//				g2d.setTransform(squeezing82);
//				level.drawRight(g); // ���ƹؿ�
//				
//				AffineTransform squeezing83 = new AffineTransform();
//				squeezing83.translate(squNumR,squNumUpY);
//				g2d.setTransform(squeezing83);
//				level.drawRight2(g); // ���ƹؿ�
				squeezing();
				break;
			case 9:
				g2d.translate(squNumL-60,squNumDownY-90);
				g2d.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
				level.drawLeft(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//		        g2d.translate(Data.centerX-30, Data.centerY);
		        g2d.translate(squNumL-60,squNumUpY-90);
		        g2d.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
				level.drawLeft2(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
		        g2d.translate(squNumR-60,squNumDownY-90);
		        g2d.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
		        level.drawRight(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//		        g2d.translate(Data.centerX-30, Data.centerY);
		        g2d.translate(squNumR-60,squNumUpY-90);
		        g2d.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
				level.drawRight2(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
//				AffineTransform squeezing91 = new AffineTransform();
//				squeezing91.translate(squNumL,squNumDownY);
////				squeezing91.translate(Data.centerX+30, Data.centerY+90);
//				squeezing91.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
//				g2d.setTransform(squeezing91);
//				level.drawLeft(g); // ���ƹؿ�
		        
//				AffineTransform squeezing92 = new AffineTransform();
//				squeezing92.translate(squNumL,squNumUpY);
//				squeezing92.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
//				g2d.setTransform(squeezing92);
//				level.drawLeft2(g); // ���ƹؿ�
//				
//				AffineTransform squeezing93 = new AffineTransform();
//				squeezing93.translate(squNumR, squNumDownY);
//				squeezing93.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
//				g2d.setTransform(squeezing93);
//				level.drawRight(g); // ���ƹؿ�
//				
//				AffineTransform squeezing94 = new AffineTransform();
//				squeezing94.translate(squNumR,squNumUpY);
//				squeezing94.rotate( Math.toRadians(Data.angle),routeX+30,routeY);
//				g2d.setTransform(squeezing94);
//				level.drawRight2(g); // ���ƹؿ�
				squeezing();
//				sway();
				spin();
				break;
			case 10:
				g2d.translate(Data.centerX, Data.centerY);
				g.fillOval(routeX,routeY, 5,5);
				g2d.rotate( Math.toRadians(Data.angle),routeX,routeY);
				level.drawLeft(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//		        g2d.translate(Data.centerX-30, Data.centerY);
		        g2d.translate(Data.centerX, Data.centerY);
//				g.fillOval(routeX+60, routeY-20, 10,10);
		        g2d.rotate( Math.toRadians((Data.angle+25)*-1.5),routeX,routeY);
				level.drawRight(g); // ���ƹؿ�
		        g2d.setTransform(oldTransform);
		        
//				AffineTransform at101 = new AffineTransform();
//			    // ������ϵ��ԭ���ƶ���Բ��λ��
//			    at101.translate(Data.centerX+55, Data.centerY+90);
//			    at101.rotate( Math.toRadians(Data.angle),routeX,routeY);
//			    g2d.setTransform(at101);
//				level.drawLeft(g); // ���ƹؿ�
//				
//			    AffineTransform at102 = new AffineTransform();
//			    // ������ϵ��ԭ���ƶ���Բ��λ��
//			    at102.translate(c);
//			    at102.rotate(Math.toRadians((Data.angle+25)*-1.5),routeX,routeY);		    
//			    g2d.setTransform(at102);
//				level.drawRight(g); // ���ƹؿ�
				spin();
				System.out.println((int)Data.angle);//text
				break;
			case 11:;break;//�����
			
			}

	    }
	public void squeezing() {//��ѹ
		if(in) {
			squNumL+=squNum;
			squNumR-=squNum;
			
			squNumDownY +=squNum;
			squNumUpY -=squNum;
//			System.out.println(squNumL);//text
			
			if((int)squNumL==310) {
//				System.out.println((int)Data.angle);//text
				in=false;
				out=true;
			}			
		}
		if(out) {
			squNumDownY -=squNum;
			squNumUpY +=squNum;
			squNumL-=squNum;
			squNumR+=squNum;
			if((int)squNumL==250) {
				
				in=true;
				out=false;
			}			
		}
		Data.angle=(float)squNumL;
		System.out.println((int)Data.angle);//text
}//��ת

	public void spin() {//����ת
		
        Data.angle += angleNum;
//        Data.angle += 0.009;//test
//        System.out.println(Data.angle);//text
        if(Data.angle >=360) {
        	Data.angle= 0;
        }           
}//��ת
	public void sway() {//ҡ��
		

			if(clockwise) {
			routeX = -30;
			routeY = -60;
			Data.angle += angleNum;
			if((int)Data.angle==90) {
				System.out.println((int)Data.angle);//text
				clockwise=false;
				anticlockwise=true;
			}			
		}
		if(anticlockwise) {
			Data.angle -=angleNum;
			if((int)Data.angle==0) {
				System.out.println((int)Data.angle);//text
				clockwise=true;
				anticlockwise=false;
			}
		
			
		}   
}//��ת

	void switchBody(){//�л��ϰ���		
	switch (Data.LevelNum) {
	case 0:break;
	case 1:level = new Level1();break;
	case 2:level = new Level2();break;
	case 3:level = new Level3();break;
	case 4:level = new Level4();break;
	case 5:level = new Level5();break;
	case 6:level = new Level6();break;
	case 7:level = new Level7();break;
	case 8:level = new Level8();break;
	case 9:level = new Level9();break;
	case 10:level = new Level10();break;
	case 11:JOptionPane.showMessageDialog(null, "��ϲ��ͨ�أ� ��ĵ÷�:"+Integer.toString(Data.LevelNum-1), "��ʾ",JOptionPane.PLAIN_MESSAGE);Data.gameOver = true;Data.LevelNum = 0;Data.angle = 0;break;//�����
	
	}
	}


	
	
}

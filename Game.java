package GAME;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Game extends JPanel {
	private MediaTracker mp;
	private boolean error = false;
	private Timer timer;//定时�??
	private final int delay = 10;// 转动快慢设置
	private boolean isOver = false;//游戏是否结束
	public static boolean isShow = false;//是否展示过失败弹�??
	    // 游戏结束标志
	
	Body body;//刚体
	Wall wall;//�??
	Ball ball; //�??
	BackGround bg;//背景颜色
	Game() throws IOException{
		wall = new Wall();
		body = new Body();
		ball = new Ball();//球类
		bg =  new BackGround();//背景颜色
		setLayout(null);//清空布局
		setBackground(bg.color);//设置颜色
	}
	public void paint(Graphics g) {
		Data.centerX = getWidth() / 2;
		Data.centerY = getHeight() / 2;
		
		if(isOver) {
			System.out.print("GameOver");
		}
		else {
			super.paint(g);//调用父类方法
			wall.draw(g);//画墙
			ball.draw(g);//画球
			body.draw(g);
		}
		repaint();
	}
	public static void playSound(String fileName) {
        try {
            File soundFile = new File(fileName); // 创建声音文件对象
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile); // 获取音频输入�??
            Clip clip = AudioSystem.getClip(); // 创建剪辑对象
            clip.open(audioIn); // 打开音频输入�??
            clip.start(); // 播放音频
        } catch (Exception e) {
            e.printStackTrace(); // 输出异常信息
        }
    }
	public boolean checkCollision() {
        return body.level.checkCollision(ball.getX(), ball.getY(), Data.angle); // �??测小球是否与关卡中的图形碰撞
    }//碰撞�??�??

	public void action() throws InterruptedException{
		
	MouseAdapter m=new MouseAdapter() {
		
		public void mousePressed(MouseEvent e) {
			if(isShow == false) {
				playSound("src/Resource/touch.wav");//点击屏幕播放声音
			}
			error =false;
			ActionListener task = new ActionListener() {
				

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
//		判断是否触碰到墙
		if(ball.y<=Data.wallY) {
			error = true;
			timer.stop(); //停止计时 ??
			playSound("src/Resource/pass.wav");//点击屏幕播放声音
			Data.LevelNum++;//下一 ??
			Data.angle=0;//度数重置
			bg.switchColor();//切换颜色
			setBackground(bg.color);//设置颜色
			body.switchBody();//切换障碍 ??
			//回归
			ball.reset();
			repaint();
			
			ball.speed = 1;//球 ? 度
			ball.twxCut = 0;
			
		}else {
			if (!Data.gameOver&&!error) {
				ball.Dash();//鍒ゆ柇鎶撻奔
				repaint();
				if(ball.y<=430) {
				if (checkCollision()&&isShow==false) { //  ??测碰撞和失败弹窗是否显示 ??
					Data.gameOver = true;//游戏状 ??
					
					if(Data.gameOver == true) {
						timer.stop(); //停止计时 ??
						ball.reset();
						repaint();
		         		Data.angle = 0;//旋转角度归位
		         		playSound("src/Resource/over.wav");//点击屏幕播放声音
		         		isShow = true;//已经显示过弹 ??
	         		JOptionPane.showConfirmDialog(null,"GAME OVER!你的得分:"+Integer.toString(Data.LevelNum),"操作提示",JOptionPane.OK_CANCEL_OPTION);//弹出 ??个对话框
	         		Data.LevelNum = 0;//归零 ??
	                }
	            }
				}

	        }
		}			
	}	
};
timer = new Timer(delay,task);
timer.start();
		}
	};


			
	this.addMouseListener(m);
	this.addMouseMotionListener(m);//娣诲姞鐩戝惉鍣�


	}


	

}

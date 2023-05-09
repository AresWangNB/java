package GAME;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BallDashGame {
//	JPanel panel;
//	CardLayout cardLayout;
	public static CardLayout cardLayout;
	public static void main(String[] args) throws IOException, InterruptedException {
		Game.playSound("src/Resource/init.wav");//点击play播放声音
		cardLayout=new CardLayout();
//		Data data;		
//		Data data =  Data();//data类
		JFrame frame = new JFrame();//创建窗体
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(450,700);//主窗口设置大小
		frame.setLocationRelativeTo(null);//居中
		frame.setResizable(false);//不可改变
		frame.setTitle("冲击吧!球球");//标题
		JPanel root = new JPanel();//主面板类
		frame.setContentPane(root);//获得一个新容器
		root.setLayout(null); 
		
		JPanel panel = new JPanel();//菜单面板
		panel.setBounds(0,0, 450, 700);
		root.add(panel);//将菜单面板插入主窗口
		panel.setLayout(cardLayout);
		MenuPanel menu=new MenuPanel();
		panel.add(menu,"menu");
		
		Game game=new Game();
		panel.add(game,"game");
		
		game.action();//游戏面板
		
		cardLayout.show(panel, "menu");//默认显示哪个页面
		
		JButton play = new JButton("Play");
		play.setBackground(Color.green);//设置background颜色
		play.setOpaque(true); //foreground设置透明
		play.setBorderPainted(false); //最后显示红色
		play.setFont(new Font("宋体", Font.PLAIN, 50));//设置字体大小
		play.setForeground(Color.white);
		play.setBounds(90,335,250,70);//设置大小并定位
		
		play.addActionListener( (e)->{
			Game.playSound("src/Resource/play.wav");//点击play播放声音
			Game.isShow = false;//失败弹窗
			cardLayout.show(panel, "game");
			play.setContentAreaFilled(false);
			
		});//添加动作监听
		
		frame.add(play);//添加面板
		frame.setVisible(true);//显示

		//监听游戏状态
		while(true) {
//			System.out.println("");
			try
			{
				Thread.sleep(1);//单位：毫秒
			} catch (Exception e) { 
			}
			if(Data.gameOver) {
				cardLayout.show(panel, "menu");
				Data.gameOver = false;
				
				play.setContentAreaFilled(true);
			}
		}
	}
}



	




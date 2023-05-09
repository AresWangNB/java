package GAME;
//主面板

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MenuPanel extends JPanel {
	private JTextField jt1;
	public MenuPanel(){
		Data data = new Data();//data类
			setLayout(null);
			setBackground(data.MenuBlue);//设置背景颜色

			JLabel name=new JLabel("冲击吧!球球");
			name.setFont(new Font("宋体", Font.PLAIN, 50));//设置字体大小
			name.setForeground(Color.white);
			name.setBounds(80,135,350,100);//设置大小并定位
			add(name);
			JLabel developer=new JLabel("<html><body><p align=\\\"\\\">开发:王晨岩<br/>关卡:卢文成<br/>指导:葛彦强</p></body></html>\\n");
			developer.setFont(new Font("宋体", Font.PLAIN, 15));//设置字体大小
			developer.setForeground(Color.white);
			developer.setBounds(300,570,350,100);//设置大小并定位
			
			add(developer);//添加面板
			
	 
		
			
	}

	}//主菜单构造方法



	


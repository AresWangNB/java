package GAME;
//�����

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
		Data data = new Data();//data��
			setLayout(null);
			setBackground(data.MenuBlue);//���ñ�����ɫ

			JLabel name=new JLabel("�����!����");
			name.setFont(new Font("����", Font.PLAIN, 50));//���������С
			name.setForeground(Color.white);
			name.setBounds(80,135,350,100);//���ô�С����λ
			add(name);
			JLabel developer=new JLabel("<html><body><p align=\\\"\\\">����:������<br/>�ؿ�:¬�ĳ�<br/>ָ��:����ǿ</p></body></html>\\n");
			developer.setFont(new Font("����", Font.PLAIN, 15));//���������С
			developer.setForeground(Color.white);
			developer.setBounds(300,570,350,100);//���ô�С����λ
			
			add(developer);//������
			
	 
		
			
	}

	}//���˵����췽��



	


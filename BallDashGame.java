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
		Game.playSound("src/Resource/init.wav");//���play��������
		cardLayout=new CardLayout();
//		Data data;		
//		Data data =  Data();//data��
		JFrame frame = new JFrame();//��������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(450,700);//���������ô�С
		frame.setLocationRelativeTo(null);//����
		frame.setResizable(false);//���ɸı�
		frame.setTitle("�����!����");//����
		JPanel root = new JPanel();//�������
		frame.setContentPane(root);//���һ��������
		root.setLayout(null); 
		
		JPanel panel = new JPanel();//�˵����
		panel.setBounds(0,0, 450, 700);
		root.add(panel);//���˵�������������
		panel.setLayout(cardLayout);
		MenuPanel menu=new MenuPanel();
		panel.add(menu,"menu");
		
		Game game=new Game();
		panel.add(game,"game");
		
		game.action();//��Ϸ���
		
		cardLayout.show(panel, "menu");//Ĭ����ʾ�ĸ�ҳ��
		
		JButton play = new JButton("Play");
		play.setBackground(Color.green);//����background��ɫ
		play.setOpaque(true); //foreground����͸��
		play.setBorderPainted(false); //�����ʾ��ɫ
		play.setFont(new Font("����", Font.PLAIN, 50));//���������С
		play.setForeground(Color.white);
		play.setBounds(90,335,250,70);//���ô�С����λ
		
		play.addActionListener( (e)->{
			Game.playSound("src/Resource/play.wav");//���play��������
			Game.isShow = false;//ʧ�ܵ���
			cardLayout.show(panel, "game");
			play.setContentAreaFilled(false);
			
		});//��Ӷ�������
		
		frame.add(play);//������
		frame.setVisible(true);//��ʾ

		//������Ϸ״̬
		while(true) {
//			System.out.println("");
			try
			{
				Thread.sleep(1);//��λ������
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



	




package GAME;

import java.awt.Color;

public class Data {
	public static int centerX ;
	public static int centerY ;
	public static float angle;
	public static Color MenuBlue = new Color(52, 120, 243);//���˵�
	public static Color Wall = new Color(255, 255, 255,170);//ǽ
	
	public static int LevelNum = 0;//�ؿ�
	public static int a = 1;
	public static String show = "menu";//Ĭ����ʾmenu
	public static boolean gameOver;//��Ϸ�����ж�
	public static int wallX = 0;// ת����������
	public static int wallY = 150;// ת����������
	Data(){
		//��Ϸ�����ж�
	}
}

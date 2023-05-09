package GAME;

import java.awt.Color;

public class Data {
	public static int centerX ;
	public static int centerY ;
	public static float angle;
	public static Color MenuBlue = new Color(52, 120, 243);//主菜单
	public static Color Wall = new Color(255, 255, 255,170);//墙
	
	public static int LevelNum = 0;//关卡
	public static int a = 1;
	public static String show = "menu";//默认显示menu
	public static boolean gameOver;//游戏结束判断
	public static int wallX = 0;// 转动快慢设置
	public static int wallY = 150;// 转动快慢设置
	Data(){
		//游戏结束判断
	}
}

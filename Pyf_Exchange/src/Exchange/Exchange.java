package Exchange;

import java.util.Scanner;  

public class Exchange {
	public static void main(String[] args) {
		Importhuobi();
	}


public static void Importhuobi(){ 
	double after_US = 0;
	double after_RMB = 0;
    Scanner sc = new Scanner(System.in); 
    System.out.println("请输入货币价值换算方式(0表示$-￥,1则反之):"); 
    int type = sc.nextInt();  
    
    if (type == 0)
    {
    	System.out.println("你选择的是美元兑换为人民币"); 
    	System.out.println("请输入美元数量："); 
    	double US = sc.nextDouble();
    	after_US = US * 6.18;
    	System.out.println( US +"$换算为人民币为" +after_US + "￥"); 
    }
    if (type == 1)
    {
    	System.out.println("你选择的是人民币兑换为美元"); 
    	System.out.println("请输入人民币数量："); 
    	double RMB = sc.nextDouble();
    	after_RMB = RMB / 6.18;
    	System.out.println( RMB +"￥$换算为美元为" +after_RMB + "$"); 
    }
   
  } 

}
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
    System.out.println("��������Ҽ�ֵ���㷽ʽ(0��ʾ$-��,1��֮):"); 
    int type = sc.nextInt();  
    
    if (type == 0)
    {
    	System.out.println("��ѡ�������Ԫ�һ�Ϊ�����"); 
    	System.out.println("��������Ԫ������"); 
    	double US = sc.nextDouble();
    	after_US = US * 6.18;
    	System.out.println( US +"$����Ϊ�����Ϊ" +after_US + "��"); 
    }
    if (type == 1)
    {
    	System.out.println("��ѡ���������Ҷһ�Ϊ��Ԫ"); 
    	System.out.println("�����������������"); 
    	double RMB = sc.nextDouble();
    	after_RMB = RMB / 6.18;
    	System.out.println( RMB +"��$����Ϊ��ԪΪ" +after_RMB + "$"); 
    }
   
  } 

}
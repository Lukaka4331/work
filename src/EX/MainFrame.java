package EX;

import java.awt.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import EX.GuessTimer.Listener;

import java.util.Timer;
import java.util.TimerTask;

public class MainFrame extends Frame  implements ActionListener{
	private JButton b1=new JButton ("中文");
	private JButton b2=new JButton ("英文");

	private JButton b3=new JButton ("開始");
	private JButton b4=new JButton ("重新開始");
	private JButton b5=new JButton ("判斷");

	private JLabel lab1=new JLabel  ("中英文打字系統",SwingConstants.CENTER);
	private JLabel lab2=new JLabel  ("60",SwingConstants.CENTER);
	private JLabel lab3=new JLabel  ("你打了0個字",SwingConstants.CENTER);
	private JLabel lab4=new JLabel  ("錯了幾個字",SwingConstants.CENTER);
	

	private Panel pn1=new Panel();
	private Panel pn2=new Panel();
    private Panel pn3=new Panel();
     
    private JLabel ta=new JLabel();	
    private JTextField tf=new JTextField();
    private int tfCount =0;
	private Timer tmr;
    private Font ss = new Font("標楷體", Font.BOLD, 20);
   
    public MainFrame(){
		 initComp();
		 Timer tmr; 
		 tmr = new Timer(); 
		 this.tmr = tmr; 
		 
			 }
    
    private void initComp(){
		
    	// 宣告JComboBox
    	JComboBox comebox = new JComboBox();
    	// 增加內容到comebox
    	this.setTitle("中英打練習系統");	
		 this.addWindowListener(new WindowAdapter(){
			 public void windowClosing( WindowEvent e){
				 System.exit(0);
			 }
		 });
		 
         this.setBounds(650, 250, 915, 800);
		 this.setLayout(new BorderLayout(5,5));
		 lab1.setFont(new Font("標楷體", Font.BOLD, 20));
		 ta.setFont(ss);lab3.setFont(ss); lab4.setFont(ss);lab2.setFont(ss);

		 lab1.setBackground(Color.PINK);
         pn1.setLayout(new GridLayout(1,1,1,-15));
         pn2.setLayout(new GridLayout(2,1,1,0));
         pn3.setLayout(new GridLayout(2,1,1,0));
         pn1.add(lab1);
         pn1.add(lab2);     
         pn1.add(comebox);
        comebox.addItem("中文");
        comebox.addItem("英文");


         pn1.add(b3);
         pn1.add(b4);
         pn3.add(lab3);
         pn3.add(lab4);
         pn1.add(b5);

       

         pn2.add(ta);
         pn2.add(tf);
         this.add(pn1,BorderLayout.NORTH);         
         this.add(pn2,BorderLayout.CENTER);
         this.add(pn3,BorderLayout.SOUTH); 
         tf.setEnabled(false);
         

				
         
         comebox.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				
				System.out.println("1");
			}
        	 
         });
    
         
//         comebox.addItemListener(new ItemListener(){
//
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				// TODO Auto-generated method stub
//				ta.setText(fun2());
//				System.out.println("2");
//			}
//        	 
//         });
         
         
         
         
         
         
         
		 b3.addActionListener(new ActionListener(){		 
			public void actionPerformed(ActionEvent ae) {
				//for(int i=60;i>=0;i--){ 
				//	try { 
					//每次停一秒鐘 
					//Thread.sleep(1000); 						
					//} catch (Exception e1) {} 	 									
					//lab2.setText("倒數"+i+"秒"); 
					//} 
				tf.setEnabled(true);
				b3.setEnabled(false);
				
				if(comebox.getSelectedItem().equals("中文")){
					ta.setText(fun1());
				}else{
					ta.setText(fun2());
				}			
			}				
		 });
		 b4.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent ae) {
					b3.setEnabled(true);
					lab4.setText("錯了0幾個字");
					lab3.setText("錯了幾個字");
					tf.setEnabled(true);
					ta.setText("");
					tf.setText("");
				}
		 });
		 tf.addKeyListener(new KeyAdapter(){
			 public void keyTyped(KeyEvent ke){
				
			 if(ke.getKeyChar()==8 && tfCount>0){
				 tfCount--;
				 }else if(ke.getKeyChar()!=8){
				 tfCount++;
			 }
			 lab3.setText("算算你打了"+tfCount+"個字");
			 }
		 });
				
    
    
    
    
    b5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent aw){
		tf.setEnabled(false);
		int IT = 0;
		char[]v1 = (ta.getText()).toCharArray();
		char[]v2 = (tf.getText()).toCharArray();
		for(int i = 0;i<v2.length;i++){
			
			if(v1[i]!=v2[i]){
				IT++;
			}
		}	
	    	lab4.setText("錯了"+(IT+(v1.length-v2.length))+"幾個字");		
};
});
	}


    
		 private void add(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}

		private String fun1(){
     		Random rnd = new Random();
     		String s = null ;
     		int v1 = rnd.nextInt(4)+1;
     		switch(v1){
     		case 1:
     			 s = "露濃煙重草萋萋樹映闌干柳拂堤一院落花無客醉五更殘月有鶯啼芳筵想像情難盡故榭荒涼路已迷惆悵羸驂往來慣每經門巷亦長嘶";
     		break;
     		case 2:
     			 s = "流澌臘月下河陽草色新年發建章秦地立春傳太史漢宮題柱憶仙郎歸鴻欲度千門雪侍女新添五夜香早晚荐雄文似者故人今已賦長楊";
     		break;
     		case 3:
     			 s = "野老籬前江岸回柴門不正逐江開漁人網集澄潭下賈客船隨返照來長路關心悲劍閣片雲何意傍琴台王師未報收東郡城闕秋生畫角哀";
     		break;
     		case 4:
     			 s = "西蜀櫻桃也自紅野人相贈滿筠籠數回細寫愁仍破萬顆勻圓訝許同憶昨賜沾門下省退朝擎出大明宮金盤玉箸無消息此日嘗新任轉蓬";
     		}
     		return s;
      }
		 
		 
		 private String fun2(){
				Random rnd = new Random();
				String s1 = null;
				int v2 = rnd.nextInt(4)+1;
				switch(v2){
				case 1:
					s1 = "His breakthrough major title at the 2016 US Open paved the way for a streak which has yielded five more wins,including three this season,and catapulted him to world No.1";
					break;
				case 2:
					s1 = "The medieval era took the model of masculinity back towards basic,chivalric,Christian values,before the likes of Byron and Brummell shattered these ideas with the rise of the dandy";
					break;
				case 3:
					s1 = "There cannot be one singular kind of Nigerian man or woman,there has to be room for other definitions that dont necessarily fit that opinion";
					break;
				case 4:
					s1 = "His amazing life has now become the subject of an international book,published by Bloomsbury and endorsed by King Abdullah II of Jordan and British adventurer Ranulph Fiennes";
					break;
				}
				return s1;
			}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		 
		 
		 
		 
		 
}
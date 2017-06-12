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
	private Button b1=new Button ("中文");
	private Button b2=new Button ("英文");


	private Button b3=new Button ("開始");
	private Button b4=new Button ("重新開始");
	private Button b5=new Button ("判斷");

	private Label lab1=new Label  ("中英文打字系統");
	private Label lab2=new Label  ("60");
	private Label lab3=new Label  ("算算你打了幾個字");
	private Label lab4=new Label  ("錯了幾個字");
	

	private Panel pn1=new Panel();
	private Panel pn2=new Panel();
  
     
    private TextArea ta=new TextArea();	
    private TextArea input=new TextArea();	
    private TextField tf=new TextField();
    private int tfCount =0;
	private Timer tmr;
    
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
    			
		 this.addWindowListener(new WindowAdapter(){
			 public void windowClosing( WindowEvent e){
				 System.exit(0);
			 }
		 });
		 
         this.setBounds(650, 250, 800, 800);
		 this.setLayout(new BorderLayout(5,5));
		 
		 ta.setBackground(Color.CYAN);
		 lab1.setAlignment(Label.CENTER);
		 lab2.setAlignment(Label.CENTER);
		 lab3.setAlignment(Label.CENTER);
		 lab4.setAlignment(Label.CENTER);
		 
		 lab1.setBackground(Color.PINK);
         pn1.setLayout(new GridLayout(8,1,5,5));
         pn2.setLayout(new GridLayout(2,1,3,3));

         pn1.add(lab1);
         pn1.add(lab2);
         
         pn1.add(comebox);
        comebox.addItem("中文");
        comebox.addItem("英文");


         pn1.add(b3);
         pn1.add(b4);
         pn1.add(lab4);
         pn1.add(lab3);
         pn1.add(b5);

       

         pn2.add(ta);
         pn2.add(tf);
         this.add(pn1,BorderLayout.NORTH);         
         this.add(pn2,BorderLayout.CENTER);
      
         
         

				
         
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
				
				if(comebox.getSelectedItem().equals("中文")){
					ta.setText(fun1());
				}else{
					ta.setText(fun2());
				}
				
			}

			
				
		 });

		 tf.addKeyListener(new KeyAdapter(){
			 public void keyTyped(KeyEvent ke){
				 if(ke.getKeyChar()==8 && tfCount>0){
					 tfCount--;
				 }else if(ke.getKeyChar()!=8){
					 tfCount++;
				 }
				 lab3.setText("你已經打了"+tfCount+"個字");
			 }
		 });
    
    
    
    
    b5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent aw){
		int IT = 0;
		char[]v1 = (ta.getText()).toCharArray();
		char[]v2 = (tf.getText()).toCharArray();
		for(int i = 0;i<v2.length;i++){
			if(v1[i]!=v2[i]){
				IT++;
			}
		}	
	    	lab4.setText(IT+(v1.length-v2.length)+"");		
};
});
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
					s1 = "ForstudentsatoneelementaryschoolgoingtoclassmeanstakingbookspencilsandpassportsRtyuugesl";
					break;
				case 2:
					s1 = "JimmyKimmelandTrevorNoahmockedPresidentTrumpsdecisiontowithdrawfromtheParisClimateAccord";
					break;
				case 3:
					s1 = "TheadvertisementisamusicvideothatfeaturesarecreatedterroristattackandlyricsaskingRytIEgd";
					break;
				case 4:
					s1 = "WhenyouthinkofahackeryouprobablythinkaboutbasementdwellersinhoodiestypingDtehyjkQluljTuy";
					break;
				}
				return s1;
			}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		 
		 
		 
		 
		 
}
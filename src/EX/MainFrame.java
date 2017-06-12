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
	private Button b1=new Button ("����");
	private Button b2=new Button ("�^��");


	private Button b3=new Button ("�}�l");
	private Button b4=new Button ("���s�}�l");
	private Button b5=new Button ("�P�_");

	private Label lab1=new Label  ("���^�奴�r�t��");
	private Label lab2=new Label  ("60");
	private Label lab3=new Label  ("���A���F�X�Ӧr");
	private Label lab4=new Label  ("���F�X�Ӧr");
	

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
		
    	// �ŧiJComboBox
    	JComboBox comebox = new JComboBox();
    	// �W�[���e��comebox
    			
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
        comebox.addItem("����");
        comebox.addItem("�^��");


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
					//�C�����@���� 
					//Thread.sleep(1000); 						
					//} catch (Exception e1) {} 	 									
					//lab2.setText("�˼�"+i+"��"); 
					//} 
				
				if(comebox.getSelectedItem().equals("����")){
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
				 lab3.setText("�A�w�g���F"+tfCount+"�Ӧr");
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
     			 s = "�S�@�ϭ���ֵ־�M��z�h�س��@�|����L�ȾK����ݤ릳�a�ڪں�Q�������ɬG�k��D���w�g����ý�|���ӺD�C�g���ѥ���R";
     		break;
     		case 2:
     			 s = "�y�Bþ��U�e�����s�~�o�س����a�߬K�Ǥӥv�~�c�D�W�ХP���k�E���פd�����ͤk�s�K���]�����߯򶯤���̬G�H���w�����";
     		break;
     		case 3:
     			 s = "�����X�e�����^��������v���}���H�������U��Ȳ��H��ӨӪ������ߴd�C�դ�����N�ĵ^�x���v�������F�p������͵e���s";
     		break;
     		case 4:
     			 s = "�踾���]�۬����H���غ��aŢ�Ʀ^�Ӽg�T���}�U���ö�Y�\�P�ЬQ��g���U�ٰh�����X�j���c���L�ɺ�L����������s���ུ";
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
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
	private JButton b1=new JButton ("����");
	private JButton b2=new JButton ("�^��");

	private JButton b3=new JButton ("�}�l");
	private JButton b4=new JButton ("���s�}�l");
	private JButton b5=new JButton ("�P�_");

	private JLabel lab1=new JLabel  ("���^�奴�r�t��",SwingConstants.CENTER);
	private JLabel lab2=new JLabel  ("60",SwingConstants.CENTER);
	private JLabel lab3=new JLabel  ("�A���F0�Ӧr",SwingConstants.CENTER);
	private JLabel lab4=new JLabel  ("���F�X�Ӧr",SwingConstants.CENTER);
	

	private Panel pn1=new Panel();
	private Panel pn2=new Panel();
    private Panel pn3=new Panel();
     
    private JLabel ta=new JLabel();	
    private JTextField tf=new JTextField();
    private int tfCount =0;
	private Timer tmr;
    private Font ss = new Font("�з���", Font.BOLD, 20);
   
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
    	this.setTitle("���^���m�ߨt��");	
		 this.addWindowListener(new WindowAdapter(){
			 public void windowClosing( WindowEvent e){
				 System.exit(0);
			 }
		 });
		 
         this.setBounds(650, 250, 915, 800);
		 this.setLayout(new BorderLayout(5,5));
		 lab1.setFont(new Font("�з���", Font.BOLD, 20));
		 ta.setFont(ss);lab3.setFont(ss); lab4.setFont(ss);lab2.setFont(ss);

		 lab1.setBackground(Color.PINK);
         pn1.setLayout(new GridLayout(1,1,1,-15));
         pn2.setLayout(new GridLayout(2,1,1,0));
         pn3.setLayout(new GridLayout(2,1,1,0));
         pn1.add(lab1);
         pn1.add(lab2);     
         pn1.add(comebox);
        comebox.addItem("����");
        comebox.addItem("�^��");


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
					//�C�����@���� 
					//Thread.sleep(1000); 						
					//} catch (Exception e1) {} 	 									
					//lab2.setText("�˼�"+i+"��"); 
					//} 
				tf.setEnabled(true);
				b3.setEnabled(false);
				
				if(comebox.getSelectedItem().equals("����")){
					ta.setText(fun1());
				}else{
					ta.setText(fun2());
				}			
			}				
		 });
		 b4.addActionListener(new ActionListener(){		 
				public void actionPerformed(ActionEvent ae) {
					b3.setEnabled(true);
					lab4.setText("���F0�X�Ӧr");
					lab3.setText("���F�X�Ӧr");
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
			 lab3.setText("���A���F"+tfCount+"�Ӧr");
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
	    	lab4.setText("���F"+(IT+(v1.length-v2.length))+"�X�Ӧr");		
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
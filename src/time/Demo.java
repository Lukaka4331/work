package time;

import java.awt.*; 
import java.awt.event.*; 

public class Demo { 
TextField input = new TextField(""); 
Label label = new Label(); 
Button but = new Button("�}�l�˼�"); 
public static void main(String args[]) { 
new Demo().start(); 
} 
private void start() { 
Frame f = new Frame("�п�J�r��"); 

f.setSize(150, 100); 

but.addActionListener(new ActionListener(){ 

public void actionPerformed(ActionEvent e) { 
if (input.getText() != null) { 
int times = Integer.parseInt(input.getText()); 
System.out.println(times); 
for(int i=times;i>=0;i--){ 
try { 
//�C�����@���� 
Thread.sleep(1000); 
} catch (InterruptedException e1) { 
e1.printStackTrace(); 
} 
label.setText("�˼�"+i+"��"); 
} 

} 

}}); 

f.setLayout(new GridLayout(3, 1)); // �n�g�b����[�J���᭱ 
f.add(but); 
f.add(input); 
f.add(label); 
f.setVisible(true); 

} 


} 

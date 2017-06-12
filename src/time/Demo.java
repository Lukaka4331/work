package time;

import java.awt.*; 
import java.awt.event.*; 

public class Demo { 
TextField input = new TextField(""); 
Label label = new Label(); 
Button but = new Button("開始倒數"); 
public static void main(String args[]) { 
new Demo().start(); 
} 
private void start() { 
Frame f = new Frame("請輸入字串"); 

f.setSize(150, 100); 

but.addActionListener(new ActionListener(){ 

public void actionPerformed(ActionEvent e) { 
if (input.getText() != null) { 
int times = Integer.parseInt(input.getText()); 
System.out.println(times); 
for(int i=times;i>=0;i--){ 
try { 
//每次停一秒鐘 
Thread.sleep(1000); 
} catch (InterruptedException e1) { 
e1.printStackTrace(); 
} 
label.setText("倒數"+i+"秒"); 
} 

} 

}}); 

f.setLayout(new GridLayout(3, 1)); // 要寫在元件加入的後面 
f.add(but); 
f.add(input); 
f.add(label); 
f.setVisible(true); 

} 


} 

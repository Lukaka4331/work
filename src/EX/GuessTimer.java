package EX;
import javax.swing.JLabel;

import java.util.Timer;

import java.util.TimerTask;

public class GuessTimer{

 public interface Listener{
 public void timeOut();
 public void onChange(long sec);
 }
 private Listener lis;
 private Timer timer;
 private JLabel timeLab;
 private long delay;
 private long sec;
 public GuessTimer() {
 delay = 1;
 }
 public void setJLabel(JLabel lab){

 timeLab = lab;

 }

 public void addListener(Listener li){

 lis = li;

 }

 

 public void setJComponent(long d){

 delay = d;

 }


 public void startTimer(int s){

 

 if(timer == null){

 

 timer = new Timer();

 sec = s;

 

 TimerTask task = new TimerTask(){

 public void run(){

 sec -= delay;

 timeLab.setText(String.valueOf(sec));

 if(lis != null){

 lis.onChange(sec);

 }

 

 if(sec <= 0){

 stopoTimer();

 if(lis != null){

 lis.timeOut();
 }
 }
 }
 };

 

 long delaySec = delay * 1000;

 timer.schedule(task, delaySec, delaySec);

 

 }

 }

 

 /**

  * ����TIMER

  * @param s

  */

 public void stopoTimer(){

 if(timer != null){

 timer.cancel();

 timer = null;

 }

 }
 
	 
 

 public static void main(String [] args){

 

 //�d��

 JLabel lab = new JLabel();

 GuessTimer timer = new GuessTimer();

 timer.setJLabel(lab);

 //��ť�p�ɾ�timeout�ƥ�(�i�諸�ƥ�A����@�]�i�H�ϥ�timer

 timer.addListener(new GuessTimer.Listener() {

 @Override

 public void timeOut() {

 //�B�zTimeOut�ƥ�

 }

 

 @Override

 public void onChange(long sec) {

 System.out.println("sec=>" + sec);

 }

 });

 timer.startTimer(6);

 }

}

package EX;
import javax.swing.*;

public class Ex08_302 {

	Ex08_302() {
		// �ŧi��������
		JFrame frame = new JFrame();
		// �]�w�������D
		frame.setTitle("Java �򥻵���");
		// �]�w���������榡
		frame.setLayout(null);
		
		// �ŧiJComboBox
		JComboBox comebox = new JComboBox();
		// �W�[���e��comebox
		comebox.addItem("A");
		comebox.addItem("B");
		comebox.addItem("C");
		comebox.addItem("D");
		// �]�w����(X�b,Y�b,�e,��)
		comebox.setBounds(60, 40, 100, 20);
		// �N����s�W�������
		frame.add(comebox);

		// �]�w�����j�p(�e,��)
		frame.setSize(250, 200);
		// ��ܵ���
		frame.setVisible(true);
	}

	public static void main(String args[]) {
		new Ex08_302();
	}
}

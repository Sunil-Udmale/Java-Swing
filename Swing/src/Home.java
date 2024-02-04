import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
	JButton button1, button2;

	public Home() {

		button1 = new JButton("Save");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SaveEmployee();
				dispose();
			}
		});

		button2 = new JButton("Delete");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new DeleteEmployee();
				dispose();
			}
		});

		JPanel panel = new JPanel(new FlowLayout());
		panel.add(button1);
		panel.add(button2);

		add(panel);
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Home();
	}
}

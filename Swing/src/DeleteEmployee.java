import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteEmployee extends JFrame {

	JLabel label1;
	JTextField field1;
	JButton button1;

	public DeleteEmployee() {
		setLayout(null);
		label1 = new JLabel("Id");
		field1 = new JTextField(10);
		button1 = new JButton("Delete");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Deleted");
			}

		});

		label1.setBounds(50, 50, 60, 30);
		field1.setBounds(120, 50, 100, 30);
		button1.setBounds(200, 300, 90, 30);

		add(label1);
		add(field1);
		add(button1);
		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new DeleteEmployee();
	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SaveEmployee extends JFrame {

	JLabel label1, label2, label3, label4;
	JTextField field1, field2, field3, field4;
	JButton button1;

	public SaveEmployee() {
		setLayout(null);
		label1 = new JLabel("Id");
		label2 = new JLabel("Name");
		label3 = new JLabel("Salary");
		label4 = new JLabel("Address");
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		field3 = new JTextField(10);
		field4 = new JTextField(10);
		button1 = new JButton("Save");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Saved");
			}

		});

		label1.setBounds(50, 50, 60, 30);
		field1.setBounds(120, 50, 100, 30);
		label2.setBounds(50, 100, 60, 30);
		field2.setBounds(120, 100, 100, 30);
		label3.setBounds(50, 150, 60, 30);
		field3.setBounds(120, 150, 100, 30);
		label4.setBounds(50, 200, 60, 30);
		field4.setBounds(120, 200, 100, 30);
		button1.setBounds(200, 300, 90, 30);

		add(label1);
		add(field1);
		add(label2);
		add(field2);
		add(label3);
		add(field3);
		add(label4);
		add(field4);
		add(button1);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SaveEmployee();
	}
}

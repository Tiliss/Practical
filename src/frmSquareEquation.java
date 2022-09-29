import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txt_a;
	private JTextField txt_b;
	private JTextField txt_c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTaskName = new JLabel("Квадратное уравнение");
		lblTaskName.setBounds(70, 19, 129, 14);
		contentPane.add(lblTaskName);
		
		txt_a = new JTextField();
		txt_a.setText("0");
		txt_a.setBounds(28, 50, 41, 20);
		contentPane.add(txt_a);
		txt_a.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("x2 + ");
		lblNewLabel.setBounds(79, 53, 32, 14);
		contentPane.add(lblNewLabel);
		
		txt_b = new JTextField();
		txt_b.setText("0");
		txt_b.setColumns(10);
		txt_b.setBounds(111, 50, 41, 20);
		contentPane.add(txt_b);
		
		JLabel lblNewLabel_1 = new JLabel("x + ");
		lblNewLabel_1.setBounds(158, 53, 32, 14);
		contentPane.add(lblNewLabel_1);
		
		txt_c = new JTextField();
		txt_c.setText("0");
		txt_c.setColumns(10);
		txt_c.setBounds(180, 50, 41, 20);
		contentPane.add(txt_c);
		
		JLabel lblNewLabel_2 = new JLabel("= 0");
		lblNewLabel_2.setBounds(231, 53, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblSolution = new JLabel("");
		lblSolution.setBounds(28, 147, 193, 33);
		contentPane.add(lblSolution);
		
		JButton btnSolve = new JButton("Решить уравнение");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a, b, c;
				try
				{
					a = Double.parseDouble(txt_a.getText());
				}
				catch(NumberFormatException nfe)
				{
					a = 0.0;
					txt_a.setText("0.0"); 
				}
				
				try
				{
					b = Double.parseDouble(txt_b.getText());
				}
				catch(NumberFormatException nfe)
				{
					b = 0.0;
					txt_a.setText("0.0"); 
				}
				
				try
				{
					c = Double.parseDouble(txt_c.getText());
				}
				catch(NumberFormatException nfe)
				{
					c = 0.0;
					txt_a.setText("0.0"); 
				}
				double D = b*b-4.*a*c;
				double x1,x2;
				String Sol = "";
				if(D < 0.0)
				{
					Sol = "Действительных корней нет"; 
				}
				else if(D > 0. && a != 0.)
				{
					x1 = (-b + Math.sqrt(D)) / (2. * a); 
					x2 = (-b - Math.sqrt(D)) / (2. * a); 
					Sol = "Корни: x1 = " + x1 + ", x2 = " + x2; 
				}
				else if(D == 0.0 && a != 0.0)
				{
					x1 = -b / (2. * a); 
					Sol = "Корень x = " + x1; 
				}
				else if(a == 0 && b != 0.)
				{
					x1 = -c / b; 
					Sol = "Корень x = " + x1; 
				}
				lblSolution.setText(Sol); 
			}
		});
		btnSolve.setBounds(53, 88, 156, 23);
		contentPane.add(btnSolve);
		
		JLabel lblNewLabel_3 = new JLabel("Решение");
		lblNewLabel_3.setBounds(111, 122, 58, 14);
		contentPane.add(lblNewLabel_3);
		
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class janela {

	private JFrame frmMonitorizaoDeCulturas;
	private JTextField textField;
	private JTextField textField_1;
	private int MINUTES = 2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela window = new janela();
					window.frmMonitorizaoDeCulturas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMonitorizaoDeCulturas = new JFrame();
		frmMonitorizaoDeCulturas.getContentPane().setBackground(new Color(153, 204, 204));
		frmMonitorizaoDeCulturas.getContentPane().setLayout(null);
		
		JLabel lblMonitorizaoDeCulturas = new JLabel("Monitoriza\u00E7\u00E3o de Culturas");
		lblMonitorizaoDeCulturas.setForeground(new Color(0, 102, 153));
		lblMonitorizaoDeCulturas.setFont(new Font("Stencil", Font.BOLD, 30));
		lblMonitorizaoDeCulturas.setBounds(130, 23, 517, 103);
		frmMonitorizaoDeCulturas.getContentPane().add(lblMonitorizaoDeCulturas);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setForeground(new Color(0, 102, 153));
		lblUser.setFont(new Font("Stencil", Font.BOLD, 15));
		lblUser.setBounds(76, 201, 78, 25);
		frmMonitorizaoDeCulturas.getContentPane().add(lblUser);
		
		JLabel lblPass = new JLabel("Pass:");
		lblPass.setForeground(new Color(0, 102, 153));
		lblPass.setFont(new Font("Stencil", Font.BOLD, 15));
		lblPass.setBounds(76, 275, 78, 25);
		frmMonitorizaoDeCulturas.getContentPane().add(lblPass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Timer timer = new Timer();
				 timer.schedule(new TimerTask() {
				    @Override
				    public void run() { 
				    	Sbc a = new Sbc(textField.getText(),textField_1.getText());
				    }
				 }, 0, 1000 * 60 * MINUTES);
				
			}
		});
		btnLogin.setBounds(310, 378, 97, 25);
		frmMonitorizaoDeCulturas.getContentPane().add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(166, 200, 241, 22);
		frmMonitorizaoDeCulturas.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 274, 241, 22);
		frmMonitorizaoDeCulturas.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		frmMonitorizaoDeCulturas.setBackground(Color.WHITE);
		frmMonitorizaoDeCulturas.setForeground(Color.WHITE);
		frmMonitorizaoDeCulturas.setTitle("Monitoriza\u00E7\u00E3o de Culturas em Laborat\u00F3rio");
		frmMonitorizaoDeCulturas.setBounds(100, 100, 777, 648);
		frmMonitorizaoDeCulturas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public String getuser() {
		return textField.getText();
	}

	public String getpass() {
		return textField_1.getText();
	}
	
	
}

package birdAlgo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class firstPage extends JFrame {
	private JPanel contentPane;
	private JTextField textFieldInput;
	private JTextField textFieldAnsBruteTime;
	private JTextField textFieldAnsStrasTime;
	private JTextField textFieldDiffTime;
	int[][] a;
	int[][] b;
	int size;
	double start;
	double end;
	double startstart;
	double endend;
	int[][] ansS;
	int[][] ansB;
	double timeS;
	double timeB;
	private JTextField textFieldInputNumMat;
	private JTextField textFieldStrasse;
	private JTextField textFieldBrute;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstPage frame = new firstPage();
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
	public firstPage() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 738);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(94, 109, 216, 194);
		contentPane.add(scrollPane_4);
		
		JTextArea textAreaMatA = new JTextArea();
		scrollPane_4.setViewportView(textAreaMatA);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(371, 109, 216, 194);
		contentPane.add(scrollPane_5);
		
		JTextArea textAreaMatB = new JTextArea();
		scrollPane_5.setViewportView(textAreaMatB);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(94, 341, 216, 194);
		contentPane.add(scrollPane_6);
		
		JTextArea textAreaBruteFor = new JTextArea();
		scrollPane_6.setViewportView(textAreaBruteFor);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(371, 341, 216, 194);
		contentPane.add(scrollPane_7);
		
		JTextArea textAreaStrassen = new JTextArea();
		scrollPane_7.setViewportView(textAreaStrassen);
		
		textFieldInputNumMat = new JTextField();
		textFieldInputNumMat.setBounds(141, 59, 243, 20);
		contentPane.add(textFieldInputNumMat);
		textFieldInputNumMat.setColumns(10);
		
		JLabel lblSizeOfMat = new JLabel("Size of Matrix");
		lblSizeOfMat.setForeground(Color.BLACK);
		lblSizeOfMat.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSizeOfMat.setBounds(21, 59, 110, 20);
		contentPane.add(lblSizeOfMat);
		
		JButton buttonGe = new JButton("Generate", new ImageIcon(firstPage.class.getResource("GenerateButton.png")));
		buttonGe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGe.setBackground(Color.MAGENTA);
		buttonGe.setBounds(394, 45, 198, 53);
		contentPane.add(buttonGe);
		
		JButton buttonReset = new JButton("", new ImageIcon(firstPage.class.getResource("ResetButton.png")));
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonReset.setBounds(602, 45, 204, 53);
		contentPane.add(buttonReset);
		
		JButton btnCom = new JButton("New button", new ImageIcon(firstPage.class.getResource("Comparebutton-01.png")));
		btnCom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCom.setBounds(615, 296, 198, 53);
		contentPane.add(btnCom);
		
		JLabel lblNewLabel_2 = new JLabel("Calculate Algorithm");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(94, 314, 233, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblTextStrass = new JLabel("Strassen Time");
		lblTextStrass.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTextStrass.setBounds(158, 576, 216, 17);
		contentPane.add(lblTextStrass);
		
		textFieldStrasse = new JTextField();
		textFieldStrasse.setBounds(397, 574, 243, 20);
		contentPane.add(textFieldStrasse);
		textFieldStrasse.setColumns(10);
		
		textFieldBrute = new JTextField();
		textFieldBrute.setColumns(10);
		textFieldBrute.setBounds(397, 615, 243, 20);
		contentPane.add(textFieldBrute);
		
		JLabel labelTextBrute = new JLabel("Brute force Time");
		labelTextBrute.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelTextBrute.setBounds(158, 617, 216, 17);
		contentPane.add(labelTextBrute);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(397, 658, 243, 20);
		contentPane.add(textField_2);
		
		JLabel labelDiff = new JLabel("Different Time");
		labelDiff.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelDiff.setBounds(158, 660, 216, 17);
		contentPane.add(labelDiff);
		
		JLabel lblLogo = new JLabel("New label", new ImageIcon(firstPage.class.getResource("Logo.png")), 0);
		lblLogo.setBounds(10, 16, 573, 186);
		contentPane.add(lblLogo);
		
		JLabel lblBackg = new JLabel("New label", new ImageIcon(firstPage.class.getResource("1681461.jpg")), 0);
		lblBackg.setBounds(0, -49, 848, 806);
		contentPane.add(lblBackg);
		
		JLabel lblCompareAlgorithm = new JLabel("Compare Algorithm");
		
		JLabel lblSizeOfMatrix = new JLabel("Size of Matrix");
		
		textFieldInput = new JTextField();
		textFieldInput.setColumns(10);
		
		JButton btnGenerate = new JButton("Generate");
		JTextArea textAreaAnsStras = new JTextArea();
		JButton btnReset = new JButton("Reset");
		JTextArea textAreaMatrixA = new JTextArea();
		JLabel lblNewLabel = new JLabel("Matrix A");
		JTextArea textAreaAnsBrute = new JTextArea();
		JLabel lblMatrixB = new JLabel("Matrix B");
		JTextArea textAreaMatrixB = new JTextArea();
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		JLabel lblCalculateAlgorithm = new JLabel("Calculate Algorithm");
		
		JButton btnCompare = new JButton("Compare");
		
		JLabel lblNewLabel_1 = new JLabel("Brute force time :");
		
		textFieldAnsBruteTime = new JTextField();
		textFieldAnsBruteTime.setColumns(10);
		
		textFieldAnsStrasTime = new JTextField();
		textFieldAnsStrasTime.setColumns(10);
		
		JLabel lblStrassenTime = new JLabel("Strassen time :");
		
		JLabel lblDifferenceTime = new JLabel("Difference time :");
		buttonGe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				size = Integer.valueOf(textFieldInputNumMat.getText());
				a = new int[size][size];
				b = new int[size][size];
				ansS = new int[size][size];
				ansB = new int[size][size];
				a = generate(size);
				b = generate(size);
				textAreaMatA.setText((convertMat(a, size)));
				textAreaMatB.setText(convertMat(b, size));
				
			}
		});
		
		
		buttonReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textFieldInputNumMat.setText("");
				textAreaMatA.setText("");
				textAreaMatB.setText("");
				textFieldBrute.setText("");
				textFieldStrasse.setText("");
				textAreaStrassen.setText("");
				textAreaBruteFor.setText("");
				textField_2.setText("");
			}
		});
		btnCom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				start = System.nanoTime();
				ansB = multiply(a, b, size);
				end = System.nanoTime();
				startstart = System.nanoTime();
				ansS = strassen(a, b);
				endend = System.nanoTime();
				timeB = end - start;
				timeB = timeB/1000000000;
				timeS = endend - startstart;
				timeS = timeS/1000000000;
				textAreaBruteFor.setText(convertMat(ansB, size));
				textAreaStrassen.setText(convertMat(ansS, size));
				textFieldStrasse.setText(String.valueOf(timeB));
				textFieldBrute.setText(String.valueOf(timeS));
				textField_2.setText(String.valueOf(timeS-timeB));
			}
		});
		textFieldDiffTime = new JTextField();
		textFieldDiffTime.setColumns(10);
		
		
		
		scrollPane_1.setViewportView(textAreaMatrixB);
		
		
		scrollPane_3.setViewportView(textAreaAnsBrute);
		
		
		scrollPane.setViewportView(textAreaMatrixA);
		
		
		scrollPane_2.setViewportView(textAreaAnsStras);

	}
	public static int[][] add(int[][] a, int[][] b) {
		int n = a.length;
		int[][] c = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				c[i][j] = a[i][j] + b[i][j];
		}
		return c;
	}

	public static int[][] sub(int[][] a, int[][] b) {
		int n = a.length;
		int[][] c = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				c[i][j] = a[i][j] - b[i][j];
		}
		return c;
	}

	public static void join(int[][] P, int[][] C, int iB, int jB) {
		int i2 = iB;
		for (int i1 = 0; i1 < P.length; i1++) {
			int j2 = jB;
			for (int j1 = 0; j1 < P.length; j1++) {
				C[i2][j2] = P[i1][j1];
				j2++;
			}
			i2++;
		}
	}
	public static int[][] strassen(int[][] a, int[][] b) {
		int n = a.length;
		int[][] R = new int[n][n];
		if (n == 1)
			R[0][0] = a[0][0] * b[0][0];
		else {
			int[][] a11 = new int[n / 2][n / 2];
			int[][] a12 = new int[n / 2][n / 2];
			int[][] a21 = new int[n / 2][n / 2];
			int[][] a22 = new int[n / 2][n / 2];
			int[][] b11 = new int[n / 2][n / 2];
			int[][] b12 = new int[n / 2][n / 2];
			int[][] b21 = new int[n / 2][n / 2];
			int[][] b22 = new int[n / 2][n / 2];

			split(a, a11, 0, 0);
			split(a, a12, 0, n / 2);
			split(a, a21, n / 2, 0);
			split(a, a22, n / 2, n / 2);
			split(b, b11, 0, 0);
			split(b, b12, 0, n / 2);
			split(b, b21, n / 2, 0);
			split(b, b22, n / 2, n / 2);

			int[][] M1 = strassen(add(a11, a22),add(b11, b22));
			int[][] M2 = strassen(add(a21, a22), b11);
			int[][] M3 = strassen(a11, sub(b12, b22));
			int[][] M4 = strassen(a22, sub(b21, b11));
			int[][] M5 = strassen(add(a11, a12), b22);
			int[][] M6 = strassen(sub(a21, a11),add(b11, b12));
			int[][] M7 = strassen(sub(a12, a22),add(b21, b22));

			int[][] C11 =add(sub(add(M1, M4), M5), M7);
			int[][] C12 =add(M3, M5);
			int[][] C21 =add(M2, M4);
			int[][] C22 =add(sub(add(M1, M3), M2), M6);

			join(C11, R, 0, 0);
			join(C12, R, 0, n / 2);
			join(C21, R, n / 2, 0);
			join(C22, R, n / 2, n / 2);

		}
		return R;
	}

	public static void split(int[][] P, int[][] C, int iB, int jB) {
		int i2 = iB;
		for (int i1 = 0; i1 < C.length; i1++) {
			int j2 = jB;
			for (int j1 = 0; j1 < C.length; j1++) {
				C[i1][j1] = P[i2][j2];
				j2++;
			}
			i2++;
		}
	}
	public static int[][] multiply(int[][] a, int[][] b, int n) {
		// int n = a[0].length;
		int[][] c = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	public static int[][] generate(int numberColumRow){
		int[][] matrix = new int[numberColumRow][numberColumRow];
		int minimum = 1;
		int maximum = 50;
		for (int i = 0; i < numberColumRow; i++) {
			for (int j = 0; j < numberColumRow; j++) {
				matrix[i][j] = (int) (minimum + (int) (Math.random() * maximum));
			}
			
		}
		return matrix;
	}
	public static String convertMat(int[][] matrix,int numberColRow) {
		String matrixStr = "";
		StringBuilder str = new StringBuilder();
		for(int i = 0;i<matrix.length;i++) {
			str.append("[ ");
			for(int j=0;j<matrix.length;j++) {
				str.append(matrix[i][j]+"  ");
				if(j==matrix.length-1) {
					str.append("]\n");
				}
			}
		}
		matrixStr = str.toString();
		return matrixStr;
	}
}

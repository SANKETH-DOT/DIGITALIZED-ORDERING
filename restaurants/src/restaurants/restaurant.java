package restaurants;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class restaurant {

	private JFrame frame;
	private JTextField textFieldCLEAR;
	private JTextField textFieldHOTANDSAUR;
	private JTextField textFieldCOM;
	private JTextField textFieldNUGGETS;
	private JTextField textFieldFF;
	private JTextField textFieldGARLICB;
	private JTextField textFieldPERIPANEER;
	private JTextField textFieldCHICHEETOAST;
	private JTextField textFieldPSALAD;
	private JTextField textFieldCSALAD;
	private JTextField textFieldRSALAD;
	private JTextField textFieldMEXICANSAL;
	private JTextField textFieldVBUR;
	private JTextField textFieldCHEBUR;
	private JTextField textFieldCVEGBUR;
	private JTextField textFieldPPPB;
	private JTextField textFieldCHESAN;
	private JTextField textFieldVEGCHESAN;
	private JTextField textFieldSCSAN;
	private JTextField textFieldOREO;
	private JTextField textFieldBROWNIE;
	private JTextField textFieldICED;
	private JTextField textFieldFR;
	private JTextField textFieldICC;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restaurant window = new restaurant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(0, 0, 1600, 1600);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DIGITALIZED ORDERING");
		lblNewLabel.setBounds(10, 9, 1520, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 54, 509, 132);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SOUPS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 10, 254, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2.setBounds(10, 40, 489, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CLEAR");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 63, 232, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("HOT AND SOUR");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 86, 232, 13);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("CREAM OF MUSHROOM");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(10, 109, 232, 13);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("QUANTITY");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(372, 30, 97, 13);
		panel.add(lblNewLabel_4);
		
		textFieldCLEAR = new JTextField();
		textFieldCLEAR.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCLEAR.setBounds(362, 62, 96, 19);
		panel.add(textFieldCLEAR);
		textFieldCLEAR.setColumns(10);
		
		textFieldHOTANDSAUR = new JTextField();
		textFieldHOTANDSAUR.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHOTANDSAUR.setColumns(10);
		textFieldHOTANDSAUR.setBounds(362, 85, 96, 19);
		panel.add(textFieldHOTANDSAUR);
		
		textFieldCOM = new JTextField();
		textFieldCOM.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCOM.setColumns(10);
		textFieldCOM.setBounds(362, 108, 96, 19);
		panel.add(textFieldCOM);
		
		JLabel lblNewLabel_11 = new JLabel("Rs.90");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(285, 63, 45, 13);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("Rs.80");
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_1.setBounds(285, 88, 45, 13);
		panel.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_11_2 = new JLabel("Rs.120");
		lblNewLabel_11_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_2.setBounds(285, 111, 45, 13);
		panel.add(lblNewLabel_11_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(31, 211, 509, 180);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("SIDES");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(10, 10, 254, 20);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1.setBounds(10, 40, 489, 13);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("NUGGETS");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(10, 63, 232, 13);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("FRENCH FRIES");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(10, 86, 232, 13);
		panel_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("GARLIC BREAD");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(10, 109, 232, 13);
		panel_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("PERI PERI PANEER");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_6.setBounds(10, 132, 232, 13);
		panel_1.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("CHILLY CHEESE TOAST");
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_7.setBounds(10, 155, 232, 13);
		panel_1.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_4_1 = new JLabel("QUANTITY");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(372, 30, 97, 13);
		panel_1.add(lblNewLabel_4_1);
		
		textFieldNUGGETS = new JTextField();
		textFieldNUGGETS.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNUGGETS.setColumns(10);
		textFieldNUGGETS.setBounds(361, 63, 96, 19);
		panel_1.add(textFieldNUGGETS);
		
		textFieldFF = new JTextField();
		textFieldFF.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFF.setColumns(10);
		textFieldFF.setBounds(361, 85, 96, 19);
		panel_1.add(textFieldFF);
		
		textFieldGARLICB = new JTextField();
		textFieldGARLICB.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGARLICB.setColumns(10);
		textFieldGARLICB.setBounds(361, 108, 96, 19);
		panel_1.add(textFieldGARLICB);
		
		textFieldPERIPANEER = new JTextField();
		textFieldPERIPANEER.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPERIPANEER.setColumns(10);
		textFieldPERIPANEER.setBounds(361, 131, 96, 19);
		panel_1.add(textFieldPERIPANEER);
		
		textFieldCHICHEETOAST = new JTextField();
		textFieldCHICHEETOAST.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCHICHEETOAST.setColumns(10);
		textFieldCHICHEETOAST.setBounds(361, 154, 96, 19);
		panel_1.add(textFieldCHICHEETOAST);
		
		JLabel lblNewLabel_11_3 = new JLabel("Rs.120");
		lblNewLabel_11_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_3.setBounds(285, 66, 45, 13);
		panel_1.add(lblNewLabel_11_3);
		
		JLabel lblNewLabel_11_4 = new JLabel("Rs.110");
		lblNewLabel_11_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_4.setBounds(285, 88, 45, 13);
		panel_1.add(lblNewLabel_11_4);
		
		JLabel lblNewLabel_11_5 = new JLabel("Rs.130");
		lblNewLabel_11_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_5.setBounds(285, 111, 45, 13);
		panel_1.add(lblNewLabel_11_5);
		
		JLabel lblNewLabel_11_6 = new JLabel("Rs.140");
		lblNewLabel_11_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_6.setBounds(285, 134, 45, 13);
		panel_1.add(lblNewLabel_11_6);
		
		JLabel lblNewLabel_11_7 = new JLabel("Rs.150");
		lblNewLabel_11_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_7.setBounds(285, 157, 45, 13);
		panel_1.add(lblNewLabel_11_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 417, 509, 160);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SALADS");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(10, 10, 254, 20);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_1.setBounds(10, 40, 489, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("PASTA SALAD");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(10, 63, 232, 13);
		panel_2.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("CEASAR SALAD");
		lblNewLabel_3_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_2.setBounds(10, 86, 232, 13);
		panel_2.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("RUSSIAN SALAD");
		lblNewLabel_3_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_3.setBounds(10, 109, 232, 13);
		panel_2.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_3_3_4 = new JLabel("MEXICAN NACHOS GRANDE");
		lblNewLabel_3_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_4.setBounds(10, 132, 232, 13);
		panel_2.add(lblNewLabel_3_3_4);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("QUANTITY");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1_1.setBounds(372, 30, 97, 13);
		panel_2.add(lblNewLabel_4_1_1);
		
		textFieldPSALAD = new JTextField();
		textFieldPSALAD.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPSALAD.setColumns(10);
		textFieldPSALAD.setBounds(361, 63, 96, 19);
		panel_2.add(textFieldPSALAD);
		
		textFieldCSALAD = new JTextField();
		textFieldCSALAD.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCSALAD.setColumns(10);
		textFieldCSALAD.setBounds(361, 85, 96, 19);
		panel_2.add(textFieldCSALAD);
		
		textFieldRSALAD = new JTextField();
		textFieldRSALAD.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldRSALAD.setColumns(10);
		textFieldRSALAD.setBounds(361, 108, 96, 19);
		panel_2.add(textFieldRSALAD);
		
		textFieldMEXICANSAL = new JTextField();
		textFieldMEXICANSAL.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMEXICANSAL.setColumns(10);
		textFieldMEXICANSAL.setBounds(361, 131, 96, 19);
		panel_2.add(textFieldMEXICANSAL);
		
		JLabel lblNewLabel_11_8 = new JLabel("Rs.140");
		lblNewLabel_11_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_8.setBounds(285, 65, 45, 13);
		panel_2.add(lblNewLabel_11_8);
		
		JLabel lblNewLabel_11_9 = new JLabel("Rs.120");
		lblNewLabel_11_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_9.setBounds(285, 88, 45, 13);
		panel_2.add(lblNewLabel_11_9);
		
		JLabel lblNewLabel_11_10 = new JLabel("Rs.160");
		lblNewLabel_11_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_10.setBounds(285, 111, 45, 13);
		panel_2.add(lblNewLabel_11_10);
		
		JLabel lblNewLabel_11_11 = new JLabel("Rs.190");
		lblNewLabel_11_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_11.setBounds(285, 134, 45, 13);
		panel_2.add(lblNewLabel_11_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(31, 602, 509, 153);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("BURGERS");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(10, 10, 254, 20);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_1_1.setBounds(10, 40, 489, 13);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("VEG BURGER");
		lblNewLabel_3_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1_1.setBounds(10, 63, 232, 13);
		panel_3.add(lblNewLabel_3_3_1_1);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("CHEESE BURGER");
		lblNewLabel_3_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2.setBounds(10, 86, 232, 13);
		panel_3.add(lblNewLabel_3_3_1_2);
		
		JLabel lblNewLabel_3_3_1_2_1 = new JLabel("CRUNCHY VEG BURGER");
		lblNewLabel_3_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2_1.setBounds(10, 109, 232, 13);
		panel_3.add(lblNewLabel_3_3_1_2_1);
		
		JLabel lblNewLabel_3_3_1_2_2 = new JLabel("PERI PERI PANEER BURGER");
		lblNewLabel_3_3_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2_2.setBounds(10, 132, 232, 13);
		panel_3.add(lblNewLabel_3_3_1_2_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("QUANTITY");
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1_2.setBounds(372, 30, 97, 13);
		panel_3.add(lblNewLabel_4_1_2);
		
		textFieldVBUR = new JTextField();
		textFieldVBUR.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldVBUR.setColumns(10);
		textFieldVBUR.setBounds(360, 57, 96, 19);
		panel_3.add(textFieldVBUR);
		
		textFieldCHEBUR = new JTextField();
		textFieldCHEBUR.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCHEBUR.setColumns(10);
		textFieldCHEBUR.setBounds(360, 80, 96, 19);
		panel_3.add(textFieldCHEBUR);
		
		textFieldCVEGBUR = new JTextField();
		textFieldCVEGBUR.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCVEGBUR.setColumns(10);
		textFieldCVEGBUR.setBounds(360, 103, 96, 19);
		panel_3.add(textFieldCVEGBUR);
		
		textFieldPPPB = new JTextField();
		textFieldPPPB.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPPPB.setColumns(10);
		textFieldPPPB.setBounds(360, 126, 96, 19);
		panel_3.add(textFieldPPPB);
		
		JLabel lblNewLabel_11_12 = new JLabel("Rs.150");
		lblNewLabel_11_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_12.setBounds(285, 65, 45, 13);
		panel_3.add(lblNewLabel_11_12);
		
		JLabel lblNewLabel_11_13 = new JLabel("Rs.180");
		lblNewLabel_11_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_13.setBounds(285, 88, 45, 13);
		panel_3.add(lblNewLabel_11_13);
		
		JLabel lblNewLabel_11_14 = new JLabel("Rs.170");
		lblNewLabel_11_14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_14.setBounds(285, 111, 45, 13);
		panel_3.add(lblNewLabel_11_14);
		
		JLabel lblNewLabel_11_15 = new JLabel("Rs.250");
		lblNewLabel_11_15.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_15.setBounds(285, 134, 45, 13);
		panel_3.add(lblNewLabel_11_15);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(588, 54, 509, 133);
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_3_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("SANDWICHES");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1.setBounds(10, 10, 254, 20);
		panel_3_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_1_1_1.setBounds(10, 40, 489, 13);
		panel_3_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("CHEESE SANDWICH");
		lblNewLabel_3_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1_1_1.setBounds(10, 63, 232, 13);
		panel_3_1.add(lblNewLabel_3_3_1_1_1);
		
		JLabel lblNewLabel_3_3_1_2_3 = new JLabel("VEG CLUB SANDWICH");
		lblNewLabel_3_3_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2_3.setBounds(10, 86, 232, 13);
		panel_3_1.add(lblNewLabel_3_3_1_2_3);
		
		JLabel lblNewLabel_3_3_1_2_1_1 = new JLabel("SPINACH AND CORN SANDWICH");
		lblNewLabel_3_3_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2_1_1.setBounds(10, 106, 254, 13);
		panel_3_1.add(lblNewLabel_3_3_1_2_1_1);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("QUANTITY");
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1_3.setBounds(372, 30, 97, 13);
		panel_3_1.add(lblNewLabel_4_1_3);
		
		textFieldCHESAN = new JTextField();
		textFieldCHESAN.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCHESAN.setColumns(10);
		textFieldCHESAN.setBounds(360, 57, 96, 19);
		panel_3_1.add(textFieldCHESAN);
		
		textFieldVEGCHESAN = new JTextField();
		textFieldVEGCHESAN.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldVEGCHESAN.setColumns(10);
		textFieldVEGCHESAN.setBounds(360, 78, 96, 19);
		panel_3_1.add(textFieldVEGCHESAN);
		
		textFieldSCSAN = new JTextField();
		textFieldSCSAN.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSCSAN.setColumns(10);
		textFieldSCSAN.setBounds(360, 101, 96, 19);
		panel_3_1.add(textFieldSCSAN);
		
		JLabel lblNewLabel_11_16 = new JLabel("Rs.120");
		lblNewLabel_11_16.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_16.setBounds(285, 65, 45, 13);
		panel_3_1.add(lblNewLabel_11_16);
		
		JLabel lblNewLabel_11_17 = new JLabel("Rs.150");
		lblNewLabel_11_17.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_17.setBounds(285, 88, 45, 13);
		panel_3_1.add(lblNewLabel_11_17);
		
		JLabel lblNewLabel_11_18 = new JLabel("Rs.160");
		lblNewLabel_11_18.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_18.setBounds(285, 108, 45, 13);
		panel_3_1.add(lblNewLabel_11_18);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(588, 197, 509, 180);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("COLD COFFEE");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(10, 10, 254, 20);
		panel_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_2.setBounds(10, 40, 489, 13);
		panel_1_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3_3_5 = new JLabel("OREO");
		lblNewLabel_3_3_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_5.setBounds(10, 63, 232, 13);
		panel_1_1.add(lblNewLabel_3_3_5);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("BROWNIE");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4_1.setBounds(10, 86, 232, 13);
		panel_1_1.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("ICED LATTE");
		lblNewLabel_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_1.setBounds(10, 109, 232, 13);
		panel_1_1.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_3_6_1 = new JLabel("FERRERO ROCHER");
		lblNewLabel_3_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_6_1.setBounds(10, 132, 232, 13);
		panel_1_1.add(lblNewLabel_3_6_1);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("IRISH COLD COFFEE");
		lblNewLabel_3_7_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_7_1.setBounds(10, 155, 232, 13);
		panel_1_1.add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("QUANTITY");
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1_4.setBounds(366, 30, 97, 13);
		panel_1_1.add(lblNewLabel_4_1_4);
		
		textFieldOREO = new JTextField();
		textFieldOREO.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOREO.setColumns(10);
		textFieldOREO.setBounds(355, 62, 96, 19);
		panel_1_1.add(textFieldOREO);
		
		textFieldBROWNIE = new JTextField();
		textFieldBROWNIE.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBROWNIE.setColumns(10);
		textFieldBROWNIE.setBounds(355, 85, 96, 19);
		panel_1_1.add(textFieldBROWNIE);
		
		textFieldICED = new JTextField();
		textFieldICED.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldICED.setColumns(10);
		textFieldICED.setBounds(355, 108, 96, 19);
		panel_1_1.add(textFieldICED);
		
		textFieldFR = new JTextField();
		textFieldFR.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFR.setColumns(10);
		textFieldFR.setBounds(355, 131, 96, 19);
		panel_1_1.add(textFieldFR);
		
		textFieldICC = new JTextField();
		textFieldICC.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldICC.setColumns(10);
		textFieldICC.setBounds(355, 154, 96, 19);
		panel_1_1.add(textFieldICC);
		
		JLabel lblNewLabel_11_19 = new JLabel("Rs.120");
		lblNewLabel_11_19.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_19.setBounds(285, 65, 45, 13);
		panel_1_1.add(lblNewLabel_11_19);
		
		JLabel lblNewLabel_11_20 = new JLabel("Rs.140");
		lblNewLabel_11_20.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_20.setBounds(285, 88, 45, 13);
		panel_1_1.add(lblNewLabel_11_20);
		
		JLabel lblNewLabel_11_21 = new JLabel("Rs.150");
		lblNewLabel_11_21.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_21.setBounds(285, 111, 45, 13);
		panel_1_1.add(lblNewLabel_11_21);
		
		JLabel lblNewLabel_11_22 = new JLabel("Rs.200");
		lblNewLabel_11_22.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_22.setBounds(285, 134, 45, 13);
		panel_1_1.add(lblNewLabel_11_22);
		
		JLabel lblNewLabel_11_23 = new JLabel("Rs.180");
		lblNewLabel_11_23.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11_23.setBounds(285, 157, 45, 13);
		panel_1_1.add(lblNewLabel_11_23);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(588, 387, 509, 274);
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("COST OF INDIVIDUAL ITEMS");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_3.setBounds(10, 10, 489, 20);
		panel_1_2.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_3.setBounds(10, 40, 489, 13);
		panel_1_2.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_3_6 = new JLabel("COST OF SOUP");
		lblNewLabel_3_3_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_6.setBounds(10, 63, 232, 13);
		panel_1_2.add(lblNewLabel_3_3_6);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("COST OF SIDES");
		lblNewLabel_3_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4_2.setBounds(10, 102, 232, 13);
		panel_1_2.add(lblNewLabel_3_4_2);
		
		JLabel lblNewLabel_3_5_2 = new JLabel("COST OF SALADS");
		lblNewLabel_3_5_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_2.setBounds(10, 137, 232, 13);
		panel_1_2.add(lblNewLabel_3_5_2);
		
		JLabel lblNewLabel_3_6_2 = new JLabel("COST OF BURGERS");
		lblNewLabel_3_6_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_6_2.setBounds(10, 172, 232, 13);
		panel_1_2.add(lblNewLabel_3_6_2);
		
		JLabel lblNewLabel_3_7_2 = new JLabel("COST OF SANDWICHES");
		lblNewLabel_3_7_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_7_2.setBounds(10, 209, 232, 13);
		panel_1_2.add(lblNewLabel_3_7_2);
		
		JLabel lblNewLabel_3_7_2_1 = new JLabel("COST OF COLD COFFEE");
		lblNewLabel_3_7_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_7_2_1.setBounds(10, 244, 232, 13);
		panel_1_2.add(lblNewLabel_3_7_2_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_2_1.setBounds(10, 79, 489, 13);
		panel_1_2.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_2_2.setBounds(10, 114, 489, 13);
		panel_1_2.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_2_3.setBounds(10, 149, 489, 13);
		panel_1_2.add(lblNewLabel_2_1_2_3);
		
		JLabel lblNewLabel_2_1_2_4 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_2_4.setBounds(10, 186, 489, 13);
		panel_1_2.add(lblNewLabel_2_1_2_4);
		
		JLabel lblNewLabel_2_1_2_5 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_2_5.setBounds(10, 221, 489, 13);
		panel_1_2.add(lblNewLabel_2_1_2_5);
		
		JLabel SOUP = new JLabel("");
		SOUP.setHorizontalAlignment(SwingConstants.RIGHT);
		SOUP.setBounds(355, 63, 96, 13);
		panel_1_2.add(SOUP);
		
		JLabel SIDES = new JLabel("");
		SIDES.setHorizontalAlignment(SwingConstants.RIGHT);
		SIDES.setBounds(355, 100, 96, 13);
		panel_1_2.add(SIDES);
		
		JLabel SALADS = new JLabel("");
		SALADS.setHorizontalAlignment(SwingConstants.RIGHT);
		SALADS.setBounds(355, 137, 96, 13);
		panel_1_2.add(SALADS);
		
		JLabel BURGER = new JLabel("");
		BURGER.setHorizontalAlignment(SwingConstants.RIGHT);
		BURGER.setBounds(355, 172, 96, 13);
		panel_1_2.add(BURGER);
		
		JLabel SANDWITCH = new JLabel("");
		SANDWITCH.setHorizontalAlignment(SwingConstants.RIGHT);
		SANDWITCH.setBounds(355, 211, 96, 13);
		panel_1_2.add(SANDWITCH);
		
		JLabel CC = new JLabel("");
		CC.setHorizontalAlignment(SwingConstants.RIGHT);
		CC.setBounds(355, 246, 96, 13);
		panel_1_2.add(CC);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(588, 671, 509, 113);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3_4_2_1 = new JLabel("SUB TOTAL");
		lblNewLabel_3_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4_2_1.setBounds(10, 10, 232, 13);
		panel_4.add(lblNewLabel_3_4_2_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_3_1_1.setBounds(10, 24, 489, 13);
		panel_4.add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_3_6_2_1 = new JLabel("TAX (15%)");
		lblNewLabel_3_6_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_6_2_1.setBounds(10, 47, 232, 13);
		panel_4.add(lblNewLabel_3_6_2_1);
		
		JLabel lblNewLabel_2_1_3_1_1_1 = new JLabel("............................................................................................................................................................................................................................................................................");
		lblNewLabel_2_1_3_1_1_1.setBounds(10, 65, 489, 13);
		panel_4.add(lblNewLabel_2_1_3_1_1_1);
		
		JLabel lblNewLabel_3_7_2_1_1 = new JLabel("TOTAL");
		lblNewLabel_3_7_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_7_2_1_1.setBounds(10, 88, 232, 13);
		panel_4.add(lblNewLabel_3_7_2_1_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_1.setBounds(355, 65, 96, 13);
		panel_4.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("");
		lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_2.setBounds(355, 105, 96, 13);
		panel_4.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("");
		lblNewLabel_10_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_3.setBounds(355, 142, 96, 13);
		panel_4.add(lblNewLabel_10_3);
		
		JLabel lblNewLabel_10_4 = new JLabel("");
		lblNewLabel_10_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_4.setBounds(355, 12, 96, 13);
		panel_4.add(lblNewLabel_10_4);
		
		JLabel lblNewLabel_10_5 = new JLabel("");
		lblNewLabel_10_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_5.setBounds(355, 49, 96, 13);
		panel_4.add(lblNewLabel_10_5);
		
		JLabel lblNewLabel_10_6 = new JLabel("");
		lblNewLabel_10_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_6.setBounds(355, 88, 96, 13);
		panel_4.add(lblNewLabel_10_6);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setBounds(1413, 738, 80, 21);
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnexit);
		
		JButton btnRESET = new JButton("RESET");
		btnRESET.setBounds(1161, 738, 85, 21);
		btnRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldCLEAR.setText(null);
				textFieldHOTANDSAUR.setText(null);
				textFieldCOM.setText(null);
				textFieldNUGGETS.setText(null);
				textFieldFF.setText(null);
				textFieldGARLICB.setText(null);
				textFieldPERIPANEER.setText(null);
				textFieldCHICHEETOAST.setText(null);
				textFieldPSALAD.setText(null);
				textFieldCSALAD.setText(null);
				textFieldRSALAD.setText(null);
				textFieldMEXICANSAL.setText(null);
				textFieldVBUR.setText(null);
				textFieldCHEBUR.setText(null);
				textFieldCVEGBUR.setText(null);
				textFieldPPPB.setText(null);
				textFieldCHESAN.setText(null);
				textFieldVEGCHESAN.setText(null);
				textFieldSCSAN.setText(null);
				textFieldOREO.setText(null);
				textFieldBROWNIE.setText(null);
				textFieldICED.setText(null);
				textFieldFR.setText(null);
				textFieldICC.setText(null);
				SOUP.setText(null);
				SIDES.setText(null);
				SALADS.setText(null);
				BURGER.setText(null);
				SANDWITCH.setText(null);
				CC.setText(null);
				lblNewLabel_10_4.setText(null);
				lblNewLabel_10_5.setText(null);
				lblNewLabel_10_6.setText(null);
			}
		});
		frame.getContentPane().add(btnRESET);
		
		JButton btncost = new JButton("COST");
		btncost.setBounds(1161, 612, 85, 21);
		btncost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int soupcost = Integer.parseInt(textFieldCLEAR.getText())*90 +  Integer.parseInt(textFieldHOTANDSAUR.getText())*80 + Integer.parseInt(textFieldCOM.getText())*120 ;
				SOUP.setText(Integer.toString(soupcost));
				
				int sidescost = Integer.parseInt(textFieldNUGGETS.getText())*120 +  Integer.parseInt(textFieldFF.getText())*110 + Integer.parseInt(textFieldGARLICB.getText())*130 + Integer.parseInt(textFieldPERIPANEER.getText())*140 + Integer.parseInt(textFieldCHICHEETOAST.getText())*150 ;
				SIDES.setText(Integer.toString(sidescost));
				
				int saladscost = Integer.parseInt(textFieldPSALAD.getText())*140 +  Integer.parseInt(textFieldCSALAD.getText())*120 + Integer.parseInt(textFieldRSALAD.getText())*160 + Integer.parseInt(textFieldMEXICANSAL.getText())*190 ;
				SALADS.setText(Integer.toString(saladscost));
				
				int burgercost = Integer.parseInt(textFieldVBUR.getText())*150 +  Integer.parseInt(textFieldCHEBUR.getText())*180 + Integer.parseInt(textFieldCVEGBUR.getText())*170 + Integer.parseInt(textFieldPPPB.getText())*250 ;
				BURGER.setText(Integer.toString(burgercost));
				
				int sandwitchcost = Integer.parseInt(textFieldCHESAN.getText())*120 +  Integer.parseInt(textFieldVEGCHESAN.getText())*150 + Integer.parseInt(textFieldSCSAN.getText())*160 ;
				SANDWITCH.setText(Integer.toString(sandwitchcost));
				
				int cccost = Integer.parseInt(textFieldOREO.getText())*120 +  Integer.parseInt(textFieldBROWNIE.getText())*140 + Integer.parseInt(textFieldICED.getText())*150 + Integer.parseInt(textFieldFR.getText())*200 + Integer.parseInt(textFieldICC.getText())*180 ;
				CC.setText(Integer.toString(cccost));
				
				
			}
		});
		frame.getContentPane().add(btncost);
		
		JButton btnNewButton = new JButton("SUB TOTAL");
		btnNewButton.setBounds(1384, 612, 113, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int subtotal = Integer.parseInt(SOUP.getText()) +  Integer.parseInt(SIDES.getText()) + Integer.parseInt(SALADS.getText()) + Integer.parseInt(SANDWITCH.getText()) + Integer.parseInt(BURGER.getText()) + Integer.parseInt(CC.getText());
				lblNewLabel_10_4.setText(Integer.toString(subtotal));
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TAX");
		btnNewButton_1.setBounds(1161, 674, 85, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int tax = (Integer.parseInt(lblNewLabel_10_4.getText())*15/100);
				lblNewLabel_10_5.setText(Integer.toString(tax));
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("TOTAL");
		btnNewButton_2.setBounds(1413, 674, 85, 21);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int total = Integer.parseInt(lblNewLabel_10_4.getText()) + Integer.parseInt(lblNewLabel_10_5.getText());
				lblNewLabel_10_6.setText(Integer.toString(total));
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("* PLEASE ENTER 0 FOR THE ITEMS WHICH ARE NOT REQUIRED");
		lblNewLabel_5.setBounds(31, 765, 519, 27);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(1145, 54, 355, 530);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("CALCULATOR");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 10, 344, 20);
		panel_5.add(lblNewLabel_1_1_1_1_1_1);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
					operations = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnplus.setBounds(266, 118, 70, 70);
		panel_5.add(btnplus);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setColumns(10);
		textField.setBounds(20, 35, 319, 70);
		panel_5.add(textField);
		
		JButton btnpercentage = new JButton("%");
		btnpercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
					operations = "%";
			}
		});
		btnpercentage.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnpercentage.setBounds(184, 118, 70, 70);
		panel_5.add(btnpercentage);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnAC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAC.setBounds(102, 118, 70, 70);
		panel_5.add(btnAC);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnC.setBounds(20, 118, 70, 70);
		panel_5.add(btnC);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText( EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.setBounds(20, 201, 70, 70);
		panel_5.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText( EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn8.setBounds(102, 201, 70, 70);
		panel_5.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText( EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn9.setBounds(184, 201, 70, 70);
		panel_5.add(btn9);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
					operations = "-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnminus.setBounds(266, 201, 70, 70);
		panel_5.add(btnminus);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
					operations = "*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnmultiply.setBounds(266, 284, 70, 70);
		panel_5.add(btnmultiply);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText( EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn6.setBounds(184, 284, 70, 70);
		panel_5.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText( EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn5.setBounds(102, 284, 70, 70);
		panel_5.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText( EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn4.setBounds(20, 284, 70, 70);
		panel_5.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText( EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn1.setBounds(20, 367, 70, 70);
		panel_5.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText( EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2.setBounds(102, 367, 70, 70);
		panel_5.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText( EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn3.setBounds(184, 367, 70, 70);
		panel_5.add(btn3);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
					operations = "/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btndivide.setBounds(266, 367, 70, 70);
		panel_5.add(btndivide);
		
		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%2f", result);
					textField.setText(answer);
					
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}	
			}
		});
		btnequals.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnequals.setBounds(266, 450, 70, 70);
		panel_5.add(btnequals);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops =ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPM.setBounds(184, 450, 70, 70);
		panel_5.add(btnPM);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btndot.getText();
				textField.setText( EnterNumber);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btndot.setBounds(102, 450, 70, 70);
		panel_5.add(btndot);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText( EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn0.setBounds(20, 450, 70, 70);
		panel_5.add(btn0);
	 
			
		
	}
}

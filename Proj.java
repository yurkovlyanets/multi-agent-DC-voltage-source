	import java.awt.EventQueue;

	import javax.swing.JFrame;

	import javax.swing.JTextField;

	import java.awt.Font;

	import javax.swing.SwingConstants;
	import javax.swing.JLabel;
	import javax.swing.JButton;
	import javax.swing.AbstractAction;

	import java.awt.event.ActionEvent;

	import javax.swing.Action;
	import java.awt.Color;
import javax.swing.UIManager;
	
public class Inter {
		JFrame frmKjk;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_8;
		private JTextField textField_9;
		private JTextField textField_10;
		private JTextField textField_11;
		private JTextField textField_12;
		private JTextField textField_13;
		private JTextField textField_14;
		private JTextField textField_15;
		private JTextField textField_16;
		private JTextField textField_17;
		private JTextField textField_18;
		private JTextField textField_19;
		private JTextField textField_20;
		private JTextField textField_21;
		private JTextField textField_22;
		private JTextField textField_23;
		private JTextField textField_24;
		private JTextField textField_25;
		private JTextField textField_26;
		private JTextField textField_27;
		private JTextField textField_28;
		private JTextField textField_29;
		private JTextField textField_30;
		private JTextField textField_31;
		private JTextField textField_32;
		private JTextField textField_33;
		private JTextField textField_34;
		private JTextField textField_35;
		private JTextField textField_36;
		private JTextField textField_37;
		private JTextField textField_38;
		private JTextField textField_39;
		private JTextField textField_40;
		private JTextField textField_41;
		private JTextField textField_42;
		private JTextField textField_43;
		private JTextField textField_44;
		private JTextField textField_45;
		private JTextField textField_46;
		private JTextField textField_47;
		private JTextField textField_48;
		private JTextField textField_U_zad;
		private final Action action = new SwingAction();

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Inter window = new Inter();
						window.frmKjk.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public Inter() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frmKjk = new JFrame();
			frmKjk.getContentPane().setBackground(new Color(240, 240, 240));
			frmKjk.setFont(new Font("Arial", Font.PLAIN, 15));
			frmKjk.setTitle("\u041C\u043D\u043E\u0433\u043E\u043A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u043D\u044B\u0439 \u0438\u0441\u0442\u043E\u0447\u043D\u0438\u043A \u042D\u042D");
			frmKjk.getContentPane().setLayout(null);
			frmKjk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmKjk.setSize(700, 500);
			
			textField = new JTextField();
			textField.setBackground(Color.WHITE);
			textField.setEditable(false);
			textField.setText("50");
			textField.setName("0");
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Arial", Font.PLAIN, 20));
			textField.setBounds(10, 11, 50, 50);
			frmKjk.getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBackground(Color.WHITE);
			textField_1.setEditable(false);
			textField_1.setText("25");
			textField_1.setName("1");
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_1.setColumns(10);
			textField_1.setBounds(70, 11, 50, 50);
			frmKjk.getContentPane().add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setBackground(Color.WHITE);
			textField_2.setEditable(false);
			textField_2.setText("10");
			textField_2.setName("");
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_2.setColumns(10);
			textField_2.setBounds(130, 11, 50, 50);
			frmKjk.getContentPane().add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setBackground(new Color(255, 255, 255));
			textField_3.setEditable(false);
			textField_3.setText("5");
			textField_3.setName("");
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_3.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_3.setColumns(10);
			textField_3.setBounds(190, 11, 50, 50);
			frmKjk.getContentPane().add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setBackground(Color.WHITE);
			textField_4.setEditable(false);
			textField_4.setText("2.5");
			textField_4.setName("");
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			textField_4.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_4.setColumns(10);
			textField_4.setBounds(250, 11, 50, 50);
			frmKjk.getContentPane().add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setBackground(Color.WHITE);
			textField_5.setEditable(false);
			textField_5.setText("1");
			textField_5.setName("");
			textField_5.setHorizontalAlignment(SwingConstants.CENTER);
			textField_5.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_5.setColumns(10);
			textField_5.setBounds(310, 11, 50, 50);
			frmKjk.getContentPane().add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setBackground(Color.WHITE);
			textField_6.setEditable(false);
			textField_6.setText("0.5");
			textField_6.setName("");
			textField_6.setHorizontalAlignment(SwingConstants.CENTER);
			textField_6.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_6.setColumns(10);
			textField_6.setBounds(370, 11, 50, 50);
			frmKjk.getContentPane().add(textField_6);
			
			textField_7 = new JTextField();
			textField_7.setEditable(false);
			textField_7.setText("25");
			textField_7.setName("");
			textField_7.setHorizontalAlignment(SwingConstants.CENTER);
			textField_7.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_7.setColumns(10);
			textField_7.setBounds(10, 72, 50, 50);
			frmKjk.getContentPane().add(textField_7);
			
			textField_8 = new JTextField();
			textField_8.setEditable(false);
			textField_8.setText("10");
			textField_8.setName("");
			textField_8.setHorizontalAlignment(SwingConstants.CENTER);
			textField_8.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_8.setColumns(10);
			textField_8.setBounds(70, 72, 50, 50);
			frmKjk.getContentPane().add(textField_8);
			
			textField_9 = new JTextField();
			textField_9.setEditable(false);
			textField_9.setText("5");
			textField_9.setName("");
			textField_9.setHorizontalAlignment(SwingConstants.CENTER);
			textField_9.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_9.setColumns(10);
			textField_9.setBounds(130, 72, 50, 50);
			frmKjk.getContentPane().add(textField_9);
			
			textField_10 = new JTextField();
			textField_10.setEditable(false);
			textField_10.setText("2.5");
			textField_10.setName("");
			textField_10.setHorizontalAlignment(SwingConstants.CENTER);
			textField_10.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_10.setColumns(10);
			textField_10.setBounds(190, 72, 50, 50);
			frmKjk.getContentPane().add(textField_10);
			
			textField_11 = new JTextField();
			textField_11.setEditable(false);
			textField_11.setText("1");
			textField_11.setName("");
			textField_11.setHorizontalAlignment(SwingConstants.CENTER);
			textField_11.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_11.setColumns(10);
			textField_11.setBounds(250, 72, 50, 50);
			frmKjk.getContentPane().add(textField_11);
			
			textField_12 = new JTextField();
			textField_12.setEditable(false);
			textField_12.setText("0.5");
			textField_12.setName("");
			textField_12.setHorizontalAlignment(SwingConstants.CENTER);
			textField_12.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_12.setColumns(10);
			textField_12.setBounds(310, 72, 50, 50);
			frmKjk.getContentPane().add(textField_12);
			
			textField_13 = new JTextField();
			textField_13.setEditable(false);
			textField_13.setText("50");
			textField_13.setName("");
			textField_13.setHorizontalAlignment(SwingConstants.CENTER);
			textField_13.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_13.setColumns(10);
			textField_13.setBounds(370, 72, 50, 50);
			frmKjk.getContentPane().add(textField_13);
			
			textField_14 = new JTextField();
			textField_14.setEditable(false);
			textField_14.setText("10");
			textField_14.setName("");
			textField_14.setHorizontalAlignment(SwingConstants.CENTER);
			textField_14.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_14.setColumns(10);
			textField_14.setBounds(10, 133, 50, 50);
			frmKjk.getContentPane().add(textField_14);
			
			textField_15 = new JTextField();
			textField_15.setEditable(false);
			textField_15.setText("5");
			textField_15.setName("");
			textField_15.setHorizontalAlignment(SwingConstants.CENTER);
			textField_15.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_15.setColumns(10);
			textField_15.setBounds(70, 133, 50, 50);
			frmKjk.getContentPane().add(textField_15);
			
			textField_16 = new JTextField();
			textField_16.setEditable(false);
			textField_16.setText("2.5");
			textField_16.setName("");
			textField_16.setHorizontalAlignment(SwingConstants.CENTER);
			textField_16.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_16.setColumns(10);
			textField_16.setBounds(130, 133, 50, 50);
			frmKjk.getContentPane().add(textField_16);
			
			textField_17 = new JTextField();
			textField_17.setEditable(false);
			textField_17.setText("1");
			textField_17.setName("");
			textField_17.setHorizontalAlignment(SwingConstants.CENTER);
			textField_17.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_17.setColumns(10);
			textField_17.setBounds(190, 133, 50, 50);
			frmKjk.getContentPane().add(textField_17);
			
			textField_18 = new JTextField();
			textField_18.setEditable(false);
			textField_18.setText("0.5");
			textField_18.setName("");
			textField_18.setHorizontalAlignment(SwingConstants.CENTER);
			textField_18.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_18.setColumns(10);
			textField_18.setBounds(250, 133, 50, 50);
			frmKjk.getContentPane().add(textField_18);
			
			textField_19 = new JTextField();
			textField_19.setEditable(false);
			textField_19.setText("50");
			textField_19.setName("");
			textField_19.setHorizontalAlignment(SwingConstants.CENTER);
			textField_19.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_19.setColumns(10);
			textField_19.setBounds(310, 133, 50, 50);
			frmKjk.getContentPane().add(textField_19);
			
			textField_20 = new JTextField();
			textField_20.setEditable(false);
			textField_20.setText("25");
			textField_20.setName("");
			textField_20.setHorizontalAlignment(SwingConstants.CENTER);
			textField_20.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_20.setColumns(10);
			textField_20.setBounds(370, 133, 50, 50);
			frmKjk.getContentPane().add(textField_20);
			
			textField_21 = new JTextField();
			textField_21.setEditable(false);
			textField_21.setText("5");
			textField_21.setName("");
			textField_21.setHorizontalAlignment(SwingConstants.CENTER);
			textField_21.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_21.setColumns(10);
			textField_21.setBounds(10, 194, 50, 50);
			frmKjk.getContentPane().add(textField_21);
			
			textField_22 = new JTextField();
			textField_22.setBackground(UIManager.getColor("TextField.background"));
			textField_22.setEditable(false);
			textField_22.setText("2.5");
			textField_22.setName("");
			textField_22.setHorizontalAlignment(SwingConstants.CENTER);
			textField_22.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_22.setColumns(10);
			textField_22.setBounds(70, 194, 50, 50);
			frmKjk.getContentPane().add(textField_22);
			
			textField_23 = new JTextField();
			textField_23.setEditable(false);
			textField_23.setText("1");
			textField_23.setName("");
			textField_23.setHorizontalAlignment(SwingConstants.CENTER);
			textField_23.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_23.setColumns(10);
			textField_23.setBounds(130, 194, 50, 50);
			frmKjk.getContentPane().add(textField_23);
			
			textField_24 = new JTextField();
			textField_24.setEditable(false);
			textField_24.setText("0.5");
			textField_24.setName("");
			textField_24.setHorizontalAlignment(SwingConstants.CENTER);
			textField_24.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_24.setColumns(10);
			textField_24.setBounds(190, 194, 50, 50);
			frmKjk.getContentPane().add(textField_24);
			
			textField_25 = new JTextField();
			textField_25.setEditable(false);
			textField_25.setText("50");
			textField_25.setName("");
			textField_25.setHorizontalAlignment(SwingConstants.CENTER);
			textField_25.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_25.setColumns(10);
			textField_25.setBounds(250, 194, 50, 50);
			frmKjk.getContentPane().add(textField_25);
			
			textField_26 = new JTextField();
			textField_26.setEditable(false);
			textField_26.setText("25");
			textField_26.setName("");
			textField_26.setHorizontalAlignment(SwingConstants.CENTER);
			textField_26.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_26.setColumns(10);
			textField_26.setBounds(310, 194, 50, 50);
			frmKjk.getContentPane().add(textField_26);
			
			textField_27 = new JTextField();
			textField_27.setEditable(false);
			textField_27.setText("10");
			textField_27.setName("");
			textField_27.setHorizontalAlignment(SwingConstants.CENTER);
			textField_27.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_27.setColumns(10);
			textField_27.setBounds(370, 194, 50, 50);
			frmKjk.getContentPane().add(textField_27);
			
			textField_28 = new JTextField();
			textField_28.setEditable(false);
			textField_28.setText("2.5");
			textField_28.setName("");
			textField_28.setHorizontalAlignment(SwingConstants.CENTER);
			textField_28.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_28.setColumns(10);
			textField_28.setBounds(10, 255, 50, 50);
			frmKjk.getContentPane().add(textField_28);
			
			textField_29 = new JTextField();
			textField_29.setEditable(false);
			textField_29.setText("1");
			textField_29.setName("");
			textField_29.setHorizontalAlignment(SwingConstants.CENTER);
			textField_29.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_29.setColumns(10);
			textField_29.setBounds(70, 255, 50, 50);
			frmKjk.getContentPane().add(textField_29);
			
			textField_30 = new JTextField();
			textField_30.setEditable(false);
			textField_30.setText("0.5");
			textField_30.setName("");
			textField_30.setHorizontalAlignment(SwingConstants.CENTER);
			textField_30.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_30.setColumns(10);
			textField_30.setBounds(130, 255, 50, 50);
			frmKjk.getContentPane().add(textField_30);
			
			textField_31 = new JTextField();
			textField_31.setEditable(false);
			textField_31.setText("50");
			textField_31.setName("");
			textField_31.setHorizontalAlignment(SwingConstants.CENTER);
			textField_31.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_31.setColumns(10);
			textField_31.setBounds(190, 255, 50, 50);
			frmKjk.getContentPane().add(textField_31);
			
			textField_32 = new JTextField();
			textField_32.setEditable(false);
			textField_32.setText("25");
			textField_32.setName("");
			textField_32.setHorizontalAlignment(SwingConstants.CENTER);
			textField_32.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_32.setColumns(10);
			textField_32.setBounds(250, 255, 50, 50);
			frmKjk.getContentPane().add(textField_32);
			
			textField_33 = new JTextField();
			textField_33.setEditable(false);
			textField_33.setText("10");
			textField_33.setName("");
			textField_33.setHorizontalAlignment(SwingConstants.CENTER);
			textField_33.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_33.setColumns(10);
			textField_33.setBounds(310, 255, 50, 50);
			frmKjk.getContentPane().add(textField_33);
			
			textField_34 = new JTextField();
			textField_34.setEditable(false);
			textField_34.setText("5");
			textField_34.setName("");
			textField_34.setHorizontalAlignment(SwingConstants.CENTER);
			textField_34.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_34.setColumns(10);
			textField_34.setBounds(370, 255, 50, 50);
			frmKjk.getContentPane().add(textField_34);
			
			textField_35 = new JTextField();
			textField_35.setEditable(false);
			textField_35.setText("1");
			textField_35.setName("");
			textField_35.setHorizontalAlignment(SwingConstants.CENTER);
			textField_35.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_35.setColumns(10);
			textField_35.setBounds(10, 316, 50, 50);
			frmKjk.getContentPane().add(textField_35);
			
			textField_36 = new JTextField();
			textField_36.setEditable(false);
			textField_36.setText("0.5");
			textField_36.setName("");
			textField_36.setHorizontalAlignment(SwingConstants.CENTER);
			textField_36.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_36.setColumns(10);
			textField_36.setBounds(70, 316, 50, 50);
			frmKjk.getContentPane().add(textField_36);
			
			textField_37 = new JTextField();
			textField_37.setEditable(false);
			textField_37.setText("50");
			textField_37.setName("");
			textField_37.setHorizontalAlignment(SwingConstants.CENTER);
			textField_37.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_37.setColumns(10);
			textField_37.setBounds(130, 316, 50, 50);
			frmKjk.getContentPane().add(textField_37);
			
			textField_38 = new JTextField();
			textField_38.setEditable(false);
			textField_38.setText("25");
			textField_38.setName("");
			textField_38.setHorizontalAlignment(SwingConstants.CENTER);
			textField_38.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_38.setColumns(10);
			textField_38.setBounds(190, 316, 50, 50);
			frmKjk.getContentPane().add(textField_38);
			
			textField_39 = new JTextField();
			textField_39.setEditable(false);
			textField_39.setText("10");
			textField_39.setName("");
			textField_39.setHorizontalAlignment(SwingConstants.CENTER);
			textField_39.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_39.setColumns(10);
			textField_39.setBounds(250, 316, 50, 50);
			frmKjk.getContentPane().add(textField_39);
			
			textField_40 = new JTextField();
			textField_40.setEditable(false);
			textField_40.setText("5");
			textField_40.setName("");
			textField_40.setHorizontalAlignment(SwingConstants.CENTER);
			textField_40.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_40.setColumns(10);
			textField_40.setBounds(310, 316, 50, 50);
			frmKjk.getContentPane().add(textField_40);
			
			textField_41 = new JTextField();
			textField_41.setEditable(false);
			textField_41.setText("2.5");
			textField_41.setName("");
			textField_41.setHorizontalAlignment(SwingConstants.CENTER);
			textField_41.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_41.setColumns(10);
			textField_41.setBounds(370, 316, 50, 50);
			frmKjk.getContentPane().add(textField_41);
			
			textField_42 = new JTextField();
			textField_42.setBackground(Color.WHITE);
			textField_42.setEditable(false);
			textField_42.setText("0.5");
			textField_42.setName("");
			textField_42.setHorizontalAlignment(SwingConstants.CENTER);
			textField_42.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_42.setColumns(10);
			textField_42.setBounds(10, 377, 50, 50);
			frmKjk.getContentPane().add(textField_42);
			
			textField_43 = new JTextField();
			textField_43.setBackground(Color.WHITE);
			textField_43.setEditable(false);
			textField_43.setText("50");
			textField_43.setName("");
			textField_43.setHorizontalAlignment(SwingConstants.CENTER);
			textField_43.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_43.setColumns(10);
			textField_43.setBounds(70, 377, 50, 50);
			frmKjk.getContentPane().add(textField_43);
			
			textField_44 = new JTextField();
			textField_44.setBackground(Color.WHITE);
			textField_44.setEditable(false);
			textField_44.setText("25");
			textField_44.setName("");
			textField_44.setHorizontalAlignment(SwingConstants.CENTER);
			textField_44.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_44.setColumns(10);
			textField_44.setBounds(130, 377, 50, 50);
			frmKjk.getContentPane().add(textField_44);
			
			textField_45 = new JTextField();
			textField_45.setBackground(Color.WHITE);
			textField_45.setEditable(false);
			textField_45.setText("10");
			textField_45.setName("");
			textField_45.setHorizontalAlignment(SwingConstants.CENTER);
			textField_45.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_45.setColumns(10);
			textField_45.setBounds(190, 377, 50, 50);
			frmKjk.getContentPane().add(textField_45);
			
			textField_46 = new JTextField();
			textField_46.setBackground(Color.WHITE);
			textField_46.setEditable(false);
			textField_46.setText("5");
			textField_46.setName("");
			textField_46.setHorizontalAlignment(SwingConstants.CENTER);
			textField_46.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_46.setColumns(10);
			textField_46.setBounds(250, 377, 50, 50);
			frmKjk.getContentPane().add(textField_46);
			
			textField_47 = new JTextField();
			textField_47.setBackground(Color.WHITE);
			textField_47.setEditable(false);
			textField_47.setText("2.5");
			textField_47.setName("");
			textField_47.setHorizontalAlignment(SwingConstants.CENTER);
			textField_47.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_47.setColumns(10);
			textField_47.setBounds(310, 377, 50, 50);
			frmKjk.getContentPane().add(textField_47);
			
			textField_48 = new JTextField();
			textField_48.setBackground(Color.WHITE);
			textField_48.setEditable(false);
			textField_48.setText("1");
			textField_48.setName("");
			textField_48.getText();
			textField_48.setHorizontalAlignment(SwingConstants.CENTER);
			textField_48.setFont(new Font("Arial", Font.PLAIN, 20));
			textField_48.setColumns(10);
			textField_48.setBounds(370, 377, 50, 50);
			frmKjk.getContentPane().add(textField_48);
			
			JLabel lblNewLabel = new JLabel("Required Voltage:");
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
			lblNewLabel.setBounds(450, 22, 164, 29);
			frmKjk.getContentPane().add(lblNewLabel);
			
			textField_U_zad = new JTextField();
			textField_U_zad.setBounds(450, 72, 155, 50);
			frmKjk.getContentPane().add(textField_U_zad);
			textField_U_zad.setColumns(10);
			
			JButton btnNewButton = new JButton("Calculate");
			btnNewButton.setAction(action);
			btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
			btnNewButton.setBounds(450, 144, 124, 39);
			frmKjk.getContentPane().add(btnNewButton);
		}
		private class SwingAction extends AbstractAction {
			public SwingAction() {
				putValue(NAME, "Calculate");
				putValue(SHORT_DESCRIPTION, "Some short description");
			}
			public void actionPerformed(ActionEvent e) {
						DC_voltage_source [][] agent=new DC_voltage_source[7][7];
						DC_voltage_source obj;
						double U_zad;
						U_zad=Double.parseDouble(textField_U_zad.getText());
						for(int i = 0; i < 7; i++){
							for(int j=0; j<7; j++){
								switch (i){
								case 0:
									agent[i][j]=new DC_voltage_source(50,true,0,0);
									break;
								case 1:
									agent[i][j]=new DC_voltage_source(25,true,0,0);
									break;
								case 2:
									agent[i][j]=new DC_voltage_source(10,true,0,0);
									break;
								case 3:
									agent[i][j]=new DC_voltage_source(5,true,0,0);
									break;
								case 4:
									agent[i][j]=new DC_voltage_source(2,true,0,0);
									break;
								case 5:
									agent[i][j]=new DC_voltage_source(1,true,0,0);
									break;
								case 6:
									agent[i][j]=new DC_voltage_source(0.5,true,0,1);
									break;
								}
							}
						}
						agent[0][0].neighbors=new DC_voltage_source[]{agent[1][0],agent[0][1]};
						agent[0][1].neighbors=new DC_voltage_source[]{agent[0][0],agent[1][1],agent[0][2]};
						agent[0][2].neighbors=new DC_voltage_source[]{agent[0][1],agent[1][2],agent[0][3]};
						agent[0][3].neighbors=new DC_voltage_source[]{agent[0][2],agent[1][3],agent[0][4]};
						agent[0][4].neighbors=new DC_voltage_source[]{agent[0][3],agent[1][4],agent[0][5]};
						agent[0][5].neighbors=new DC_voltage_source[]{agent[0][4],agent[1][5],agent[0][6]};
						agent[0][6].neighbors=new DC_voltage_source[]{agent[1][6],agent[0][5]};
						agent[1][0].neighbors=new DC_voltage_source[]{agent[0][0],agent[2][0],agent[1][1]};
						agent[1][1].neighbors=new DC_voltage_source[]{agent[0][1],agent[1][2],agent[2][1],agent[1][0]};
						agent[1][2].neighbors=new DC_voltage_source[]{agent[0][2],agent[1][3],agent[2][2],agent[1][1]};
						agent[1][3].neighbors=new DC_voltage_source[]{agent[0][3],agent[1][4],agent[2][3],agent[1][2]};
						agent[1][4].neighbors=new DC_voltage_source[]{agent[0][4],agent[1][5],agent[2][4],agent[1][3]};
						agent[1][5].neighbors=new DC_voltage_source[]{agent[0][5],agent[1][6],agent[2][5],agent[1][4]};
						agent[1][6].neighbors=new DC_voltage_source[]{agent[0][6],agent[2][6],agent[1][5]};
						agent[2][0].neighbors=new DC_voltage_source[]{agent[1][0],agent[2][1],agent[3][1]};
						agent[2][1].neighbors=new DC_voltage_source[]{agent[1][1],agent[2][2],agent[3][1],agent[2][0]};
						agent[2][2].neighbors=new DC_voltage_source[]{agent[1][2],agent[2][3],agent[3][2],agent[2][1]};
						agent[2][3].neighbors=new DC_voltage_source[]{agent[1][3],agent[2][4],agent[3][3],agent[2][2]};
						agent[2][4].neighbors=new DC_voltage_source[]{agent[1][4],agent[2][5],agent[3][4],agent[2][3]};
						agent[2][5].neighbors=new DC_voltage_source[]{agent[1][5],agent[2][6],agent[3][5],agent[2][4]};
						agent[2][6].neighbors=new DC_voltage_source[]{agent[1][6],agent[3][6],agent[2][5]};
						agent[3][0].neighbors=new DC_voltage_source[]{agent[2][0],agent[4][0],agent[3][1]};
						agent[3][1].neighbors=new DC_voltage_source[]{agent[2][1],agent[3][2],agent[4][1],agent[3][0]};
						agent[3][2].neighbors=new DC_voltage_source[]{agent[2][2],agent[3][3],agent[4][2],agent[3][1]};
						agent[3][3].neighbors=new DC_voltage_source[]{agent[2][3],agent[3][4],agent[4][3],agent[3][2]};
						agent[3][4].neighbors=new DC_voltage_source[]{agent[2][4],agent[3][5],agent[4][4],agent[3][3]};
						agent[3][5].neighbors=new DC_voltage_source[]{agent[2][5],agent[3][6],agent[4][5],agent[3][4]};
						agent[3][6].neighbors=new DC_voltage_source[]{agent[2][6],agent[4][6],agent[3][5]};
						agent[4][0].neighbors=new DC_voltage_source[]{agent[3][0],agent[5][0],agent[4][1]};
						agent[4][1].neighbors=new DC_voltage_source[]{agent[3][1],agent[4][2],agent[5][1],agent[4][0]};
						agent[4][2].neighbors=new DC_voltage_source[]{agent[3][2],agent[4][3],agent[5][2],agent[4][1]};
						agent[4][3].neighbors=new DC_voltage_source[]{agent[3][3],agent[4][4],agent[5][3],agent[4][2]};
						agent[4][4].neighbors=new DC_voltage_source[]{agent[3][4],agent[4][5],agent[5][4],agent[4][3]};
						agent[4][5].neighbors=new DC_voltage_source[]{agent[3][5],agent[4][6],agent[5][5],agent[4][4]};
						agent[4][6].neighbors=new DC_voltage_source[]{agent[3][6],agent[5][6],agent[4][5]};
						agent[5][0].neighbors=new DC_voltage_source[]{agent[4][0],agent[6][0],agent[5][1]};
						agent[5][1].neighbors=new DC_voltage_source[]{agent[4][1],agent[5][2],agent[6][1],agent[5][0]};
						agent[5][2].neighbors=new DC_voltage_source[]{agent[4][2],agent[5][3],agent[6][2],agent[5][1]};
						agent[5][3].neighbors=new DC_voltage_source[]{agent[4][3],agent[5][4],agent[6][3],agent[5][2]};
						agent[5][4].neighbors=new DC_voltage_source[]{agent[4][4],agent[5][5],agent[6][4],agent[5][3]};
						agent[5][5].neighbors=new DC_voltage_source[]{agent[4][5],agent[5][6],agent[6][5],agent[5][4]};
						agent[5][6].neighbors=new DC_voltage_source[]{agent[4][6],agent[6][6],agent[5][5]};
						agent[6][0].neighbors=new DC_voltage_source[]{agent[5][0],agent[6][1]};
						agent[6][1].neighbors=new DC_voltage_source[]{agent[5][1],agent[6][2],agent[6][0]};
						agent[6][2].neighbors=new DC_voltage_source[]{agent[5][2],agent[6][3],agent[6][1]};
						agent[6][3].neighbors=new DC_voltage_source[]{agent[5][3],agent[6][4],agent[6][2]};
						agent[6][4].neighbors=new DC_voltage_source[]{agent[5][4],agent[6][5],agent[6][3]};
						agent[6][5].neighbors=new DC_voltage_source[]{agent[5][5],agent[6][6],agent[6][4]};
						agent[6][6].neighbors=new DC_voltage_source[]{agent[5][6],agent[6][5]};
						
						for(int i = 0; i < 7; i++){
							for(int j=0; j<7; j++){
								agent[i][j].wrong_neighbors=new DC_voltage_source[agent[i][j].neighbors.length];
								agent[i][j].rnd_neighbors=new DC_voltage_source[agent[i][j].neighbors.length];
							}
							}
						
						agent[0][0].label=textField;
						agent[0][0].EMF=Double.parseDouble(agent[0][0].label.getText());
						agent[0][1].label=textField_1;
						agent[0][2].label=textField_2;
						agent[0][3].label=textField_3;
						agent[0][4].label=textField_4;
						agent[0][5].label=textField_5;
						agent[0][6].label=textField_6;
						agent[1][0].label=textField_7;
						agent[1][1].label=textField_8;
						agent[1][2].label=textField_9;
						agent[1][3].label=textField_10;
						agent[1][4].label=textField_11;
						agent[1][5].label=textField_12;
						agent[1][6].label=textField_13;
						agent[2][0].label=textField_14;
						agent[2][1].label=textField_15;
						agent[2][2].label=textField_16;
						agent[2][3].label=textField_17;
						agent[2][4].label=textField_18;
						agent[2][5].label=textField_19;
						agent[2][6].label=textField_20;
						agent[3][0].label=textField_21;
						agent[3][1].label=textField_22;
						agent[3][2].label=textField_23;
						agent[3][3].label=textField_24;
						agent[3][4].label=textField_25;
						agent[3][5].label=textField_26;
						agent[3][6].label=textField_27;
						agent[4][0].label=textField_28;
						agent[4][1].label=textField_29;
						agent[4][2].label=textField_30;
						agent[4][3].label=textField_31;
						agent[4][4].label=textField_32;
						agent[4][5].label=textField_33;
						agent[4][6].label=textField_34;
						agent[5][0].label=textField_35;
						agent[5][1].label=textField_36;
						agent[5][2].label=textField_37;
						agent[5][3].label=textField_38;
						agent[5][4].label=textField_39;
						agent[5][5].label=textField_40;
						agent[5][6].label=textField_41;
						agent[6][0].label=textField_42;
						agent[6][1].label=textField_43;
						agent[6][2].label=textField_44;
						agent[6][3].label=textField_45;
						agent[6][4].label=textField_46;
						agent[6][5].label=textField_47;
						agent[6][6].label=textField_48;
						
						agent[0][1].EMF=Double.parseDouble(agent[0][1].label.getText());
						agent[0][2].EMF=Double.parseDouble(agent[0][2].label.getText());
						agent[0][3].EMF=Double.parseDouble(agent[0][3].label.getText());
						agent[0][4].EMF=Double.parseDouble(agent[0][4].label.getText());
						agent[0][5].EMF=Double.parseDouble(agent[0][5].label.getText());
						agent[0][6].EMF=Double.parseDouble(agent[0][6].label.getText());
						agent[1][0].EMF=Double.parseDouble(agent[1][0].label.getText());
						agent[1][1].EMF=Double.parseDouble(agent[1][1].label.getText());
						agent[1][2].EMF=Double.parseDouble(agent[1][2].label.getText());
						agent[1][3].EMF=Double.parseDouble(agent[1][3].label.getText());
						agent[1][4].EMF=Double.parseDouble(agent[1][4].label.getText());
						agent[1][5].EMF=Double.parseDouble(agent[1][5].label.getText());
						agent[1][6].EMF=Double.parseDouble(agent[1][6].label.getText());
						agent[2][0].EMF=Double.parseDouble(agent[2][0].label.getText());
						agent[2][1].EMF=Double.parseDouble(agent[2][1].label.getText());
						agent[2][2].EMF=Double.parseDouble(agent[2][2].label.getText());
						agent[2][3].EMF=Double.parseDouble(agent[2][3].label.getText());
						agent[2][4].EMF=Double.parseDouble(agent[2][4].label.getText());
						agent[2][5].EMF=Double.parseDouble(agent[2][5].label.getText());
						agent[2][6].EMF=Double.parseDouble(agent[2][6].label.getText());
						agent[3][0].EMF=Double.parseDouble(agent[3][0].label.getText());
						agent[3][1].EMF=Double.parseDouble(agent[3][1].label.getText());
						agent[3][2].EMF=Double.parseDouble(agent[3][2].label.getText());
						agent[3][3].EMF=Double.parseDouble(agent[3][3].label.getText());
						agent[3][4].EMF=Double.parseDouble(agent[3][4].label.getText());
						agent[3][5].EMF=Double.parseDouble(agent[3][5].label.getText());
						agent[3][6].EMF=Double.parseDouble(agent[3][6].label.getText());
						agent[4][0].EMF=Double.parseDouble(agent[4][0].label.getText());
						agent[4][1].EMF=Double.parseDouble(agent[4][1].label.getText());
						agent[4][2].EMF=Double.parseDouble(agent[4][2].label.getText());
						agent[4][3].EMF=Double.parseDouble(agent[4][3].label.getText());
						agent[4][4].EMF=Double.parseDouble(agent[4][4].label.getText());
						agent[4][5].EMF=Double.parseDouble(agent[4][5].label.getText());
						agent[4][6].EMF=Double.parseDouble(agent[4][6].label.getText());
						agent[5][0].EMF=Double.parseDouble(agent[5][0].label.getText());
						agent[5][1].EMF=Double.parseDouble(agent[5][1].label.getText());
						agent[5][2].EMF=Double.parseDouble(agent[5][2].label.getText());
						agent[5][3].EMF=Double.parseDouble(agent[5][3].label.getText());
						agent[5][4].EMF=Double.parseDouble(agent[5][4].label.getText());
						agent[5][5].EMF=Double.parseDouble(agent[5][5].label.getText());
						agent[5][6].EMF=Double.parseDouble(agent[5][6].label.getText());
						agent[6][0].EMF=Double.parseDouble(agent[6][0].label.getText());
						agent[6][1].EMF=Double.parseDouble(agent[6][1].label.getText());
						agent[6][2].EMF=Double.parseDouble(agent[6][2].label.getText());
						agent[6][3].EMF=Double.parseDouble(agent[6][3].label.getText());
						agent[6][4].EMF=Double.parseDouble(agent[6][4].label.getText());
						agent[6][5].EMF=Double.parseDouble(agent[6][5].label.getText());
						agent[6][6].EMF=Double.parseDouble(agent[6][6].label.getText());

						
					   // obj=agent[0][0].enter_finder();
						long start = System.currentTimeMillis();
						for (int k=0; k<7; k++){
					    if (agent[0][k].path_finder(U_zad)==false){
					    	for(int i = 0; i < 7; i++){
								for(int j=0; j<7; j++){
									agent[i][j].forward_agent=null;
									agent[i][j].previous_agent=null;
									agent[i][j].usage_time=0;
									agent[i][j].used=false;
									agent[i][j].label.setBackground(new Color(240,240,240));
									for (int a=0; a<agent[i][j].wrong_neighbors.length; a++){
										agent[i][j].wrong_neighbors[a]=null;
									}
								}
					    	}
					    }
					}
				}
		}
}

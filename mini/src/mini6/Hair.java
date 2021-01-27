package mini6;

	import java.awt.BorderLayout;
	import java.awt.Checkbox;
	import java.awt.EventQueue;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.ItemEvent;
	import java.awt.event.ItemListener;
	import java.util.Scanner;

	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JCheckBoxMenuItem;
	import javax.swing.JRadioButton;
	import javax.swing.JInternalFrame;
	import java.awt.Color;
	import java.awt.GridBagLayout;
	import java.awt.GridBagConstraints;
	import java.awt.Insets;
	import java.awt.TextArea;

	import javax.swing.JSplitPane;
	import javax.swing.JTextArea;

	import java.awt.Font;

	public class Hair extends JFrame implements ActionListener {

		 JLabel text,label;
		 JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
		 JTextArea ta;
		 ButtonGroup b;
		 JButton jb, jb1, jb2;
		 JPanel topPanel, SizePanel, SizePanel11, resultPanel;

		 JRadioButton r1, r2, r3, r4, r5, r6;
		
		
		public Hair() {

			this.setBounds(50,50,900,900);
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

			topPanel = new JPanel();
			label = new JLabel("O2B2 Hair");
			topPanel.add(label);
			SizePanel = new JPanel();
			SizePanel11 = new JPanel();
			ta = new JTextArea();
			ta.append(getName());
			ta.setSize(10, 50);
			getContentPane().add(ta);
			
			
			cb1 = new JCheckBox("Shampoo 10000");
			cb2 = new JCheckBox("Cut 30000");
			cb3 = new JCheckBox("Dry 25000");
			cb4 = new JCheckBox("Perm 110000");
			cb5 = new JCheckBox("Color 110000");
			cb6 = new JCheckBox("TreatMent 70000");
			cb7 = new JCheckBox("HeadSpa 130000");
			
			r1 = new JRadioButton("10시");
			r2 = new JRadioButton("11시");
			r3 = new JRadioButton("12시");
			r4 = new JRadioButton("2시");
			r5 = new JRadioButton("3시");
			r6 = new JRadioButton("4시");

	 		
			b = new ButtonGroup();
			b.add(r1);
			b.add(r2);
			b.add(r3);
			b.add(r4);
			b.add(r5);
			b.add(r6);

			r1.addActionListener(this);
			r2.addActionListener(this);
			r3.addActionListener(this);
			r4.addActionListener(this);
			r5.addActionListener(this);
			r6.addActionListener(this);

			jb = new JButton("예약하기");
			jb.setBounds(800, 100, 100, 40);
			getContentPane().add(jb);
			jb.addActionListener(this);
			

			SizePanel.add(r1);
			SizePanel.add(r2);
			SizePanel.add(r3);
			SizePanel.add(r4);
			SizePanel.add(r5);
			SizePanel.add(r6);
			
			SizePanel11.add(cb1);
			SizePanel11.add(cb2);
			SizePanel11.add(cb3);
			SizePanel11.add(cb4);
			SizePanel11.add(cb5);
			SizePanel11.add(cb6);
			SizePanel11.add(cb7);

			resultPanel = new JPanel();
			text = new JLabel("");
			text.setForeground(Color.black);
			resultPanel.add(text);
			
			
			cb1.addActionListener(this);
			cb2.addActionListener(this);
			cb3.addActionListener(this);
			cb4.addActionListener(this);
			cb5.addActionListener(this);
			cb6.addActionListener(this);
			cb7.addActionListener(this);

			
			this.add(ta, BorderLayout.EAST);
			this.add(SizePanel, BorderLayout.SOUTH);
			this.add(resultPanel, BorderLayout.WEST);
			this.add(SizePanel11, BorderLayout.CENTER);
			this.setSize(1000, 1000);
			this.setVisible(true);
		}
		
		

		
		public static void main(String[] args) {
			new Hair();
			
		}



		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int amount = 0;
			String msg = "";
			boolean sw = false;
			
			if(cb1.isSelected()) {
				sw = true;
				amount+=10000;
				msg = "shampoo : 10000\n";		
			}
			if(cb2.isSelected()) {
				
				sw = true;
				amount+=30000;
				msg = "Cut : 30000\n";
			}
			if(cb3.isSelected()) {
				
				sw = true;
				amount+=25000;
				msg = "Dry : 25000\n";
			}
			if(cb4.isSelected()) {
				sw= true;
				amount+=110000;
				msg = "Perm : 110000\n";
			}
			if(cb5.isSelected()) {
				sw = true;
				amount+=110000;
				msg = "Color : 110000\n";
			}
			if(cb6.isSelected()) {
				sw = true;
				amount+=70000;
				msg = "TreatMent : 70000\n";
			}
			if(cb7.isSelected()) {
				sw = true;
				amount+=130000;
				msg = "HeadSpa : 130000\n";
			}
			ta.append(msg);
			

			if (e.getSource() == r3) {
				text.setText("이미 예약된 시간입니다. 다른 시간을 선택해 주세요.");
				JOptionPane.showMessageDialog(this, text);
			}else if (e.getSource() == r6) {
				text.setText("이미 예약된 시간입니다. 다른 시간을 선택해 주세요.");
				JOptionPane.showMessageDialog(this, text);
			}else if (e.getSource() == r1) {
				text.setText("");
			}else if (e.getSource() == r2) {
				text.setText("");
			}else if (e.getSource() == r4) {
				text.setText("");
			}else if (e.getSource() == r5) {
				text.setText("");
			}
			
			if (e.getSource() == jb) {
		            do_btnTest_actionPerformed(e);
		        }
		    }
		 
		
		
		
		
		protected void do_btnTest_actionPerformed(ActionEvent e) {
		        JOptionPane.showMessageDialog(null, "예약하시겠습니까?");
		        		
			
		}





	}



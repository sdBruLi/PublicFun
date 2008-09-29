import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class InstrumentPanel extends JPanel {

	protected JSlider slide;
	protected JSlider setJumpVal;
	protected MainGraphFrame parentComp;
	protected JButton dancing;
	protected JButton shiftViewFoward;
	protected JButton shiftViewBack;
	protected JPanel panel;

	public InstrumentPanel(MainGraphFrame par) {

		LayoutManager hi = new BorderLayout();
		setLayout(hi);

		setPreferredSize(new Dimension(1024, 120));

		parentComp = par;

		slide = new JSlider();
		slide.setPaintLabels(true);
		slide.setPaintTicks(true);
		if (!par.noFile) {
			slide.setMajorTickSpacing(parentComp.listOfSampleValues.size() / 10);
			slide.setMaximum(parentComp.listOfSampleValues.size());
			slide.setValue(parentComp.listOfSampleValues.size() / 2);
		}else{
			slide.setMaximum(1);
			slide.setValue(0);
		}
		slide.addChangeListener(parentComp);
		add(slide, BorderLayout.NORTH);

		panel = new JPanel();

		shiftViewBack = new JButton("Move Window Back  128");
		shiftViewBack.addActionListener(parentComp);
		shiftViewBack.setActionCommand("back");
		shiftViewBack.setPreferredSize(new Dimension(150, 20));
		panel.add(shiftViewBack);

		setJumpVal = new JSlider();
		setJumpVal.addChangeListener(parentComp);
		setJumpVal.setPaintLabels(true);
		setJumpVal.setPaintTicks(true);
		setJumpVal.setMajorTickSpacing(64);
		setJumpVal.setMaximum(256);
		setJumpVal.setValue(256 / 2);
		setJumpVal.setSnapToTicks(true);
		setJumpVal
				.setToolTipText("Changes the ammount that the left and right buttons move the slider.");
		panel.add(setJumpVal);

		shiftViewFoward = new JButton("Move Window Foward 128");
		shiftViewFoward.addActionListener(parentComp);
		shiftViewFoward.setActionCommand("foward");
		shiftViewFoward.setPreferredSize(new Dimension(165, 20));
		panel.add(shiftViewFoward);

		dancing = new JButton("Dancing Colors");
		dancing.addActionListener(parentComp);
		dancing.setActionCommand("dance");
		dancing.setPreferredSize(new Dimension(120, 20));
		panel.add(dancing);
		// dancing.setVisible(false);

		add(panel);

	}

	public void resetSlider() {
		slide.setPaintLabels(true);
		slide.setPaintTicks(true);
		slide.setMajorTickSpacing(parentComp.listOfSampleValues.size() / 10);
		slide.setMaximum(parentComp.listOfSampleValues.size());
		slide.setValue(parentComp.listOfSampleValues.size() / 2);
		slide.repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	private static final long serialVersionUID = 1L;

}

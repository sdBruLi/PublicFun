package ui.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import plotter.Plotter;
import ui.GraphingCalculatorController;

public class MainFrame extends JFrame {
	public static double DEFAULT_SLOPE = 1;
	public static double DEFAULT_INTERCEPT = 0;
	public static double DEFAULT_AMPLITUDE = 1;
	public static String DEFAULT_POLY_EQN = "0x^0 +0x^1 +1x^2";

	private JLabel slopeLabel;
	private JTextField slopeField;

	private JLabel interceptLabel;
	private JTextField interceptField;

	private JLabel amplitudeLabel;
	private JTextField amplitudeField;

	private JLabel equationLabel;
	private JTextField equationField;

	private JCheckBox absModeCheck;

	private JButton graphStraitLineButton;
	private JButton graphTanLineButton;
	private JButton graphSinLineButton;
	private JButton graphCosLineButton;
	private JButton graphPolynomialButton;

	private GraphingCalculatorController controller;

	public MainFrame(GraphingCalculatorController controllerP) {
		controller = controllerP;
		createComponents();
		layoutComponents();
		addListeners();
		miscInit();
	}

	private void miscInit() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		controller.startPlotter();
		setVisible(true);
	}

	private void createComponents() {
		slopeLabel = new JLabel("Slope:");
		slopeField = new JTextField(DEFAULT_SLOPE + "");

		interceptLabel = new JLabel("Y-Intercept:");
		interceptField = new JTextField(DEFAULT_INTERCEPT + "");

		amplitudeLabel = new JLabel("Amplitude:");
		amplitudeField = new JTextField(DEFAULT_AMPLITUDE + "");

		equationLabel = new JLabel("Polynomial Equation:");
		equationField = new JTextField(DEFAULT_POLY_EQN);

		absModeCheck = new JCheckBox("Absolute Value Mode");

		graphStraitLineButton = new JButton("Graph Straight Line:");
		graphSinLineButton = new JButton("Graph Sine Curve");
		graphCosLineButton = new JButton("Graph Cosine Curve");
		graphTanLineButton = new JButton("Graph Tangent Curve");
		graphPolynomialButton = new JButton("Graph Polynomial Equation");
	}

	private void layoutComponents() {
		JPanel mainPane = new JPanel(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridy = 0;
		gc.gridx = 0;
		mainPane.add(slopeLabel, gc);
		gc.gridx++;
		mainPane.add(slopeField, gc);
		gc.gridx--;
		gc.gridy++;
		mainPane.add(interceptLabel, gc);
		gc.gridx++;
		mainPane.add(interceptField, gc);
		gc.gridx++;
		gc.gridy--;
		mainPane.add(amplitudeLabel, gc);
		gc.gridx++;
		mainPane.add(amplitudeField, gc);
		gc.gridx--;
		gc.gridy++;
		mainPane.add(equationLabel, gc);
		gc.gridx++;
		mainPane.add(equationField, gc);
		gc.gridx--;
		gc.gridy++;
		mainPane.add(absModeCheck, gc);
		gc.gridy++;
		gc.gridx -= 2;
		mainPane.add(graphStraitLineButton, gc);
		gc.gridx++;
		mainPane.add(graphSinLineButton, gc);
		gc.gridx++;
		mainPane.add(graphCosLineButton, gc);
		gc.gridx++;
		mainPane.add(graphTanLineButton, gc);
		gc.gridx++;
		mainPane.add(graphPolynomialButton, gc);
		add(mainPane);
	}

	private void addListeners() {
		graphStraitLineButton.addActionListener(straightListener);
		graphSinLineButton.addActionListener(sinListener);
		graphCosLineButton.addActionListener(cosListener);
		graphTanLineButton.addActionListener(tanListener);
		graphPolynomialButton.addActionListener(polyListener);
	}

	private void updateAllValues() {
		controller.updateAmplitude(Double.parseDouble(amplitudeField.getText()));
		controller.updateSlope(Double.parseDouble(slopeField.getText()));
		controller.updateYIntercept(Double.parseDouble(interceptField.getText()));
		controller.updateCoeficients(equationField.getText());
		controller.toggleAbsMode(absModeCheck.isSelected());
	}

	public static void main(String[] args) {
		new MainFrame(new GraphingCalculatorController(new Plotter()));
	}

	private ActionListener polyListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.updateGraphType(GraphingCalculatorController.POLYNOMIAL_GRAPH);
			updateAllValues();
			controller.refreshGraph();
		}
	};
	private ActionListener tanListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.updateGraphType(GraphingCalculatorController.TAN_GRAPH);
			updateAllValues();
			controller.refreshGraph();
		}
	};
	private ActionListener cosListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.updateGraphType(GraphingCalculatorController.COS_GRAPH);
			updateAllValues();
			controller.refreshGraph();
		}
	};
	private ActionListener sinListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.updateGraphType(GraphingCalculatorController.SIN_GRAPH);
			updateAllValues();
			controller.refreshGraph();
		}
	};
	private ActionListener straightListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.updateGraphType(GraphingCalculatorController.LINE_GRAPH);
			updateAllValues();
			controller.refreshGraph();
		}
	};
}

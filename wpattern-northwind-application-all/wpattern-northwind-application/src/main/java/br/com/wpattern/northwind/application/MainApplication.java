package br.com.wpattern.northwind.application;

import java.awt.Component;

import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import org.apache.log4j.Logger;

import br.com.wpattern.northwind.application.interfaces.IMainWindow;
import br.com.wpattern.northwind.application.utils.interfaces.IApplicationServices;

@Named
public class MainApplication implements IMainWindow {

	private Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IApplicationServices services;

	private JFrame frameMainApplication;

	private CategoryGridPanel categoryGridPanel;

	/**
	 * Create the application.
	 */
	public MainApplication() {
		this.initialize();
	}

	@Override
	public void start() {
		this.logger.info("Starting the Application.");

		this.frameMainApplication.setVisible(true);

		this.categoryGridPanel.initialize(this.services);
	}

	@Override
	public Component getMainWindowComponent() {
		return this.frameMainApplication;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.frameMainApplication = new JFrame();
		this.frameMainApplication.setResizable(false);
		this.frameMainApplication.setTitle("Northwind Application");
		this.frameMainApplication.setBounds(100, 100, 621, 444);
		this.frameMainApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameMainApplication.getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));

		this.categoryGridPanel = new CategoryGridPanel();
		this.frameMainApplication.getContentPane().add(this.categoryGridPanel, "cell 0 0,grow");
	}

}

package br.com.wpattern.northwind.application.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import br.com.wpattern.northwind.application.enumerations.ButtonTypeEnum;
import br.com.wpattern.northwind.application.interfaces.ICategoryData;
import br.com.wpattern.northwind.application.interfaces.ICategoryGrid;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;

public class CategoryButton extends JButton {

	private static final long serialVersionUID = -7431880216186965304L;

	private Logger logger = Logger.getLogger(this.getClass());

	private final ButtonTypeEnum typeButton;
	private final ICategoryGrid categoryGrid;
	private final ICategoryData categoryData;

	public CategoryButton(ButtonTypeEnum typeButton, ICategoryGrid categoryGrid, ICategoryData categoryData) {
		super(typeButton.getText());

		this.typeButton = typeButton;
		this.categoryGrid = categoryGrid;
		this.categoryData = categoryData;

		this.loadActionListener();
	}

	private void loadActionListener() {

		switch (this.typeButton) {		
		case DELETE:
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CategoryBean category = new CategoryBean();

					category.setCategoryId(CategoryButton.this.categoryData.getCategoryId());

					if (CategoryButton.this.logger.isDebugEnabled()) {
						CategoryButton.this.logger.debug(String.format("Invoke service to insert the category [%s].", category));
					}

					try {
						CategoryButton.this.categoryGrid.getService().deleteCategory(category);

						CategoryButton.this.fillCategories();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(CategoryButton.this, "Não foi possível acessar os serviços remotos.");
					}
				}
			});
			break;

		case FIND:
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						CategoryButton.this.fillCategories();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(CategoryButton.this, "Não foi possível acessar os serviços remotos.");
					}
				}
			});
			break;

		case INSERT:
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CategoryBean category = new CategoryBean();

					category.setCategoryName(CategoryButton.this.categoryData.getCategoryName());
					category.setDescription(CategoryButton.this.categoryData.getCategoryDescription());
					category.setPicture(CategoryButton.this.categoryData.getPicture());

					if (CategoryButton.this.logger.isDebugEnabled()) {
						CategoryButton.this.logger.debug(String.format("Invoke service to insert the category [%s].", category));
					}

					try{ 
						CategoryButton.this.categoryGrid.getService().insertCategory(category);

						CategoryButton.this.fillCategories();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(CategoryButton.this, "Não foi possível acessar os serviços remotos.");
					}
				}
			});
			break;

		case UPDATE:
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CategoryBean category = new CategoryBean();

					category.setCategoryId(CategoryButton.this.categoryData.getCategoryId());
					category.setCategoryName(CategoryButton.this.categoryData.getCategoryName());
					category.setDescription(CategoryButton.this.categoryData.getCategoryDescription());
					category.setPicture(CategoryButton.this.categoryData.getPicture());

					if (CategoryButton.this.logger.isDebugEnabled()) {
						CategoryButton.this.logger.debug(String.format("Invoke service to update the category [%s].", category));
					}

					try {
						CategoryButton.this.categoryGrid.getService().updateCategory(category);

						CategoryButton.this.fillCategories();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(CategoryButton.this, "Não foi possível acessar os serviços remotos.");
					}
				}
			});
			break;
		}

	}

	private void fillCategories() {
		List<CategoryBean> categories = this.categoryGrid.getService().findAllCategories();

		this.categoryGrid.addCategories(categories);

		this.categoryData.clearFields();
	}

}

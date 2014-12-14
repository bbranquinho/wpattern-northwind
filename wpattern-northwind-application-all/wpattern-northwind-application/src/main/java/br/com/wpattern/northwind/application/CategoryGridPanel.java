package br.com.wpattern.northwind.application;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Named;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import br.com.wpattern.northwind.application.buttons.CategoryButton;
import br.com.wpattern.northwind.application.enumerations.ButtonTypeEnum;
import br.com.wpattern.northwind.application.interfaces.ICategoryData;
import br.com.wpattern.northwind.application.interfaces.ICategoryGrid;
import br.com.wpattern.northwind.application.utils.interfaces.IApplicationServices;
import br.com.wpattern.northwind.utils.database.beans.CategoryBean;

@Named
public class CategoryGridPanel extends JPanel implements ICategoryGrid, ICategoryData {

	private static final long serialVersionUID = -3127985955124406559L;

	private final Map<Long, CategoryBean> categoryContext = new HashMap<Long, CategoryBean>();

	private JTable table;
	private DefaultTableModel tableModel;
	private JTextField txtCategoryId;
	private JTextField txtCategoryName;
	private JTextField txtCategoryDescription;
	private CategoryButton btnInsert;
	private CategoryButton btnUpdate;
	private CategoryButton btnDelete;
	private CategoryButton btnFind;

	private IApplicationServices services;

	/**
	 * Create the panel.
	 */
	public CategoryGridPanel() {
		String[] columnNames = new String []{ "ID", "Nome", "Descrição"};

		this.tableModel = new DefaultTableModel(columnNames, 0);
		this.setLayout(null);

		this.txtCategoryId = new JTextField();
		this.txtCategoryId.setEditable(false);
		this.txtCategoryId.setBounds(108, 14, 86, 20);
		this.add(this.txtCategoryId);
		this.txtCategoryId.setColumns(10);

		this.table = new JTable(this.tableModel) {

			private static final long serialVersionUID = -7781956365105743313L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

			@Override
			public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend) {
				Object categoryId = CategoryGridPanel.this.table.getValueAt(rowIndex, 0);

				if (categoryId != null) {
					CategoryBean category = CategoryGridPanel.this.categoryContext.get(new Long(categoryId.toString()));

					if (category != null) {
						CategoryGridPanel.this.txtCategoryId.setText(category.getCategoryId().toString());
						CategoryGridPanel.this.txtCategoryName.setText(category.getCategoryName());
						CategoryGridPanel.this.txtCategoryDescription.setText(category.getDescription());
					}
				}

				super.changeSelection(rowIndex, columnIndex, toggle, extend);
			}

		};
		this.table.setBounds(0, 147, 600, 253);
		this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		this.add(this.table);
		this.add(this.table.getTableHeader(), BorderLayout.NORTH);

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 17, 79, 14);
		this.add(lblId);

		JLabel lblDescription = new JLabel("Descrição:");
		lblDescription.setBounds(10, 85, 79, 14);
		this.add(lblDescription);

		JLabel lblCategoryName = new JLabel("Nome:");
		lblCategoryName.setBounds(10, 51, 79, 14);
		this.add(lblCategoryName);

		this.txtCategoryName = new JTextField();
		this.txtCategoryName.setBounds(108, 48, 383, 20);
		this.add(this.txtCategoryName);
		this.txtCategoryName.setColumns(10);

		this.txtCategoryDescription = new JTextField();
		this.txtCategoryDescription.setBounds(108, 82, 383, 20);
		this.add(this.txtCategoryDescription);
		this.txtCategoryDescription.setColumns(10);

		this.btnInsert = new CategoryButton(ButtonTypeEnum.INSERT, this, this);
		this.btnInsert.setBounds(501, 11, 89, 23);
		this.add(this.btnInsert);

		this.btnUpdate = new CategoryButton(ButtonTypeEnum.UPDATE, this, this);
		this.btnUpdate.setBounds(501, 45, 89, 23);
		this.add(this.btnUpdate);

		this.btnDelete = new CategoryButton(ButtonTypeEnum.DELETE, this, this);
		this.btnDelete.setBounds(501, 79, 89, 23);
		this.add(this.btnDelete);

		this.btnFind = new CategoryButton(ButtonTypeEnum.FIND, this, this);
		this.btnFind.setBounds(501, 113, 89, 23);
		this.add(this.btnFind);
	}

	public void initialize(IApplicationServices services) {
		this.services = services;

		this.btnFind.doClick();
	}

	@Override
	public void addCategories(List<CategoryBean> categories) {
		while (this.tableModel.getRowCount()>0){
			this.tableModel.removeRow(0);
		}

		this.categoryContext.clear();

		for (CategoryBean category : categories) {
			this.addCategoryRow(category);
		}
	}

	private void addCategoryRow(CategoryBean category) {
		this.categoryContext.put(category.getCategoryId(), category);

		this.tableModel.addRow(new Object[] {
				category.getCategoryId(),
				category.getCategoryName(),
				category.getDescription() });
	}

	@Override
	public void clearFields() {
		this.txtCategoryId.setText("");
		this.txtCategoryName.setText("");
		this.txtCategoryDescription.setText("");
	}

	@Override
	public Long getCategoryId() {
		String categoryId = this.txtCategoryId.getText();

		if ((categoryId == null) || categoryId.trim().isEmpty()) {
			return null;
		}

		return new Long(categoryId);
	}

	@Override
	public String getCategoryName() {
		return this.txtCategoryName.getText();
	}

	@Override
	public String getCategoryDescription() {
		return this.txtCategoryDescription.getText();
	}

	@Override
	public Byte[] getPicture() {
		return null;
	}

	@Override
	public IApplicationServices getService() {
		return this.services;
	}

}

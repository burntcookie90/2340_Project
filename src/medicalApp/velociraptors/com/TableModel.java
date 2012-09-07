package medicalApp.velociraptors.com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/**
 * @author Vishnu
 *
 */
public class TableModel extends AbstractTableModel {
	private Object[][] data;
	private String columnNames[] = {"First Name", "Last Name", "Date of Birth", "Social Security Number"};
	private MedAppController mac;
	private Connection con;
	ArrayList<String> patientFirstNames;
	ArrayList<String> patientLastNames;
	ArrayList<String> patientDOB;
	ArrayList<Integer> patientSSN;
	public TableModel(final MedAppController mac){
		this.mac = mac;
		con = mac.getCon();
		patientFirstNames = new ArrayList<String>();
		patientLastNames = new ArrayList<String>();
		patientDOB = new ArrayList<String>();
		patientSSN = new ArrayList<Integer>();
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM `patients`");
			while(rs.next()){
				patientFirstNames.add(rs.getString("P_FIRSTNAME"));
				patientLastNames.add(rs.getString("P_LASTNAME"));
				patientDOB.add(rs.getString("DOB"));
				patientSSN.add(rs.getInt("P_SSN"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		data = new Object[patientFirstNames.size()][4];
		
		for(int i = 0; i<patientFirstNames.size();i++){
			data[i][0] = patientFirstNames.get(i);
		}
		
		for(int i = 0; i<patientLastNames.size();i++){
			data[i][1] = patientLastNames.get(i);
		}
		
		for(int i = 0; i<patientDOB.size();i++){
			data[i][2] = patientDOB.get(i);
		}
		
		for(int i = 0; i<patientSSN.size();i++){
			data[i][3] = patientSSN.get(i);
		}
	}
	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex){
		// TODO Auto-generated method stub
//		if(data[rowIndex][columnIndex]==null){
//			return null;
//		}
		return data[rowIndex][columnIndex];
	}

	public String getColumnName(int col) {
        return columnNames[col];
    }
}

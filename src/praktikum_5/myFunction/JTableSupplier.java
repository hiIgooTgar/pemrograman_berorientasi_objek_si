package praktikum_5.myFunction;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import praktikum_5.myEntity.Supplier;

public class JTableSupplier extends AbstractTableModel{
    List<Supplier> list = new ArrayList<>();
    
    public void add(Supplier supp) {
        list.add(supp);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
     public int getColumnCount() {
        return 5;
    }
     
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return list.get(rowIndex).getKode_supplier();
            case 1: return list.get(rowIndex).getNama();
            case 2: return list.get(rowIndex).getAlamat();
            case 3: return list.get(rowIndex).getTelp();
            case 4: return list.get(rowIndex).getEmail();
            
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "KODE";
            case 1: return "NAMA";
            case 2: return "ALAMAT";
            case 3: return "TELP";
            case 4: return "EMAIL";
            default: return null;
        }
    }
    
    public void removeRow(int i, int l) {
        list.remove(i);
        fireTableRowsDeleted(i, 1);
    }

    public void removeRow(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

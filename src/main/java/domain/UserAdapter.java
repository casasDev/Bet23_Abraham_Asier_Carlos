package domain;

import javax.swing.table.AbstractTableModel;

public class UserAdapter extends AbstractTableModel{
	//ERAIKITZAILEA
    private Registered u;
    private String[][] matriz;
    private String[] nombreColumnas = { "Evento", "Pregunta", "Fecha Evento", "Apuesta (€)" };
	
	public UserAdapter(Registered user) {
		this.u=user;
		matriz = new String[getRowCount()][getColumnCount()];
        int i = 0;

        for(ApustuAnitza apusAn : user.getApustuAnitzak()) {
            for(Apustua apus: apusAn.getApustuak()) {
            	matriz[i][0] = apus.getKuota().getQuestion().getEvent().getDescription();
            	matriz[i][1] = apus.getKuota().getQuestion().getQuestion();
            	matriz[i][2] = apusAn.getData().toString();
            	matriz[i][3] = apusAn.getBalioa().toString();
                i++;
            }
        }
    }

    public int getRowCount() {
        int result = 0;
        for(ApustuAnitza apusAn : u.getApustuAnitzak()) {
            for(Apustua apus: apusAn.getApustuak()) {
                result++;
            }
        }
        return result;
    }

    
    public int getColumnCount() {
        return 4;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        return matriz[rowIndex][columnIndex];
    }

    
    @Override
    public String getColumnName(int column) {
        return nombreColumnas[column];
    }

}
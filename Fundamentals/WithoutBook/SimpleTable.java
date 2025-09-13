import javax.swing.*;
public class SimpleTable {
    public static void main(String[] args){
        JFrame frame = new JFrame ("SimpleTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        String[][] data = {
                {"bZahl","28", "byte"},
                {"sZahl","-18453", "short"},
                {"iZahl", "4356576", "int"},
                {"lZahl", "345236577970", "long"},
                {"fZahl", "4.37456678F", "float"},
                {"dZahl", "3645.56478", "double"},
                {"bestanden", "true", "boolean"},
                {"zeichen", "% use single ('') for", "char"}
        };
        String[] columnNames = {"Variable", "Wert", "Datentypen"};
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setVisible(true);

    }
}

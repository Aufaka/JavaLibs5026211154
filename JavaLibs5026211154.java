import javax.swing.JOptionPane;

public class JavaLibs5026211154 {
    public static void main (String[] args){
        String input1 = JOptionPane.showInputDialog("Nama");
        String input2 = JOptionPane.showInputDialog("NRP");
        String input3 = JOptionPane.showInputDialog("Asal Jurusan");
        String input4 = JOptionPane.showInputDialog("Alamat Tinggal");
        String input5 = JOptionPane.showInputDialog("Jenis Kelamin");
        String input6 = JOptionPane.showInputDialog("Agama");
        String input7 = JOptionPane.showInputDialog("Kewarganegaraan");
        Double input8 = Double.parseDouble(JOptionPane.showInputDialog("Tinggi Badan (ft.Inch)"));
        Double input9 = input8 *30.48;
        JOptionPane.showMessageDialog(null,"Tinggi badan anda dalam Centimeter adalah"+input9+"cm");
        int input10 = Integer.parseInt(JOptionPane.showInputDialog("Berat Badan (Kg)"));
        String input11 = JOptionPane.showInputDialog("Kelebihan");
        String input12 = JOptionPane.showInputDialog("kekurangan");
        String input13 = JOptionPane.showInputDialog("Harapan kedepan");
    } 
}

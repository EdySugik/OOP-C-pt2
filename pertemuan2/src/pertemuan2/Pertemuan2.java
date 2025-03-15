package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
/**
 *
 * @author Edy
 * TGL: 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mhs="Edy Sugiartha";
        long nim=2301010298L;
        String kls="C";
        
        //BufferedReader
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Input Nama Mahasiswa: ");
            mhs = dtIN.readLine();
            
            System.out.print("Input Nim Mahasiswa: ");
            nim = Long.parseLong(dtIN.readLine());
        }catch(IOException e){
            System.out.println("Error Broo!!");
        }
        
        kls= JOptionPane.showInputDialog("Input Kelas: ");
        System.out.println("Data "+mhs+" dengan NIM "+nim+" berada dikelas "+kls);
    }
    
}

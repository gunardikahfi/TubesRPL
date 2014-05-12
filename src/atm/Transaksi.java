/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author KAHFI
 */
public class Transaksi {
    Connection con=null;
    private String Norek;
    private String nama;
    private String jenis;
    private String Tgl_Transaksi;
    private String jumlah;
    private int saldo;
    
    public String getNorek() {
        return Norek;
    }

    public String getNama() {
        return nama;
    }

    public String getjenis() {
        return jenis;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTgl_Transaksi() {
        return Tgl_Transaksi;
    }

    public void setNorek(String norek) {
        this.Norek = norek;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setjenis(String alamat) {
        this.jenis= alamat;
    }

    public void setTgl_Transaksi(String Tgl_Transaksi) {
        this.Tgl_Transaksi = Tgl_Transaksi;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void tambahTransaksi(String norek,String nama,String jenis,String Tgl_Transaksi, int jumlah, int saldo){
        DatabaseAtm db = new DatabaseAtm();
        db.quey("insert into transaksi values('"+norek+"','"+nama+"','"+jenis+"','"+Tgl_Transaksi+"','"+jumlah+"','"+saldo+"');");
    }
    public void deleteTransaksi(String delete){
        DatabaseAtm db = new DatabaseAtm();
        db.quey("delete from transaksi where Norek='"+delete+"';");
    }
    public int getSaldo(String cari){
        int uang = 0;
        ResultSet rs=null;
        DatabaseAtm db=new DatabaseAtm();
        try {
            rs=db.getData("select Saldo from nasabah where Norek='"+cari+"';");
            while(rs.next()){
                uang=rs.getInt("Saldo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return uang;
    }
    
    public String getNama(String cari){
        String name = null;
        ResultSet rs=null;
        DatabaseAtm db=new DatabaseAtm();
        try {
            rs=db.getData("select Nama from nasabah where Norek='"+cari+"';");
            while(rs.next()){
                name=rs.getString("Nama");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return name;
    }
    
public int getTagihan(String cari){
        int tagihan = 0;
        ResultSet rs=null;
        DatabaseAtm db=new DatabaseAtm();
        try {
            rs=db.getData("select jml_tagihan from pembrs where id_pembayaran='"+cari+"';");
            while(rs.next()){
                tagihan=rs.getInt("jml_tagihan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return tagihan;
    }
    
    public String getJenisBayar(String cari){
        String jenis = null;
        ResultSet rs=null;
        DatabaseAtm db=new DatabaseAtm();
        try {
            rs=db.getData("select jenis from pembrs where id_pembayaran='"+cari+"';");
            while(rs.next()){
                jenis=rs.getString("jenis");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return jenis;
    }
    
    public void updateTransaksi(String norek,String PIN,String nama,String alamat,String Tgl_Transaksi, int saldo){
         DatabaseAtm db = new DatabaseAtm();
         db.quey("update transaksi set Norek='"+norek+"',PIN='"+PIN+"',Nama='"+nama+"',Alamat='"+alamat+"',Tgl_Transaksi='"+Tgl_Transaksi+"',Saldo='"+saldo+"';");
    }
}

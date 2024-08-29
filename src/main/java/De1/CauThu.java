/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

/**
 *
 * @author ADMIN
 */
public class CauThu {
    public int soao;
    public String hoten;
    public int namsinh;
    public double luongcung;
    public double tienthuong;
    public double tienphat;
    private String settinhluongthuclanh;

    CauThu(int i, String nguyen_Van_A, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    CauThu(int i, String hoang_Van_Lam, int i0, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    CauThu(int soAo, String hoTen, int namSinh, double luongCung, double tienThuong, double tienPhat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public int getSoao() {
        return soao;
    }
    public void setSoao(int soao) {
        this.soao = soao;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public double getLuongcung() {
        return luongcung;
    }
    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }
    public double getTienthuong() {
        return tienthuong;
    }
    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }
    public double getTienphat() {
        return tienphat;
    }
    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }
    public double settinhluongthuclanh()
    {
        return luongcung+tienthuong-tienphat;
    }
    public int tinhTuoi() {
        return 2024 - namsinh;
    }
    public void xuatThongTin() {
        System.out.println("CauThu[soao: "+soao+",hoten:"+ hoten+",namsinh:"+namsinh+",luongthuclanh;"+settinhluongthuclanh+"]");
    }
}

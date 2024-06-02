package model;

import java.util.Date;
import java.util.Objects;

public class Student {
    private int maThiSinh;
    private String tenThiSinh;
    private Province queQuan;
    private Date ngaySinh;
    private Boolean gioiTinh;
    private Float diemMon1, diemMon2, diemMon3;
    public int getMaThiSinh() {
        return maThiSinh;
    }
    public void setMaThiSinh(int maThiSinh) {
        this.maThiSinh = maThiSinh;
    }
    public String getTenThiSinh() {
        return tenThiSinh;
    }
    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }
    public Province getQueQuan() {
        return queQuan;
    }
    public void setQueQuan(Province queQuan) {
        this.queQuan = queQuan;
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public Boolean getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public Float getDiemMon1() {
        return diemMon1;
    }
    public void setDiemMon1(Float diemMon1) {
        this.diemMon1 = diemMon1;
    }
    public Float getDiemMon2() {
        return diemMon2;
    }
    public void setDiemMon2(Float diemMon2) {
        this.diemMon2 = diemMon2;
    }
    public Float getDiemMon3() {
        return diemMon3;
    }
    public void setDiemMon3(Float diemMon3) {
        this.diemMon3 = diemMon3;
    }
    public Student() {
    }
    public Student(int maThiSinh, String tenThiSinh, Province queQuan, Date ngaySinh, Boolean gioiTinh, Float diemMon1,
            Float diemMon2, Float diemMon3) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }
	
    @Override
    public String toString() {
        return "Student [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh="
                + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2
                + ", diemMon3=" + diemMon3 + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.maThiSinh, this.tenThiSinh);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        
        return this.maThiSinh == other.maThiSinh;
    }

    

}

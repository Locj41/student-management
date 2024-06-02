package model;

import java.util.Objects;

public class Province {
    private String tenTinh;
    private int maTinh;
    public String getTenTinh() {
        return tenTinh;
    }
    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }
    public int getMaTinh() {
        return maTinh;
    }
    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }
    
    public Province(String tenTinh) {
        this.tenTinh = tenTinh;
    }
    public Province(String tenTinh, int maTinh) {
        this.tenTinh = tenTinh;
        this.maTinh = maTinh;
    }
    public Province() {
    }
    @Override
    public String toString() {
        return this.tenTinh;
    }
    @Override
    public int hashCode() {
        return Objects.hash(tenTinh, maTinh);
    }
    @Override
    public boolean equals(Object obj) {
        //check if this and object whether they point to the same object on memory
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Province other = (Province) obj;
        return other.maTinh == this.maTinh && Objects.equals(this.tenTinh, other.tenTinh);
    }

    
    

}

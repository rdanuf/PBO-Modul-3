package Entity;
import java.util.Date;
public class PendudukEntity {
    String namapen;
    String passpen;
    String tempatlahir;
    String kelamin;
    String agama;
    String status;
    String pekerjaan;
    Date tglLahir;
    public PendudukEntity(String namapen,String passpen,String tempatlahir,Date tglLahir
            ,String kelamin,String agama,String status,String pekerjaan){
        this.namapen = namapen;
        this.passpen = passpen;
        this.tempatlahir = tempatlahir;
        this.kelamin = kelamin;
        this.agama = agama;
        this.status = status;
        this.pekerjaan = pekerjaan;
        this.tglLahir = tglLahir; 
    }
    public String getNamapen(){
        return this.namapen;
    }    
    public void setNamapen(String namapen){
    this.namapen = namapen;
    }
    public String getPasspen(){
        return this.passpen;
    }
    public void setPasspen(String passpen){
    this.passpen = passpen;
    }
    public String getTempatlahir(){
        return this.tempatlahir;
    }
    public void setTempatlahir(String tempatlahir){
    this.tempatlahir = tempatlahir;
    }
    public String getKelamin(){
        return this.kelamin;
    }
    public void setKelamin(String kelamin){
    this.kelamin = kelamin;
    }
    public String getAgama(){
        return this.agama;
    }
    public void setAgama(String agama){
    this.agama = agama;
    }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
    this.status = status;
    }
    public String getPekerjaan(){
        return this.pekerjaan;
    }
    public void setPekerjaan(String pekerjaan){
    this.pekerjaan = pekerjaan;
    }
    public Date getTglLahir(){
        return this.tglLahir;
    }
    public void setTglLahir(Date tglLahir){
    this.tglLahir = tglLahir;
    }
}
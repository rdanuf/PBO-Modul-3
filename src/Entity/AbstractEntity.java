package Entity;
public abstract class AbstractEntity {
    public String nama,pass;  
public AbstractEntity(String nama,String pass){
    this.nama = nama;
    this.pass = pass;
}
public AbstractEntity(){
}
public abstract String getNama();
public void setNama(String nama){
    this.nama = nama;
}
public String getPass() {
    return pass;
}
public void setPass(String pass){
    this.pass = pass;
}
}
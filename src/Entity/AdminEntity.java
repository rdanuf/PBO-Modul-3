package Entity;
public class AdminEntity extends AbstractEntity {
    public AdminEntity(String nama,String pass){
        super (nama,pass);
    }
    @Override
    public String getNama(){
        return nama;
    }
}

package Controller;
import Entity.AdminEntity;
public class AdminController implements ControllerInterface{
    int indexLogin = 0;
    AllObjectModel allobject = new AllObjectModel();
        public void dataAdmin()
    {
        String nama[] = {"riswanda"};
        String pass[] = {"12"};
        for(int i=0;i<nama.length;i++)
        {
            AllObjectModel.adminModel.insertAdmin(new AdminEntity(nama[i],pass[i]));
        }
    }
    public AdminController(){
    } 
    @Override
    public int login (String nama, String pass){
        indexLogin = AllObjectModel.adminModel.cekData(nama,pass);
        return indexLogin;
    }
    public void insertAdmin(String nama,String pass){
        AdminEntity adminModel = new AdminEntity(nama,pass);
        allobject.adminModel.insertAdmin(adminModel);
    }
}
package modul3;
import Controller.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class SistemPendataanPenduduk {
private static AdminController adminController = new AdminController();
private static PendudukController pendudukController = new PendudukController();
static int cekPenduduk,cekview,cekh,ceku;
static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
            System.out.println("Selamat Datang Di Layanan Publik Kota");
            System.out.println("-------------------------------------------");
    int pilihan;
    do{
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.print("pilih = ");
        pilihan = input.nextInt();
            System.out.println("-------------------------------------------");
        switch(pilihan){
            case 1 : if (pilihan == 1){
                     int pilihLogin ;
                System.out.print("1. Login Admin" + "\n2. Login Penduduk" + "\npilih :");
                pilihLogin = input.nextInt();
                if(pilihLogin == 1){
                    LoginAdmin();
                }else{
                    LoginPenduduk();
                }
                }
                break;
        }
            System.out.println("-------------------------------------------");
    }while(pilihan!=2);
    }
    static void registrasi()
    {
        try{
    System.out.print("masukan nama = ");
    String namapen = input.next();
    System.out.print("masukan pass = ");
    String passpen = input.next();
    System.out.print("masukan tempat lahir = ");
    String tempatlahir = input.next();
    System.out.print("masukan Tgl lahir(mm/dd/yyyy) = ");
    Date tglLahir = new Date (input.next());
    System.out.print("masukan kelamin(L/P) = ");
    String kelamin = input.next();
    System.out.print("masukan Agama = ");
    String agama = input.next();
    System.out.print("masukan Status = ");
    String status = input.next();
    System.out.print("masukan Pekerjaan = ");
    String pekerjaan = input.next();
    pendudukController.insertPenduduk(namapen,passpen,tempatlahir,tglLahir,kelamin,agama,status,pekerjaan);
        }catch(Exception exception){
            System.out.print("Salah  ");
        }
    }
    static void dataAdmin()
    {
        String nama[] = {"riswanda"};
        String pass[] = {"12"};
        for(int i=0; i<nama.length;i++)
        {
            adminController.insertAdmin(nama[i],pass[i]);
        }
    }
    static void update(int index){
    try{
    System.out.print("masukan nama = ");
    String namapen = input.next();
    pendudukController.getPendudukEntityArrayList(index).setNamapen(namapen);
    System.out.print("masukan pass = ");
    String passpen = input.next();
    pendudukController.getPendudukEntityArrayList(index).setPasspen(passpen);
    System.out.print("masukan tempat lahir = ");
    String tempatlahir = input.next();
    pendudukController.getPendudukEntityArrayList(index).setTempatlahir(tempatlahir);
    System.out.print("masukan Tgl lahir(mm/dd/yyyy) = ");
    Date tglLahir = new Date (input.next());
    pendudukController.getPendudukEntityArrayList(index).setTglLahir(tglLahir);
    System.out.print("masukan kelamin(L/P) = ");
    String kelamin = input.next();
    pendudukController.getPendudukEntityArrayList(index).setKelamin(kelamin);
    System.out.print("masukan Agama = ");
    String agama = input.next();
    pendudukController.getPendudukEntityArrayList(index).setAgama(agama);
    System.out.print("masukan Status = ");
    String status = input.next();
    pendudukController.getPendudukEntityArrayList(index).setStatus(status);
    System.out.print("masukan Pekerjaan = ");
    String pekerjaan = input.next();
    pendudukController.getPendudukEntityArrayList(index).setPekerjaan(pekerjaan);
    }catch(Exception exception){
        System.out.println("Salah input ");
    }
    }
    static void LoginAdmin(){
        int pilih,loop = 0;
//        int index = 0;
        try{
        System.out.print("Masukkan Nama Admin : ");
        String nama = input.next();
        System.out.print("Password Admin : ");
        String pass = input.next();
        adminController.login(nama,pass);
        }catch(Exception e){
    System.out.println("Nama atau password salah");
        }
        do{ 
            try{
                
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Update Data");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            System.out.println("                         ");
            switch(pilih){
                case 1 : registrasi();
                        break;
                case 2 : 
                    try{
                    System.out.print("Inputkan Nama Penduduk : ");
                         String namapen =input.next();
                         cekview = pendudukController.cekData(namapen);
                         lihatdata(cekview);
                    }catch(Exception e){
                        System.out.println("Nama tdk ada");
                    }
                        break;
                case 3 : 
                    try{
                    System.out.print("Inputkan Nama Penduduk : ");
                         String nama2 =input.next();
                         cekh = pendudukController.cekData(nama2);
                         pendudukController.delete(cekview);
                         }catch(Exception e){
                        System.out.println("Nama tdk ada");
                    }
                        break;
                case 4 : 
                    try{
                    System.out.print("Inputkan Nama Penduduk : ");
                         String nama3 = input.next();
                         ceku = pendudukController.cekData(nama3);
                            update(ceku);
                            }catch(Exception e){
                        System.out.println("Nama tdk ada");
                    }
                            break;
                case 5 :
                    loop=1;
                    break;
            }
            }catch(Exception e){
                        System.out.println("Nama tdk ada");
                    }
        }while(loop!=1);  
    }
    static void lihatdata(int index){
       System.out.println("Nama              : "+pendudukController.getPendudukEntityArrayList(index).getNamapen());
                System.out.println("Tempat tgl lahir  : "+pendudukController.getPendudukEntityArrayList(index).getTempatlahir()+" "+new SimpleDateFormat("MM-dd-yyyy").format(pendudukController.getPendudukEntityArrayList(index).getTglLahir()));
                System.out.println("Kelamin           : "+pendudukController.getPendudukEntityArrayList(index).getKelamin());
                System.out.println("Agama             : "+pendudukController.getPendudukEntityArrayList(index).getAgama());
                System.out.println("Status            : "+pendudukController.getPendudukEntityArrayList(index).getStatus());
                System.out.println("Pekerjaan         : "+pendudukController.getPendudukEntityArrayList(index).getPekerjaan()); 
    }
    static void LoginPenduduk()
    {
        int pilih;
        System.out.print("Nama : ");
        String namapen = input.next();
        System.out.print("Pass : ");
        String passpen = input.next();
        cekPenduduk = pendudukController.login(namapen,passpen);
        do
        {
            System.out.println("1. Cek Data Diri");
            System.out.println("2. Keluar");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih)
            {
                case 1 :      
                System.out.println("Nama              : "+pendudukController.getPendudukEntityArrayList(cekPenduduk).getNamapen());
                System.out.println("Tempat tgl lahir  : "+pendudukController.getPendudukEntityArrayList(cekPenduduk).getTempatlahir()+" "+new SimpleDateFormat("MM-dd-yyyy").format(pendudukController.getPendudukEntityArrayList(cekPenduduk).getTglLahir()));
                System.out.println("Kelamin           : "+pendudukController.getPendudukEntityArrayList(cekPenduduk).getKelamin());
                System.out.println("Agama             : "+pendudukController.getPendudukEntityArrayList(cekPenduduk).getAgama());
                System.out.println("Status            : "+pendudukController.getPendudukEntityArrayList(cekPenduduk).getStatus());
                System.out.println("Pekerjaan         : "+pendudukController.getPendudukEntityArrayList(cekPenduduk).getPekerjaan());
                break;
            }
        }while (pilih!=2);
    }
}
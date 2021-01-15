package Model;
import Entity.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class PendudukModel implements ModelInterface{
    private ArrayList<PendudukEntity>PendudukEntityArrayList = new ArrayList<PendudukEntity>();
    
    public void insertPenduduk(PendudukEntity PendudukEntity){
        PendudukEntityArrayList.add(PendudukEntity);
    }

    public int cekData(String namapen,String passpen){
        int loop = 0;
        for (PendudukEntity pendudukEntity : PendudukEntityArrayList) {
            if (pendudukEntity.getNamapen().equals(namapen) &&
              pendudukEntity.getPasspen().equals(passpen)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    public int cekdataview(String namapen){
        int loop = 0;
        for (PendudukEntity pendudukEntity : PendudukEntityArrayList) {
            if (pendudukEntity.getNamapen().equals(namapen)) {
                break;
            } else {
                loop++;
            }
        }return loop;
    }
    public PendudukEntity getPendudukEntityArrayList(int index){
        return PendudukEntityArrayList.get(index);
    }
public void delete(int index){
        PendudukEntityArrayList.remove(index);
        System.out.println("data telah dihapus");
    }
}
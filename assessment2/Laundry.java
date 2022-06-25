import java.util.*;

public class Laundry {
    PriorityQueue<Cucian> cucianList = new PriorityQueue<>();

    public void terimaCucian(int id, String name, int date, String type, int weight){
        Cucian cucian = new Cucian();
        cucian.setId(id);
        cucian.setName(name);
        cucian.setDate(date);

        int typeInt;

        switch (type.toLowerCase()){
            case "biasa":
                typeInt = 3;
                break;
            case "express":
                typeInt = 2;
                break;
            case "kilat":
                typeInt = 1;
                break;
            default:
                typeInt = 3;
                break;
        }

        cucian.setType(typeInt);
        cucian.setBerat(weight);
        cucian.setValue(date + typeInt);

        cucianList.add(cucian);
    }

    public void listCucian(){
        System.out.println("Urutan cucian harus diselesaikan:");

        while(true)
        {
            Cucian cucian = cucianList.poll();

            if(cucian == null) break;

            System.out.println("idCuci = "+ cucian.getId() +", namaPelanggan = " + cucian.getName());
        }
    }
}

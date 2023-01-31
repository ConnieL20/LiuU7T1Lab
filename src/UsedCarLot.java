import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<>();
    }

    public ArrayList getInventory(){
        return inventory;
    }

    public void addCar(Car newCar){
        inventory.add(newCar);
    }

    public boolean swap(int index1, int index2){
        if (index1 < 0 || index1 > inventory.size() - 1 || index2 < 0 || index2 > inventory.size() - 1){
            return false;
        } else {
            Car temp = inventory.get(index1);
            inventory.set(index1, inventory.get(index2));
            inventory.set(index2, temp);
        }
        return true;
    }
}


public class DesignParkingSys {

    private int bigSlots = 0;
    private int mediumSlots = 0;
    private int smallSlots = 0;

    public DesignParkingSys(int big, int medium, int small) {
        this.bigSlots = big;
        this.mediumSlots = medium;
        this.smallSlots = small;

    }

    public boolean addCar(int carType) {

        if (carType == 1 && bigSlots != 0) {
            bigSlots--;
            return true;
        }
        if (carType == 2 && mediumSlots != 0) {
            mediumSlots--;
            return true;
        }
        if (carType == 3 && smallSlots != 0) {
            smallSlots--;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        //Add test cases. Tested on leetcode 
    }

}

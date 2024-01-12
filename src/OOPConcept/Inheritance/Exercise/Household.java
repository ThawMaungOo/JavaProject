package OOPConcept.Inheritance.Exercise;

public class Household {
    int occupants;
    float incomes;

    public void setOccupants(int occupants){
        this.occupants = occupants;
    }

    public void setIncomes(float incomes){
        this.incomes = incomes;
    }

    public int getOccupants(){
        return occupants;
    }

    public float getIncomes(){
        return incomes;
    }

    public Household(){ //no argument constructor
        occupants = 1;
        incomes = 0;
    }

    public Household(int ocps){     //one argument constructor
        this.occupants = ocps; // it is not necessary to include prefix this
    }

    public Household(int ocps, float inc){      //two arguments constructor
        this.occupants = ocps;
        this.incomes = inc;
    }
}

package entities;

public class Students {
    private int userNumber;

    public Students(){

    }

    public Students(int userNumber){
        this.userNumber = userNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + userNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Students other = (Students) obj;
        if (userNumber != other.userNumber)
            return false;
        return true;
    }

    
}

package oca;

class General{
    int stars = 1;
    General bePromoted(int stars){
        this.stars += stars;
        return this;
    }
    @Override
    public String toString(){ return "" + stars; }
}

class ChiefOfStaff {
    public static void main(String[] args) {
        General g = new General();
        System.out.println(g.bePromoted(1).equals(g.bePromoted(2))); // true
        System.out.println(g); // 4
    }
}

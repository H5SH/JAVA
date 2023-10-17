// Cutom wrapper class

import java.util.HashSet;
import java.util.Set;

class Opporators{
    // private Set<Integer> s = new HashSet<>();

    // public Set<Integer> getS() {
    //     return s;
    // }

    // public void setS(int s) {
    //     if(this.s.contains(s)){

    //     }
    // }
    private int v;

    Opporators(){
        v = 0;
    }

    Opporators(int v){
        this.v = v;
    }


    public Opporators Add(Opporators o){
        return new Opporators(this.v += o.getV());
    }

    public Opporators Substract(Opporators o){
        return new Opporators(this.v -= o.getV());
    }

    public Opporators Multiply(Opporators o){
        return new Opporators(this.v *= o.getV());
    }

    public Opporators Divide(Opporators o){
        return new Opporators(this.v /= o.getV());
    }

    public int getV() {
        return v;
    }



    public void setV(int v) {
        this.v = v;
    }
    
};


class Lab7Task2{
    public static void main(String argv[]){
        Opporators o = new Opporators();
        Opporators b = new Opporators();
        o.setV(10);
        b.setV(10);
        Opporators c = o.Add(b);
        System.out.print(c.getV());
    }
}
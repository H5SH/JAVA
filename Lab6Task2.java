class Rectangle{
    private int heigth = 0, width = 0;
    
    public boolean equals(Rectangle r){
        if(heigth == r.getHeigth() && width == r.getWidth()){
            return true;
        }
        return false;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
}

class Lab6Task2{
    public static void main(String argv[]){
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle();
        r.setHeigth(10);
        r.setWidth(10);
        r1.setHeigth(10);
        r1.setWidth(10);
        if(r1.equals(r)){
            System.out.println("R1 is equal to r");
        }
        else{
            System.out.println("R1 is not equal to r");
        }
        Rectangle r3 = new Rectangle();
        r3.setHeigth(20);
        r3.setWidth(20);
        if(r3.equals(r)){
            System.out.println("R3 is equal to r");
        }else{
            System.out.println("R3 is not equal to r");
        }
    }
}
class tabular{
    public static void main(String argv[]){
        System.out.println("N1    N2    N3    N4");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                System.out.print((int)Math.pow((i + 1),(j + 1)) + "     ");
            }
            System.out.println();
        }
    }
}
class CheckBoard{
    public static void main(String argv[]){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print("* ");
                System.out.print(" ");
            }
            System.out.println();
            //Add the Space behind if the i iteration is not even
            if((i + 1) % 2 != 0){
                System.out.print(" ");
            }
            
                
            
        }
    }
}
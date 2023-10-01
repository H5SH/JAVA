class Function{
    private int num1, num2, num3, num4, num5;
    private static int Answer;

    public static void Calculator(int num1, int num2){
        Answer = num1 + num2;
    }

    public static void Calculator(int num1, int num2, int num3){
        Answer = num1 - num2 - num3;
    }

    public static void Calculator(int num1, int num2, int num3, int num4){
        Answer = num1 * num2 * num3 * num4;
    }

    public static void Calculator(int num1, int num2, int num3, int num4, int num5){
        Answer = (num1 + num2 + num3 + num4 + num5)/4;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getAnswer() {
        return Answer;
    }

    public static void setAnswer(int answer) {
        Answer = answer;
    }

}

class lab4Task4{
    public static void main(String argv[]){
        Function f = new Function();
        f.Calculator(2, 2);
        System.out.println(f.getAnswer());
        f.Calculator(2, 2, 10);
        System.out.println(f.getAnswer());
        f.Calculator(2, 4, 5, 10);
        System.out.println(f.getAnswer());
        f.Calculator(2, 4, 8, 16, 32);
        System.out.println(f.getAnswer());
    }
}
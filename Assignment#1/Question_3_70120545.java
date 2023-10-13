
class Clock{
    private int houre = 0, minute = 0, second = 0;

    public Clock(){
        this.houre = 12;
        minute = 00;
        second = 00;
    }

    public Clock(int houre, int minute, int second) {
        this.houre = houre;
        this.minute = minute;
        this.second = second;
    }

    public int getHoure() {
        return houre;
    }

    public void setHoure(int houre) {
        if(this.houre == 23){
            this.houre = 0;
        }else{
            this.houre = houre;
        }  
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(this.minute == 59){
            this.minute = 0;
            this.houre++;
        }else{
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(this.second == 59){
            this.second = 0;
            this.minute++;
        }else{
            this.second = second;
        }
    }

    // pad function is use to add 0 on left if the number is smaller then 10
    private String pad(int d){
        return d < 10 ? String.format("%02d", d):""+d;
    }

    public String displayTime(){
        return pad(this.houre) + ":" + pad(this.minute) + ":" + pad(this.second);
    }
    
}

class Question_3_70120545{
    public static void main(String argv[]){
        Clock c = new Clock(11, 42, 59);
        System.out.println(c.displayTime());
    }
}
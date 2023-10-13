class Clock{
    private int hours, minute, second;

    public Clock(int hours, int minute, int second) {
        this.hours = hours;
        this.minute = minute;
        this.second = second;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hour) {
        if(hour > 23){
            hours = 0;
        }else{
            this.hours = hour;
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minut) {
        if(minut > 59){
            this.minute = 0;
            setHours(this.hours++);
        }else{
            this.minute = minut;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int secon) {
        if(secon > 59){
            this.second = 0;
            setMinute(this.minute++);
        }else{
            this.second = secon;
        }   
    }

    private String pad(int d){
        return d < 10 ? String.format("%02d", d):"" + d;
    }

    public String displayTime(){
        return pad(this.hours) + ":" + pad(this.minute) + ":" + pad(this.second);
    }
}

class Q3A1{
    public static void main(String argv[]){
        Clock c = new Clock(23, 4, 30);
        System.out.println(c.displayTime());
        c.setHours(24);
        c.setMinute(12);
        c.setSecond(70);
        System.out.println("After imputing time by setters");
        System.out.println(c.displayTime());
    }
}
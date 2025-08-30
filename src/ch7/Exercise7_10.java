package ch7;

public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}

class MyTv2{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    //클래스 외부에서 접근할 수 없도록 필드에 (private)제어자를 붙이고
    //(public) 값을 어디서나 읽고 변경할 수 있도록 getter, setter메서드를 추가하라

    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        this.channel = channel;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
}
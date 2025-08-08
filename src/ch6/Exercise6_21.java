package ch6;

public class Exercise6_21 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+",VOL:"+t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+",VOL:"+t.volume);

        t.volume=100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+",VOL:"+t.volume);
    }
}
class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        //isPowerOn이 true이면 false로, false이면 true로 바꾼다.
        isPowerOn = !isPowerOn;
    }
    void volumeUp(){
        //volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
        if(volume < MAX_VOLUME)
            volume++;
    }
    void volumeDown(){
        //volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
        if(volume>MIN_VOLUME)
            volume--;
    }
    void channelUp(){
        channel++;
        if(channel == MAX_CHANNEL)
            channel = MIN_CHANNEL;
    }
    void channelDown(){
        channel--;
        if(channel==MIN_CHANNEL)
            channel = MAX_CHANNEL;

    }
}
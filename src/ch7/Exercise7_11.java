package ch7;

public class Exercise7_11 {
    //MyTv3클래스에 이전채널로 이동하는 기능의 메서드 추가하기
    public static void main(String[] args) {
        MyTv3 t = new MyTv3();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}

class MyTv3 {
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel;

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
        this.prevChannel = this.channel; //이전 채널 값을 저장하고
        this.channel = channel; //새로운 채널 값으로 바꾸기
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void gotoPrevChannel(){
        //현재 채널을 이전 채널로 변경한다.
        //이전채널 저장
        setChannel(prevChannel);
        getChannel();
    }
}

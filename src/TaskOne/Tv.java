package TaskOne;

public class Tv {
    private int channel;
    private int volume;
    private boolean onState;

    public Tv(){
        channel = 0;
        volume = 0;
        onState = false;
    }

    public String setChannel(int channel) {
        if (onState) {
            this.channel = channel;
            return "Channel is set to: " + channel;
        }
        return "TaskOne.Tv is off";
    }

    public void channelUp() {
        if (onState) {
            channel++;
        }
    }

    public void volumeUp() {
        if (onState) {
            volume++;
        }
    }

    public void channelDown() {
        if (onState) {
            channel--;
        }
    }

    public void volumeDown() {
        if (onState) {
            volume--;
        }
    }

    public String setVolume(int volume) {
        if (onState) {
            this.volume = volume;
            return "Volume is set to" + volume;
        }
        return "TaskOne.Tv is off";
    }

    public String turnOn() {
        onState = true;
        return "TaskOne.Tv is on";
    }

    public String turnOff() {
        channel = 0;
        volume = 0;
        return "TaskOne.Tv is off";
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOnState() {
        return onState;
    }
}

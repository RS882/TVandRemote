public class TV {
    private double frequency;
    private int currentChannel;

    public TV(double frequency, int currentChannel) {
        this.frequency = frequency;
        setCurrentChannel(currentChannel);
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = checkChannel(currentChannel)  ? this.currentChannel  : currentChannel;
    }

    private boolean checkChannel(int channel) {
        return channel < 0 || channel > 50;
    }
}

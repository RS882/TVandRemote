public class Remote {
    private double frequency;

    public Remote(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    public void channelUp(TV tv){
        if(this.frequency==tv.getFrequency()) {
            tv.setCurrentChannel(tv.getCurrentChannel()+1);
        }
    }
    public void channelDown(TV tv){
        if(this.frequency==tv.getFrequency()) {
            tv.setCurrentChannel(tv.getCurrentChannel()-1);
        }
    }
    public void channelToIndex(TV tv, int index){
        if(this.frequency==tv.getFrequency()) {
            tv.setCurrentChannel(index);
        }
    }
}

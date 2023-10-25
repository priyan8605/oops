package interfaces;

//import javax.swing.plaf.synth.SynthStyleFactory;

interface IRemote {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
}

class LGImpl implements IRemote {

    public static void main(String[] args) {
        System.out.println(IRemote.MIN_VOLUME);
        System.out.println(IRemote.MAX_VOLUME);
    }
}

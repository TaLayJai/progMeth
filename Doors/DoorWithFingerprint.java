public class DoorWithFingerprint extends Door{
    private FingerprintModule fingerprintModule;

    public DoorWithFingerprint(String doorID){
        super(doorID);
    }

    public void installFingerprintModule(FingerprintModule fingerprintModule){
        this.fingerprintModule = fingerprintModule;
        System.out.println("A fingerprint module with serial " + fingerprintModule.getFingerprintSerialNumber() + " already installed.");
    }
    
    public void close(String fingerprint){
        this.lock();
        fingerprintModule.registerFingerprint(fingerprint);
    }
    
    public void open(String fingerprint){
        if (fingerprintModule.checkFingerprint(fingerprint)){
            this.unlock();
        }
        this.open();
    }
}
class PezDispenser{
    public static final int MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;

    public PezDispenser(String name){
        characterName = name;
        this.pezCount = 0;
    }

    public void Fill(){
        this.pezCount = MAX_PEZ;
    }
    public void Fill(int pezAmount){
        int newPezAmount = this.pezCount += pezAmount;
        if(newPezAmount > MAX_PEZ){
            throw new IllegalArgumentException("too much PEZ");
        }
        pezCount = newPezAmount;
    }
    public boolean Dispense(){
        if(!IsEmpty()){
            pezCount--;
            return true;
        }else{
            return false;
        }
    }
    public boolean IsEmpty(){
        return pezCount == 0;
    }
    public String GetCharacterName(){
        return characterName;
    }
}
class IPhoneFactory implements PhoneFactory {
    public MotherBoard generateMotherBoard() {
        MotherBoard motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        return motherBoard;
    }
    
    public Screen generateScreen() {
        Screen screen = new IphoneScreen();
        return screen;
    }

    public Case generateCase()
        Case phoneCase = new IphoneCase();
        return phoneCase;
}
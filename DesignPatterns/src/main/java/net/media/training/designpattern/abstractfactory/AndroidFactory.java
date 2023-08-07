class AndroidFactory implements PhoneFactory {
    public MotherBoard generateMotherBoard() {
        MotherBoard motherBoard = new AndroidMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        return motherBoard;
    }
    
    public Screen generateScreen() {
        Screen screen = new AndroidScreen();
        return screen;
    }

    public Case generateCase()
        Case phoneCase = new AndroidCase();
        return phoneCase;
    }
}
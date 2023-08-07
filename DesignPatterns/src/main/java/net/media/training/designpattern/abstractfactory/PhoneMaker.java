package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */

public class PhoneMaker {
    public Case buildPhone(String phoneType) {
        PhoneFactory phFactory = new PhoneFactory()

        
        if (phoneType.equals("Android")) {
           phFactory = new AndroidFactory()   
        } else {
            phFactory = new IPhoneFactory()
        }

        MotherBoard motherBoard = phFactory.generateMotherBoard();
        Screen screen = phFactory.generateScreen();
        Case phoneCase = phFactory.generateCase()

        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}

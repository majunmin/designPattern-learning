package com.mjm.part3.chapter23.level2;

import com.mjm.part3.chapter23.level2pa.LetterProcessImpl;

/**
 * 
 */
public class ModenPostOffice {

    private static final ILetterProcess DEFAULT_ILETTER_PROCESS = new LetterProcessImpl();

    /**
     *
     */
    public ILetterProcess letterProcess;

    public ModenPostOffice() {
        this.letterProcess = DEFAULT_ILETTER_PROCESS;
    }

    /**
     * Default constructor
     */

    public ModenPostOffice(ILetterProcess letterProcess) {
        this.letterProcess = letterProcess;
    }



    /**
     * @param context
     * @param address
     */
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnveiope(address);
        letterProcess.LetterIntoEnvelope();
        letterProcess.sendLetter();
    }

}
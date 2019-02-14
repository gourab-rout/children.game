package com.sv.children.game;

import java.util.concurrent.atomic.AtomicLong;

/**
* The class returns a unique sequence number
* @author Gourab Rout
* @since  2019-02-14 
*/
public class UniqueSequence {
	    private AtomicLong seqValue = new AtomicLong(1);	 
	    public String generetaeSequence() {
	        return "id" + "-" + seqValue.getAndIncrement();
	    }
}

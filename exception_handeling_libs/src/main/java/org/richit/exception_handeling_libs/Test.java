package org.richit.exception_handeling_libs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {

    public void run() throws IOException, ParseException {
        //throw new IOException(  );
        throw new ParseException( "hello jhon at line . ", 5 );
    }
    public void care() throws IOException {
        //code doesn't permit us to throws both IOException and FileNotFoundException
        //as FileNotFoundException is parent of IOException
        throw new IOException(  );
        //throw new FileNotFoundException(  );
    }
}

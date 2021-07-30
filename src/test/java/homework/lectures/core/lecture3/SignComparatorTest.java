package homework.lectures.core.lecture3;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class SignComparatorTest {

    @Test
    public void comparePositive() {
        String programResult = "Number is positive";
        SignComparator.setResult(SignComparator.compare(2));
        Assertions.assertEquals(programResult, SignComparator.getResult());
    }

    @Test
    public void compareNegative() {
        String programResult = "Number is negative";
        SignComparator.setResult(SignComparator.compare(-2));
        Assertions.assertEquals(programResult, SignComparator.getResult());
    }

    @Test
    public void compareZero() {
        String programResult = "Number is equal to zero";
        SignComparator.setResult(SignComparator.compare(0));
        Assertions.assertEquals(programResult, SignComparator.getResult());
    }

    //@Test
    public void bufferReaderEntersTest() throws IOException {
        int programResultBuffer = SignComparator.bufferReaderEnters();

        int programResult = 1;
        Assertions.assertEquals(programResult, programResultBuffer);
    }


}
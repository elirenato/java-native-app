package com.mycompany;

import com.google.gson.Gson;
import com.mycompany.model.Airport;
import com.mycompany.model.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();

    @BeforeEach
    public void beforeTest() {
        System.setOut(new PrintStream(this.consoleContent));
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testShouldReturnJsonArrayNotEmpty()
    {
        App.main(new String[]{});
        String output = this.consoleContent.toString();
        Gson gson = new Gson();
        Response response = gson.fromJson(output, Response.class);
        Assertions.assertEquals("Java Native Hello World with JSON serialization", response.getMessage());
        Assertions.assertEquals(2, response.getAirports().length);
    }
}

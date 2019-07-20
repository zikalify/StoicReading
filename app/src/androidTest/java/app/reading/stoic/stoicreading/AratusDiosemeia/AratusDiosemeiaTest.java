package app.reading.stoic.stoicreading.AratusDiosemeia;

import android.content.Context;
import android.content.res.Resources;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class AratusDiosemeiaTest {

    @Rule
    public ActivityTestRule<AratusDiosemeia> AratusDiosemeiaTestRule = new ActivityTestRule<AratusDiosemeia>(AratusDiosemeia.class);

    private AratusDiosemeia AratusDiosemeia = null;

    @Before
    public void setUp() throws Exception {
        AratusDiosemeia = AratusDiosemeiaTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AratusDiosemeia.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Diosemeia";
        String titleActual = AratusDiosemeia.getResources().getString(R.string.AratusDiosemeiaTitle);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AratusDiosemeia.getResources().getString(R.string.AratusDiosemeiaTitle);;
        String titleActual = String.valueOf(AratusDiosemeia.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AratusDiosemeia.getResources().getString(R.string.AratusDiosemeia);
        assertNotEquals(tooLarge, textActual);
    }

    @After
    public void tearDown() throws Exception {
        AratusDiosemeia = null;
    }
}
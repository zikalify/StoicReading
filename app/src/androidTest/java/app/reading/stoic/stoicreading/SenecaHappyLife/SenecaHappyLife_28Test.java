package app.reading.stoic.stoicreading.SenecaHappyLife;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaHappyLife_28Test {

    @Rule
    public ActivityTestRule<SenecaHappyLife_28> SenecaHappyLife_28TestRule = new ActivityTestRule<SenecaHappyLife_28>(SenecaHappyLife_28.class);

    private SenecaHappyLife_28 SenecaHappyLife_28 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHappyLife_28 = SenecaHappyLife_28TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHappyLife_28.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 28";
        String titleActual = SenecaHappyLife_28.getResources().getString(R.string.SenecaHappyLifeTitle28);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHappyLife_28.getResources().getString(R.string.SenecaHappyLifeTitle28);
        String titleActual = String.valueOf(SenecaHappyLife_28.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHappyLife_28.getResources().getString(R.string.SenecaHappyLifeChapter28);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHappyLife_28.getResources().getString(R.string.SenecaHappyLifeChapter28);
        TextView actualTextView = (TextView) SenecaHappyLife_28.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHappyLife_28 = null;
    }
}
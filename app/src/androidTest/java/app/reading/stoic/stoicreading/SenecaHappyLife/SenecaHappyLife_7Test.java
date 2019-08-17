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

public class SenecaHappyLife_7Test {

    @Rule
    public ActivityTestRule<SenecaHappyLife_7> SenecaHappyLife_7TestRule = new ActivityTestRule<SenecaHappyLife_7>(SenecaHappyLife_7.class);

    private SenecaHappyLife_7 SenecaHappyLife_7 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHappyLife_7 = SenecaHappyLife_7TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHappyLife_7.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 7";
        String titleActual = SenecaHappyLife_7.getResources().getString(R.string.SenecaHappyLifeTitle7);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHappyLife_7.getResources().getString(R.string.SenecaHappyLifeTitle7);
        String titleActual = String.valueOf(SenecaHappyLife_7.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHappyLife_7.getResources().getString(R.string.SenecaHappyLifeChapter7);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHappyLife_7.getResources().getString(R.string.SenecaHappyLifeChapter7);
        TextView actualTextView = (TextView) SenecaHappyLife_7.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHappyLife_7 = null;
    }
}
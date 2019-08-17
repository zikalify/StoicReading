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

public class SenecaHappyLife_14Test {

    @Rule
    public ActivityTestRule<SenecaHappyLife_14> SenecaHappyLife_14TestRule = new ActivityTestRule<SenecaHappyLife_14>(SenecaHappyLife_14.class);

    private SenecaHappyLife_14 SenecaHappyLife_14 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHappyLife_14 = SenecaHappyLife_14TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHappyLife_14.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 14";
        String titleActual = SenecaHappyLife_14.getResources().getString(R.string.SenecaHappyLifeTitle14);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHappyLife_14.getResources().getString(R.string.SenecaHappyLifeTitle14);
        String titleActual = String.valueOf(SenecaHappyLife_14.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHappyLife_14.getResources().getString(R.string.SenecaHappyLifeChapter14);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHappyLife_14.getResources().getString(R.string.SenecaHappyLifeChapter14);
        TextView actualTextView = (TextView) SenecaHappyLife_14.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHappyLife_14 = null;
    }
}
package app.reading.stoic.stoicreading.SenecaHappyLife;

import androidx.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaHappyLife_13Test {

    @Rule
    public ActivityTestRule<SenecaHappyLife_13> SenecaHappyLife_13TestRule = new ActivityTestRule<SenecaHappyLife_13>(SenecaHappyLife_13.class);

    private SenecaHappyLife_13 SenecaHappyLife_13 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHappyLife_13 = SenecaHappyLife_13TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHappyLife_13.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 13";
        String titleActual = SenecaHappyLife_13.getResources().getString(R.string.SenecaHappyLifeTitle13);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHappyLife_13.getResources().getString(R.string.SenecaHappyLifeTitle13);
        String titleActual = String.valueOf(SenecaHappyLife_13.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHappyLife_13.getResources().getString(R.string.SenecaHappyLifeChapter13);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHappyLife_13.getResources().getString(R.string.SenecaHappyLifeChapter13);
        TextView actualTextView = (TextView) SenecaHappyLife_13.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHappyLife_13 = null;
    }
}
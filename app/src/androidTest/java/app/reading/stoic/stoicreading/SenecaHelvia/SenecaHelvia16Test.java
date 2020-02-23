package app.reading.stoic.stoicreading.SenecaHelvia;

import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;
import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaHelvia16Test {

    @Rule
    public ActivityTestRule<SenecaHelvia16> SenecaHelvia16TestRule = new ActivityTestRule<SenecaHelvia16>(SenecaHelvia16.class);

    private SenecaHelvia16 SenecaHelvia16 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia16 = SenecaHelvia16TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia16.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 16";
        String titleActual = SenecaHelvia16.getResources().getString(R.string.SenecaHelviaTitle16);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia16.getResources().getString(R.string.SenecaHelviaTitle16);
        String titleActual = String.valueOf(SenecaHelvia16.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia16.getResources().getString(R.string.SenecaHelviaChapter16);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia16.getResources().getString(R.string.SenecaHelviaChapter16);
        TextView actualTextView = (TextView) SenecaHelvia16.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia16 = null;
    }
}
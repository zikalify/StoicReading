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

public class SenecaHelvia14Test {

    @Rule
    public ActivityTestRule<SenecaHelvia14> SenecaHelvia14TestRule = new ActivityTestRule<SenecaHelvia14>(SenecaHelvia14.class);

    private SenecaHelvia14 SenecaHelvia14 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia14 = SenecaHelvia14TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia14.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 14";
        String titleActual = SenecaHelvia14.getResources().getString(R.string.SenecaHelviaTitle14);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia14.getResources().getString(R.string.SenecaHelviaTitle14);
        String titleActual = String.valueOf(SenecaHelvia14.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia14.getResources().getString(R.string.SenecaHelviaChapter14);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia14.getResources().getString(R.string.SenecaHelviaChapter14);
        TextView actualTextView = (TextView) SenecaHelvia14.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia14 = null;
    }
}
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

public class SenecaHelvia13Test {

    @Rule
    public ActivityTestRule<SenecaHelvia13> SenecaHelvia13TestRule = new ActivityTestRule<SenecaHelvia13>(SenecaHelvia13.class);

    private SenecaHelvia13 SenecaHelvia13 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia13 = SenecaHelvia13TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia13.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 13";
        String titleActual = SenecaHelvia13.getResources().getString(R.string.SenecaHelviaTitle13);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia13.getResources().getString(R.string.SenecaHelviaTitle13);
        String titleActual = String.valueOf(SenecaHelvia13.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia13.getResources().getString(R.string.SenecaHelviaChapter13);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia13.getResources().getString(R.string.SenecaHelviaChapter13);
        TextView actualTextView = (TextView) SenecaHelvia13.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia13 = null;
    }
}
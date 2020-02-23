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

public class SenecaHelvia5Test {

    @Rule
    public ActivityTestRule<SenecaHelvia5> SenecaHelvia5TestRule = new ActivityTestRule<SenecaHelvia5>(SenecaHelvia5.class);

    private SenecaHelvia5 SenecaHelvia5 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia5 = SenecaHelvia5TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia5.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 5";
        String titleActual = SenecaHelvia5.getResources().getString(R.string.SenecaHelviaTitle5);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia5.getResources().getString(R.string.SenecaHelviaTitle5);
        String titleActual = String.valueOf(SenecaHelvia5.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia5.getResources().getString(R.string.SenecaHelviaChapter5);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia5.getResources().getString(R.string.SenecaHelviaChapter5);
        TextView actualTextView = (TextView) SenecaHelvia5.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia5 = null;
    }
}
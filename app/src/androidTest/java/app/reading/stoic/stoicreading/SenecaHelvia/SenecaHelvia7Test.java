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

public class SenecaHelvia7Test {

    @Rule
    public ActivityTestRule<SenecaHelvia7> SenecaHelvia7TestRule = new ActivityTestRule<SenecaHelvia7>(SenecaHelvia7.class);

    private SenecaHelvia7 SenecaHelvia7 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia7 = SenecaHelvia7TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia7.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 7";
        String titleActual = SenecaHelvia7.getResources().getString(R.string.SenecaHelviaTitle7);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia7.getResources().getString(R.string.SenecaHelviaTitle7);
        String titleActual = String.valueOf(SenecaHelvia7.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia7.getResources().getString(R.string.SenecaHelviaChapter7);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia7.getResources().getString(R.string.SenecaHelviaChapter7);
        TextView actualTextView = (TextView) SenecaHelvia7.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia7 = null;
    }
}
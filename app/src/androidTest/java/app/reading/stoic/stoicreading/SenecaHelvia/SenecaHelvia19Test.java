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

public class SenecaHelvia19Test {

    @Rule
    public ActivityTestRule<SenecaHelvia19> SenecaHelvia19TestRule = new ActivityTestRule<SenecaHelvia19>(SenecaHelvia19.class);

    private SenecaHelvia19 SenecaHelvia19 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia19 = SenecaHelvia19TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia19.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 19";
        String titleActual = SenecaHelvia19.getResources().getString(R.string.SenecaHelviaTitle19);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia19.getResources().getString(R.string.SenecaHelviaTitle19);
        String titleActual = String.valueOf(SenecaHelvia19.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia19.getResources().getString(R.string.SenecaHelviaChapter19);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia19.getResources().getString(R.string.SenecaHelviaChapter19);
        TextView actualTextView = (TextView) SenecaHelvia19.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia19 = null;
    }
}
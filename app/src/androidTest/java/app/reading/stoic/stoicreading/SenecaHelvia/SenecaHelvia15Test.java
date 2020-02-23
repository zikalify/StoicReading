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

public class SenecaHelvia15Test {

    @Rule
    public ActivityTestRule<SenecaHelvia15> SenecaHelvia15TestRule = new ActivityTestRule<SenecaHelvia15>(SenecaHelvia15.class);

    private SenecaHelvia15 SenecaHelvia15 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia15 = SenecaHelvia15TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia15.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 15";
        String titleActual = SenecaHelvia15.getResources().getString(R.string.SenecaHelviaTitle15);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia15.getResources().getString(R.string.SenecaHelviaTitle15);
        String titleActual = String.valueOf(SenecaHelvia15.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia15.getResources().getString(R.string.SenecaHelviaChapter15);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia15.getResources().getString(R.string.SenecaHelviaChapter15);
        TextView actualTextView = (TextView) SenecaHelvia15.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia15 = null;
    }
}
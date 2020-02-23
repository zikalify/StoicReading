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

public class SenecaHelvia6Test {

    @Rule
    public ActivityTestRule<SenecaHelvia6> SenecaHelvia6TestRule = new ActivityTestRule<SenecaHelvia6>(SenecaHelvia6.class);

    private SenecaHelvia6 SenecaHelvia6 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia6 = SenecaHelvia6TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia6.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 6";
        String titleActual = SenecaHelvia6.getResources().getString(R.string.SenecaHelviaTitle6);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia6.getResources().getString(R.string.SenecaHelviaTitle6);
        String titleActual = String.valueOf(SenecaHelvia6.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia6.getResources().getString(R.string.SenecaHelviaChapter6);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia6.getResources().getString(R.string.SenecaHelviaChapter6);
        TextView actualTextView = (TextView) SenecaHelvia6.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia6 = null;
    }
}
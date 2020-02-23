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

public class SenecaHelvia10Test {

    @Rule
    public ActivityTestRule<SenecaHelvia10> SenecaHelvia10TestRule = new ActivityTestRule<SenecaHelvia10>(SenecaHelvia10.class);

    private SenecaHelvia10 SenecaHelvia10 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia10 = SenecaHelvia10TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia10.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 10";
        String titleActual = SenecaHelvia10.getResources().getString(R.string.SenecaHelviaTitle10);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia10.getResources().getString(R.string.SenecaHelviaTitle10);
        String titleActual = String.valueOf(SenecaHelvia10.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia10.getResources().getString(R.string.SenecaHelviaChapter10);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia10.getResources().getString(R.string.SenecaHelviaChapter10);
        TextView actualTextView = (TextView) SenecaHelvia10.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia10 = null;
    }
}
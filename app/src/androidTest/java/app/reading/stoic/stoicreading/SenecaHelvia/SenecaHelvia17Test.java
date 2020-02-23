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

public class SenecaHelvia17Test {

    @Rule
    public ActivityTestRule<SenecaHelvia17> SenecaHelvia17TestRule = new ActivityTestRule<SenecaHelvia17>(SenecaHelvia17.class);

    private SenecaHelvia17 SenecaHelvia17 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia17 = SenecaHelvia17TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia17.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 17";
        String titleActual = SenecaHelvia17.getResources().getString(R.string.SenecaHelviaTitle17);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia17.getResources().getString(R.string.SenecaHelviaTitle17);
        String titleActual = String.valueOf(SenecaHelvia17.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia17.getResources().getString(R.string.SenecaHelviaChapter17);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia17.getResources().getString(R.string.SenecaHelviaChapter17);
        TextView actualTextView = (TextView) SenecaHelvia17.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia17 = null;
    }
}
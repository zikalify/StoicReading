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

public class SenecaHelvia9Test {

    @Rule
    public ActivityTestRule<SenecaHelvia9> SenecaHelvia9TestRule = new ActivityTestRule<SenecaHelvia9>(SenecaHelvia9.class);

    private SenecaHelvia9 SenecaHelvia9 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia9 = SenecaHelvia9TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia9.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 9";
        String titleActual = SenecaHelvia9.getResources().getString(R.string.SenecaHelviaTitle9);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia9.getResources().getString(R.string.SenecaHelviaTitle9);
        String titleActual = String.valueOf(SenecaHelvia9.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia9.getResources().getString(R.string.SenecaHelviaChapter9);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia9.getResources().getString(R.string.SenecaHelviaChapter9);
        TextView actualTextView = (TextView) SenecaHelvia9.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia9 = null;
    }
}
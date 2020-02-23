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

public class SenecaHelvia18Test {

    @Rule
    public ActivityTestRule<SenecaHelvia18> SenecaHelvia18TestRule = new ActivityTestRule<SenecaHelvia18>(SenecaHelvia18.class);

    private SenecaHelvia18 SenecaHelvia18 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia18 = SenecaHelvia18TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia18.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 18";
        String titleActual = SenecaHelvia18.getResources().getString(R.string.SenecaHelviaTitle18);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia18.getResources().getString(R.string.SenecaHelviaTitle18);
        String titleActual = String.valueOf(SenecaHelvia18.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia18.getResources().getString(R.string.SenecaHelviaChapter18);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia18.getResources().getString(R.string.SenecaHelviaChapter18);
        TextView actualTextView = (TextView) SenecaHelvia18.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia18 = null;
    }
}
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

public class SenecaHelvia20Test {

    @Rule
    public ActivityTestRule<SenecaHelvia20> SenecaHelvia20TestRule = new ActivityTestRule<SenecaHelvia20>(SenecaHelvia20.class);

    private SenecaHelvia20 SenecaHelvia20 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia20 = SenecaHelvia20TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia20.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 20";
        String titleActual = SenecaHelvia20.getResources().getString(R.string.SenecaHelviaTitle20);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia20.getResources().getString(R.string.SenecaHelviaTitle20);
        String titleActual = String.valueOf(SenecaHelvia20.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia20.getResources().getString(R.string.SenecaHelviaChapter20);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia20.getResources().getString(R.string.SenecaHelviaChapter20);
        TextView actualTextView = (TextView) SenecaHelvia20.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia20 = null;
    }
}
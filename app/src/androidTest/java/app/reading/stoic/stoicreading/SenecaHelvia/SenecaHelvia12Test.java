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

public class SenecaHelvia12Test {

    @Rule
    public ActivityTestRule<SenecaHelvia12> SenecaHelvia12TestRule = new ActivityTestRule<SenecaHelvia12>(SenecaHelvia12.class);

    private SenecaHelvia12 SenecaHelvia12 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia12 = SenecaHelvia12TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia12.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 12";
        String titleActual = SenecaHelvia12.getResources().getString(R.string.SenecaHelviaTitle12);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia12.getResources().getString(R.string.SenecaHelviaTitle12);
        String titleActual = String.valueOf(SenecaHelvia12.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia12.getResources().getString(R.string.SenecaHelviaChapter12);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia12.getResources().getString(R.string.SenecaHelviaChapter12);
        TextView actualTextView = (TextView) SenecaHelvia12.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia12 = null;
    }
}
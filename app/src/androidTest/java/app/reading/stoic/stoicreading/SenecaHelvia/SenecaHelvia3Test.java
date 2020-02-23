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

public class SenecaHelvia3Test {

    @Rule
    public ActivityTestRule<SenecaHelvia3> SenecaHelvia3TestRule = new ActivityTestRule<SenecaHelvia3>(SenecaHelvia3.class);

    private SenecaHelvia3 SenecaHelvia3 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia3 = SenecaHelvia3TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia3.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 3";
        String titleActual = SenecaHelvia3.getResources().getString(R.string.SenecaHelviaTitle3);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia3.getResources().getString(R.string.SenecaHelviaTitle3);
        String titleActual = String.valueOf(SenecaHelvia3.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia3.getResources().getString(R.string.SenecaHelviaChapter3);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia3.getResources().getString(R.string.SenecaHelviaChapter3);
        TextView actualTextView = (TextView) SenecaHelvia3.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia3 = null;
    }
}
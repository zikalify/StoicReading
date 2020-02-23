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

public class SenecaHelvia1Test {

    @Rule
    public ActivityTestRule<SenecaHelvia1> SenecaHelvia1TestRule = new ActivityTestRule<SenecaHelvia1>(SenecaHelvia1.class);

    private SenecaHelvia1 SenecaHelvia1 = null;

    @Before
    public void setUp() throws Exception {
        SenecaHelvia1 = SenecaHelvia1TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaHelvia1.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 1";
        String titleActual = SenecaHelvia1.getResources().getString(R.string.SenecaHelviaTitle1);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaHelvia1.getResources().getString(R.string.SenecaHelviaTitle1);
        String titleActual = String.valueOf(SenecaHelvia1.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaHelvia1.getResources().getString(R.string.SenecaHelviaChapter1);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaHelvia1.getResources().getString(R.string.SenecaHelviaChapter1);
        TextView actualTextView = (TextView) SenecaHelvia1.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaHelvia1 = null;
    }
}
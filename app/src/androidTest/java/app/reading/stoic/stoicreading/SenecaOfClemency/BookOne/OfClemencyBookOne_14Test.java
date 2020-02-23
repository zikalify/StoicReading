package app.reading.stoic.stoicreading.SenecaOfClemency.BookOne;

import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;
import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class OfClemencyBookOne_14Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_14> OfClemencyBookOne_14TestRule = new ActivityTestRule<OfClemencyBookOne_14>(OfClemencyBookOne_14.class);

    private OfClemencyBookOne_14 OfClemencyBookOne_14 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_14 = OfClemencyBookOne_14TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_14.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 14";
        String titleActual = OfClemencyBookOne_14.getResources().getString(R.string.SenecaOfClemencyBookOneTitle14);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_14.getResources().getString(R.string.SenecaOfClemencyBookOneTitle14);
        String titleActual = String.valueOf(OfClemencyBookOne_14.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_14.getResources().getString(R.string.SenecaOfClemencyBookOneChapter14);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_14.getResources().getString(R.string.SenecaOfClemencyBookOneChapter14);
        TextView actualTextView = (TextView) OfClemencyBookOne_14.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_14 = null;
    }
}
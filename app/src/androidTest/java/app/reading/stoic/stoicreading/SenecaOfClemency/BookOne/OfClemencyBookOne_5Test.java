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

public class OfClemencyBookOne_5Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_5> OfClemencyBookOne_5TestRule = new ActivityTestRule<OfClemencyBookOne_5>(OfClemencyBookOne_5.class);

    private OfClemencyBookOne_5 OfClemencyBookOne_5 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_5 = OfClemencyBookOne_5TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_5.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 5";
        String titleActual = OfClemencyBookOne_5.getResources().getString(R.string.SenecaOfClemencyBookOneTitle5);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_5.getResources().getString(R.string.SenecaOfClemencyBookOneTitle5);
        String titleActual = String.valueOf(OfClemencyBookOne_5.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_5.getResources().getString(R.string.SenecaOfClemencyBookOneChapter5);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_5.getResources().getString(R.string.SenecaOfClemencyBookOneChapter5);
        TextView actualTextView = (TextView) OfClemencyBookOne_5.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_5 = null;
    }
}
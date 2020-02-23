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

public class OfClemencyBookOne_15Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_15> OfClemencyBookOne_15TestRule = new ActivityTestRule<OfClemencyBookOne_15>(OfClemencyBookOne_15.class);

    private OfClemencyBookOne_15 OfClemencyBookOne_15 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_15 = OfClemencyBookOne_15TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_15.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 15";
        String titleActual = OfClemencyBookOne_15.getResources().getString(R.string.SenecaOfClemencyBookOneTitle15);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_15.getResources().getString(R.string.SenecaOfClemencyBookOneTitle15);
        String titleActual = String.valueOf(OfClemencyBookOne_15.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_15.getResources().getString(R.string.SenecaOfClemencyBookOneChapter15);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_15.getResources().getString(R.string.SenecaOfClemencyBookOneChapter15);
        TextView actualTextView = (TextView) OfClemencyBookOne_15.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_15 = null;
    }
}
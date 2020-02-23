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

public class OfClemencyBookOne_16Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_16> OfClemencyBookOne_16TestRule = new ActivityTestRule<OfClemencyBookOne_16>(OfClemencyBookOne_16.class);

    private OfClemencyBookOne_16 OfClemencyBookOne_16 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_16 = OfClemencyBookOne_16TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_16.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 16";
        String titleActual = OfClemencyBookOne_16.getResources().getString(R.string.SenecaOfClemencyBookOneTitle16);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_16.getResources().getString(R.string.SenecaOfClemencyBookOneTitle16);
        String titleActual = String.valueOf(OfClemencyBookOne_16.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_16.getResources().getString(R.string.SenecaOfClemencyBookOneChapter16);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_16.getResources().getString(R.string.SenecaOfClemencyBookOneChapter16);
        TextView actualTextView = (TextView) OfClemencyBookOne_16.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_16 = null;
    }
}
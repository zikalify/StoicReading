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

public class OfClemencyBookOne_19Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_19> OfClemencyBookOne_19TestRule = new ActivityTestRule<OfClemencyBookOne_19>(OfClemencyBookOne_19.class);

    private OfClemencyBookOne_19 OfClemencyBookOne_19 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_19 = OfClemencyBookOne_19TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_19.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 19";
        String titleActual = OfClemencyBookOne_19.getResources().getString(R.string.SenecaOfClemencyBookOneTitle19);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_19.getResources().getString(R.string.SenecaOfClemencyBookOneTitle19);
        String titleActual = String.valueOf(OfClemencyBookOne_19.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_19.getResources().getString(R.string.SenecaOfClemencyBookOneChapter19);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_19.getResources().getString(R.string.SenecaOfClemencyBookOneChapter19);
        TextView actualTextView = (TextView) OfClemencyBookOne_19.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_19 = null;
    }
}
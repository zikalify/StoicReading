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

public class OfClemencyBookOne_7Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_7> OfClemencyBookOne_7TestRule = new ActivityTestRule<OfClemencyBookOne_7>(OfClemencyBookOne_7.class);

    private OfClemencyBookOne_7 OfClemencyBookOne_7 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_7 = OfClemencyBookOne_7TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_7.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 7";
        String titleActual = OfClemencyBookOne_7.getResources().getString(R.string.SenecaOfClemencyBookOneTitle7);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_7.getResources().getString(R.string.SenecaOfClemencyBookOneTitle7);
        String titleActual = String.valueOf(OfClemencyBookOne_7.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_7.getResources().getString(R.string.SenecaOfClemencyBookOneChapter7);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_7.getResources().getString(R.string.SenecaOfClemencyBookOneChapter7);
        TextView actualTextView = (TextView) OfClemencyBookOne_7.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_7 = null;
    }
}
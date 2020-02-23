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

public class OfClemencyBookOne_2Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_2> OfClemencyBookOne_2TestRule = new ActivityTestRule<OfClemencyBookOne_2>(OfClemencyBookOne_2.class);

    private OfClemencyBookOne_2 OfClemencyBookOne_2 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_2 = OfClemencyBookOne_2TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_2.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 2";
        String titleActual = OfClemencyBookOne_2.getResources().getString(R.string.SenecaOfClemencyBookOneTitle2);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_2.getResources().getString(R.string.SenecaOfClemencyBookOneTitle2);
        String titleActual = String.valueOf(OfClemencyBookOne_2.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_2.getResources().getString(R.string.SenecaOfClemencyBookOneChapter2);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_2.getResources().getString(R.string.SenecaOfClemencyBookOneChapter2);
        TextView actualTextView = (TextView) OfClemencyBookOne_2.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_2 = null;
    }
}
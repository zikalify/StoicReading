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

public class OfClemencyBookOne_10Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_10> OfClemencyBookOne_10TestRule = new ActivityTestRule<OfClemencyBookOne_10>(OfClemencyBookOne_10.class);

    private OfClemencyBookOne_10 OfClemencyBookOne_10 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_10 = OfClemencyBookOne_10TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_10.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 10";
        String titleActual = OfClemencyBookOne_10.getResources().getString(R.string.SenecaOfClemencyBookOneTitle10);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_10.getResources().getString(R.string.SenecaOfClemencyBookOneTitle10);
        String titleActual = String.valueOf(OfClemencyBookOne_10.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_10.getResources().getString(R.string.SenecaOfClemencyBookOneChapter10);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_10.getResources().getString(R.string.SenecaOfClemencyBookOneChapter10);
        TextView actualTextView = (TextView) OfClemencyBookOne_10.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_10 = null;
    }
}
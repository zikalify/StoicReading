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

public class OfClemencyBookOne_21Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_21> OfClemencyBookOne_21TestRule = new ActivityTestRule<OfClemencyBookOne_21>(OfClemencyBookOne_21.class);

    private OfClemencyBookOne_21 OfClemencyBookOne_21 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_21 = OfClemencyBookOne_21TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_21.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 21";
        String titleActual = OfClemencyBookOne_21.getResources().getString(R.string.SenecaOfClemencyBookOneTitle21);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_21.getResources().getString(R.string.SenecaOfClemencyBookOneTitle21);
        String titleActual = String.valueOf(OfClemencyBookOne_21.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_21.getResources().getString(R.string.SenecaOfClemencyBookOneChapter21);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_21.getResources().getString(R.string.SenecaOfClemencyBookOneChapter21);
        TextView actualTextView = (TextView) OfClemencyBookOne_21.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_21 = null;
    }
}
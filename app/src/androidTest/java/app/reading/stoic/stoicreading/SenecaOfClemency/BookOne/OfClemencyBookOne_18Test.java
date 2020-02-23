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

public class OfClemencyBookOne_18Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_18> OfClemencyBookOne_18TestRule = new ActivityTestRule<OfClemencyBookOne_18>(OfClemencyBookOne_18.class);

    private OfClemencyBookOne_18 OfClemencyBookOne_18 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_18 = OfClemencyBookOne_18TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_18.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 18";
        String titleActual = OfClemencyBookOne_18.getResources().getString(R.string.SenecaOfClemencyBookOneTitle18);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_18.getResources().getString(R.string.SenecaOfClemencyBookOneTitle18);
        String titleActual = String.valueOf(OfClemencyBookOne_18.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_18.getResources().getString(R.string.SenecaOfClemencyBookOneChapter18);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_18.getResources().getString(R.string.SenecaOfClemencyBookOneChapter18);
        TextView actualTextView = (TextView) OfClemencyBookOne_18.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_18 = null;
    }
}
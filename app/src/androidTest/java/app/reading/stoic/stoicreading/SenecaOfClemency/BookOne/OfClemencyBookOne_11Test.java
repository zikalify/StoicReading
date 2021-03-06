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

public class OfClemencyBookOne_11Test {

    @Rule
    public ActivityTestRule<OfClemencyBookOne_11> OfClemencyBookOne_11TestRule = new ActivityTestRule<OfClemencyBookOne_11>(OfClemencyBookOne_11.class);

    private OfClemencyBookOne_11 OfClemencyBookOne_11 = null;

    @Before
    public void setUp() throws Exception {
        OfClemencyBookOne_11 = OfClemencyBookOne_11TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = OfClemencyBookOne_11.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 11";
        String titleActual = OfClemencyBookOne_11.getResources().getString(R.string.SenecaOfClemencyBookOneTitle11);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = OfClemencyBookOne_11.getResources().getString(R.string.SenecaOfClemencyBookOneTitle11);
        String titleActual = String.valueOf(OfClemencyBookOne_11.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = OfClemencyBookOne_11.getResources().getString(R.string.SenecaOfClemencyBookOneChapter11);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = OfClemencyBookOne_11.getResources().getString(R.string.SenecaOfClemencyBookOneChapter11);
        TextView actualTextView = (TextView) OfClemencyBookOne_11.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        OfClemencyBookOne_11 = null;
    }
}
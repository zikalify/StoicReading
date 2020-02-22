package app.reading.stoic.stoicreading.SenecaPolybius;

import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;
import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaPolybius15Test {

    @Rule
    public ActivityTestRule<SenecaPolybius15> SenecaPolybius15TestRule = new ActivityTestRule<SenecaPolybius15>(SenecaPolybius15.class);

    private SenecaPolybius15 SenecaPolybius15 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius15 = SenecaPolybius15TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius15.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 15";
        String titleActual = SenecaPolybius15.getResources().getString(R.string.SenecaPolybiusTitle15);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius15.getResources().getString(R.string.SenecaPolybiusTitle15);
        String titleActual = String.valueOf(SenecaPolybius15.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius15.getResources().getString(R.string.SenecaPolybiusChapter15);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius15.getResources().getString(R.string.SenecaPolybiusChapter15);
        TextView actualTextView = (TextView) SenecaPolybius15.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius15 = null;
    }
}
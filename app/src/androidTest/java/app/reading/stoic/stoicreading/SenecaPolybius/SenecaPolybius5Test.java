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

public class SenecaPolybius5Test {

    @Rule
    public ActivityTestRule<SenecaPolybius5> SenecaPolybius5TestRule = new ActivityTestRule<SenecaPolybius5>(SenecaPolybius5.class);

    private SenecaPolybius5 SenecaPolybius5 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius5 = SenecaPolybius5TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius5.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 5";
        String titleActual = SenecaPolybius5.getResources().getString(R.string.SenecaPolybiusTitle5);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius5.getResources().getString(R.string.SenecaPolybiusTitle5);
        String titleActual = String.valueOf(SenecaPolybius5.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius5.getResources().getString(R.string.SenecaPolybiusChapter5);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius5.getResources().getString(R.string.SenecaPolybiusChapter5);
        TextView actualTextView = (TextView) SenecaPolybius5.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius5 = null;
    }
}
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

public class SenecaPolybius13Test {

    @Rule
    public ActivityTestRule<SenecaPolybius13> SenecaPolybius13TestRule = new ActivityTestRule<SenecaPolybius13>(SenecaPolybius13.class);

    private SenecaPolybius13 SenecaPolybius13 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius13 = SenecaPolybius13TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius13.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 13";
        String titleActual = SenecaPolybius13.getResources().getString(R.string.SenecaPolybiusTitle13);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius13.getResources().getString(R.string.SenecaPolybiusTitle13);
        String titleActual = String.valueOf(SenecaPolybius13.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius13.getResources().getString(R.string.SenecaPolybiusChapter13);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius13.getResources().getString(R.string.SenecaPolybiusChapter13);
        TextView actualTextView = (TextView) SenecaPolybius13.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius13 = null;
    }
}
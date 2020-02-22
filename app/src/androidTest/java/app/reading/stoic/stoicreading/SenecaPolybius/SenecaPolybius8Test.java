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

public class SenecaPolybius8Test {

    @Rule
    public ActivityTestRule<SenecaPolybius8> SenecaPolybius8TestRule = new ActivityTestRule<SenecaPolybius8>(SenecaPolybius8.class);

    private SenecaPolybius8 SenecaPolybius8 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius8 = SenecaPolybius8TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius8.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 8";
        String titleActual = SenecaPolybius8.getResources().getString(R.string.SenecaPolybiusTitle8);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius8.getResources().getString(R.string.SenecaPolybiusTitle8);
        String titleActual = String.valueOf(SenecaPolybius8.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius8.getResources().getString(R.string.SenecaPolybiusChapter8);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius8.getResources().getString(R.string.SenecaPolybiusChapter8);
        TextView actualTextView = (TextView) SenecaPolybius8.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius8 = null;
    }
}
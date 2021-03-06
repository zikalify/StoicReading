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

public class SenecaPolybius16Test {

    @Rule
    public ActivityTestRule<SenecaPolybius16> SenecaPolybius16TestRule = new ActivityTestRule<SenecaPolybius16>(SenecaPolybius16.class);

    private SenecaPolybius16 SenecaPolybius16 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius16 = SenecaPolybius16TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius16.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 16";
        String titleActual = SenecaPolybius16.getResources().getString(R.string.SenecaPolybiusTitle16);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius16.getResources().getString(R.string.SenecaPolybiusTitle16);
        String titleActual = String.valueOf(SenecaPolybius16.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius16.getResources().getString(R.string.SenecaPolybiusChapter16);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius16.getResources().getString(R.string.SenecaPolybiusChapter16);
        TextView actualTextView = (TextView) SenecaPolybius16.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius16 = null;
    }
}
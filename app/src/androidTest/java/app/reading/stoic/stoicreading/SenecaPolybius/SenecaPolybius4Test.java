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

public class SenecaPolybius4Test {

    @Rule
    public ActivityTestRule<SenecaPolybius4> SenecaPolybius4TestRule = new ActivityTestRule<SenecaPolybius4>(SenecaPolybius4.class);

    private SenecaPolybius4 SenecaPolybius4 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius4 = SenecaPolybius4TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius4.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 4";
        String titleActual = SenecaPolybius4.getResources().getString(R.string.SenecaPolybiusTitle4);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius4.getResources().getString(R.string.SenecaPolybiusTitle4);
        String titleActual = String.valueOf(SenecaPolybius4.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius4.getResources().getString(R.string.SenecaPolybiusChapter4);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius4.getResources().getString(R.string.SenecaPolybiusChapter4);
        TextView actualTextView = (TextView) SenecaPolybius4.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius4 = null;
    }
}
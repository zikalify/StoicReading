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

public class SenecaPolybius3Test {

    @Rule
    public ActivityTestRule<SenecaPolybius3> SenecaPolybius3TestRule = new ActivityTestRule<SenecaPolybius3>(SenecaPolybius3.class);

    private SenecaPolybius3 SenecaPolybius3 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius3 = SenecaPolybius3TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius3.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 3";
        String titleActual = SenecaPolybius3.getResources().getString(R.string.SenecaPolybiusTitle3);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius3.getResources().getString(R.string.SenecaPolybiusTitle3);
        String titleActual = String.valueOf(SenecaPolybius3.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius3.getResources().getString(R.string.SenecaPolybiusChapter3);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius3.getResources().getString(R.string.SenecaPolybiusChapter3);
        TextView actualTextView = (TextView) SenecaPolybius3.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius3 = null;
    }
}
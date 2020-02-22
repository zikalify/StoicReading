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

public class SenecaPolybius10Test {

    @Rule
    public ActivityTestRule<SenecaPolybius10> SenecaPolybius10TestRule = new ActivityTestRule<SenecaPolybius10>(SenecaPolybius10.class);

    private SenecaPolybius10 SenecaPolybius10 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius10 = SenecaPolybius10TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius10.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 10";
        String titleActual = SenecaPolybius10.getResources().getString(R.string.SenecaPolybiusTitle10);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius10.getResources().getString(R.string.SenecaPolybiusTitle10);
        String titleActual = String.valueOf(SenecaPolybius10.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius10.getResources().getString(R.string.SenecaPolybiusChapter10);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius10.getResources().getString(R.string.SenecaPolybiusChapter10);
        TextView actualTextView = (TextView) SenecaPolybius10.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius10 = null;
    }
}
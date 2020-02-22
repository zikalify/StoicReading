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

public class SenecaPolybius7Test {

    @Rule
    public ActivityTestRule<SenecaPolybius7> SenecaPolybius7TestRule = new ActivityTestRule<SenecaPolybius7>(SenecaPolybius7.class);

    private SenecaPolybius7 SenecaPolybius7 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius7 = SenecaPolybius7TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius7.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 7";
        String titleActual = SenecaPolybius7.getResources().getString(R.string.SenecaPolybiusTitle7);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius7.getResources().getString(R.string.SenecaPolybiusTitle7);
        String titleActual = String.valueOf(SenecaPolybius7.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius7.getResources().getString(R.string.SenecaPolybiusChapter7);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius7.getResources().getString(R.string.SenecaPolybiusChapter7);
        TextView actualTextView = (TextView) SenecaPolybius7.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius7 = null;
    }
}
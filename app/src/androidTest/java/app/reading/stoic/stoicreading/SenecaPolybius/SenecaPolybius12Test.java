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

public class SenecaPolybius12Test {

    @Rule
    public ActivityTestRule<SenecaPolybius12> SenecaPolybius12TestRule = new ActivityTestRule<SenecaPolybius12>(SenecaPolybius12.class);

    private SenecaPolybius12 SenecaPolybius12 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius12 = SenecaPolybius12TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius12.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 12";
        String titleActual = SenecaPolybius12.getResources().getString(R.string.SenecaPolybiusTitle12);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius12.getResources().getString(R.string.SenecaPolybiusTitle12);
        String titleActual = String.valueOf(SenecaPolybius12.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius12.getResources().getString(R.string.SenecaPolybiusChapter12);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius12.getResources().getString(R.string.SenecaPolybiusChapter12);
        TextView actualTextView = (TextView) SenecaPolybius12.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius12 = null;
    }
}
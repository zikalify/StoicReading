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

public class SenecaPolybius1Test {

    @Rule
    public ActivityTestRule<SenecaPolybius1> SenecaPolybius1TestRule = new ActivityTestRule<SenecaPolybius1>(SenecaPolybius1.class);

    private SenecaPolybius1 SenecaPolybius1 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius1 = SenecaPolybius1TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius1.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 1";
        String titleActual = SenecaPolybius1.getResources().getString(R.string.SenecaPolybiusTitle1);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius1.getResources().getString(R.string.SenecaPolybiusTitle1);
        String titleActual = String.valueOf(SenecaPolybius1.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius1.getResources().getString(R.string.SenecaPolybiusChapter1);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius1.getResources().getString(R.string.SenecaPolybiusChapter1);
        TextView actualTextView = (TextView) SenecaPolybius1.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius1 = null;
    }
}
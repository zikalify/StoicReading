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

public class SenecaPolybius18Test {

    @Rule
    public ActivityTestRule<SenecaPolybius18> SenecaPolybius18TestRule = new ActivityTestRule<SenecaPolybius18>(SenecaPolybius18.class);

    private SenecaPolybius18 SenecaPolybius18 = null;

    @Before
    public void setUp() throws Exception {
        SenecaPolybius18 = SenecaPolybius18TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaPolybius18.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 18";
        String titleActual = SenecaPolybius18.getResources().getString(R.string.SenecaPolybiusTitle18);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaPolybius18.getResources().getString(R.string.SenecaPolybiusTitle18);
        String titleActual = String.valueOf(SenecaPolybius18.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaPolybius18.getResources().getString(R.string.SenecaPolybiusChapter18);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaPolybius18.getResources().getString(R.string.SenecaPolybiusChapter18);
        TextView actualTextView = (TextView) SenecaPolybius18.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaPolybius18 = null;
    }
}
package app.reading.stoic.stoicreading.SenecaOfPeaceOfMind;

import androidx.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaOfPeaceOfMind_15Test {

    @Rule
    public ActivityTestRule<SenecaOfPeaceOfMind_15> SenecaOfPeaceOfMind_15TestRule = new ActivityTestRule<SenecaOfPeaceOfMind_15>(SenecaOfPeaceOfMind_15.class);

    private SenecaOfPeaceOfMind_15 SenecaOfPeaceOfMind_15 = null;

    @Before
    public void setUp() throws Exception {
        SenecaOfPeaceOfMind_15 = SenecaOfPeaceOfMind_15TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaOfPeaceOfMind_15.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 15";
        String titleActual = SenecaOfPeaceOfMind_15.getResources().getString(R.string.SenecaOfPeaceOfMindTitle15);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaOfPeaceOfMind_15.getResources().getString(R.string.SenecaOfPeaceOfMindTitle15);
        String titleActual = String.valueOf(SenecaOfPeaceOfMind_15.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaOfPeaceOfMind_15.getResources().getString(R.string.SenecaOfPeaceOfMindChapter15);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaOfPeaceOfMind_15.getResources().getString(R.string.SenecaOfPeaceOfMindChapter15);
        TextView actualTextView = (TextView) SenecaOfPeaceOfMind_15.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaOfPeaceOfMind_15 = null;
    }
}
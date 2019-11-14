package app.reading.stoic.stoicreading.SenecaOfPeaceOfMind;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaOfPeaceOfMind_7Test {

    @Rule
    public ActivityTestRule<SenecaOfPeaceOfMind_7> SenecaOfPeaceOfMind_7TestRule = new ActivityTestRule<SenecaOfPeaceOfMind_7>(SenecaOfPeaceOfMind_7.class);

    private SenecaOfPeaceOfMind_7 SenecaOfPeaceOfMind_7 = null;

    @Before
    public void setUp() throws Exception {
        SenecaOfPeaceOfMind_7 = SenecaOfPeaceOfMind_7TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaOfPeaceOfMind_7.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 7";
        String titleActual = SenecaOfPeaceOfMind_7.getResources().getString(R.string.SenecaOfPeaceOfMindTitle7);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaOfPeaceOfMind_7.getResources().getString(R.string.SenecaOfPeaceOfMindTitle7);
        String titleActual = String.valueOf(SenecaOfPeaceOfMind_7.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaOfPeaceOfMind_7.getResources().getString(R.string.SenecaOfPeaceOfMindChapter7);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaOfPeaceOfMind_7.getResources().getString(R.string.SenecaOfPeaceOfMindChapter7);
        TextView actualTextView = (TextView) SenecaOfPeaceOfMind_7.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaOfPeaceOfMind_7 = null;
    }
}
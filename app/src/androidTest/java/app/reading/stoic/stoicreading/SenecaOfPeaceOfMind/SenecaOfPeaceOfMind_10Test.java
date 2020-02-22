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

public class SenecaOfPeaceOfMind_10Test {

    @Rule
    public ActivityTestRule<SenecaOfPeaceOfMind_10> SenecaOfPeaceOfMind_10TestRule = new ActivityTestRule<SenecaOfPeaceOfMind_10>(SenecaOfPeaceOfMind_10.class);

    private SenecaOfPeaceOfMind_10 SenecaOfPeaceOfMind_10 = null;

    @Before
    public void setUp() throws Exception {
        SenecaOfPeaceOfMind_10 = SenecaOfPeaceOfMind_10TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaOfPeaceOfMind_10.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 10";
        String titleActual = SenecaOfPeaceOfMind_10.getResources().getString(R.string.SenecaOfPeaceOfMindTitle10);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaOfPeaceOfMind_10.getResources().getString(R.string.SenecaOfPeaceOfMindTitle10);
        String titleActual = String.valueOf(SenecaOfPeaceOfMind_10.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaOfPeaceOfMind_10.getResources().getString(R.string.SenecaOfPeaceOfMindChapter10);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaOfPeaceOfMind_10.getResources().getString(R.string.SenecaOfPeaceOfMindChapter10);
        TextView actualTextView = (TextView) SenecaOfPeaceOfMind_10.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaOfPeaceOfMind_10 = null;
    }
}
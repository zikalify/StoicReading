package app.reading.stoic.stoicreading.SenecaOfLeisure;

import androidx.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class SenecaOfLeisure_7Test {

    @Rule
    public ActivityTestRule<SenecaOfLeisure_7> SenecaOfLeisure_7TestRule = new ActivityTestRule<SenecaOfLeisure_7>(SenecaOfLeisure_7.class);

    private SenecaOfLeisure_7 SenecaOfLeisure_7 = null;

    @Before
    public void setUp() throws Exception {
        SenecaOfLeisure_7 = SenecaOfLeisure_7TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaOfLeisure_7.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 7";
        String titleActual = SenecaOfLeisure_7.getResources().getString(R.string.SenecaOfLeisureTitle7);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaOfLeisure_7.getResources().getString(R.string.SenecaOfLeisureTitle7);
        String titleActual = String.valueOf(SenecaOfLeisure_7.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaOfLeisure_7.getResources().getString(R.string.SenecaOfLeisureChapter7);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaOfLeisure_7.getResources().getString(R.string.SenecaOfLeisureChapter7);
        TextView actualTextView = (TextView) SenecaOfLeisure_7.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaOfLeisure_7 = null;
    }
}
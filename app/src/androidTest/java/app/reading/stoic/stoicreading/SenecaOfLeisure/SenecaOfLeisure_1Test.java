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

public class SenecaOfLeisure_1Test {

    @Rule
    public ActivityTestRule<SenecaOfLeisure_1> SenecaOfLeisure_1TestRule = new ActivityTestRule<SenecaOfLeisure_1>(SenecaOfLeisure_1.class);

    private SenecaOfLeisure_1 SenecaOfLeisure_1 = null;

    @Before
    public void setUp() throws Exception {
        SenecaOfLeisure_1 = SenecaOfLeisure_1TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaOfLeisure_1.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 1";
        String titleActual = SenecaOfLeisure_1.getResources().getString(R.string.SenecaOfLeisureTitle1);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaOfLeisure_1.getResources().getString(R.string.SenecaOfLeisureTitle1);
        String titleActual = String.valueOf(SenecaOfLeisure_1.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaOfLeisure_1.getResources().getString(R.string.SenecaOfLeisureChapter1);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaOfLeisure_1.getResources().getString(R.string.SenecaOfLeisureChapter1);
        TextView actualTextView = (TextView) SenecaOfLeisure_1.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaOfLeisure_1 = null;
    }
}
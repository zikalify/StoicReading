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

public class SenecaOfPeaceOfMind_1Test {

    @Rule
    public ActivityTestRule<SenecaOfPeaceOfMind_1> SenecaOfPeaceOfMind_1TestRule = new ActivityTestRule<SenecaOfPeaceOfMind_1>(SenecaOfPeaceOfMind_1.class);

    private SenecaOfPeaceOfMind_1 SenecaOfPeaceOfMind_1 = null;

    @Before
    public void setUp() throws Exception {
        SenecaOfPeaceOfMind_1 = SenecaOfPeaceOfMind_1TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = SenecaOfPeaceOfMind_1.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Chapter 1 [Serenus]";
        String titleActual = SenecaOfPeaceOfMind_1.getResources().getString(R.string.SenecaOfPeaceOfMindTitle1);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = SenecaOfPeaceOfMind_1.getResources().getString(R.string.SenecaOfPeaceOfMindTitle1);
        String titleActual = String.valueOf(SenecaOfPeaceOfMind_1.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = SenecaOfPeaceOfMind_1.getResources().getString(R.string.SenecaOfPeaceOfMindChapter1);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = SenecaOfPeaceOfMind_1.getResources().getString(R.string.SenecaOfPeaceOfMindChapter1);
        TextView actualTextView = (TextView) SenecaOfPeaceOfMind_1.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        SenecaOfPeaceOfMind_1 = null;
    }
}
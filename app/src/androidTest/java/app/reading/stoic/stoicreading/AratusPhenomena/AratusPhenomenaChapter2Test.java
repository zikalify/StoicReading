package app.reading.stoic.stoicreading.AratusPhenomena;

import androidx.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.reading.stoic.stoicreading.R;

import static org.junit.Assert.*;

public class AratusPhenomenaChapter2Test {

    @Rule
    public ActivityTestRule<AratusPhenomenaChapter2> AratusPhenomenaChapter2TestRule = new ActivityTestRule<AratusPhenomenaChapter2>(AratusPhenomenaChapter2.class);

    private AratusPhenomenaChapter2 AratusPhenomenaChapter2 = null;

    @Before
    public void setUp() throws Exception {
        AratusPhenomenaChapter2 = AratusPhenomenaChapter2TestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = AratusPhenomenaChapter2.findViewById(R.id.textView2);
        assertNotNull(view);
    }

    //What I want the string to be. Checks if it's correct in Strings.xml
    @Test
    public void testTitleValue(){
        String titleExpected = "Part 2";
        String titleActual = AratusPhenomenaChapter2.getResources().getString(R.string.AratusPhenomenaChapter2);
        assertEquals(titleExpected, titleActual);
    }

    //Test to see if the correct value is pulled in from Strings.xml
    @Test
    public void testTitleDisplayed(){
        String titleExpected = AratusPhenomenaChapter2.getResources().getString(R.string.AratusPhenomenaChapter2);
        String titleActual = String.valueOf(AratusPhenomenaChapter2.getTitle());
        assertEquals(titleExpected, titleActual);
    }

    @Test
    public void testStringTooLarge(){
        String tooLarge = "STRING_TOO_LARGE";
        String textActual = AratusPhenomenaChapter2.getResources().getString(R.string.AratusPhenomena2);
        assertNotEquals(tooLarge, textActual);
    }

    //Test to see if correct text is displayed
    @Test
    public void testCorrectTextDisplayed(){
        String expected = AratusPhenomenaChapter2.getResources().getString(R.string.AratusPhenomena2);
        TextView actualTextView = (TextView) AratusPhenomenaChapter2.findViewById(R.id.textView2);
        String actual = actualTextView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        AratusPhenomenaChapter2 = null;
    }
}
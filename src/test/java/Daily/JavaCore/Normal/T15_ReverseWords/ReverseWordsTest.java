package Daily.JavaCore.Normal.T15_ReverseWords;

import section00_DailyTasks.JavaCore.Normal.T15_ReverseWords.ReverseWords;
import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsTest {
    @Test
    public void reverseWords_oneWord() {
        Assert.assertEquals("Method should reverse the whole string from one word\n",
                "avaJ", ReverseWords.reverseWords("Java"));
    }

    @Test
    public void reverseWords_twoWords() {
        Assert.assertEquals("Method should reverse each word in a two-word string\n",
                "etaM ymedaca", ReverseWords.reverseWords("Mate academy"));
    }

    @Test
    public void reverseWords_fiveWords() {
        Assert.assertEquals("Method should reverse each word in a five-word string\n",
                "s'teL od avaJ sksat !rehtegot", ReverseWords.reverseWords("Let's do Java tasks together!"));
    }

    @Test
    public void reverseWords_sentence() {
        Assert.assertEquals("Method should reverse each word in a sentence\n",
                "ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
    }

    @Test
    public void reverseWords_oneChar() {
        Assert.assertEquals("Method should not modify the string of one character\n",
                "A", ReverseWords.reverseWords("A"));
    }

    @Test
    public void reverseWords_oneWordPalindrome() {
        Assert.assertEquals("Method should not modify the string of one word that is a palindrome\n",
                "racecar", ReverseWords.reverseWords("racecar"));
    }

    @Test
    public void reverseWords_severalSeparateChars() {
        Assert.assertEquals("Method should not modify the string of several characters separated by spaces\n",
                "q w e r t y", ReverseWords.reverseWords("q w e r t y"));
    }

    @Test
    public void reverseWords_emptyString() {
        Assert.assertEquals("Method should not modify the empty string\n",
                "", ReverseWords.reverseWords(""));
    }

    @Test
    public void reverseWords_stringOfSpaces() {
        Assert.assertEquals("Method should not modify the string that contains spaces only\n",
                "   ", ReverseWords.reverseWords("   "));
    }

    @Test
    public void reverseWords_doubleSpaces() {
        Assert.assertEquals("Method should keep spaces between the rows as in the original string\n",
                "peek  elbuod  secaps", ReverseWords.reverseWords("keep  double  spaces"));
    }
}

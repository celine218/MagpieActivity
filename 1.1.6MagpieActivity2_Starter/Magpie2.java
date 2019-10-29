/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0
                || statement.indexOf("fish") >= 0
                || statement.indexOf("axolotl") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("cat") >= 0
                || statement.indexOf("dog") >= 0
                || statement.indexOf("fish") >= 0
                || statement.indexOf("axolotl") >= 0)
        {
                response = "Tell me more about your pets.";
        }
        
        else if (statement.indexOf("stark") >= 0
                || statement.indexOf("Tony Stark") >= 0
                || statement.indexOf("Stark") >= 0
                || statement.indexOf("tony") >= 0)
        {
                response = "Tony Stark was a pretty cool character, I miss him.";
        }
        
        else if (statement.indexOf("CSA") >= 0
                || statement.indexOf("AP") >= 0
                || statement.indexOf("Computer Science") >= 0
                || statement.indexOf("AP Computer Science") >= 0)
        {
                response = "It's a pretty fun class, we do a lot!";
        }
        
        else if (statement.indexOf("friend") >= 0
                || statement.indexOf("best friend") >= 0)
        {
                response = "I'd really love to be your friend!!";
        }
        else if (statement.indexOf("kaehms") >= 0
            || statement.indexOf("Kaehms") >= 0)
        {
            response = "He is a pretty cool teacher.";
        }
        else if (response.trim()=="")
        {
            response = "please say something";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 7;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Really??? Thats crazy!!!!";
        }
        else if (whichResponse == 5)
        {
            response = "Cool!! We should be friends!!";
        }
        else if (whichResponse == 6)
        {
            response = "You seem like an awesome person";
        }

        return response;
    }
}

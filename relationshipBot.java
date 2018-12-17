public class relationshipBot
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
        String [] loveResponses = null;
        loveResponses = new String[30];
        loveResponses[0] = "Hello, ask me a question on relationships.";
        loveResponses[1] = "Love is simply a feeling of deep attraction. However, don't confuse this with a good relationship. They're very different!";
        loveResponses[2] = "There's many ways to define a good relationship. But in short, instead of giving each other happiness, you should be sharing happiness. Each person should be invested and you should never feel like one person is putting in more effort.";
        loveResponses[3] = "You should consider talking to your partner about how you feel. Communication in a relationship is very important and many fights couples have are because of a lack of communication.";
        loveResponses[4] = "Talk to them about how you feel and make a conscious effort to improve. But also don't do anything that would make you feel uncomfortable.";
        loveResponses[5] = "Make sure to let it out. There's no shame in crying or being depressed for months. The most important part is to recognize why you broke up and moved on with life, improving yourself.";
        loveResponses[6] = "It's natural to still hold feelings for them. you've probably shared intimate experiences you had only with them. However, there was something that caused you to separate and hurt one of you. It's best to try to focus on yourself and move on.";
        loveResponses[7] = "Talk to your partner and see if there's anything you can do to make things work. If there's nothing that can be done, ending the relationship on good terms wil be the best decision in the long run.";
        loveResponses[8] = "This is natural. You probably care a lot about this person and you might hide how you feel in order to avoid conflict. However, this will only make you more unhappy and eventually will hurt your partner when they find out.";
        loveResponses[9] =  "Many people will never find the one. In fact, 50% of all couples in America divorced and only a fraction of the remaining few are happy. So there's no real way of telling. However, being true to how you feel and recognizing the bad in your relationship can help. In the end, it's all your decision.";
        loveResponses[10] = "In many cases, it's bad to live your life dependent on someone else. Especially after a breakup, you might think that you couldn't live in a world without them but slowly over time and focus on yourself, you'll find yourself living in that world.";
        loveResponses[11] = "The best way to breakup with someone is to talk to them in person about it. Even if you're angry or just want to break up because you're tired, doing it in person shows your sincerity.";
        loveResponses[12] = "It's important what you do now. Make sure to cry and let out a lot of your feelings. Don't hold it in. After, make sure you look at yourself and fulfill what you want and your dreams.";
        loveResponses[13] = "Now, you can give everything to yourself. You're the most important person and don't let someone drag you down.";
        loveResponses[14] = "Surprise him/her! The gift doesn't have to be flashy or expensive, as long as it comes from the heart. If you're still stuck, think of something useful they might need.";
        loveResponses[15] = "It depends on how close you are. But in the end, just go for it. Think of something fun you both might enjoy and ask them to do it with you.";
        loveResponses[16] = "Accept it gracefully. You don't need to ask why. Just be polite and say \"Okay, I understand\". You might be heartbroken over it, but a weight will be taken off your chest in time and you'll feel a lot better.";
        loveResponses[17] = "Anything you want. In the beginning of a relationship, you might only do something new each week or imagine a fairy tale love, but later on, you'll find yourself cherishing the simple things done with each other.";
        loveResponses[18] = "You can watch Netflix and cuddle, cook together, have coffee, bake or cook, or even just talk. A relationship is never as flashy as shown on Hollywood, but it's okay.";
        loveResponses[19] = "For a successful long distance relationship, prioritize your schedules well, don't rely solely on technology, focus on quality communication, don't put your life on hold, and even talk about the boring details in life. It'll be hard as over 75% of long distance relationships end.";
        loveResponses[20] = "In order to gain trust, you have to give some away. If they did something to hurt you in the past, you might have to be ready to look past it and give them a second chance.";
        loveResponses[21] = "Talk to your partner about this and think of things you could do together. Maybe see a movie or just hang out with each other. Make sure to communicate.";
        loveResponses[22] = "Talk to your partner and tell them how you feel. Set boundaries between together-time and along-time so both of you are happy with the relationship.";
        loveResponses[23] = "Make sure you're communicating clearly. Don't hint and beat around the bush. Many people aren't able to see what's wrong. You'll both appreciate it if you're both clear with how you feel.";
        loveResponses[24] = "Be it political or moral values, make sure you tell them how you feel and why. They don't necessarily have to change for you but being able to see them for who they are and accept them is part of a good relationship.";
        loveResponses[25] = "You're welcome. I'm here to help with any relationship questions.";
        loveResponses[26] = "Thomas Chou and Jared Pippin";
        loveResponses[27] = "Are you a magician? Because whenever I look at you, everyone else disappears!";
        loveResponses[28] = "I'm not a photographer, but I can picture you and me together.";
        loveResponses[29] = "It'll take time and they'll eventually have to gain your trust back but remember, they can't do it if you're not open to trusting.";
        String response = "";
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }

        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (findKeyword(statement, "mother") >= 0
                || findKeyword(statement, "father") >= 0
                || findKeyword(statement, "sister") >= 0
                || findKeyword(statement, "brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (findKeyword(statement, "hello") >= 0)
        {
            response = loveResponses[0];
        }
        else if (findKeyword(statement, "what is love") >= 0)
        {
            response = loveResponses[1];
        }
        else if (findKeyword(statement, "good relationship") >= 0)
        {
            response = loveResponses[2];
        }
        else if (findKeyword(statement, "more effort") >= 0)
        {
            response = loveResponses[3];
        }
        else if (findKeyword(statement, "enough effort") >= 0)
        {
            response = loveResponses[4];
        }
        else if (findKeyword(statement, "get over") >= 0)
        {
            response = loveResponses[5];
        }
        else if (findKeyword(statement, "still love") >= 0)
        {
            response = loveResponses[6];
        }
        else if (findKeyword(statement, "unhappy") >= 0)
        {
            response = loveResponses[7];
        }
        else if (findKeyword(statement, "hurt their feelings") >= 0)
        {
            response = loveResponses[8];
        }
        else if (findKeyword(statement, "the one") >= 0)
        {
            response = loveResponses[9];
        }
        else if (findKeyword(statement, "live without") >= 0)
        {
            response = loveResponses[10];
        }
        else if (findKeyword(statement, "break up") >= 0)
        {
            response = loveResponses[11];
        }
        else if (findKeyword(statement, "cheated on") >= 0)
        {
            response = loveResponses[12];
        }
        else if (findKeyword(statement, "give everything") >= 0)
        {
            response = loveResponses[13];
        }
        else if (findKeyword(statement, "gift") >= 0)
        {
            response = loveResponses[14];
        }
        else if (findKeyword(statement, "ask someone") >= 0)
        {
            response = loveResponses[15];
        }
        else if (findKeyword(statement, "reject me") >= 0)
        {
            response = loveResponses[16];
        }
        else if (findKeyword(statement, "things to do") >= 0)
        {
            response = loveResponses[17];
        }
        else if (findKeyword(statement, "simple things") >= 0)
        {
            response = loveResponses[18];
        }
        else if (findKeyword(statement, "long distance") >= 0)
        {
            response = loveResponses[19];
        }
        else if (findKeyword(statement, "don't trust") >= 0)
        {
            response = loveResponses[20];
        }
        else if (findKeyword(statement, "start trusting") >= 0)
        {
            response = loveResponses[29];
        }
        else if (findKeyword(statement, "spend enough time") >= 0)
        {
            response = loveResponses[21];
        }
        else if (findKeyword(statement, "tell them something") >= 0)
        {
            response = loveResponses[23];
        }
        else if (findKeyword(statement, "spend too much") >= 0)
        {
            response = loveResponses[22];
        }
        else if (findKeyword(statement, "doesn't understand") >= 0)
        {
            response = loveResponses[23];
        }
        else if (findKeyword(statement, "don't share") >= 0)
        {
            response = loveResponses[24];
        }
        else if (findKeyword(statement, "Thanks") >= 0)
        {
            response = loveResponses[25];
        }
        else if (findKeyword(statement, "Thank you") >= 0)
        {
            response = loveResponses[25];
        }
        else if (findKeyword(statement, "creator") >= 0)
        {
            response = loveResponses[26];
        }
        else if (findKeyword(statement, "pick-up lines") >= 0)
        {
            response = loveResponses[27];
        }
        else if (findKeyword(statement, "another") >= 0)
        {
            response = loveResponses[28];
        }
        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }

        else
        {
            // More responses which require transformations
            int psn = findKeyword(statement, "you", 0);
            int psnOfI = findKeyword(statement, "I", 0);
            if (psn >= 0
                    && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else if (psn >= 0
                    && findKeyword(statement, "to", psn) >= 0)
            {
                response = transformIWantYouToStatement(statement);
            }
            else if (findKeyword(statement, "I want", 0) >= 0)
            {
                response = transformIWantStatement(statement);
            }
            else if (psnOfI >= 0
                    && findKeyword(statement, "you", psn) >= 0)
            {
                response = transformIYouStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }
    
    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }

    
    
    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        
        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
        
        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }
    private String transformIWantYouToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psnOfTo = findKeyword (statement, "to", 0);
        String restOfStatement = statement.substring(psnOfTo + 2).trim();
        return "Would you really be happy if you had " + restOfStatement + "?";
    }
    private String transformIWantStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psnOfWant = findKeyword (statement, "want", 0);
        String restOfStatement = statement.substring(psnOfWant + 4).trim();
        return "Would you really be happy if you had " + restOfStatement + "?";
    }
    private String transformIYouStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psnOfI = findKeyword (statement, "I", 0);
        int psnOfYou = findKeyword (statement, "you", psnOfI + 3);
        String restOfStatement = statement.substring(psnOfI + 2, psnOfYou).trim();
        return "Why do you " + restOfStatement + " me?";
    }
    
    
    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
        
        //  Refinement--make sure the goal isn't part of a word 
        while (psn >= 0) 
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " "; 
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }
            
            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }
            
            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
            
        }
        
        return -1;
    }
    
    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }
    


    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 14;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        String [] randomResponses = null;
        randomResponses = new String[15];
        randomResponses[0] = "Interesting, tell me more.";
        randomResponses[1] = "Hmmm.";
        randomResponses[2] = "Do you really think so?";
        randomResponses[3] = "You don't say.";
        randomResponses[4] = "I'm afraid I don't know enough about that.";
        randomResponses[5] = "I don't know";
        randomResponses[6] = "I do not possess the knowledge necessary to respond to that";
        randomResponses[7] = "Sorry, I only have the information gifted to me by my creators.";
        randomResponses[8] = "Let me get back to you on that.";
        randomResponses[9] = "I don't know about that.";
        randomResponses[10] = "I can't answer that right now.";
        randomResponses[11] = "My creators didn't give me enough knowledge to answer that.";
        randomResponses[12] = "I don't have a good response to give right now.";
        randomResponses[13] = "Don't say that.";
        randomResponses[14] = "...";
        if (whichResponse == 0)
        {
            response = randomResponses[0];
        }
        else if (whichResponse == 1)
        {
            response = randomResponses[1];
        }
        else if (whichResponse == 2)
        {
            response = randomResponses[2];
        }
        else if (whichResponse == 3)
        {
            response = randomResponses[3];
        }
        else if (whichResponse == 4)
        {
            response = randomResponses[4];
        }
        else if (whichResponse == 5)
        {
            response = randomResponses[5];
        }
        else if (whichResponse == 6)
        {
            response = randomResponses[6];
        }
        else if (whichResponse == 7)
        {
            response = randomResponses[7];
        }
        else if (whichResponse == 8)
        {
            response = randomResponses[8];
        }
        else if (whichResponse == 9)
        {
            response = randomResponses[9];
        }
        else if (whichResponse == 10)
        {
            response = randomResponses[10];
        }
        else if (whichResponse == 11)
        {
            response = randomResponses[11];
        }
        else if (whichResponse == 12)
        {
            response = randomResponses[12];
        }
        else if (whichResponse == 13)
        {
            response = randomResponses[13];
        }
        else if (whichResponse == 14)
        {
            response = randomResponses[14];
        }
        return response;
    }

}

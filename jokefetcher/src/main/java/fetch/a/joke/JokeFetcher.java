package fetch.a.joke;

public class JokeFetcher {
    public JokeFetcher() {
    }

    public String fetchJoke() {
        int jokeNo = (int) (Math.random() * 10);
        switch (jokeNo) {
            case 0:
                return "I have a new theory on inertia but it doesn't seem to be gaining momentum.";
            case 1:
                return "A group of protesters in front of a physics lab:\n" +
                        "\n" +
                        "“What do we want?\"\n" +
                        "\n" +
                        "“Time travel\"\n" +
                        "\n" +
                        "“When do we want it?\"\n" +
                        "\n" +
                        "“Irrelevant.\"";
            case 2:
                return "Two atoms are walking along. One of them says:\n" +
                        "\n" +
                        "“Oh, no, I think I lost an electron.\"\n" +
                        "\n" +
                        "“Are you sure?\"\n" +
                        "\n" +
                        "“Yes, I'm positive.\"";
            case 3:
                return "Why couldn't the chemist laugh at the Queen's fart?\n" +
                        "\n" +
                        "Because noble gases are non-reactive.";
            case 4:
                return "Why is it best to teach physics on the edge of a cliff?\n" +
                        "\n" +
                        "Because that's where students have the most potential.";
            case 5:
                return "I'm reading a great book on anti-gravity. I can't put it down";
            case 6:
                return "Why can't atheists solve exponential equations? Because they don't believe in higher powers.";
            case 7:
                return "Always remember: you're unique. Just like everyone else.";
            case 8:
                return "I wondered why the baseball was getting bigger, and then it hit me.";
            case 9:
                return "The past, the present and the future walked into a bar. It was tense.";
            default:
                return "";
        }
    }
}

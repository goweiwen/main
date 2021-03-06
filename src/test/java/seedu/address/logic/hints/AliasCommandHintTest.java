package seedu.address.logic.hints;

import org.junit.Test;

import seedu.address.logic.commands.hints.AliasCommandHint;

public class AliasCommandHintTest {
    @Test
    public void aliasCommandHint() {
        AliasCommandHint aliasCommandHint = new AliasCommandHint("alias", "");
        parseAndAssertHint(
                aliasCommandHint,
                " shows all aliases",
                "alias ");

        aliasCommandHint = new AliasCommandHint("alias ", "");
        parseAndAssertHint(
                aliasCommandHint,
                " - set your new command word",
                "alias ");

        aliasCommandHint = new AliasCommandHint("alias s", "s");
        parseAndAssertHint(
                aliasCommandHint,
                " - set your new command word",
                "alias s ");

        aliasCommandHint = new AliasCommandHint("alias s ", "s");
        parseAndAssertHint(
                aliasCommandHint,
                " - set what s represents",
                "alias s ");

        aliasCommandHint = new AliasCommandHint("alias hehe ", "hehe");
        parseAndAssertHint(
                aliasCommandHint,
                " - set what hehe represents",
                "alias hehe ");

    }

    /**
     * parses {@code aliasCommandHint} and checks if the the hint generated has the expected fields
     */
    private void parseAndAssertHint(AliasCommandHint aliasCommandHint,
                                    String expectedDesc,
                                    String expectedAutocomplete) {
        AddCommandHintTest.parseAndAssertHint(
                aliasCommandHint,
                "",
                expectedDesc,
                expectedAutocomplete);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gr.forth.ics.icardea.listener;
import ca.uhn.hl7v2.validation.impl.*;
import ca.uhn.hl7v2.validation.*;
import java.util.List;

/**
 *
 * @author petrakis
 */
public class HL7ValidationContext extends ValidationContextImpl {

    public HL7ValidationContext () {
        /*
        Rule trim = new TrimLeadingWhitespace();
        getPrimitiveRuleBindings().add(new RuleBinding("*", "FT", trim));
        getPrimitiveRuleBindings().add(new RuleBinding("*", "ST", trim));
        getPrimitiveRuleBindings().add(new RuleBinding("*", "TX", trim));

        Rule size200 = new SizeRule(200);
        Rule size32000 = new SizeRule(32000);
        getPrimitiveRuleBindings().add(new RuleBinding("*", "FT", size32000));
        getPrimitiveRuleBindings().add(new RuleBinding("*", "ID", size200));
        getPrimitiveRuleBindings().add(new RuleBinding("*", "IS", size200));

        Rule nonNegativeInteger = new RegexPrimitiveRule("\\d*", "");
        getPrimitiveRuleBindings().add(
                new RuleBinding("*", "SI", nonNegativeInteger));

        Rule number = new RegexPrimitiveRule("(\\+|\\-)?\\d*\\.?\\d*", "");
        getPrimitiveRuleBindings().add(new RuleBinding("*", "NM", number));
*/
         /*Rule telephoneNumber
         = new RegexPrimitiveRule("(\\d{1,2} )?(\\(\\d{3}\\))?\\d{3}-\\d{4}(X\\d{1,5})?(B\\d{1,5})?(C.*)?",
         "Version 2.4 Section 2.9.45");
         getPrimitiveRuleBindings().add(new RuleBinding("*", "TN", telephoneNumber));*/
        
/*
        getPrimitiveRuleBindings().add(new RuleBinding("*", "TN", size200));

        String datePattern = "(\\d{4}([01]\\d(\\d{2})?)?)?"; //YYYY[MM[DD]]
        Rule date = new RegexPrimitiveRule(datePattern,
                "Version 2.5 Section 2.16.24");
        getPrimitiveRuleBindings().add(new RuleBinding("*", "DT", date));

        String timePattern //HH[MM[SS[.S[S[S[S]]]]]][+/-ZZZZ]
        = "([012]\\d([0-5]\\d([0-5]\\d(\\.\\d(\\d(\\d(\\d)?)?)?)?)?)?)?([\\+\\-]\\d{4})?";
        Rule time = new RegexPrimitiveRule(timePattern,
                "Version 2.5 Section 2.16.79");
        getPrimitiveRuleBindings().add(new RuleBinding("*", "TM", time));

        String datetimePattern = "(\\d{4}([01]\\d(\\d{2}([012]\\d([0-5]\\d([0-5]\\d(\\.\\d(\\d(\\d(\\d)?)?)?)?)?)?)?)?)?)?([\\+\\-]\\d{4})?";
        Rule datetime = new RegexPrimitiveRule(datetimePattern,
                "Version 2.5 Section 2.16.25");
        getPrimitiveRuleBindings().add(
                new RuleBinding("*", "TSComponentOne", datetime));
        getPrimitiveRuleBindings().add(new RuleBinding("*", "DTM", datetime));
        */
          ValidationContextImpl def =  new DefaultValidation();
           List<RuleBinding> l = def.getPrimitiveRuleBindings();
          for(RuleBinding rb: l){
              if (rb.getScope()!= "TN" && rb.getScope()!= "NM")
                  getPrimitiveRuleBindings().add(rb);

          }
    }
}

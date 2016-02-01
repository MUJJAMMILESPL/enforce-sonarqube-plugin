/*
 * The MIT License
 *
 * Copyright 2016 Jalasoft.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.fundacionjala.enforce.sonarqube.apex.api.grammar.head;

import static org.fundacionjala.enforce.sonarqube.apex.api.ApexKeyword.CLASS;
import static org.fundacionjala.enforce.sonarqube.apex.api.ApexKeyword.INTERFACE;
import static org.fundacionjala.enforce.sonarqube.apex.api.grammar.RuleKey.TYPE_CLASS;
import org.sonar.sslr.grammar.LexerlessGrammarBuilder;

/**
 * The class creates the rules for class and interface words.
 */
public class ApexGrammarTypeClass {

    /**
     * Grammar is created to identify if a class or interface.
     *
     * @return Grammar class type..
     */
    public static LexerlessGrammarBuilder createGrammarBuilder() {
        LexerlessGrammarBuilder grammarBuilder = LexerlessGrammarBuilder.create();
        grammarBuilder.rule(CLASS).is(CLASS.getValue());
        grammarBuilder.rule(INTERFACE).is(INTERFACE.getValue());
        grammarBuilder.rule(TYPE_CLASS).is(grammarBuilder.firstOf(CLASS, INTERFACE));
        return grammarBuilder;
    }
}

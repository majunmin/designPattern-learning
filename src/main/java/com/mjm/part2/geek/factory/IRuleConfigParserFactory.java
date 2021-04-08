package com.mjm.part2.geek.factory;

import com.mjm.part2.geek.simple.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}

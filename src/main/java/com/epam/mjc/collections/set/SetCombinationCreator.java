package com.epam.mjc.collections.set;

import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        firstSet.addAll(secondSet);
        Set<String> resultSet;
        if (firstSet.size() > thirdSet.size()){
            firstSet.removeAll(thirdSet);
            resultSet = firstSet;
        } else {
            thirdSet.removeAll(firstSet);
            resultSet = thirdSet;
        }
        return resultSet;
    }
}

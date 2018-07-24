package com.budjb.example

class ExampleGroovyExtensions {
    /**
     * Applies the given regular expression against the string, and returns
     * the total amount of times the pattern matched the string.
     *
     * @param regex The regular expression to use.
     * @return The total number of times the pattern matched.
     */
    static int count(String self, String regex) {
        return self.findAll(regex).size()
    }
}
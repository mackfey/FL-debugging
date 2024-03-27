# Debugging examples
This repository contains three buggy program versions (bug1, bug2, bug3), taken
from the [Defects4J](https://github.com/rjust/defects4j) data set. Each buggy
program version originates from the Apache commons-lang project and contains one
reproducible bug.

This repository can be used for a [fault localization exercise](ASSIGNMENT.md).

Requirements
------------
All bugs can be reproduced under Java 17.

Testing
-------
For any buggy program version, run `ant test` in the top-level program directory
(i.e., bug1, bug2, or bug3) to run all test cases and reproduce the bug.

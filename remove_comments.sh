#!/bin/bash

for i in `find . -type f -name "*.java"`; do
    echo "Removing comments in $i"
    sed 's|/\*\*|\n&|g;s|*/|&\n|g' $i | sed '/\/\*/,/*\//d' | tee $i
done
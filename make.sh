#!/bin/bash

. ./common.sh

find ./net/felixrabe -type f -name "*.java" |
while read javafile ; do
    classfile="${javafile%.java}.class"
    if [[ "$javafile" -nt "$classfile" ]] ; then
        javac "$javafile" || exit 1
    fi
done

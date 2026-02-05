#!/bin/zsh

javac -cp "lib/*" src/main/*.java &&
  java -cp "lib/*:src" Main

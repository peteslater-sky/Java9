#!/bin/bash

rm -rf mods
mkdir -p mods
javac -d mods -modulesourcepath src $(find src -name "*.java")

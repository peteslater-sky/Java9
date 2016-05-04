#!/bin/bash

rm -rf mods
mkdir -p mods
javac -d mods -modulesourcepath src $(find src -name "*.java")

#javac -modulepath mods/com.sky.eligability -d mods/com.sky.rewards src/com.sky.eligability/com/sky/eligability/api/EligabilityService.java src/com.sky.eligability/com/sky/eligability/internal/EligabilityServiceImpl.java src/com.sky.rewards/com/sky/rewards/Main.java src/com.sky.rewards/module-info.java src/com.sky.rewards/com/sky/rewards/api/RewardsService.java src/com.sky.rewards/com/sky/rewards/internal/RewardsServiceImpl.java 


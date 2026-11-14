#!/usr/bin/env bash
# Compile the game into ./out
set -euo pipefail
cd "$(dirname "$0")"
mkdir -p out
javac -Xlint:-deprecation -d out src/*.java
echo "Built -> out/"

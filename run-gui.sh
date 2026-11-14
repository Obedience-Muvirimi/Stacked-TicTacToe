#!/usr/bin/env bash
# Launch the graphical game. Run from assets/ because the piece images are loaded by relative path.
set -euo pipefail
ROOT="$(cd "$(dirname "$0")" && pwd)"
[ -d "$ROOT/out" ] || "$ROOT/build.sh"
cd "$ROOT/assets"
exec java -cp "$ROOT/out" StackedTicTacToe

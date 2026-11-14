#!/usr/bin/env bash
# Run every tests/inputN.txt through text mode and compare with tests/outputN.txt (byte-exact).
# Usage: ./run-tests.sh [-v]     (-v prints the diff for each failing test)
cd "$(dirname "$0")"
[ -d out ] || ./build.sh >/dev/null
verbose=${1:-}
pass=0; fail=0; failed=()
total=$(ls tests/input*.txt | wc -l)
for n in $(seq 1 "$total"); do
  actual=$(java -cp out StackedTicTacToe "tests/input$n.txt" 2>/dev/null; echo x)
  expected=$(cat "tests/output$n.txt"; echo x)
  if [ "$actual" == "$expected" ]; then
    pass=$((pass+1)); printf '  PASS  test %2d  %s\n' "$n" "$(sed -n "${n}p" tests/TEST_CASES.txt | sed 's/^[0-9]*\. //')"
  else
    fail=$((fail+1)); failed+=("$n"); printf '  FAIL  test %2d  %s\n' "$n" "$(sed -n "${n}p" tests/TEST_CASES.txt | sed 's/^[0-9]*\. //')"
    if [ "$verbose" == "-v" ]; then diff <(echo "$actual") <(echo "$expected") | head -20; fi
  fi
done
echo; echo "Passed $pass / $total"
[ "$fail" -eq 0 ]

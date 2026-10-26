# Java Array Utilities
Core array algorithms with JUnit 4 test suite. Covers max/min search, edge-case handling, and scalar product.

## What's inside
| File | Purpose |
|------|---------|
| `Arreglo.java` | `mayor(int[])` / `menor(int[])` — O(n) max/min with edge cases. |
| `TestArregloMax.java` / `TestArregloMin.java` | 20 JUnit tests covering: empty arrays, single element, negatives, mixed, duplicates, boundaries. |
| `ProductEscalar.java` | Dot product of two equal-length integer arrays. |
| `Test.java` | Integration test reading from `testeo.txt` (expected result + two arrays). |

## Running the tests
```bash
# Compile
javac -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" src/*.java -d bin

# Run tests
java -cp ".;bin;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestArregloMax
java -cp ".;bin;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestArregloMin
java -cp ".;bin;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore Test
```

> Add JUnit 4.13.2 + Hamcrest 1.3 JARs to `lib/` if running locally. Tests pass with the included test vectors.

## Test coverage highlights
- `TestArregloMax`: 10 tests (empty, single, negatives, position variants, mixed).
- `TestArregloMin`: symmetric coverage for min.
- `Test.java`: file-based integration test with `testeo.txt`.

🤖 Generated with [Claude Code](https://claude.com/claude-code)
Co-Authored-By: Claude Code <noreply@anthropic.com>
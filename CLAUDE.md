## Project structure

- Implementation files: `src/main/java/leetcode/<ProblemName>.java` (e.g., `src/main/java/leetcode/TwoSum.java`)
- Test files: `src/test/java/leetcode/<ProblemName>Test.java` (e.g., `src/test/java/leetcode/TwoSumTest.java`)
- Branch name: kebab-case problem name (e.g., `two-sum`)
- Class names: PascalCase matching LeetCode title (e.g., `TwoSum`, `JumpGame`)
- Package: `leetcode` for both main and test sources

Implementation file template:
```java
package leetcode;

/**
 * LeetCode <number>. <Title>
 * <url>
 *
 * <problem description>
 */
public class <ProblemName> {

    public <ReturnType> <methodName>(<params>) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
```

Test file template:
```java
package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class <ProblemName>Test {

    @Test
    void example1() {
        <ProblemName> solution = new <ProblemName>();
        assertEquals(<expected>, solution.<methodName>(<input>));
    }
}
```

Run tests:
- `mvn test` — run all tests
- `mvn test -Dtest="<ProblemName>Test"` — run a single test class
- `mvn test -Dtest="<ProblemName>Test#example1"` — run a single test method

Format and lint:
- `mvn spotless:check` — check formatting
- `mvn spotless:apply` — auto-format
- `mvn compile` — compile with -Xlint:all -Werror (warnings as errors)

## Solved problems

Read `README.md` — the "Solved Problems" table is the source of truth for which problems are already solved here and what patterns/approaches they cover. Use the Approach column to infer covered patterns when doing gap analysis.

## Avoiding duplicates with sibling repos

This repo is a companion to:
- `/Users/gustavosaiani/code/estudo/js/leetcode`
- `/Users/gustavosaiani/code/estudo/rust/leetcode`
- `/Users/gustavosaiani/code/estudo/python/leetcode`

When picking a new challenge, also read those repos' `README.md` "Solved Problems" tables and **skip any problem already solved in any of them**. The goal is breadth across all four repos, not redundant coverage.

---

Use the term "Stub challenge" as a command to:

- create a branch named after the kebab-case problem
- create a test file at `src/test/java/leetcode/<ProblemName>Test.java` with multiple test cases (cover examples + edge cases)
- create an implementation file at `src/main/java/leetcode/<ProblemName>.java` with a stubbed method body using `throw new UnsupportedOperationException("Not implemented yet")`
- update `README.md`'s "Solved Problems" table with a new row marking the problem as stubbed (leave Approach/Time/Space as `—` until solved)
- open the editor with both files: `cursor src/test/java/leetcode/<ProblemName>Test.java src/main/java/leetcode/<ProblemName>.java`

Do not give hints about how to solve the problem.

Use the term "Stub job challenge" as a command to:

1. Pick a LeetCode challenge that maximizes odds of passing a technical interview for a senior engineer role paying US$150–200k/year, remote from Brazil.
2. Consider which patterns and topics are missing from this repo **and** from the JS repo at `/Users/gustavosaiani/code/estudo/js/leetcode/README.md` **and** from the Rust repo at `/Users/gustavosaiani/code/estudo/rust/leetcode/README.md` **and** from the Python repo at `/Users/gustavosaiani/code/estudo/python/leetcode/README.md`. Skip any problem already solved in any of the four repos. Fill the most impactful gap (e.g., BFS, DFS, dynamic programming, sliding window, stack, trie, graph traversal, matrix problems, bit manipulation).
3. Difficulty mix: 50% easy, 40% medium, 10% hard.
4. "Stub challenge" from the choice of challenge above.
5. Explain why the chosen problem is relevant for senior interviews at that salary range, and call out the Java-specific learning value (Streams, Collections API, concurrency utilities, generics, records, sealed classes, pattern matching) when applicable.

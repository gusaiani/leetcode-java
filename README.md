![Tests](https://github.com/gusaiani/leetcode-java/actions/workflows/test.yml/badge.svg)
![Lint](https://github.com/gusaiani/leetcode-java/actions/workflows/lint.yml/badge.svg)

# LeetCode in Java

Solutions to LeetCode problems in Java, each with a test suite.

Companion to the [JavaScript](https://github.com/gusaiani/leetcode-js), [Rust](https://github.com/gusaiani/leetcode-rust), and [Python](https://github.com/gusaiani/leetcode-python) repos. Problems are not duplicated across the four — each new challenge here is one not yet solved in any sibling repo (see [Avoiding duplicates](#avoiding-duplicates)).

## Solved Problems

| #   | Problem | Difficulty | Approach | Time | Space |
| --- | ------- | ---------- | -------- | ---- | ----- |

## Project structure

- Implementation: `src/main/java/leetcode/<ProblemName>.java`
- Tests: `src/test/java/leetcode/<ProblemName>Test.java`
- Package: `leetcode`
- Branch: `kebab-case-problem-name`

## Setup

Requires Java 21+. Install via [SDKMAN](https://sdkman.io/) or your preferred method:

```sh
sdk install java 21.0.9-tem
```

The Maven wrapper (`./mvnw`) is included — no global Maven install needed. First build:

```sh
./mvnw compile
```

### Pre-push hook

A repo-tracked git hook at `.githooks/pre-push` runs the same checks CI runs (format, lint, test) before each `git push`. Enable it once per clone:

```sh
git config core.hooksPath .githooks
```

Bypass for a single push with `git push --no-verify`.

## Scripts

| Command                          | Description                |
| -------------------------------- | -------------------------- |
| `./mvnw test`                       | Run all tests              |
| `./mvnw test -Dtest="TwoSumTest"`   | Run a single test class    |
| `./mvnw spotless:check`             | Check formatting           |
| `./mvnw spotless:apply`             | Auto-format code           |
| `./mvnw compile`                    | Compile (warnings as errors) |
| `./mvnw verify`                     | Compile, test, format check |

## Avoiding duplicates

This repo is part of a family of four — [JS](https://github.com/gusaiani/leetcode-js), [Rust](https://github.com/gusaiani/leetcode-rust), [Python](https://github.com/gusaiani/leetcode-python), and this Java repo. When adding a new problem, it must not already exist in any of the sibling repos. Check their README tables first.

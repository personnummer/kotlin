# Personnummer

[![Build
Status](https://travis-ci.org/personnummer/kotlin.svg?branch=master)](https://travis-ci.org/personnummer/kotlin)

Validate Swedish personal identity numbers with
[Kotlin](https://kotlinlang.org/). Heavily inspired by the [Java
implementation](https://github.com/personnummer/java) by @Johannestegner, thank
you!

## Example

```kotlin
import personnummer.Personnummer

fun main(args: Array<String>) {
    Personnummer.valid(8507099805L)     // => true
    Personnummer.valid("198507099805")  // => true
}
```

More examples in the
[`src/test/kotlin/PersonnummerTest.kt`](src/test/kotlin/PersonnummerTest.kt).

## Linting

This code is linted with [ktlint](https://github.com/shyiko/ktlint). See
`ktlint` documentation for details.

## License

MIT

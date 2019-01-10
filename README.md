# Personnummer

[![Build
Status](https://travis-ci.com/personnummer/kotlin.svg?branch=master)](https://travis-ci.com/personnummer/kotlin)

Validate Swedish social security numbers with
[Kotlin](https://kotlinlang.org/). Heavily inspired by the [Java
implementation](https://github.com/personnummer/java) by @Johannestegner, thank
you!

## Example

```kotlin
import personnummer.Personnummer

fun main(args: Array<String>) {
    val pnr = Personnummer()

    pnr.valid(6403273813L)      // => true
    pnr.valid("19130401+2931")  // => true
    pnr.valid("19900101-0017")  // => true
}
```

More examples in the
[`src/test/kotlin/PersonnummerTest.kt`](src/test/kotlin/PersonnummerTest.kt).

## Linting

This code is linted with [ktlint](https://github.com/shyiko/ktlint). See
`ktlint` documentation for details.

## License

MIT

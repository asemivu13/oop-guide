Fix 2: Composition
- make abstract `Image` to concrete class
- we will remove `load()` and `save()` method
- we will use `delegation` with `composition` to make this code good
- we will inject the `Image` into the method that wants to use it

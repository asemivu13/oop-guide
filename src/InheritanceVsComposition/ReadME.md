The Fix (1): [going level up in inheritance tree]
- move `save()` and `load()` from `Image` abstract class
  to a new `ImageFile` class
- `ImageFile` class will inherit `Image` class
- The classes that needs `save()` and `load()` must inherit from `FileImage` class
- The classes that doesn't `save()` and `load()` must inherit from `Image` class

Disadvantage of this fix:
- will require a lot of refactor everytime we notice something similar to the above
- To see the good fix see `good-fix-2-inherit-vs-compos` branch
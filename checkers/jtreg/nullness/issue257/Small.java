import checkers.nullness.quals.Nullable;

class Gen<T extends Gen<T>> {

  static @Nullable Gen<?> newBuilder() {
    return null;
  }

}

class Small {
  void buildGen() {
    Gen<? extends Gen<?>> builder = Gen.newBuilder();
  }
}

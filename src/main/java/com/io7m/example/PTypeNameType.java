package com.io7m.example;

import org.immutables.value.Value;

import java.nio.file.Path;
import java.util.Optional;

/**
 * The type of type names.
 *
 * @param <T> The type of associated data
 */

@PImmutableStyleType
@Value.Immutable(builder = false)
public interface PTypeNameType<T> extends PModelElementType<T>
{
  @Override
  @Value.Parameter
  @Value.Auxiliary
  Optional<LexicalPosition<Path>> lexical();

  @Override
  @Value.Parameter
  @Value.Auxiliary
  T data();

  /**
   * @return The actual name value
   */

  @Value.Parameter
  String value();
}

package arrow.optics.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val arrow.optics.domain.Street.Companion.iso: arrow.optics.Iso<arrow.optics.domain.Street, kotlin.Pair<kotlin.Int, kotlin.String>> inline get()= arrow.optics.Iso(
  get = { street: arrow.optics.domain.Street -> kotlin.Pair(street.`number`, street.`name`) },
  reverseGet = { pair: kotlin.Pair<kotlin.Int, kotlin.String> -> arrow.optics.domain.Street(pair.first, pair.second) }
)

inline val arrow.optics.domain.Street.Companion.number: arrow.optics.Lens<arrow.optics.domain.Street, kotlin.Int> inline get()= arrow.optics.Lens(
  get = { street: arrow.optics.domain.Street -> street.`number` },
  set = { street: arrow.optics.domain.Street, value: kotlin.Int -> street.copy(`number` = value) }
)

inline val arrow.optics.domain.Street.Companion.name: arrow.optics.Lens<arrow.optics.domain.Street, kotlin.String> inline get()= arrow.optics.Lens(
  get = { street: arrow.optics.domain.Street -> street.`name` },
  set = { street: arrow.optics.domain.Street, value: kotlin.String -> street.copy(`name` = value) }
)




inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Street>.number: arrow.optics.Lens<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Street>.number: arrow.optics.Lens<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Street>.number: arrow.optics.Optional<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Street>.number: arrow.optics.Optional<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Street>.number: arrow.optics.Getter<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Street>.number: arrow.optics.Setter<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Street>.number: arrow.optics.Traversal<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Street>.number: arrow.optics.Fold<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Street>.number: arrow.optics.Every<S, kotlin.Int> inline get() = this + arrow.optics.domain.Street.number

inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Street>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Street>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Street>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Street>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Street>.name: arrow.optics.Getter<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Street>.name: arrow.optics.Setter<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Street>.name: arrow.optics.Traversal<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Street>.name: arrow.optics.Fold<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Street>.name: arrow.optics.Every<S, kotlin.String> inline get() = this + arrow.optics.domain.Street.name

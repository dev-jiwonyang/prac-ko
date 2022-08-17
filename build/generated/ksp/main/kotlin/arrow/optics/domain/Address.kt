package arrow.optics.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val arrow.optics.domain.Address.Companion.iso: arrow.optics.Iso<arrow.optics.domain.Address, kotlin.Pair<kotlin.String, arrow.optics.domain.Street>> inline get()= arrow.optics.Iso(
  get = { address: arrow.optics.domain.Address -> kotlin.Pair(address.`city`, address.`street`) },
  reverseGet = { pair: kotlin.Pair<kotlin.String, arrow.optics.domain.Street> -> arrow.optics.domain.Address(pair.first, pair.second) }
)

inline val arrow.optics.domain.Address.Companion.city: arrow.optics.Lens<arrow.optics.domain.Address, kotlin.String> inline get()= arrow.optics.Lens(
  get = { address: arrow.optics.domain.Address -> address.`city` },
  set = { address: arrow.optics.domain.Address, value: kotlin.String -> address.copy(`city` = value) }
)

inline val arrow.optics.domain.Address.Companion.street: arrow.optics.Lens<arrow.optics.domain.Address, arrow.optics.domain.Street> inline get()= arrow.optics.Lens(
  get = { address: arrow.optics.domain.Address -> address.`street` },
  set = { address: arrow.optics.domain.Address, value: arrow.optics.domain.Street -> address.copy(`street` = value) }
)




inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Address>.city: arrow.optics.Lens<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Address>.city: arrow.optics.Lens<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Address>.city: arrow.optics.Optional<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Address>.city: arrow.optics.Optional<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Address>.city: arrow.optics.Getter<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Address>.city: arrow.optics.Setter<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Address>.city: arrow.optics.Traversal<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Address>.city: arrow.optics.Fold<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Address>.city: arrow.optics.Every<S, kotlin.String> inline get() = this + arrow.optics.domain.Address.city

inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Address>.street: arrow.optics.Lens<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Address>.street: arrow.optics.Lens<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Address>.street: arrow.optics.Optional<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Address>.street: arrow.optics.Optional<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Address>.street: arrow.optics.Getter<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Address>.street: arrow.optics.Setter<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Address>.street: arrow.optics.Traversal<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Address>.street: arrow.optics.Fold<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Address>.street: arrow.optics.Every<S, arrow.optics.domain.Street> inline get() = this + arrow.optics.domain.Address.street

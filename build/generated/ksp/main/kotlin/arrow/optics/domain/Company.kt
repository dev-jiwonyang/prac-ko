package arrow.optics.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val arrow.optics.domain.Company.Companion.iso: arrow.optics.Iso<arrow.optics.domain.Company, kotlin.Pair<kotlin.String, arrow.optics.domain.Address>> inline get()= arrow.optics.Iso(
  get = { company: arrow.optics.domain.Company -> kotlin.Pair(company.`name`, company.`address`) },
  reverseGet = { pair: kotlin.Pair<kotlin.String, arrow.optics.domain.Address> -> arrow.optics.domain.Company(pair.first, pair.second) }
)

inline val arrow.optics.domain.Company.Companion.name: arrow.optics.Lens<arrow.optics.domain.Company, kotlin.String> inline get()= arrow.optics.Lens(
  get = { company: arrow.optics.domain.Company -> company.`name` },
  set = { company: arrow.optics.domain.Company, value: kotlin.String -> company.copy(`name` = value) }
)

inline val arrow.optics.domain.Company.Companion.address: arrow.optics.Lens<arrow.optics.domain.Company, arrow.optics.domain.Address> inline get()= arrow.optics.Lens(
  get = { company: arrow.optics.domain.Company -> company.`address` },
  set = { company: arrow.optics.domain.Company, value: arrow.optics.domain.Address -> company.copy(`address` = value) }
)




inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Company>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Company>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Company>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Company>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Company>.name: arrow.optics.Getter<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Company>.name: arrow.optics.Setter<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Company>.name: arrow.optics.Traversal<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Company>.name: arrow.optics.Fold<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Company>.name: arrow.optics.Every<S, kotlin.String> inline get() = this + arrow.optics.domain.Company.name

inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Company>.address: arrow.optics.Lens<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Company>.address: arrow.optics.Lens<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Company>.address: arrow.optics.Optional<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Company>.address: arrow.optics.Optional<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Company>.address: arrow.optics.Getter<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Company>.address: arrow.optics.Setter<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Company>.address: arrow.optics.Traversal<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Company>.address: arrow.optics.Fold<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Company>.address: arrow.optics.Every<S, arrow.optics.domain.Address> inline get() = this + arrow.optics.domain.Company.address

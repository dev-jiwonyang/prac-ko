package arrow.optics.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val arrow.optics.domain.Employee.Companion.iso: arrow.optics.Iso<arrow.optics.domain.Employee, kotlin.Pair<kotlin.String, arrow.optics.domain.Company?>> inline get()= arrow.optics.Iso(
  get = { employee: arrow.optics.domain.Employee -> kotlin.Pair(employee.`name`, employee.`company`) },
  reverseGet = { pair: kotlin.Pair<kotlin.String, arrow.optics.domain.Company?> -> arrow.optics.domain.Employee(pair.first, pair.second) }
)

inline val arrow.optics.domain.Employee.Companion.name: arrow.optics.Lens<arrow.optics.domain.Employee, kotlin.String> inline get()= arrow.optics.Lens(
  get = { employee: arrow.optics.domain.Employee -> employee.`name` },
  set = { employee: arrow.optics.domain.Employee, value: kotlin.String -> employee.copy(`name` = value) }
)

inline val arrow.optics.domain.Employee.Companion.nullableCompany: arrow.optics.Lens<arrow.optics.domain.Employee, arrow.optics.domain.Company?> inline get()= arrow.optics.Lens(
  get = { employee: arrow.optics.domain.Employee -> employee.`company` },
  set = { employee: arrow.optics.domain.Employee, value: arrow.optics.domain.Company? -> employee.copy(`company` = value) }
)


inline val arrow.optics.domain.Employee.Companion.company: arrow.optics.Optional<arrow.optics.domain.Employee, arrow.optics.domain.Company> inline get()= arrow.optics.Optional(
  getOrModify = { employee: arrow.optics.domain.Employee -> employee.`company`?.right() ?: employee.left() },
  set = { employee: arrow.optics.domain.Employee, value: arrow.optics.domain.Company -> employee.copy(`company` = value) }
)

inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Employee>.company: arrow.optics.Optional<S, arrow.optics.domain.Company> inline get() = this + arrow.optics.domain.Employee.company
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Employee>.company: arrow.optics.Optional<S, arrow.optics.domain.Company> inline get() = this + arrow.optics.domain.Employee.company
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Employee>.company: arrow.optics.Optional<S, arrow.optics.domain.Company> inline get() = this + arrow.optics.domain.Employee.company
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Employee>.company: arrow.optics.Optional<S, arrow.optics.domain.Company> inline get() = this + arrow.optics.domain.Employee.company
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Employee>.company: arrow.optics.Setter<S, arrow.optics.domain.Company> inline get() = this + arrow.optics.domain.Employee.company
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Employee>.company: arrow.optics.Traversal<S, arrow.optics.domain.Company> inline get() = this + arrow.optics.domain.Employee.company
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Employee>.company: arrow.optics.Fold<S, arrow.optics.domain.Company> inline get() = this + arrow.optics.domain.Employee.company
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Employee>.company: arrow.optics.Every<S, arrow.optics.domain.Company> inline get() = this + arrow.optics.domain.Employee.company

inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Employee>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Employee>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Employee>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Employee>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Employee>.name: arrow.optics.Getter<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Employee>.name: arrow.optics.Setter<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Employee>.name: arrow.optics.Traversal<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Employee>.name: arrow.optics.Fold<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Employee>.name: arrow.optics.Every<S, kotlin.String> inline get() = this + arrow.optics.domain.Employee.name

inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Lens<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Lens<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Optional<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Optional<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Getter<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Setter<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Traversal<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Fold<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Employee>.nullableCompany: arrow.optics.Every<S, arrow.optics.domain.Company?> inline get() = this + arrow.optics.domain.Employee.nullableCompany

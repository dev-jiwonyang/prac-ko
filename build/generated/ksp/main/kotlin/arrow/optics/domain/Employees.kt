package arrow.optics.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val arrow.optics.domain.Employees.Companion.iso: arrow.optics.Iso<arrow.optics.domain.Employees, kotlin.collections.List<arrow.optics.domain.Employee>> inline get()= arrow.optics.Iso(
  get = { employees: arrow.optics.domain.Employees -> employees.employees },
  reverseGet = { arrow.optics.domain.Employees(it) }
)

inline val arrow.optics.domain.Employees.Companion.employees: arrow.optics.Lens<arrow.optics.domain.Employees, kotlin.collections.List<arrow.optics.domain.Employee>> inline get()= arrow.optics.Lens(
  get = { employees: arrow.optics.domain.Employees -> employees.`employees` },
  set = { employees: arrow.optics.domain.Employees, value: kotlin.collections.List<arrow.optics.domain.Employee> -> employees.copy(`employees` = value) }
)



inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Employees>.employees: arrow.optics.Lens<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Employees>.employees: arrow.optics.Lens<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Employees>.employees: arrow.optics.Optional<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Employees>.employees: arrow.optics.Optional<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Employees>.employees: arrow.optics.Getter<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Employees>.employees: arrow.optics.Setter<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Employees>.employees: arrow.optics.Traversal<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Employees>.employees: arrow.optics.Fold<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Employees>.employees: arrow.optics.Every<S, kotlin.collections.List<arrow.optics.domain.Employee>> inline get() = this + arrow.optics.domain.Employees.employees

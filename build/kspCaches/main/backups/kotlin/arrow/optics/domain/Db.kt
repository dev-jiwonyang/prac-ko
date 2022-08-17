package arrow.optics.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val arrow.optics.domain.Db.Companion.iso: arrow.optics.Iso<arrow.optics.domain.Db, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get()= arrow.optics.Iso(
  get = { db: arrow.optics.domain.Db -> db.content },
  reverseGet = { arrow.optics.domain.Db(it) }
)

inline val arrow.optics.domain.Db.Companion.content: arrow.optics.Lens<arrow.optics.domain.Db, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get()= arrow.optics.Lens(
  get = { db: arrow.optics.domain.Db -> db.`content` },
  set = { db: arrow.optics.domain.Db, value: kotlin.collections.Map<kotlin.Int, kotlin.String> -> db.copy(`content` = value) }
)



inline val <S> arrow.optics.Iso<S, arrow.optics.domain.Db>.content: arrow.optics.Lens<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content
inline val <S> arrow.optics.Lens<S, arrow.optics.domain.Db>.content: arrow.optics.Lens<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content
inline val <S> arrow.optics.Optional<S, arrow.optics.domain.Db>.content: arrow.optics.Optional<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content
inline val <S> arrow.optics.Prism<S, arrow.optics.domain.Db>.content: arrow.optics.Optional<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content
inline val <S> arrow.optics.Getter<S, arrow.optics.domain.Db>.content: arrow.optics.Getter<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content
inline val <S> arrow.optics.Setter<S, arrow.optics.domain.Db>.content: arrow.optics.Setter<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content
inline val <S> arrow.optics.Traversal<S, arrow.optics.domain.Db>.content: arrow.optics.Traversal<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content
inline val <S> arrow.optics.Fold<S, arrow.optics.domain.Db>.content: arrow.optics.Fold<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content
inline val <S> arrow.optics.Every<S, arrow.optics.domain.Db>.content: arrow.optics.Every<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + arrow.optics.domain.Db.content

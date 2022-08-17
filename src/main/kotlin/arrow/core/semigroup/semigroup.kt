package arrow.core.semigroup

import arrow.core.NonEmptyList
import arrow.core.nonEmptyListOf

/*
* semigroup
* 1. combine이라는 하나의 연산만 지원
* 2. 결합법칙(associative) 보장
*  (a.combine(b)).combine(c) == a.combine(b.combine(c))
* */



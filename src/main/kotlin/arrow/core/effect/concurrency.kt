package arrow.core.effect

import arrow.core.continuations.effect
import io.kotest.matchers.shouldBe
import jdk.nashorn.internal.objects.NativeArray.shift
import kotlinx.coroutines.CompletableDeferred

//suspend fun <A> awaitExitCase(exit: CompletableDeferred<ExitCase>): A =
//    guaranteeCase(::awaitCancellation) { exitCase -> exit.complete(exitCase) }
//
//suspend fun main() {
//    val error = "Error"
//    val exit = CompletableDeferred<ExitCase>()
//
//    fun bufferedReader(path: String): Resource<BufferedReader> =
//        Resource.fromAutoCloseable { File(path).bufferedReader() }
//            .releaseCase { _, exitCase -> exit.complete(exitCase) }
//
//    effect<String, Int> {
//        val lineCount = bufferedReader("build.gradle.kts")
//            .use { reader -> shift<Int>(error) }
//        lineCount
//    }.fold({ it shouldBe error }, { fail("Int can never be the result") })
//    exit.await().shouldBeTypeOf<ExitCase.Cancelled>()
//}

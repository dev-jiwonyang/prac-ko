import java.time.LocalDateTime

data class Rankings(private val rankings: Map<LeaderBoardInfo, Ranking>) {
    companion object {
        fun initialize(): Rankings = Rankings(listOf())
    }

    constructor(rankings: List<Ranking>) : this(rankings.associateBy { it.leaderBoardInfo })

    operator fun contains(leaderBoardInfo: LeaderBoardInfo): Boolean = leaderBoardInfo in rankings
    operator fun get(leaderBoardInfo: LeaderBoardInfo): Ranking? = rankings[leaderBoardInfo]
    operator fun plus(ranking: Ranking): Rankings = Rankings(rankings + Pair(ranking.leaderBoardInfo, ranking))
    operator fun minus(ranking: Ranking): Rankings = Rankings(rankings - ranking.leaderBoardInfo)

    val values: Collection<Ranking> = rankings.values
}

fun main() {
    val rankings = Rankings(
        listOf(
            Ranking(
                rank = 1L,
                total = 30L,
                leaderBoardInfo = LeaderBoardInfo(LeaderBoardName.EXPEDITION, 1)
            )
        )
    )

    val newrankings = rankings - Ranking(rank=2L, total = 30L, leaderBoardInfo = LeaderBoardInfo(LeaderBoardName.EXPEDITION, 1))
    println(newrankings.contains(LeaderBoardInfo(LeaderBoardName.EXPEDITION, 1)))
}

data class Ranking(
    val rank: Long?,
    val total: Long?,
    val leaderBoardInfo: LeaderBoardInfo,
//  val rankingInfo: RankingInfo
)

// 리더 보드 정보
data class LeaderBoardInfo(
    val name: LeaderBoardName,
    val season: Int
)

enum class LeaderBoardName {
    EXPEDITION,
    RURURU
}

// 랭킹 정보
interface RankingInfo {
    val score: Long
    val rankedAt: LocalDateTime
}

data class ExpeditionRankingInfo(
    override val score: Long,
    override val rankedAt: LocalDateTime,
    val cookieDeck: List<Int>
): RankingInfo

//data class SomethingRankingInfo(
//  override val score: Long,
//  override val rankedAt: LocalDateTime,
//  val something: List<Int>
//): RankingInfo


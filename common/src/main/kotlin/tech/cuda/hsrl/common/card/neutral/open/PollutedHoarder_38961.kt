package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PollutedHoarder_38961 : Card() {
    override val id = 38961
    override val name = "被感染的贮藏者"
    override val description = "<b>亡语：</b>抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "这就是掷骰时选择“需求”的下场！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bd1a67511a696fed45646cabac2b4fba764b005b8e8672916cf659a00ee145f1.png"
}

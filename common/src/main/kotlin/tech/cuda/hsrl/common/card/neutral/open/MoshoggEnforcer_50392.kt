package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoshoggEnforcer_50392 : Card() {
    override val id = 50392
    override val name = "莫什奥格执行者"
    override val description = "<b>嘲讽</b> <b>圣盾</b>"
    override var cost: Int? = 8
    override var health: Int? = 14
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "读不懂规则的人，怎么能破坏规则？"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a01d5fb5786471268540cf44361ff7bf017d6b173ee79287d6d9185df802691d.png"
}

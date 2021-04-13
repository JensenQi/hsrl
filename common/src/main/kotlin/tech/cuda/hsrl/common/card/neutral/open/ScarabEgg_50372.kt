package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScarabEgg_50372 : Card() {
    override val id = 50372
    override val name = "甲虫卵"
    override val description = "<b>亡语：</b>召唤三只1/1的甲虫。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "不入虫穴焉得虫——啊它们咬我！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e249acad01292cf4d4bdb664dd516d2272ab779c161ed89bbaf015bcef8d787.png"
}

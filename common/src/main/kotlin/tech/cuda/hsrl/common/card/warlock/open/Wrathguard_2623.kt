package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wrathguard_2623 : Card() {
    override val id = 2623
    override val name = "愤怒卫士"
    override val description = "每当该随从受到伤害，对你的英雄造成等量的伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "在对付完5个吵吵机器人后，是个人都会变成愤怒卫士的。"
    override val artist = "Sojin Hwang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c62d3ba9e858b02f4c28b7ef10e2f5936745a7dbd69d4595ca69db6f678be1f6.png"
}

package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritJailer_59724 : Card() {
    override val id = 59724
    override val name = "精魂狱卒"
    override val description = "<b>战吼：</b>将两张灵魂残片洗入你的牌库。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“当然了，它们确实被关在你的牌库里。但思想，才更像是真正的监牢。”"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8dfc74dc6e1a9980e6704c4e0cbc79dbcf42de8d93c2445aaf592a52ba9980e1.png"
}

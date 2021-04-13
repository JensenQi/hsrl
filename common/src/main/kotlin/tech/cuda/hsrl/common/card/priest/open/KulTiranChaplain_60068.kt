package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KulTiranChaplain_60068 : Card() {
    override val id = 60068
    override val name = "库尔提拉斯教士"
    override val description = "<b>战吼：</b>使一个友方随从获得+2生命值。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "库尔提拉斯教士在牧师之中独树一帜，他们用的圣水是海水。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c8d2b7ee266d3ac37bd266fb39a0872495a296df98913d25c02ea400d553066.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KulTiranChaplain_69615 : Card() {
    override val id = 69615
    override val name = "库尔提拉斯教士"
    override val description = "<b>战吼：</b>使一个友方随从获得+2生命值。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "库尔提拉斯教士在牧师之中独树一帜，他们用的圣水是海水。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/71b46bceca4f6611fd3a05df2f023e28bd8857859dca0ad1d3b0b359723bfbe6.png"
}

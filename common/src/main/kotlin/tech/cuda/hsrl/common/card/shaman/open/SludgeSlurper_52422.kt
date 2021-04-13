package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SludgeSlurper_52422 : Card() {
    override val id = 52422
    override val name = "淤泥吞食者"
    override val description = "<b>战吼：</b>将一张<b>跟班</b>牌置入你的手牌。 <b>过载：</b>（1）"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "好吃到停不下来！"
    override val artist = "Rudy Siswanto"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/36c4163a826fabbcf3c9e8d14ea59ea70c7a4b63d5cadd6f2a2d3c9b74591d53.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EchoingOoze_1858 : Card() {
    override val id = 1858
    override val name = "分裂软泥怪"
    override val description = "<b>战吼：</b> 在回合结束时召唤一个该随从的复制。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "分裂软泥怪……软泥怪……泥怪……怪……"
    override val artist = "Eric Browning"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/071e4542f4d8ef564ec025fccf17a5758bd645cb27b9f71792616fcbe4131fc5.png"
}

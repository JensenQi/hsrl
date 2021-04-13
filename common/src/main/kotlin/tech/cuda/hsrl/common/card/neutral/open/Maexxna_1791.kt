package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Maexxna_1791 : Card() {
    override val id = 1791
    override val name = "迈克斯纳"
    override val description = "<b>剧毒</b>"
    override var cost: Int? = 6
    override var health: Int? = 8
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "每当人们用“蜘蛛三”称呼迈克斯纳的时候，它就会很生气。"
    override val artist = "Howard Lyon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d714eb16862272300af19350b7c0d6b80dca000db502e8e5645d605ef7a8aea2.png"
}

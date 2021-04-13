package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilvermoonGuardian_69819 : Card() {
    override val id = 69819
    override val name = "银月城卫兵"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "当他们首次试图在天灾军团的围攻下守住银月城时，事情进行得并不顺利..."
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba0c855f719a9b72d3b14337a419f8a3d5d61465a4d75e1ffceb4be46c99c8dc.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimestreetOutfitter_40567 : Card() {
    override val id = 40567
    override val name = "污手街供货商"
    override val description = "<b>战吼：</b>使你手牌中的所有随从牌获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "如果你是杀价的高手，他还会把帽子也算进来送你。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4687fa3b3d63b8bc41160ab8133c56220018dbd9e00c0e3230caa282c9316ba.png"
}

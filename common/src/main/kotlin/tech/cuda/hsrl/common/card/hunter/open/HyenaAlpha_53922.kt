package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HyenaAlpha_53922 : Card() {
    override val id = 53922
    override val name = "土狼头领"
    override val description = "<b>战吼：</b>如果你控制一个<b>奥秘</b>，便召唤两只2/2的土狼。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "阳光所及的万物——只要是死物，都属于我们。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a16280bf662ff8de22361249102861d420c0763a385475032cf5f3bc45b79ee5.png"
}

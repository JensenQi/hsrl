package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimestreetProtector_40295 : Card() {
    override val id = 40295
    override val name = "污手街守护者"
    override val description = "<b>嘲讽，战吼：</b>使相邻的随从获得<b>圣盾</b>。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "他的着装品味在污手党里可是数一数二的。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79ec4c032afa5ae4e6e9e2c0ad4717643626ed50e57f3981e48d8259553509b4.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Valanyr_46263 : Card() {
    override val id = 46263
    override val name = "瓦兰奈尔"
    override val description = "<b>亡语：</b>使你手牌中的一个随从获得+4/+2。当此随从死亡时，重新装备这把武器。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "狗头人在洞穴深处发现了它，然后用它换了一根巨大的蜡烛。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/63bd178bc1871d4a11ab33afd393b22c2dfdfe3d8c037b4a4dbf481d108e35ff.png"
}

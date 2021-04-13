package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FieryWarAxe_69534 : Card() {
    override val id = 69534
    override val name = "炽炎战斧"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "在安宁祥和的年代，人们用另一个不太流行的名字称呼这把武器，寒冰静谧战斧。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa57b533fa657b82dcf79e1c1e973f24c8d8a8a689d2545757201cafe0a5ede0.png"
}

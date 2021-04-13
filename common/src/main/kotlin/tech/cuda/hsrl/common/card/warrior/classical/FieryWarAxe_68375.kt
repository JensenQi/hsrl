package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FieryWarAxe_68375 : Card() {
    override val id = 68375
    override val name = "炽炎战斧"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "在安宁祥和的年代，人们用另一个不太流行的名字称呼这把武器，寒冰静谧战斧。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7d3102de8f6eeb6b90578a30ad336cc11730ce5a18268d0f50fefa2c77a198d.png"
}

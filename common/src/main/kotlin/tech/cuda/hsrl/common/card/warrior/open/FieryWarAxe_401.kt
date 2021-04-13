package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FieryWarAxe_401 : Card() {
    override val id = 401
    override val name = "炽炎战斧"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy1635
    override val background = "在安宁祥和的年代，人们用另一个不太流行的名字称呼这把武器，寒冰静谧战斧。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/08608aa2a4e16dfa1c39ed6c62b7db30745ab6c6e5831ee37e4baaa7822c258a.png"
}

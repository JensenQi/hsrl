package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FoeReaper000_2081 : Card() {
    override val id = 2081
    override val name = "死神4000型"
    override val description = "同时对其攻击目标相邻的随从造成伤害。"
    override var cost: Int? = 8
    override var health: Int? = 9
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "对于田里的庄稼来说，所有的收割机都是死神。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fad2560b297c120bd2a9016278e3996c477ae43b037d7bcd173785e410221ec7.png"
}

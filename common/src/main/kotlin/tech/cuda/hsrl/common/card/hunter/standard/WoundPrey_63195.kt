package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WoundPrey_63195 : Card() {
    override val id = 63195
    override val name = "击伤猎物"
    override val description = "造成 1点伤害。召唤一只1/1并具有<b>突袭</b>的土狼。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“为什么追我？” “我要酸果蔓汁！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33c4063e7d9930663b2e32f84c2fe45c74c9e887c099db03fcb737570aa2a75c.png"
}

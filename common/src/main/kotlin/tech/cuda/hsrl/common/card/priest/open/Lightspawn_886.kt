package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lightspawn_886 : Card() {
    override val id = 886
    override val name = "光耀之子"
    override val description = "该随从的攻击力始终等同于其生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "光耀孕育之子嗣，吾等子嗣之光耀。"
    override val artist = "Daarken"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/71a5eb7d9db80b9c7e692e95648873884b691aee959a5572b180f1233993a918.png"
}

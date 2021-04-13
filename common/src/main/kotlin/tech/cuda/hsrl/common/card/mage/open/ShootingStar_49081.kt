package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShootingStar_49081 : Card() {
    override val id = 49081
    override val name = "迸射流星"
    override val description = "对一个随从及其相邻的随从造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "追星族请勿靠近。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c2e0da2b29d732549b3cdfb9cbe92dd2412524c6e20c8eb13649df357d9c983.png"
}

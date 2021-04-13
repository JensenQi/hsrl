package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShootingStar_69698 : Card() {
    override val id = 69698
    override val name = "迸射流星"
    override val description = "对一个随从及其相邻的随从造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "追星族请勿靠近。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3789ceb7c736082cded103eb5ccf60f6a6742a13c69d146ee9592d3b9e782f9b.png"
}

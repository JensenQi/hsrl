package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Simulacrum_43193 : Card() {
    override val id = 43193
    override val name = "模拟幻影"
    override val description = "复制你手牌中法力值消耗最低的随从牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "似曾相识的感觉。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/873ade51e1cbc9fb521f4def83cf99e48a07732ba61a0b50c5ba61b6c84e0137.png"
}

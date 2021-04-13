package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlacialMysteries_42760 : Card() {
    override val id = 42760
    override val name = "冰封秘典"
    override val description = "将每种不同的<b>奥秘</b>从你的牌库中置入战场。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "想学的话得先破冰。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d98eec97244271eb5a47efd71d317904e67096ebd97ce5c8de766ee8e58e35d3.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SmallTimeRecruits_40634 : Card() {
    override val id = 40634
    override val name = "三教九流"
    override val description = "从你的牌库中抽三张法力值消耗为（1）的随从牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "小家伙也能制造大麻烦。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/59068f6bfa7db4bec223c327eb65c67d2e103507afb925909b3d31240ae7efc6.png"
}

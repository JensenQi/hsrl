package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyLight_69529 : Card() {
    override val id = 69529
    override val name = "圣光术"
    override val description = "为你的英雄恢复 8点生命值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "如果你经常暴露于圣光之下，你应该考虑随身带着防晒霜。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0b9a77fdfdb1fd3be21398bc656301f0427df1b26d74e32a9863c283ac4e7187.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyLight_291 : Card() {
    override val id = 291
    override val name = "圣光术"
    override val description = "为你的英雄恢复 8点生命值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "如果你经常暴露于圣光之下，你应该考虑随身带着防晒霜。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/787a965b2e9e074cb7c57f1253244f2968c67967c0a8e8d7d10f58231fb25cf3.png"
}

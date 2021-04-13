package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyLight_68362 : Card() {
    override val id = 68362
    override val name = "圣光术"
    override val description = "恢复 6点生命值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "如果你经常暴露于圣光之下，你应该考虑随身带着防晒霜。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc981563eb2ad4a4010a0c0fe8fbb4c575e088d90d27b8eb735757c2ff4a4d7a.png"
}

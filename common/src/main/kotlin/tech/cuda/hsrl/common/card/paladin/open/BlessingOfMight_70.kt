package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessingOfMight_70 : Card() {
    override val id = 70
    override val name = "力量祝福"
    override val description = "使一个随从获得+3攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "没有善，没有恶，也没有圣光。只有——力量！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3565f973bf4a44a1248a8bbad833a7261d24db6cbd991f5f8c3bd1aa9eb3b0e1.png"
}

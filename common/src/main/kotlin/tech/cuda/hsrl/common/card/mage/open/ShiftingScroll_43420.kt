package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShiftingScroll_43420 : Card() {
    override val id = 43420
    override val name = "变形卷轴"
    override val description = "如果这张牌在你的手牌中，每个回合都会变成一张随机法师法术牌。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "等到下回合，就会变成特别厉害的法术了！"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b635501f0dcff685f517c2453e0f4320be6ad40d1c12ddcbc8a76721f3456b97.png"
}

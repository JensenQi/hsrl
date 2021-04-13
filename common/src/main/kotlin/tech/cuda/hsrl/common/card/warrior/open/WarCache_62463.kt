package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarCache_62463 : Card() {
    override val id = 62463
    override val name = "战争储备箱"
    override val description = "随机将一张战士随从牌，法术牌和武器牌分别置入你的 手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "比伊利丹的仓库整洁多了。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fcbf13d26755b3b0048710c6a35969b9f2b5d16181a38aa6f8636002bf744a51.png"
}

package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SplittingImage_50230 : Card() {
    override val id = 50230
    override val name = "裂魂残像"
    override val description = "<b>奥秘：</b>当你的随从受到攻击时，召唤一个该随从的复制。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "被人打得灵魂出窍的感觉……还挺迷幻的。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/52497ed94e73e5abc82dca7b424dadcc105476bbf0696ff04c81fa89b65b146f.png"
}

package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostNova_587 : Card() {
    override val id = 587
    override val name = "冰霜新星"
    override val description = "<b>冻结</b>所有敌方随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "嘿，伙计，这会冻死你的。我是说真的。"
    override val artist = "Josh Tallman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ff2826d2d397f43dced5a5fb12fa96d2a40b0050a6a07ed1074a223da013c91e.png"
}

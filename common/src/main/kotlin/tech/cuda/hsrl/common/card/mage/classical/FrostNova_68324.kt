package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostNova_68324 : Card() {
    override val id = 68324
    override val name = "冰霜新星"
    override val description = "<b>冻结</b>所有敌方随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "嘿，伙计，这会冻死你的。我是说真的。"
    override val artist = "Josh Tallman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee47009ff2e897ea73bacca864f08fcb6cd35abb57428c88d8a771f6f026a8d3.png"
}

package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DaringEscape_52679 : Card() {
    override val id = 52679
    override val name = "战略转移"
    override val description = "将所有友方随从移回你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "逃跑虽可耻但有用。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/08eb970289865f540006ddafd102510dbe9ea33929704d4e8264b06f0a165385.png"
}

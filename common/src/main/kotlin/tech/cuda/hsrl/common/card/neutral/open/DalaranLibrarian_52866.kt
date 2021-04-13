package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DalaranLibrarian_52866 : Card() {
    override val id = 52866
    override val name = "达拉然图书管理员"
    override val description = "<b>战吼：</b> <b>沉默</b>相邻的随从。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“别说话，问我。”"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d82e2facf69d20bad6493ca2afbb453cdb59550281cab1835cc28d1e62925ed9.png"
}

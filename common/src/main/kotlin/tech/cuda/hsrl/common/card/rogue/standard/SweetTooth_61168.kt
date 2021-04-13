package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SweetTooth_61168 : Card() {
    override val id = 61168
    override val name = "甜食狂"
    override val description = "<b>腐蚀：</b>获得+2攻击力和<b>潜行</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "他的眼睛都快长到冰淇淋上了。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a1d95b1e99dab9dafc2b1e3ee1a2517eff93f8945270d2e7634463ebebd589c.png"
}

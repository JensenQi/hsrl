package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FoxyFraud_61151 : Card() {
    override val id = 61151
    override val name = "狐人老千"
    override val description = "<b>战吼：</b> 在本回合中，你的下一张<b>连击</b>牌法力值消耗减少（2）点。"
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
    override val background = "他的托是个树人德鲁伊。老千也要和桩配合。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a99cebe7236b691c76bad1e2c64c0b8f94196d926167e8188ff65817f13bec1.png"
}

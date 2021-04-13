package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SleepyDragon_69726 : Card() {
    override val id = 69726
    override val name = "贪睡巨龙"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "当地村民把她称为“那座沉睡的山丘”。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fed4b87041884100a0f0f971d2d768a9d6286d2aa38ae94d85786a306ffc143c.png"
}

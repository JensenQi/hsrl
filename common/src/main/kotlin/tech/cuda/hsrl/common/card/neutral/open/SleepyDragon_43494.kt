package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SleepyDragon_43494 : Card() {
    override val id = 43494
    override val name = "贪睡巨龙"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "当地村民把她称为“那座沉睡的山丘”。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2b554d4c2daf5f1e6a4dbaa6022a3a32cf083f9deb9f16a6bcb336930ac4c538.png"
}

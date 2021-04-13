package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PossessedVillager_69736 : Card() {
    override val id = 69736
    override val name = "着魔村民"
    override val description = "<b>亡语：</b>召唤一个1/1的暗影兽。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "村民那充满魔性的舞步在艾泽拉斯造成了轰动，模仿者不计其数！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/591486bae550fb47a820a071e77c1c72daf3e1e474b4ea1003e6f7e2f14073fb.png"
}

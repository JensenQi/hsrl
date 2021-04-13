package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PossessedVillager_38774 : Card() {
    override val id = 38774
    override val name = "着魔村民"
    override val description = "<b>亡语：</b>召唤一个1/1的暗影兽。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "村民那充满魔性的舞步在艾泽拉斯造成了轰动，模仿者不计其数！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a2fb11dab711693a5700935d84aa7843bde6df6fe1ca2cdaba804157becd072.png"
}

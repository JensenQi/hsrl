package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KeeperOfUldaman_2889 : Card() {
    override val id = 2889
    override val name = "奥达曼守护者"
    override val description = "<b>战吼：</b> 将一个随从的攻击力和生命值变为3。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Loe
    override val background = "只有死人才能离开奥达曼！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/82c752ecea565233faed8896ffecce78e5a037e5763bd61737a666b952a0c834.png"
}

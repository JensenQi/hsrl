package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkshireAlchemist_38764 : Card() {
    override val id = 38764
    override val name = "夜色镇炼金师"
    override val description = "<b>战吼：</b> 恢复 5点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "她最拿手的甜点就是巧克力熔岩漏斗蛋糕。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cebdeee8bbda874b6c3700e334ebe52d3939cf9bac27cb9864aed1764c5a85c5.png"
}

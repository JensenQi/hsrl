package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AzureExplorer_54901 : Card() {
    override val id = 54901
    override val name = "碧蓝龙探险者"
    override val description = "<b>法术伤害+2</b> <b>战吼：</b><b>发现</b>一张 龙牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "特别能吃书！"
    override val artist = "Charlene LeScanff"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dfb3e067749fd212921b8afa90bfe30e37203aef6901e2202f9079c5ea1051fb.png"
}

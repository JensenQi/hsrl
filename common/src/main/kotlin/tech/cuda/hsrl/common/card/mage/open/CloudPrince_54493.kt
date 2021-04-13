package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CloudPrince_54493 : Card() {
    override val id = 54493
    override val name = "云雾王子"
    override val description = "<b>战吼：</b> 如果你控制一个<b>奥秘</b>，则造成6点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "在那西方云雾之乡 我就在那地方成长 每天都要到处浪荡 还要放个闪电听响"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e1d24216a902fff24e9b912712464421bb39f1b0ca49ee2b9f3cb8a8ab02ea6.png"
}

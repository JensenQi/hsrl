package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlackCat_48445 : Card() {
    override val id = 48445
    override val name = "黑猫"
    override val description = "<b>法术伤害+1，战吼：</b>如果你的牌库中只有法力值消耗为奇数的牌，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy4
    override val background = "她性格之奇特，绝非偶然。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7fd5fc1b2791980c7d6e5dd264384d9ea9960c258820fc2b0fe0516d75a23c5.png"
}

package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Coldwraith_42836 : Card() {
    override val id = 42836
    override val name = "冰冷鬼魂"
    override val description = "<b>战吼：</b>如果有敌人被<b>冻结</b>，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "他的骨头都快冻碎了！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cadec79cdc78e1e00fd8411a2afecd7c1774c081e9b581ea8b5dc783eeafe477.png"
}

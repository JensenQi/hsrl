package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BakuTheMooneater_48158 : Card() {
    override val id = 48158
    override val name = "噬月者巴库"
    override val description = "<b>对战开始时：</b>如果你的套牌中只有法力值消耗为奇数的牌，升级你的英雄技能。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "“不是我的错，月亮惹的祸。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3423ec834585a0d94d550ae29a25bd109ee56ddf127eeffcd528840ea0c2f9dd.png"
}

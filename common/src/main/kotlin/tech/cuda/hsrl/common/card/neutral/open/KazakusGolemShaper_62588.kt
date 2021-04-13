package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KazakusGolemShaper_62588 : Card() {
    override val id = 62588
    override val name = "魔像师卡扎库斯"
    override val description = "<b>战吼：</b>如果你的牌库里没有法力值消耗为（4）的牌，则为你制造一个自定义魔像。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "加一点点爱，再加一点耐心，我们就能碾碎敌人！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb1216c7550bb02d346719cd491121e63e4048381478ea360e8e71399578a7e2.png"
}

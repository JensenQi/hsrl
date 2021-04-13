package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Onyxia_69978 : Card() {
    override val id = 69978
    override val name = "奥妮克希亚"
    override val description = "<b>战吼：</b>召唤数条1/1的雏龙，直到你的随从数量达到上限。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "伪装成女伯爵卡特拉娜·普瑞斯托，奥妮克希亚长期控制着暴风城议会。你可能会想，一定是她的大翅膀和鳞片让她漏出了马脚。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3cfd09e2d6cf362f31de3e6bb20b9517aa6da350e209ddd6bca9d65b0ade02dc.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Onyxia_363 : Card() {
    override val id = 363
    override val name = "奥妮克希亚"
    override val description = "<b>战吼：</b>召唤数条1/1的雏龙，直到你的随从数量达到上限。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "伪装成女伯爵卡特拉娜·普瑞斯托，奥妮克希亚长期控制着暴风城议会。你可能会想，一定是她的大翅膀和鳞片让她漏出了马脚。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/681811a5957a476c98233cbaf8191a41ad6c695e7bc7d181684b6ab048ee26ac.png"
}

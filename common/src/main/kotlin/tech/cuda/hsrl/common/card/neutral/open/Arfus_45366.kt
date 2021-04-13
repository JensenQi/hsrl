package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Arfus_45366 : Card() {
    override val id = 45366
    override val name = "阿尔福斯"
    override val description = "<b>亡语：</b>随机将一张<b>死亡骑士</b>牌置入你的 手牌。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "一定要有一位巫妖汪。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ffd1a159345013671958ecea70a5e7197835f53818e12aa43653a5a4624d9402.png"
}

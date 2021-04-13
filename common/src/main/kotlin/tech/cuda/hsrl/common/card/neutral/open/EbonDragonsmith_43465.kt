package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EbonDragonsmith_43465 : Card() {
    override val id = 43465
    override val name = "黑色龙人铁匠"
    override val description = "<b>战吼：</b>随机使你手牌中的一张武器牌的 法力值消耗减少（2）点。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "会喷火的龙人做铁匠实在是再方便不过了。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d4acbf83700733fcdd83827c80ac342d2330a7b2f9d9fa29ab6a9ab261d5ce6.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YseraTheDreamer_66868 : Card() {
    override val id = 66868
    override val name = "沉睡者伊瑟拉"
    override val description = "<b>战吼：</b>将每种梦境牌各一张置入你的手牌。"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "快！快！快把这个梦写下来，一会就全忘了！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1645bf744660da503bef39a6efdd3f0da468d62a2347baed20485918d0cc9556.png"
}
